listLength=(int)(input("Enter the number of elements(number) you want sum of "))
numberList=[]
sum=0
while(listLength!=0):
    num=(int)(input("Enter number "))
    numberList.append(num)
    listLength=listLength-1
print("The list of numbers entered ",numberList)
numberList=tuple(numberList)
print("numbers divisible by 5 from tuple are ")
for x in numberList:
    if(x%5==0):
        print(x,end=" ")