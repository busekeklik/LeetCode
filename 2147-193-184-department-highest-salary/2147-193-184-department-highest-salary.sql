/* Write your PL/SQL query statement below */

SELECT Dept.name AS Department, Emp.name AS Employee, Emp.salary AS Salary 
FROM Department Dept, Employee Emp
WHERE Emp.departmentId = Dept.id AND (Emp.departmentId, salary) 
IN (SELECT departmentId, MAX (salary) FROM Employee GROUP BY departmentId)