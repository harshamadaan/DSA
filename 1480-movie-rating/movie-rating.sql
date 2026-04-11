# Write your MySQL query statement below
(select name as results
from users
inner join movieRating using (user_id)
group by user_id
order by count(rating) desc,name
limit 1
)

union all
(
    select title as results
    from movies
    inner join movieRating using (movie_id)
    where month(created_at)='02' and year(created_at)='2020'
    group by title
    order by avg(rating) desc, title
    limit 1
)

