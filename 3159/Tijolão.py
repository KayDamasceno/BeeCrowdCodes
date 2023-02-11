sec = ['a', 'b', 'c']
ter = ['d','e', 'f']
qua = ['g', 'h', 'i']
cin = ['j', 'k', 'l']
sex = ['m','n','o']
set = ['p','q','r','s']
oit = ['t','u','v']
nov = ['w','x','y','z']

def solve():
    ipt = input()
    out = ""

    for i in range(len(ipt)):
        if ipt[i].lower() in sec:
            if i != 0 and ipt[i].islower() and ipt[i-1].lower() in sec:
                out = out + "*"
            text =  (sec.index(ipt[i].lower())+1)*"2"
            if ipt[i].isupper():
                text = "#" + text
                
            out = out + text
        elif ipt[i].lower() in ter:
            if i != 0 and ipt[i].islower() and ipt[i-1].lower() in ter:
                out = out + "*"
            text =  (ter.index(ipt[i].lower())+1)*"3"
            if ipt[i].isupper():
                text = "#" + text

            out = out + text
        elif ipt[i].lower() in qua:
            if i != 0 and ipt[i].islower() and ipt[i-1].lower() in qua:
                out = out + "*"
            text =  (qua.index(ipt[i].lower())+1)*"4"
            if ipt[i].isupper():
                text = "#" + text
                
            out = out + text
        elif ipt[i].lower() in cin:
            if i != 0 and ipt[i].islower() and ipt[i-1].lower() in cin:
                out = out + "*"
            text =  (cin.index(ipt[i].lower())+1)*"5"
            if ipt[i].isupper():
                text = "#" + text
                
            out = out + text
        elif ipt[i].lower() in sex:
            if i != 0 and ipt[i].islower() and ipt[i-1].lower() in sex:
                out = out + "*"
            text =  (sex.index(ipt[i].lower())+1)*"6"
            if ipt[i].isupper():
                text = "#" + text
                
            out = out + text
        elif ipt[i].lower() in set:
            if i != 0 and ipt[i].islower() and ipt[i-1].lower() in set:
                out = out + "*"
            text =  (set.index(ipt[i].lower())+1)*"7"
            if ipt[i].isupper():
                text = "#" + text
                
            out = out + text
        elif ipt[i].lower() in oit:
            if i != 0 and ipt[i].islower() and ipt[i-1].lower() in oit:
                out = out + "*"
            text =  (oit.index(ipt[i].lower())+1)*"8"
            if ipt[i].isupper():
                text = "#" + text
                
            out = out + text
        elif ipt[i].lower() in nov:
            if i != 0 and ipt[i].islower() and ipt[i-1].lower() in nov:
                out = out + "*"
            text =  (nov.index(ipt[i].lower())+1)*"9"
            if ipt[i].isupper():
                text = "#" + text
                
            out = out + text
        elif ipt[i].lower() in ' ':
            out = out + "0"


    print(out)

t = int(input())

for _ in range (t):
    solve()
