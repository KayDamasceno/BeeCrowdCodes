from collections import defaultdict



t = int(input())

def dfs(graph, source):
    stack = [source]
    visited = set()

    while len(stack)!=0:
    
        current = stack.pop()
        visited.add(current)
        

        for neighbor in graph[current]:
            
            if neighbor not in visited:
                stack.append(neighbor)
        
    return len(visited)

while t > 0:

    graph = defaultdict(list)

    node = int(input())
    c, a = map(int, input().split())

    for i in range(a):
        v, w = map(int, input().split())

        graph[v].append(w)
        graph[w].append(v)
    

    print((dfs(graph, node)-1)*2)

    graph.clear()
    
    t-=1
