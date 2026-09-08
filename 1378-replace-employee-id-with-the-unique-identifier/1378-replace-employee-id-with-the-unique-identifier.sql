select unique_id, name
FROM Employees as emp
LEFT JOIN EmployeeUNI as emp1
ON emp.id = emp1.id;

