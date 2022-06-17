## JAVA - EMPLOYEE MANAGEMENT SYSTEM
This is a console user interface where you can create, read, update and delete employee profiles:
- Run the project with your IDE of compile then run:
    -  `java com.cognixia.jump.employees`

## Classes
- Driver:
    - entry point of the application
    - main method
- Application
    - displays menu
    - takes user input
    - transmits the input to Router
    - provides helper functions
- Router
    - redirects to proper user interface depending on the option selected from the menu.
- UserInterface
    - displays CRUD menus
    - takes user input
    - transmits data to DataStore
- DataStore
    - stores data in an ArrayList of HashMaps
    `ArrayList<HashMap<String, String>>`
    - performs CRUD operations using the ArrayList and Streams
    