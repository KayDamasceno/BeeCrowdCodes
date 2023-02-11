
def solve():

    text = input().split()

    for i in range(0, len(text)):

        if "oulupukk" in text[i]:

            if len(text[i])!=10:
                point = text[i][-1]
                text[i] = "Joulupukki" + point
                
            else:

                text[i] = "Joulupukki"
            

    
    print(" ".join(text))

t = int(input())

for i in range (t):
    solve()

    

    
