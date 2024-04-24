--Types of Group Functions

select MAX(salary) "Maximum"
  FROM employees;
  
select MIN(salary) "Minimum"
  FROM employees;
  
  
select avg(salary) "Average"
  FROM employees;
  
select ROUND(avg(salary),0) "Round Average"
  FROM employees;
  
select count (first_name)
from employees
where job_id = 'IT_PROG';

select count (first_name)
from employees
where job_id = 'SA_PROG';


select sum (salary)
from employees
where job_id = 'SA_REP';

select STDDEV (salary)
from employees
where job_id = 'SA_REP';


select count (commission_pct)
from employees;


SELECT AVG(NVL(commission_pct, 0))
FROM employees
Where commission_pct is null;