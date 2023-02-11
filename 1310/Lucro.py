def kadane(numbers):
    max_cust = current_cust = numbers[0]
    

    for i in numbers[1:]:
        current_cust = max(current_cust+i,i)
        max_cust = max(max_cust, current_cust)

    return max_cust

while True:

    try:
        n = int(input())

        custo = int(input())
        val = []
        for x in range(n):
            val.append(int(input())-custo)


        value = kadane(val)
        if value <= 0:
            print("0")
        else:
            print(value)
        





    except EOFError:
        break
