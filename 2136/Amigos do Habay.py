

sentence = input().split()
yes = []
no = []
while sentence[0]!="FIM":

    
   
    if sentence[1] == "YES" and sentence[0] not in yes:
        yes.append(sentence[0])
    if  sentence[1] == "NO" and sentence[0] not in no:
        no.append(sentence[0])
    results = yes.copy()


    
    

    sentence = input().split()


results = sorted(results, key = lambda x : (-len(x), yes.index(x)))

winner = results[0]

results = sorted(results, key = lambda x : x)
no = sorted(no, key=lambda  x: x)
for x in range(len(results)):
    print(results[x])
for x in range(len(no)):
    print(no[x])

print("")
print("Amigo do Habay:")
print(winner)
