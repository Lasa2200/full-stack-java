SELECT tweets. tweet
FROM users
LEFT JOIN tweets
ON users.id = tweets.user_id
WHERE users.id = 1;
