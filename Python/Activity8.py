listLength=(int)(input("Enter the number of elements(number) you want sum of "))
numberList=[]
sum=0
while(listLength!=0):
    num=(int)(input("Enter number "))
    numberList.append(num)
    listLength=listLength-1
print("The list of numbers entered ",numberList)
if(numberList[0]==numberList[-1]):
    print(True)
else:
    print(False)