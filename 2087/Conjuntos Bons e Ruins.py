n = int(input())


while n!=0:
    wordsList = []
    flag = False
    for i in range(n):
        word = input()
        if not flag:
            for words in wordsList:
                if word.startswith(words) or words.startswith(word):
                    #print(word)
                    flag = True
                    break
        
        wordsList.append(word)

    if flag:
        print("Conjunto Ruim")
    else:
        print("Conjunto Bom")
    
    flag = False
    wordsList.clear()
    n = int(input())
