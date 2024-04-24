--Using the NVL Function
select last_name, salary, NVL(commission_pct,0),
(salary * 12)+(salary *12* NVL(commission_pct,0)) AN_SAL
From employees;


--NVL e Jodi Null hoy, sekhane null er poriborte
--jekono songkha use kora jay, e.g. commission_pct, 1 or 2 or so on.
select first_name, last_name, nvl(commission_pct, 1) from employees;

--Using the NVL2 Function
SELECT last_name, salary, commission_pct,
NVL2(commission_pct,
'SAL+COMM', 'SAL') income
FROM employees WHERE department_id IN (50, 80);


--Using the NULLIF Function
SELECT first_name, LENGTH(first_name) "expr1",
last_name, LENGTH(last_name) "expr2",
NULLIF(LENGTH(first_name), LENGTH(last_name)) result
FROM employees;


--Using the COALESCE Function
SELECT last_name, salary, commission_pct,
COALESCE((salary+(commission_pct*salary)), salary+2000)"New Salary"
FROM employees;


--Using the CASE Expression
SELECT last_name, job_id, salary,
CASE job_id WHEN 'IT_PROG' THEN 1.10*salary
WHEN 'ST_CLERK' THEN 1.15*salary
WHEN 'SA_REP' THEN 1.20*salary
ELSE salary END "REVISED_SALARY"
FROM employees;

--Alternative CASE Function
SELECT last_name,salary,
(CASE WHEN salary<5000 THEN 'Low'
WHEN salary<10000 THEN 'Medium'
WHEN salary<20000 THEN 'Good'
ELSE 'Excellent'
END) qualified_salary
FROM employees;

--Using the DECODE Function
SELECT last_name, job_id, salary,
DECODE(job_id, 'IT_PROG', 1.10*salary,
'ST_CLERK', 1.15*salary,
'SA_REP', 1.20*salary,
salary)
REVISED_SALARY
FROM employees;