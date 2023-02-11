A, B, C, D = map(int, input().split())

if A*B == C*D or A*C == B*D or A*D == B*C:
    print("S")
else:
    print("N")
