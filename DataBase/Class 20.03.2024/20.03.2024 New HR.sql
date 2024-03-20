--job er sob select korar jonno
select * from jobs;

--job theke salary select kore range ber kora
select * from employees
where salary = 2800;

--job theke salary select kore range ber kora
select * from employees
where salary <= 2800;

--job theke salary select kore range ber kora
select * from employees
where salary >= 2800;

--job theke salary select kore range ber kora
select * from employees
where salary in (2500,2800,9000);

--job theke salary select kore range ber kora
select * from employees
where salary BETWEEN 10000 AND 20000;

-- M Jukto name select korar jonno
select * from employees
where first_name LIKE 'M%';

-- Mi Jukto name select korar jonno
select * from employees
where first_name LIKE 'Mi%';

-- Seshe m Jukto name select korar jonno
select * from employees
where first_name LIKE '%m';

--prothome W and seshe m select korar jonno
select * from employees
where first_name LIKE 'W%m';

-- L Jukto sokol name select korar jonno
select * from employees
where first_name LIKE '%l%';

--Null khuje ber korar jonno is er por null likhbo
select * from employees
where commission_pct is null;

-- banan bhul hole invalid identifier likha asbe

-- left, right and common data paowar jonno or use korbo
select * from employees
where commission_pct is null or salary BETWEEN 1000 and 2000;

-- limit kore id ber korar jonno
select * from employees
where department_id=90;

-- limit korar jonno and er use
select * from employees
where job_id ='IT_PROG' and salary=4800 and first_name like 'V%';

-- limit korar jonno or er use
select * from employees
where job_id ='IT_PROG' or salary=9000 and first_name like 'M%';

--less than or equal er use
SELECT first_name, last_name, salary, department_id
from employees
where hire_date <='1-jan-2005';

--Not equal to er use 
SELECT first_name, last_name, salary, department_id
from employees
where hire_date <>'27-jan-2004';

--Not equal to er sathe order by er use 
SELECT first_name, last_name, salary, department_id, hire_date
from employees
where hire_date <>'27-jan-2004'
order by first_name, hire_date;

--Not equal to er sathe order by ke desc kore use 
SELECT first_name, last_name, salary, department_id, hire_date
from employees
where hire_date <>'27-jan-2004'
order by salary desc;

--Not equal to er sathe order by ke anual salary kore use 
SELECT employee_id, last_name, salary *12 ansal
from employees
order by ansal;

--coloum er name na likhe number likheo kaj kora jay 
SELECT employee_id, last_name, salary *12 ansal
from employees
order by 2;

--coloum er name na likhe number likheo kaj kora jay 
SELECT employee_id, last_name, salary *12 ansal
from employees
order by 3;