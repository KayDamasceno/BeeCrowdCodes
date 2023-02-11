n = int(input())

values = {}
for i in range(n):
    d, t = [int(x) for x in input().split()]

    values[d] = t

values = dict(sorted(values.items()))

results = []

for i in values:
    results.append(values[i])

if all (earlier >= later for earlier, later in zip(results, results[1:])):
    print ("S")
else:
    print ("N")

