stack = []


s = input()

for x in range(0, len(s)):
    if s[x] == "(":
        stack.append("(")
    else:
        if len(stack)>0:
            stack.pop()

if len(stack) == 0:
    print("Partiu RU!")
else:
    print("Ainda temos %s assunto(s) pendente(s)!"%len(stack))
