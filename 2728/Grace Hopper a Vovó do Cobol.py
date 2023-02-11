
while True:
    try:
        words = input().split("-")
        cobol = False

        if words[0][0].lower() == 'c' or words[0][len(words[0])-1].lower() == 'c':
            if words[1][0].lower() == 'o' or words[1][len(words[1])-1].lower() == 'o':
                if words[2][0].lower() == 'b' or words[2][len(words[2])-1].lower() == 'b':
                    if words[3][0].lower() == 'o' or words[3][len(words[3])-1].lower() == 'o':
                        if words[4][0].lower() == 'l' or words[4][len(words[4])-1].lower() == 'l':
                            cobol = True


        if cobol:
            print("GRACE HOPPER")
        else:
            print("BUG")
    
    except EOFError:
        break
