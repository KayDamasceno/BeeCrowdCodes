t = int(input())

minor = 1000.00*1000

while t > 0:


    p, g = input().split()
    
    if (float(p)*1000)/int(g) < minor:
        minor = (float(p)*1000)/int(g)

    t-=1

print("%.2f"%(minor))
