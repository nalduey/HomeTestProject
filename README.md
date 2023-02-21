<H1>Parking Lot Api
<H3>Nestor Alduey - Sealed Home Project</H3>

<H2> Installation Guide </H2>

The api was constructed with Spring Boot Framework, using Intelli J IDE,
Java 17 Version and Postgres Dockerized.

1. Install Java 17 (JDK) and Gradle
2. Install Docker and Start Docker
3. By command line go to docker\postgres folder 
4. Execute docker-compose up -d
5. Confirm that Postgress DB is Running on Docker
6. On ParkingLot folder run gradle build command 
6. By command line go to parkinglot\build\libs 
7. Execute java -jar parkinglot-0.0.1-SNAPSHOT.jar


<h2> Data Preloaded </h2>
The DB is loaded with 3 Parking Lot, every Parking Lot, has 2 MotorCycle Spots, 6 Car Spots and 2 Van Spots.
1. ParkingLotRowID = 1, Description = Level 1 - All Spots are Available
2. ParkingLotRowID = 2, Description = Level 2 - All Spots are Available
3. ParkingLotRowID = 3, Description = Level 3 - All Spots are Full

<h2>Testing API</h2>

<h3> Open Postman and import "Sealed Parking Lot.postman_collection.json" </H3>

There are 6 examples of consuming api:

Parking Lot Availability
   1. Parking Lot Is Full - Returns true if parking lot is full, giving as parameter parkingLotRowId
   2. Spots Are Remaining - Returns number of spots available, giving as parameter parkingLotRowId
   3. Spots Van Taking Up - Return number spots of type van that are with parked, giving as parameter parkingLotRowId and can be modified the request specifying the vehicle_type
   4. Spots Taking Up - Return number of spots that are used in general, giving as parameter parkingLotRowId
Vehicle Take in/Out
   5. Vehicle Take In Parking - Giving as parameter, parkingLotRowId and vehicle type, if is ok return the information of the parking spot, if not throws an exception explaining that there's no availability
   6. Vehicle Take Out Parking -  Giving as parameter, parkingLotRowId and vehicle type, if is ok return the information of the parking spot that was release, if not throws and exception explaining that nothing was take out of parking 
