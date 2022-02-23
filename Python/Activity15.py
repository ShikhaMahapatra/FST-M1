try:
    print(x)
except NameError:
    print("x hasn't been defined yet.")
else:
    print("Something went wrong ")