fruit_values={ "apple":140,"orange":140,"garpes":90,"banana":60,"watermelon":75,"pineapple":75,"kiwi":199}
fruit=input("Enter a fruit to see its availbilty").lower()
if(fruit in fruit_values):
    print("fruit present")
else:
    print("Fruit not present")
