number = []
strnumber = ""
for i in range (5):

    number.append(list(input()))

i = 0
invalid = 0
while i < len(number[0]):
    

    if ''.join(number[0][i:i+3]) == "***" and ''.join(number[1][i:i+3]) == "* *" and ''.join(number[2][i:i+3]) == "* *" and\
        ''.join(number[3][i:i+3]) == "* *" and ''.join(number[4][i:i+3]) == "***":

        strnumber = strnumber + "0"
    elif ''.join(number[0][i:i+3]) == "  *" and ''.join(number[1][i:i+3]) == "  *" and ''.join(number[2][i:i+3]) == "  *" and\
        ''.join(number[3][i:i+3]) == "  *" and ''.join(number[4][i:i+3]) == "  *":

        strnumber = strnumber + "1"
    elif ''.join(number[0][i:i+3]) == "***" and ''.join(number[1][i:i+3]) == "  *" and ''.join(number[2][i:i+3]) == "***" and\
        ''.join(number[3][i:i+3]) == "*  " and ''.join(number[4][i:i+3]) == "***":

        strnumber = strnumber + "2"
    elif ''.join(number[0][i:i+3]) == "***" and ''.join(number[1][i:i+3]) == "  *" and ''.join(number[2][i:i+3]) == "***" and\
        ''.join(number[3][i:i+3]) == "  *" and ''.join(number[4][i:i+3]) == "***":

        strnumber = strnumber + "3"
    elif ''.join(number[0][i:i+3]) == "* *" and ''.join(number[1][i:i+3]) == "* *" and ''.join(number[2][i:i+3]) == "***" and\
        ''.join(number[3][i:i+3]) == "  *" and ''.join(number[4][i:i+3]) == "  *":

        strnumber = strnumber + "4"
    elif ''.join(number[0][i:i+3]) == "***" and ''.join(number[1][i:i+3]) == "* *" and ''.join(number[2][i:i+3]) == "***" and\
        ''.join(number[3][i:i+3]) == "  *" and ''.join(number[4][i:i+3]) == "***":

        strnumber = strnumber + "9"

    elif ''.join(number[0][i:i+3]) == "***" and ''.join(number[1][i:i+3]) == "*  " and ''.join(number[2][i:i+3]) == "***" and\
        ''.join(number[3][i:i+3]) == "  *" and ''.join(number[4][i:i+3]) == "***":

        strnumber = strnumber + "5"

    elif ''.join(number[0][i:i+3]) == "***" and ''.join(number[1][i:i+3]) == "*  " and ''.join(number[2][i:i+3]) == "***" and\
        ''.join(number[3][i:i+3]) == "* *" and ''.join(number[4][i:i+3]) == "***":

        strnumber = strnumber + "6"

    elif ''.join(number[0][i:i+3]) == "***" and ''.join(number[1][i:i+3]) == "  *" and ''.join(number[2][i:i+3]) == "  *" and\
        ''.join(number[3][i:i+3]) == "  *" and ''.join(number[4][i:i+3]) == "  *":

        strnumber = strnumber + "7"

    elif ''.join(number[0][i:i+3]) == "***" and ''.join(number[1][i:i+3]) == "* *" and ''.join(number[2][i:i+3]) == "***" and\
        ''.join(number[3][i:i+3]) == "* *" and ''.join(number[4][i:i+3]) == "***":

        strnumber = strnumber + "8"
    
    else:
        
        print("BOOM!!")
        invalid+=1
        break


    i = i + 4

if invalid == 0:

    if int(strnumber)%6 == 0:
        print("BEER!!")
    else:
        print("BOOM!!")
