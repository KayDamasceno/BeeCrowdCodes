def circle(x1, y1, x2,y2, r1, r2): 
  
    distSq = (((x1 - x2)* (x1 - x2))+ ((y1 - y2)* (y1 - y2)))**(.5) 
  
    if (distSq + r2 == r1): 
        return True
    elif (distSq + r2 < r1): 
        return True
    else: 
        return False
while True:

    try:

        r1, x1, y1, r2, x2, y2 = map(int, input().split())

        if circle(x1,y1, x2, y2, r1, r2):
            print("RICO")
        else:
            print("MORTO")


    except EOFError:
        break
