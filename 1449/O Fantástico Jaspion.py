t = int (input())


while t!=0:
    m, n = map(int, input().split())
    d = {}

    for _ in range(m):
        word = input()
        translate = input()

        d[word] = translate

    for _ in range(n):
        sentence = input().split()

        for b in range(0, len(sentence)):
            if sentence[b] in d:
                print(d[sentence[b]], end="")
            else:
                print(sentence[b], end="")
            
            if b == len(sentence)-1:
                print("")
            else:
                print(" ", end="")


    print("")
    t-=1
