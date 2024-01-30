# Write your MySQL query statement below
SELECT em.name , 
b.bonus
FROM Employee em
LEFT JOIN 
Bonus b
ON em.empId = b.empId
WHERE b.bonus < 1000 OR b.bonus IS NULL;