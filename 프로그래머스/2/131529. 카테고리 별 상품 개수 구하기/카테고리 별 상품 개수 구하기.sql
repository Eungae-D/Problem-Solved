-- 코드를 입력하세요
SELECT LEFT(PRODUCT_CODE, 2)AS DDD, COUNT(PRODUCT_ID) AS PRODUCTS
FROM PRODUCT
GROUP BY DDD
ORDER BY DDD;