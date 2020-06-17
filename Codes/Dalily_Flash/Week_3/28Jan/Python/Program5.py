no1 = int(input("Enter No1 = "))
no2 = int(input("Enter No2 = "))
no3 = int(input("Enter No3 = "))
if(no1<no2 and no1<no3):
    print("The min no. amongst",no1,no2,"and",no3,"is",no1)
elif(no2<no1 and no2<no3):
    print("The min no. amongst",no1,no2,"and",no3,"is",no2)
else:
    print("The min no. amongst",no1,no2,"and",no3,"is",no3)
