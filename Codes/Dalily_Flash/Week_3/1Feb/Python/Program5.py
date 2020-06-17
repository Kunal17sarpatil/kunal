no1 = int(input("Enter No1 = "))
no2 = int(input("Enter No2 = "))
if(no1>no2):
    no=no2
else:
    no=no1
for n in range(1,no+1):
    if(no1%n==0) and (no2%n==0):
        gcd = n  
print("The GCD of",no1,"and",no2,"is",gcd)
