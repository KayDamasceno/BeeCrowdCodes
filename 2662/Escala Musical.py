do     = [1, 3, 5, 6, 8, 10, 12]
dosus  = [1, 2, 4, 6, 7, 9, 11 ]
re     = [2, 3, 5, 7, 8, 10, 12 ]
resus  = [1, 3, 4, 6, 8, 9, 11]
mi     = [2, 4, 5, 7, 9, 10, 12]
fa     = [1, 3, 5, 6, 8, 10, 11 ]
fasus  = [ 2, 4, 6 , 7, 9, 11, 12]
sol    = [ 1, 3, 5, 7, 8, 10, 12 ]
solsus = [ 1, 2, 4, 6, 8, 9, 11 ]
la     = [ 2, 3, 5, 7, 9, 10, 12 ]
lasus  = [1,  3, 4, 6, 8, 10 ,11]
si     = [ 2, 4, 5, 7, 9, 11, 12]

escalas = []
escalas.append(do)
escalas.append(dosus)
escalas.append(re)
escalas.append(resus)
escalas.append(mi)
escalas.append(fa)
escalas.append(fasus)
escalas.append(sol)
escalas.append(solsus)
escalas.append(la)
escalas.append(lasus)
escalas.append(si)

n = int(input())
notes = []

for i in range(n):
    number = int(input())
    if number > 12:
        number = number%12
    notes.append(number)

notes.sort()

notes1 = list(set(notes))
result = []
for i in range(0, 12):
    if set(notes1).issubset(escalas[i]):
        if i == 0:
            result.append("do")
        elif i == 1:
            result.append("do#")
        elif i == 2:
            result.append("re")
        elif i == 3:
            result.append("re#")
        elif i == 4:
            result.append("mi")
        elif i == 5:
            result.append("fa")
        elif i == 6:
            result.append("fa#")
        elif i == 7:
            result.append("sol")
        elif i == 8:
            result.append("sol#")
        elif i == 9:
            result.append("la")
        elif i == 10:
            result.append("la#")
        elif i == 11:
            result.append("si")

if len(result)!=0:
    print(result[0])
else:
    print("desafinado")

