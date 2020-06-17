no = int(input("Enter No = "))
temp = 0
for no1 in range(1,no):
    if(no%no1==0):
        temp = temp + no1    
if(no==temp):
    print(no,"is perfect no")
else:
    print("Not Perfect No")
