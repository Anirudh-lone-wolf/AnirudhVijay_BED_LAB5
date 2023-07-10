# AnirudhVijay_BED_LAB5
## This Repository has solution for Lab 5 Problem Statement
* This is a Spring MVC Project built using Spring Boot.
* The main package is : com.greatlearning.employeemanagement which conatins the driver class of the application.
* There are 5 sub-packages :
    * com.greatlearning.employeemanagement.model - the entity class
    * com.greatlearning.employeemanagement.doa - contains an interface which extends JpaRepository for database related operations in spring
    * com.greatlearning.employeemanagement.service - which will has an Interface and an implementation class. Here the JpaRepository methods are used for                                                               different CRUD operations required by the use case
    * com.greatlearning.employeemanagement.controller - which will have url mappings to perfom different CRUD functionalities in the UI
* The database used in the Project is H2 in-memory databse. I find it is good for testing purposes.
