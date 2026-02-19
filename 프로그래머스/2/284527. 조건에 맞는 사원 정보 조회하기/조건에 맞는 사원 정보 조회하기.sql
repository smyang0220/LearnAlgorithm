-- 코드를 작성해주세요
select sum(G.SCORE) as SCORE ,E.EMP_NO,E.EMP_NAME,E.POSITION,E.EMAIL 
from HR_EMPLOYEES E 
    join HR_DEPARTMENT D 
        on E.DEPT_ID = D.DEPT_ID 
    join HR_GRADE G 
        on E.EMP_NO = G.EMP_NO
    GROUP BY E.EMP_NO
    ORDER BY sum(G.SCORE) desc LIMIT 1