# Write your MySQL query statement below
select  
    c.category , coalesce(a.accounts_count,0) as accounts_count
from (
    select 
    'Low Salary' as category
    union all
    select 'Average Salary'
    union all
    select 'High Salary'
) c
left join 
(select 
   case 
        when income < 20000 then 'Low Salary'
        when income between 20000 and 50000 then 'Average Salary'
        else 'High Salary'
    end as category , count(*) as accounts_count
from Accounts 
group by category ) a 
on c.category=a.category;