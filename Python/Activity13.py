def sum(numbers):
    sumValue=0
    for x in numbers:
        sumValue=sumValue+int(x)
    print("The sum of numbers are ",sumValue)
numberList=list(((input("Enter numbers in series separated by comma(,) to get the sum ")).split(',')))
print(numberList," has been entered to get the sum of")
sum(numberList)

