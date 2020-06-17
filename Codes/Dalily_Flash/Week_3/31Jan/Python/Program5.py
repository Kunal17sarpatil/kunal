lim = int(input("Enter Limit = "))

for no in range(1,lim):
    temp=0
    for no1 in range(1,no):
        if(no%no1==0):
            temp = temp+no1
    if(no==temp):
        print(no,end=" ")
print()
