-- Last updated: 7/9/2026, 10:06:28 AM
# Write your MySQL query statement below
SELECT tweet_id
FROM Tweets
WHERE LENGTH(content) > 15;