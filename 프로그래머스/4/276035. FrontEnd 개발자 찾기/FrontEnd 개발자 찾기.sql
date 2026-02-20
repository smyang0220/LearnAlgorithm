-- 코드를 작성해주세요
with tmp as (
select CODE from SKILLCODES 
    where CATEGORY LIKE 'Front End'
)

select DISTINCT d.ID,d.EMAIL,d.FIRST_NAME,d.LAST_NAME from DEVELOPERS d 
join tmp t 
on d.SKILL_CODE & t.CODE = t.CODE
order by d.ID