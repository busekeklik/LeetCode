SELECT person_name FROM
(SELECT person_name, weight, turn, SUM(weight) OVER(ORDER BY turn) AS weight_sum
FROM queue) x
WHERE weight_sum <= 1000
ORDER BY turn DESC LIMIT 1;