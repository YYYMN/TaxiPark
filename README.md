# taxipark

The application is implemented as a RESTful API for registering drivers in a taxi park, including the following API methods:

- POST (/driver) - method for creating a driver in the system with information (full name, date of birth, gender, address, driver's license number)

- GET (/driver/{id} - a method for obtaining information about a specific driver

- GET (/driver) - method for getting a list of drivers

- GET (/driver/pagination/{page}/{size}) - pagination method for page-by-page list of drivers

- PUT (/driver/{id} - method for changing driver information

- DELETE (driver/{id}) - a method for deleting a driver

Data is transmitted in JSON format. All data is stored in the MySQL database.

MySql dump located - taxipark\src\main\resources\dbdump\DBDump.sql 

Postaman collection to be imported: taxipark\src\test\resources\taxi_park.postman_collection.json
