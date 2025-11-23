# Requirements Gathering

- ## Clarifying Happy flow of system
1. Users knows Other user by unique ID
2. User can create new groups, user can add other users in the group
3. Any User can create a Expense.
4. Expenses can be created outside group and also inside the group.
5. Expense can/cannot have split.
6. Expense is done by Users.
7. Splits is done on total amount.
8. Split will also have users.
9. Split will have user and expense_cost is been divided among those users
10. Split is calculated among all user based on various methods, like(Percentage_split, Equal_split, amount_split)
11. Each user will have their personalised Balance sheet.
12. Balance sheet will have all records of payment to be made and payment to receive(from Whome) by that user.
13. Balance sheet will also have a simplified calculated view of total money owed and owned.


- ## Entity Identification
1. User
2. Group
3. Expense
4. (Enum) SplitType
5. Split
6. BalanceSheet

# UML diagram
