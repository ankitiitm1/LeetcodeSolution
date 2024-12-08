# Write your MySQL query statement below
# COALESCE function return first non null value
select name from Customer
where COALESCE(referee_id,'') != 2