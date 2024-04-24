--Using the Round Function
--Task 1 (45.923,2),
select round (45.923,2)
from dual;

--Task 2 (45.923,0),
select round (45.923,0)
from dual;

--Task 3 (45.923,-1),
select round (45.923,-1)
from dual;

--Task 4 (59.923,-2),
select round (59.923,-2)
from dual;

--Task 5 (459.923,-3)
select round (459.923,-3)
from dual;

--All in One Place
select round (45.923,2),
 round (45.923,0),
round (45.923,-1),
 round (59.923,-2)
from dual;

--Using the TRUNC Function
--Task 1 (45.923,2),
select TRUNC (45.923,2)
from dual;

--Task 2 (45.923,0),
select TRUNC (45.923,0)
from dual;

--Task 3 (45.923,-1),
select TRUNC (45.923,-1)
from dual;

--Task 4 (59.923,-2),
select TRUNC (59.923,-2)
from dual;

--All in one place
select TRUNC (45.923,2),
 TRUNC (45.923,0),
TRUNC (45.923,-1),
 TRUNC (59.923,-2)
from dual;
