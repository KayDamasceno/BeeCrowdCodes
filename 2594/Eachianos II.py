import re
n = int(input())

while n!=0:

    text = input()
    sub = input()
    
    a = [str(m.start(0)) for m  in re.finditer(r"\b"+sub+r"\b", text)]
    
    if len(a) == 0:
        print(-1)
    else:
        print(' '.join(a))
    
    n-=1
