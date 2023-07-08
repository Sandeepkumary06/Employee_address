
# Employee Address 


This is a backend API built using the Spring framework that handles various HTTP requests for Employee address domain. The API allows employee to create accounts and manage addresses

---

## Framework Used
* Spring Boot

---


## Dependencies
The following dependencies are required to run the project:

* Spring Boot Dev Tools
* Spring Web
* Spring Data JPA
* MySQL Driver
* Lombok


## Database Configuration
To connect to a MySQL database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:
```
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/<DatabaseName>
spring.datasource.username = <userName>
spring.datasource.password = <password>
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

```

## Language Used
* Java

---

## Data Model

The Job data model is defined in the Job class, which has the following attributes:
* Employee Model
```
id (Long)
first name (String)
lastName (String)
address (Address)
```

* Address Model
```
id (Long)
street (String)
City (String)
state (String)
Zipcode (String)
```

## Data Flow

1. The user at client side sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---



## API End Points 

The following endpoints are available in the API:

* Employee
```
GET /employees - get all employees
GET /employees/{id} - get an employee by id
POST /employees - create a new employee
PUT /employees/{id} - update an employee by id
DELETE /employees/{id} - delete an employee by id
```
* Address
```
GET /addresses - get all addresses
GET /addresses/{id} - get an address by id
POST /addresses - create a new address
PUT /addresses/{id} - update an address by id
DELETE /addresses/{id} - delete an address by id
```

## DataBase Used
* SQL database
```
We have used Persistent database to implement CRUD Operations.
```
---

## Project Summary
This Api provides functionality to store Addresses of employee. It provies basic CRUD operations & uses 'OnetoOne' mapping to map address to their respective empolyee

