max_int = 2147483647

V, W = [int(x) for x in input().split()]

adj = {}
for i in range(1, V+1):
    adj[i] = []



for i in range(0, W):
    a, b, c = [int(x) for x in input().split()]
    adj[a].append([b,c])
    adj[b].append([a,c])

key = []
mst = []
parent = []

for i in range(0, V+1):
    key.append(max_int)
    mst.append(False)
    parent.append(-1)

key[1] = 0
parent[1] = -1

for i in range(1, V):

    mini = max_int
    u = None

    for v in range(1, V+1):
        if mst[v] == False and key[v] < mini:
            u = v
            mini = key[v]
    

    mst[u] = True

    for it in adj[u]:
        v = it[0]
        w = it[1]
        #print(str(v) + " " +str(w))
        if mst[v] == False and w < key[v]:
            parent[v] = u
            key[v] = w


sum = 0
for i in range(2, V+1):
    sum+=key[i]

print(sum)
