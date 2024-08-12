import random
option = 0
login = 0
registry = {"username":[],"password":[]}
def generate():
    list = ['a','b','c','d','e','f','1','2','3']
    password = ''
    for i in range(1, 10):
        password += random.choice(list)
    return print("Your random password is"+password+".\n")
while(option != 4):
    option = 0
    try:
        while(option < 1 or option > 4):
            print("\nWelcome, please select an option: \n1.Login\n2.Register\n3.Password Generator\n4.Quit")
            option = int(input())
    except:
        print("Please put an actual numbered option from 1-4.")
    match option:
        case 1:
            if(login==0):
                if (registry["username"]==[]):
                        print("You have to register before logging in.")
                else:
                    while(login!=1):
                        print("Please enter your username: ")
                        if(str(registry["username"])=="[\'"+str(input())+"\']"):
                            print("Please enter your password: ")
                            if (str(registry["password"]) == "[\'" + str(input()) + "\']"):
                                print("Successfully logged in!")
                                login=1
                            else:
                                print("Incorrect password.\n")
                        else:
                            print("Incorrect username.\n")
            else:
                print("Already logged in.")
        case 2:
            if(registry["username"]==[]):
                print("Please enter your new username: ")
                registry["username"].append(input())
                print("Please enter your new password: ")
                registry["password"].append(input())
                print("Your login info:\nUsername:" + str(registry["username"]))
                print("Password:" + str(registry["password"]))
            else:
                print("You have already made an account.")

        case 3:
          generate()




