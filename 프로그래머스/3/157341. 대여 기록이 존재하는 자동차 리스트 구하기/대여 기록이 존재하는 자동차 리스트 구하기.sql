-- 코드를 입력하세요
SELECT distinct h.CAR_ID 
from CAR_RENTAL_COMPANY_RENTAL_HISTORY h 
join CAR_RENTAL_COMPANY_CAR c  
on h.CAR_ID = c.CAR_ID
where MONTH(h.START_DATE) = 10 and c.CAR_TYPE = '세단'
order by c.CAR_ID desc