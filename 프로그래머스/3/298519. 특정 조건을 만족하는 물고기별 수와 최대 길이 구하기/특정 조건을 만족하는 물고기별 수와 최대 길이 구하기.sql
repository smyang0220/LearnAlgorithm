-- 코드를 작성해주세요
select count(*) as FISH_COUNT, MAX(LENGTH) as MAX_LENGTH, FISH_TYPE from FISH_INFO group by FISH_TYPE having avg(
    CASE 
         when LENGTH < 11 then 10
         when LENGTH is null then 10
    else length
    end
) >= 33
order by FISH_TYPE