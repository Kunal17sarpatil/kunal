no = int(input("Enter No = "))

count=0
for n in range(1,no):
    if(no%n==0):
        count=count+1
if (count==2):
    print(no,"is Prime No")
else:
    print(no,"is not Prime no")
