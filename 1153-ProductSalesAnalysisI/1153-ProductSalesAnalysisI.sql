-- Last updated: 7/9/2026, 10:06:46 AM
# Write your MySQL query statement below
SELECT p.product_name, s.year, s.price
FROM Sales s
JOIN Product p
ON s.product_id = p.product_id;