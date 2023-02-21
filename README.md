Parking Lot Api
Nestor Alduey - Sealed Home Project
Installation Guide
The api was constructed with Spring Boot Framework, using Intelli J IDE, Java 17 Version and Postgres Dockerized.

Install Java 17 (JDK)
Install Docker and Start Docker
By command line go to docker\postgres folder
Execute docker-compose up -d
Confirm that Postgress DB is Running on Docker
By command line go to parkinglot\build\libs
Execute java -jar parkinglot-0.0.1-SNAPSHOT.jar
Data Preloaded
The DB is loaded with 3 Parking Lot, every Parking Lot, has 2 MotorCycle Spots, 6 Car Spots and 2 Van Spots. 1. ParkingLotRowID = 1, Description = Level 1 - All Spots are Available 2. ParkingLotRowID = 2, Description = Level 2 - All Spots are Available 3. ParkingLotRowID = 3, Description = Level 3 - All Spots are Full
Testing API
Open Postman and import "Sealed Parking Lot.postman_collection.json"
There are 6 examples of consuming api:

Parking Lot Availability

Parking Lot Is Full - Returns true if parking lot is full, giving as parameter parkingLotRowId
Spots Are Remaining - Returns number of spots available, giving as parameter parkingLotRowId
Spots Van Taking Up - Return number spots of type van that are with parked, giving as parameter parkingLotRowId and can be modified the request specifying the vehicle_type
Spots Taking Up - Return number of spots that are used in general, giving as parameter parkingLotRowId Vehicle Take in/Out
Vehicle Take In Parking - Giving as parameter, parkingLotRowId and vehicle type, if is ok return the information of the parking spot, if not throws an exception explaining that there's no availability
Vehicle Take Out Parking - Giving as parameter, parkingLotRowId and vehicle type, if is ok return the information of the parking spot that was release, if not throws and exception explaining that nothing was take out of parking
