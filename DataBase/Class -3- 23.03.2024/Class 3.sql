select first_name, last_name, salary
from employees
-- where first_name ='Payam';
--where first_name =INITCAP('payam');
-- First letter will be capital and others will be lower
where first_name =INITCAP('pAYam');

select first_name, last_name, salary, concat(first_name,last_name) "Full Name"
from employees
-- For Two Name Adjust
where first_name =INITCAP('payam');

select first_name, last_name, salary, SUBSTR(first_name,3,4)
from employees
-- For Substrac letter form the name. first num means where I start substrac and second num means how many letter I wants to show.
where first_name =INITCAP('payam');


select 'The job id for '|| Upper(last_name)||' is '
||lower(job_id)as "Employee Details"
from employees;

select first_name, last_name, salary,
Instr(lower('first_name'), 'd')
from employees;

select first_name, last_name, salary,
Instr(lower('first_name'), 'd'), LPAD(first_name,10,'-')
from employees;

select first_name, last_name, salary,
Instr(lower('first_name'), 'd'), RPAD(first_name,10,'-')
from employees;

--Using Character-Manipulation Function
select CONCAT(CONCAT(last_name, '''s job category is '), job_id)
"Job Details" from employees
where SUBSTR(job_id,4)='REP';

SELECT employee_id, Concat(first_name,last_name) NAME, Length (last_name),
Instr(last_name, 'a') "Contains 'a'?"
from employees
where substr(last_name, -1,3)='n';

SELECT
    * FROM employees;
    
--Using Character-Manipulation Function for finding it programmer
select CONCAT(CONCAT(last_name, '''s job category is '), job_id)
"Job Details" from employees
where SUBSTR(job_id,1,2)='IT';

--or another method
SELECT
    * FROM employees
    where substr(job_id,1,2)='IT';
    

select first_name,
lower(concat(substr(first_name,2,2),'IT'))
from employees
where first_name =INITCAP('payam');


select first_name,
lower(concat(substr(first_name,2,2),'IT'))
from employees
where first_name=initcap('Payam');