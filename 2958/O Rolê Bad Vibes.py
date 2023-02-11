n, m = map(int, input().split())

V = []
D = []
for x in range(n):
    numbers = input().split()
    
    for k in range(m):
        if 'V' in numbers[k]:
            
            V.append((numbers[k]))
        else:
            D.append((numbers[k]))



V.sort(reverse=True)
D.sort(reverse=True)
if len(V)>0:
    print('\n'.join(V))
if len(D)>0:
    print('\n'.join(D))
