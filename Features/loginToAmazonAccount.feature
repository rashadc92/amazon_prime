Feature: Login to amazon account

Scenario Outline: Login to amazon account

Given i am on the amazon homepage

When i click on the sign in button 
And i enter the "<User_Name>" in user name input field
And i enter the "<password>" in password input field
And i click on the sign in button


Then i can successfully login to my amazon account

Examples:

|    User_Name                    |  password  |

|blackgriffinviperdragon@gmail.com| 810133MaA  |