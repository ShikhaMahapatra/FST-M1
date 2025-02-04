CREATE TABLE salesman (
    salesman_id int,
    salesman_name varchar2(32),
    salesman_city varchar2(32),
    commission int
);

-- Insert multiple rows at once
INSERT ALL
    INTO salesman VALUES(5001, 'James Hoog', 'New York', 15)
    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13)
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
    
SELECT 1 FROM DUAL;
SELECT * from salesman;

-- View data from all columns
-- Show data from the salesman_id and city columns
SELECT salesman_id, salesman_city FROM salesman;

-- Show data of salesman from Paris
SELECT * FROM salesman WHERE salesman_city='Paris';

-- Show salesman_id and commission of Paul Adam
SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';
