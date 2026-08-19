# Write your MySQL query statement below
SELECT e.name As Employee from  Employee e join Employee m on e.ManagerId=m.Id Where e.Salary>m.Salary;