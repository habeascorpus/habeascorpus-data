#!/usr/bin/env python

import argparse
import os
import re

parser = argparse.ArgumentParser()
parser.add_argument('--tokendir', required=True, help='Tokenized files are rooted in this directory.')
parser.add_argument('--identifierdir', required=True, help='Identifier files are rooted in this directory.')

def search_dir_recursive(root, predicate=lambda fn: True):
    '''Recursively search the root directory and return filenames for
    which the predicate evaluates to True.

    '''
    for dirpath, dirnames, filenames in os.walk(root):
        for fn in (os.path.join(dirpath, f) for f in filenames):
            if predicate(fn):
                yield fn

def count_lines(filename, predicate=lambda l: True):
    return sum(predicate(l) for l in open(filename))

def test_identifier_counts(tokendir, identifierdir):
    '''Checks that the number of identifiers in the tokenized files
    match the number of identifiers in the identifier files.

    '''
    def is_identifier_line(token_line):
        return 'TokenNameIdentifier' in token_line

    tokenfiles = list(search_dir_recursive(tokendir, lambda f: f.endswith('.java')))
    token_id_counts = [count_lines(fn, is_identifier_line) for fn in tokenfiles]
    tokenfiles = [re.sub(tokendir, '', fn) for fn in tokenfiles]
    tokenfiles = dict(zip(tokenfiles, token_id_counts))

    identifierfiles = list(search_dir_recursive(identifierdir, lambda f: f.endswith('.java')))
    identifier_counts = [count_lines(fn) for fn in identifierfiles]
    identifierfiles = [re.sub(identifierdir, '', fn) for fn in identifierfiles]
    identifierfiles = dict(zip(identifierfiles, identifier_counts))

    passes_test = True
    for k, v in tokenfiles.items():
        if k in identifierfiles and not v == identifierfiles[k]:
            print 'Files for {0} differ by {1}'.format(k, abs(v-identifierfiles[k]))
            passes_test = False

    return passes_test

def num_unkown_identifiers(identifierdir):
    '''Prints the percentage of identifiers for which the binding is
    unknown.

    '''
    def is_unknown(line):
        return 'UNKNOWN_IDENTIFIER' in line

    identifierfiles = list(search_dir_recursive(identifierdir, lambda f: f.endswith('.java')))
    num_unknown = sum(count_lines(f, is_unknown) for f in identifierfiles)
    num_known = sum(count_lines(f) for f in identifierfiles)
    return 'Percentage of Unknown Identifiers: {0:.2}'.format(num_unknown / float(num_known))

def main():
    args = parser.parse_args()

    # pass or fail tests
    assert test_identifier_counts(args.tokendir, args.identifierdir)
    print 'All tests passed'

    # descriptive tests
    print num_unkown_identifiers(args.identifierdir)


if __name__ == '__main__': main()
