# Write your MySQL query statement below
SELECT a.name as Employee from Employee as a join Employee as b ON a.managerId = b.id AND a.salary > b.salary;