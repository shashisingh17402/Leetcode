# Write your MySQL query statement below
Select score,DENSE_RANK() Over(Order by score DESC) as 'rank' from Scores;