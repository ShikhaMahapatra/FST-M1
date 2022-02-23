import pandas as pd
dataframe=pd.read_csv("credentials.csv")
print("The complete Data in CSV is","\n",dataframe)
print("The values only in the Usernames column","\n",dataframe["Usernames"])
print("the username and password of the second row")
print("Username: ",dataframe["Usernames"][1],"Password: ",dataframe["Passwords"][1])
print("Usernames sorted in ascending order","\n",dataframe.sort_values("Usernames"))
print("Passwords sorted in descending order","\n",dataframe.sort_values("Passwords",ascending=False))