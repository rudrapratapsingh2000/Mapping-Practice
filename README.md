# Mapping Practice 
Created a simple application using Spring Initializer With required depencdencies that manages Students Requirements of an organization i.e., An Admin can perform some operation such as add, update, getAll and delete --> student, laptop, course, books, address etc.

## Frame Work And Language
* Spring Boot 
* Java-17

# Data Flow 
 ## Model
   * ### Address Model
        * #### addressId
        * #### landmark
        * #### zipcode
        * #### district
        * ####  state
        * ####  country
   * ### Book Model
        * #### Id
        * #### title
        * #### author
        * #### description
        * #### price
        * #### @ManyToOne -> student
   * ### Course Model
        * #### Id
        * #### title
        * #### description
        * #### duration
        * #### @ManyToMany -> studentList;
   * ### Student Model
        * #### ID
        * #### name
        * #### age
        * #### phone number
        * #### branch
        * #### department
        * #### @OneToOne -> address 
   * ### Laptop  Model
        * #### ID
        * #### name
        * #### brand
        * #### price
        * #### @OneToOne -> student   
        
## Controller
  * #### Student Controller
  * #### Laptop Controller
  * #### Course Controller
  * #### Book Controller  
  * #### Address Controller 
* ### Service 
  #### Student Service
  * Add student
  * update student 
  * delete student
  * Get all students 
  #### Laptop Service
  * Add Laptop
  * Update Laptop
  * Delete Laptop
  * Get All Laptop
  #### Course Service
  * Add Course
  * update Course 
  * delete Course
  * Get all Course 
  #### Book Service
  * Add Book
  * Update Book
  * Delete Book
  * Get All Book  
## Data Structure
* String
* int
* long 

## Authors

- [@Rudra Pratap Singh](https://github.com/rudrapratapsingh2000)

