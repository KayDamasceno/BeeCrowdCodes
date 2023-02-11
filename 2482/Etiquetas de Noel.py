n = int(input())

languages = {}

for x in range(0, n):
    idiom = input()
    translate = input()
    languages[idiom] = translate

m = int(input())

for x in range(0,m):
    print(input())
    print(languages[input()])
    print("")
