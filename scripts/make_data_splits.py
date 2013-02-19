#!/usr/bin/env python

import argparse
import os
import random
import re

parser = argparse.ArgumentParser()
parser.add_argument('--filelist', required=True, help='Read files from the lines of this file.')
parser.add_argument('--splitdir', required=True, help='Write data splits to this directory')
parser.add_argument('--percentdevin', default=0.15, type=float, help='Take this amount of in project data for development.')
parser.add_argument('--percenttestin', default=0.15, type=float, help='Take this amount of in project data for testing.')
parser.add_argument('--devoutproject', default='apache-cassandra-1.2.0', help='Use this project for out of project development.')
parser.add_argument('--testoutproject', default='xalan-j-2.7.1', help='Use this project for out of project testing.')

def main():
    args = parser.parse_args()
    rand = random.random
    
    filenames = [l[1:] for l in open(args.filelist)]
    datafiles = ('train.txt', 'dev_in.txt', 'test_in.txt', 'dev_out.txt', 'test_out.txt')
    train, devin, testin, devout, testout = [os.path.join(args.splitdir, f) for f in datafiles]

    with open(train,'w') as train, open(devin,'w') as din, open(testin,'w') as tin, open(devout,'w') as dout, open(testout,'w') as tout:
        for fn in filenames:
            r = rand()
            if args.devoutproject in fn:
                dout.write(fn)
            elif args.testoutproject in fn:
                tout.write(fn)
            elif r < args.percentdevin:
                din.write(fn)
            elif r < args.percentdevin+args.percenttestin:
                tin.write(fn)
            else:
                train.write(fn)

if __name__ == '__main__': main()
