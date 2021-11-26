// 1)NA ftixoume ena pop up window gia otan kanei kati to opoio den epitrepete

/*
TODO:
PROMOTE PETAEI STACK OVERFLOW
CONTRACTED HIRE DEN GINETAI


*/

/*
SELECT tmp.ID,tmp.fname,tmp.lname, p.total_amount, CONCAT(p.month,' - ', p.year) AS date 
FROM payments p
INNER JOIN
    (SELECT DISTINCT emp.Employee_ID AS ID ,emp.first_name AS fname,emp.last_name AS lname
    FROM employee emp, contracted_administrative ca, permanent_administrative pa
    WHERE emp.Employee_ID = ca.Employee_ID OR pa.Employee_ID = emp.Employee_ID) 
tmp ON p.Employee_ID = tmp.ID


*/