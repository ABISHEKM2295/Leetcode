# Write your MySQL query statement below
select person_name 
from (
    select person_name , sum(weight) over (order by turn) as totalw
    from Queue
) t 
where totalw <=1000
order by totalw desc
limit 1;