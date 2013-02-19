import argparse
import os
import sys
import re

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument('datafiles', help='List of files in dataset')
    parser.add_argument('tokendir', help='Root directory for token files')
    parser.add_argument('identdir', help='Root directory for identifier files')
    parser.add_argument('outdir', help='File output directory')
    args = parser.parse_args()

    with open(os.path.join(args.outdir, os.path.basename(args.datafiles)), 'w') as data_out:
        for fn in (l.strip() for l in open(args.datafiles)):
            token_info = [l.strip().split('\t') for l in open(os.path.join(args.tokendir, fn))]
            ident_info = [l.strip().split('\t') for l in open(os.path.join(args.identdir, fn))]

            ident_iter = iter(ident_info)
            for terminal, preterminal in token_info:
                preterminal = re.sub('TokenName', '', preterminal)
                if preterminal == 'Identifier':
                    _, id_type, is_dec = next(ident_iter)
                    id_type = re.sub('_IDENTIFIER', '', id_type)
                else:
                    id_type, is_dec = 'none', 'none'
                data_out.write('\t'.join([terminal, preterminal, id_type, is_dec]) + '\n')
            data_out.write('\n')

if __name__ == '__main__':
    main()
