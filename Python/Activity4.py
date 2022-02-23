player1=input("Enter player 1 name")
player2=input("Enter Player 2 name")
while(True):
    option_choosed1=(input(player1+" enter you choice from Rock ,Scissors or Paper")).lower()
    option_choosed2=(input(player2+" enter you choice from Rock ,Scissors or Paper")).lower()    
    if((option_choosed1=='rock' or option_choosed1=='scissors' or option_choosed1=='paper') and (option_choosed2=='rock' or option_choosed2=='scissors' or option_choosed2=='paper')):
        if(option_choosed1==option_choosed2):
            print("Its a tie")
        elif(option_choosed1=='rock'):
            if(option_choosed2=='scissors'):
                print(player1+" is the winner")
            else:
                print(player2+" is winner")
        elif(option_choosed1=='scissors'):
            if(option_choosed2=='paper'):
                print(player1+" is the winner")
            else:
                print(player2+" is winner")
        elif(option_choosed1=='paper'):
            if(option_choosed2=='rock'):
                print(player1+" is winner")
            else:
                print(player2+" is winner")
    else:
        print("Enter valid element")
    repeat=(input("Do you want to play another round "+player1+" and "+player2+"? (Yes/No)")).lower()
    if (repeat=='no'):
        raise SystemExit
    elif((repeat !='yes') and (repeat!='no')):
        print("Invalid input.Exiting!")
        raise SystemExit

    
