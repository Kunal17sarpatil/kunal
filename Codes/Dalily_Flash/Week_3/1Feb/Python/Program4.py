for row in range(4,0,-1):
    for no in range(0,row):
        if(no%2==0):
            print("+ ",end=" ")
        else:
            print("= ",end=" ")
    print()
