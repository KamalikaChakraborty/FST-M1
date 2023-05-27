user1 = input("Enter Player 1's name: ")
user2 = input("Enter Player 2's name: ")

while True:
    user1_answer = input(user1 + ", please choose any one option : rock, paper or scissors? ").lower()
    user2_answer = input(user2 + ", please choose any one option : rock, paper or scissors? ").lower()

    if user1_answer == user2_answer:
        print("It's a tie!")
    elif user1_answer == 'rock':
        if user2_answer == 'scissors':
            print("Rock wins! Winner is: " + user1)
        else:
            print("Paper wins! Winner is: " + user2)
    elif user1_answer == 'scissors':
        if user2_answer == 'paper':
            print("Scissors win! Winner is: " + user1)
        else:
            print("Rock wins! Winner is: " + user2)
    elif user1_answer == 'paper':
        if user2_answer == 'rock':
            print("Paper wins! Winner is: " + user1)
        else:
            print("Scissors win! Winner is: " + user2)
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")

    repeat = input("Do you want to play another round? Yes/No: ").lower()

    if repeat == "yes":
        pass
    elif repeat == "no":
        raise SystemExit
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit
