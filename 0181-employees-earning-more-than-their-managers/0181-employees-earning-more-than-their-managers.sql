# Write your MySQL query statement below
select emp.name as employee from employee emp, employee mgr
where emp.managerId = mgr.id AND emp.salary > mgr.salary