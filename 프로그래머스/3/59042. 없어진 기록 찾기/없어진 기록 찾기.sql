-- 코드를 입력하세요
select O.ANIMAL_ID	,O.NAME from ANIMAL_OUTS O left join ANIMAL_INS I on O.ANIMAL_ID = I.ANIMAL_ID
where I.DATETIME is null order by O.ANIMAL_ID