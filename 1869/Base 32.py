import sys

num = int(input())


while num != 0:
    saida = ""

    temp = 0

    while num >= 32:
        temp = int(num % 32)
        num = int(num / 32)

        if temp == 0:
           saida = saida + "0"
        elif temp == 1:
            saida = saida + "1"
        elif temp == 2:
            saida = saida + "2"
        elif temp == 3:
            saida = saida + "3"
        elif temp == 4:
            saida = saida + "4"
        elif temp == 5:
            saida = saida + "5"
        elif temp == 6:
            saida = saida + "6"
        elif temp == 7:
            saida = saida + "7"
        elif temp == 8:
            saida = saida + "8"
        elif temp == 9:
            saida = saida + "9"
        elif temp == 10:
            saida = saida + "A"
        elif temp == 11:
            saida = saida + "B"
        elif temp == 12:
            saida = saida + "C"
        elif temp == 13:
            saida = saida + "D"
        elif temp == 14:
            saida = saida + "E"
        elif temp == 15:
            saida = saida + "F"
        elif temp == 16:
            saida = saida + "G"
        elif temp == 17:
            saida = saida + "H"
        elif temp == 18:
            saida = saida + "I"
        elif temp == 19:
            saida = saida + "J"
        elif temp == 20:
            saida = saida + "K"
        elif temp == 21:
            saida = saida + "L"
        elif temp == 22:
            saida = saida + "M"
        elif temp == 23:
            saida = saida + "N"
        elif temp == 24:
            saida = saida + "O"
        elif temp == 25:
            saida = saida + "P"
        elif temp == 26:
            saida = saida + "Q"
        elif temp == 27:
            saida = saida + "R"
        elif temp == 28:
            saida = saida + "S"
        elif temp == 29:
            saida = saida + "T"
        elif temp == 30:
            saida = saida + "U"
        elif temp == 31:
            saida = saida + "V"
        elif temp == 32:
            saida = saida + "10"


    temp = int(num)

    if temp == 0:
        saida = saida + "0"
    elif temp == 1:
        saida = saida + "1"
    elif temp == 2:
        saida = saida + "2"
    elif temp == 3:
        saida = saida + "3"
    elif temp == 4:
        saida = saida + "4"
    elif temp == 5:
        saida = saida + "5"
    elif temp == 6:
        saida = saida + "6"
    elif temp == 7:
        saida = saida + "7"
    elif temp == 8:
        saida = saida + "8"
    elif temp == 9:
        saida = saida + "9"
    elif temp == 10:
        saida = saida + "A"
    elif temp == 11:
        saida = saida + "B"
    elif temp == 12:
        saida = saida + "C"
    elif temp == 13:
        saida = saida + "D"
    elif temp == 14:
        saida = saida + "E"
    elif temp == 15:
        saida = saida + "F"
    elif temp == 16:
        saida = saida + "G"
    elif temp == 17:
        saida = saida + "H"
    elif temp == 18:
        saida = saida + "I"
    elif temp == 19:
        saida = saida + "J"
    elif temp == 20:
        saida = saida + "K"
    elif temp == 21:
        saida = saida + "L"
    elif temp == 22:
        saida = saida + "M"
    elif temp == 23:
        saida = saida + "N"
    elif temp == 24:
        saida = saida + "O"
    elif temp == 25:
        saida = saida + "P"
    elif temp == 26:
        saida = saida + "Q"
    elif temp == 27:
        saida = saida + "R"
    elif temp == 28:
        saida = saida + "S"
    elif temp == 29:
        saida = saida + "T"
    elif temp == 30:
        saida = saida + "U"
    elif temp == 31:
        saida = saida + "V"
    elif temp == 32:
        saida = saida + "10"


    print(saida[::-1])

    num = int(input())

print(0)

