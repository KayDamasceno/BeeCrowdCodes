import sys

a = int(input())
i = 1
while a!=-1 :
    print("Experiment %d: %d full cycle(s)" % (i, a/2))
    i+=1
    a = int(input())
