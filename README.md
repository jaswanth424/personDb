Start your mysql database
Target database: mysql
Target table : person

Code by default create table in mysql, so delete the person table from mysql.
Start the application.
insert person data to person table.
run GET to fetch person data.

use mysql;
drop table person;
select * from person;
INSERT INTO person (fname, lname) VALUES ('John', 'Doe'), ('Jane', 'Smith');




curl --location 'http://localhost:8080/v1/persons'
[
    {
        "firstname": "John",
        "lastname": "Doe"
    },
    {
        "firstname": "Jane",
        "lastname": "Smith"
    }
]


# personDb
Fetch person details from Mysql Db
