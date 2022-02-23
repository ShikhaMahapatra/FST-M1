import pandas
dataframe=pandas.read_excel("Employee Details.xlsx","Sheet1")
print(dataframe)
print("The number of rows and columns is",dataframe.shape)
print("The data in the emails column only","\n",dataframe["Email"])
print("The data is sorted in ascending order based of First Name","\n",dataframe.sort_values("FirstName"))