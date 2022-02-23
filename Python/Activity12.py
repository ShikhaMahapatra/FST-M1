def summation(x): 
    if x:
        return x+summation(x-1)
    else:
        return 0
sum=summation(10)
print(sum)
