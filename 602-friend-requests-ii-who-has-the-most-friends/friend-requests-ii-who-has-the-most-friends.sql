-- dono table ma sa count dakh lo 1 kitni baar aa rha h ,2 kitni baar dono table mai sa
# Write your MySQL query statement below  -- 1-2
                                          -- 2-2
                                          -- 3-3
                                          -- 4-1
--
select id,count(*) as num

from(
    select requester_id as id 
from requestAccepted
union all -- take duplicate
select accepter_id
from requestAccepted
) as friend_account
group by id
order by num desc
limit 1