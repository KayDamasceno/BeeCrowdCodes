M = int(input())
A = int(input())
B = int(input())

C = M - (A+B)

if A > B and A > C: 
    print(A)
if B > A and B > C: 
    print(B)
if C > B and C > A: 
    print(C)
