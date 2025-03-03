# Write your MySQL query statement below
SELECT name, SUM(amount) AS balance
FROM Users
LEFT JOIN Transactions
ON Users.account = Transactions.account
GROUP BY Users.name 
HAVING SUM(Transactions.amount) > 10000;
