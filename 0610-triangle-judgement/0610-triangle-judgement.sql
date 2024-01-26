# Write your MySQL query statement below
SELECT *, IF(x+z>y AND x + y > z AND z + y > x, "Yes", "No") AS triangle
FROM Triangle