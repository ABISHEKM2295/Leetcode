# Write your MySQL query statement below
with cte as (
    select e.name as Employee , e.salary , e.departmentId ,
    dense_rank() over(
        partition by departmentId 
        order by salary desc
    ) as rnk
    from Employee e
)
select d.name as Department,c.Employee as Employee ,c.salary as Salary
from cte c
left join  Department d on c.departmentId= d.id
where c.rnk <=3; 