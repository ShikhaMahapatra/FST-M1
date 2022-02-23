def fibonacii(num):
   # series=[1]
    if (num<=1):
        return num
    elif(num>1):
        return (fibonacii(num-1)+fibonacii(num-2))

num=(int)(input("Enter how many fibonnacii number is required "))
if(num<=0):
    print("Enter a valid number")
else:
    print("The Fibonacii series is: ")
for i in range(num):
    series=fibonacii(i)
    if(i<num-1):
        print(series,',',end="")
    else:
        print(series)
