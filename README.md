## Tech Talent Infiniti - current release: [v0.17.0](https://github.com/jbpayne/TechTalentInfiniti/releases)

<h4>Tech Talent Infiniti Car Dealership Sale Request Creation And Management Tool</h4>

<h5>Created by Jordan Mor, Jonathan Payne, and Teague O'Connor</h5>
<h5>Copyright &copy; 2019. All Rights Reserved&reg;</h5>

Developed using Eclipse version: `2019-03 (4.11.0)`
`Java SDK 12.0.1`
jUnit testing provided by `jUnit5`


<h3>Welcome to the Tech Talent Infiniti User Reference and Design Manual</h3>

A Java command line program designed to read user entry from a menu prompt, create a sale request ticket, and place it into the appropriate queue in order. The sale request tickets are then retrieved from each queue and serviced in the order received.

The Program takes entry as the "Front Desk." The Front Desk is then able to place the entries into three distinct queues, Full Sale, Lease, and Finance. Each category receives its own queue, into which requests are stored, and from which they are gathered. Requests for vehicles are then stored and matched with existing vehicles that are hard coded into our program. Vehicles are stored in a HashMap within the VehicleInventory class, paired with a unique key that matches the stock number.

<h3>Running The Program</h3>

You will need to download the self-contained Java jar file named `tti.jar`.

To run on command line, change to the directory containing `tti.jar` and run:
```
java -jar tti.jar
```
Please visit the [Release](https://github.com/jbpayne/TechTalentInfiniti/releases) page for details.


<h3>Individual Program Structure:</h3>
Program files reside in the `com.tti` package within `src/com/tti`

<h5>IVehicle.java Interface</h5>
Contains methods implemented by Vehicle.java Class

<h5>Vehicle.java Class</h5>
The Vehicle class implements the IVehicle.java interface. The Vehicle Class constructs the Vehicle object, in which the vehicle information is stored. Getter and Setter functions are created within the class in order to make the data available within the package.

<h5>ILightTruck Interface</h5>
Contains methods implemented by LightTruck.java Class

<h5>LightTruck.java Class</h5>
Vehicles are broken into two types: vehicle and light truck. The LightTruck class extends the Vehicle class and implements IVehicle and ILightTruck interfaces. Getter and Setter functions are created within the class in order to make the data available within the package.

<h5>IClient.java Interface</h5>
Contains Methods implemented by Client.java Class

<h5>Client.java Class</h5>
Client.java class implements the IClient.java interface. The Client Class then constructs the Client Object, which is used to store Client information. Client information (Full Name, Address, Phone, Number and id number) is then stored in the Client object. Getter and Setter functions are created within the class in order to make the data available within the package.

<h5>ISaleRequest.java Interface</h5>
Contains Methods implemented by SaleRequest.java Class

<h5>SaleRequest.java Class</h5>
SalesRequest Class implements the  ISaleRequest.java Class, which abstracts the corresponding variables and methods. The SalesRequest.java class constructs the SalesRequest object, with parameters (Vehicle Object, Type of Sale String and Client Object). The SalesRequest Object will then be used to match a customer to a vehicle.

<h5>FrontDeskMenu.java</h5>
Imports libraries
java.util.Scanner;
Takes user input, stored as Client object, then creates a SaleRequest object, in which it stores the Client object along with a selected Vehicle object, finally placing the SaleRequest object in the appropriate queue. 
 
<h5>Queues.java class</h5>
Data Structures used to store the SaleRequest objects and return them in the same order they were stored.
Imports Libraries: 
`java.util.ArrayDeque`
`java.util.Queue`
- Instantiates a new instance of the FullSale queue.
- Instantiates a new instance of the Finance queue.
- Instantiate a new instance of Lease queue.
 
