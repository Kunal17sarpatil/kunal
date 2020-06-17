first = int(input("Enter Start = "))
last = int(input("Enter End = "))
for no in range(first,last+1):
    fact = 1
    for no1 in range(1,no+1):
        fact = fact*no1
    print("Factorial of ",no,"=",fact)

