list1=[4,78,52,47,1,34,57,99,47]
list2=[47,56,24,32,33,89,77,52]
newlist=[]
for x in list1:
    if(x%2!=0):
        newlist.append(x)
for x in list2:
    if(x%2==0):
        newlist.append(x)
print("First List ",list1)
print("Second List ",list2)
print("new List ",newlist)