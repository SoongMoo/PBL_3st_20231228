-- lab
-- 1.
select first_name, department_id, hire_date, job_id, salary
     , nvl(commission_pct, 0) as commission
     , salary * (1 + nvl(commission_pct, 0)) * 12 as year_sal
from hr.employees;
-- 2.
select *
from hr.employees
where hire_date > to_date('03/06/17', 'yy/mm/dd');
-- 3.
select *
from hr.employees
where hire_date > to_date('17/06/03', 'dd/mm/yy');
-- 4.
select *
from hr.employees
where hire_date > to_date('06/17/03', 'mm/dd/yy');
-- 5.
select to_char(sysdate, 'yy-mm-dd'), to_char(sysdate, 'dd-mm-yy'), to_char(sysdate, 'yyyy-mm-dd')
     , to_char(sysdate, 'yyyy-mm-dd hh:mi:ss am'), to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss am')
from dual;
-- 6.
-- 1은 문자 2는 숫자
-- 7.
select to_char('1234567', 'L999,999,999')
     , to_char('1234567', '$999,999,999')
     , to_char('-1234567', '$999,999,999mi')
from dual;
-- 8.
select first_name, last_name, job_id, department_id
     , to_char(salary, '$999,999') as salary
from hr.employees;
-- 9.
select *
from hr.employees
where lower(first_name) = lower('janette');
select *
from hr.employees
where lower(first_name) = lower('JANETTE');
select *
from hr.employees
where lower(first_name) = lower('jaNette');
-- 10.
select first_name, last_name, salary
     , case job_id when 'IT_PROG' then salary * 1.1
                   when 'ST_CLERK' then salary * 1.15
                   when 'SA_REP' then salary * 1.2
                   else salary end as sal
from hr.employees;
-- 11.
select first_name, last_name, job_id, salary
     , case when salary <= 3000 then '사원'
            when salary <= 5000 then '주임'
            when salary <= 7000 then '대리'
            when salary <= 9000 then '과장'
            when salary <= 11000 then '차장'
            when salary <= 13000 then '부장'
            else '임원' end
from hr.employees;
-- 12.
select first_name, last_name, salary, job_id
     , case trunc(salary / 2000) when 0 then salary * 0
                                 when 1 then salary * 0.09
                                 when 2 then salary * 0.2
                                 when 3 then salary * 0.3
                                 when 4 then salary * 0.4
                                 when 5 then salary * 0.42
                                 when 6 then salary * 0.44
                                 else salary * 0.45 end as tax
from hr.employees;
-- 13.
select concat('나의 이름은 ', concat(concat(last_name, first_name), ' 입니다.'))
from hr.employees;
-- 14.
select first_name, last_name, job_id, salary
     , salary * (1 + nvl(commission_pct, 0)) * 12 as year_sal
from hr.employees;
--15.
select first_name, last_name, job_id, salary
     , salary * (1 + nvl2(commission_pct, commission_pct, 0)) * 12 as year_sal
from hr.employees;
-- 16.
select first_name, email, length(first_name), length(email)
     , nullif(length(first_name), length(email))
from hr.employees;
-- 17.
select first_name, salary, commission_pct
     , salary * (1 + coalesce(commission_pct, 0)) * 12 as year_sal
from hr.employees;
-- 18.
select max(salary), min(salary), avg(salary)
from hr.employees;
-- 19.
select count(*), count(department_id)
from hr.employees;
-- 20.
select avg(commission_pct) -- 커미션을 받는 사원 커미션 평균
from hr.employees;
select avg(nvl(commission_pct, 0)) -- 전체 사원 커미션 평균
from hr.employees;
-- 21.
select count(*)
from hr.employees;
-- 22.
select max(hire_date), min(hire_date)
from hr.employees;
-- 23.
select max(salary), min(salary)
from hr.employees
where job_id like '%REP%';
-- 24.
select count(*), max(commission_pct), min(commission_pct)
from hr.employees
where department_id = 80;
-- 25,
select distinct(department_id)
from hr.employees;
-- 26.
select count(distinct(department_id))
from hr.employees;
-- 27.
select avg(commission_pct) -- 커미션을 받는 사원 커미션 평균
from hr.employees;
select avg(nvl(commission_pct, 0)) -- 전체 사원 커미션 평균
from hr.employees;
--28.
select avg(salary), sum(salary), max(salary), min(salary), count(*)
from hr.employees
where department_id = 90;
-- 29.
select avg(salary), sum(salary), max(salary), min(salary), count(*)
from hr.employees
where department_id = 80;
-- 30.
select avg(salary), sum(salary), max(salary), min(salary), count(*)
from hr.employees
where department_id = 70;