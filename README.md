# Tech Talent Infiniti

Created by Jordan Mor, Jonathan Payne And Teague O'Connor. Copyright 2019. All Rights Reserved.

Tech Talent Infiniti Front Desk service tool
.
Developed using Eclipse version: 2019-03 (4.11.0)
Java SDK 12.0.1
Junit testing provided by J Unit 5.0

Welcome to the Tech Talent Infiniti User Reference and Design Manual

Program is designed to read user entry off a menu and place them onto a queue in which they are then serviced in the order received.

The Program takes entry as the "Front Desk." The Front Desk is then able to place them into three distinct queues, Full Sale, Lease, and Finance. Each categories receives it's own queue, in which requests are stored and gathered from. Requests for vehicles are then stored and matched with existing vehicles that are hard coded into our program. Vehicles are stored in an vehicle class then paired with  a stock number. vehicle and stock number are paired in a hashmap, so that each vehicle and be identified by the same stock number.

IVehicle.java Class
Contains methods used to implement Vehicle.java Class

Vehicle.java Class
Vehicles are broken into two types cars, and light Truck. the Light Truck class extends the Vehicle class, which is implemented from the Ivehicle interface. The Vehicle Class constructs the Vehicle object in which the vehicle information is stored. Getter and Setter functions  are created with inthe class in order to make the data available within the package.
The Client Vehicle and Sales Request we used interfaces as a way of abstracting the variables from the user.

Client.java Class
Client class  implements the IClient The Client Class then constructs the Client Object which is used to store Client information. Clients information (Full Name, Address, Phone, Number and id number)  are then stored in the client object. Getter and Setter functions are created within the class in order to make the data available throughout the entire package.
IClient.java Class
Contains Methods used to implement Client.java Class
SaleRequest.java Class
SalesRequest Class implements the  iSalesRequest.java Class which abstracts the corresponding variables and methods. The SalesRequest.java Class Constructs the SalesRequest Object which has the parameters Vehicle Object, Type of Sale String and Client Object). The SalesRequest Object will then be used to match a customer to a vehicle.
Created by Jordan Mor, Jonathan Payne And Teague O'Connor. Copyright 2019. All Rights Reserved.
Tech Talent Infiniti Front Desk service tool.
Developed using Eclipse version:
Java SDK 12.0.1
Junit testing
provided by J Unit 5.0
Welcome to the Tech Talent Infiniti User Reference and Design Manual

Program Overview:
Program is designed to read user entry off a menu and place them onto a queue in which they are then serviced in the order received.


Program Design:
The Program takes entry as the "Front Desk." The Front Desk is then able to place them into three distinct queues, Full Sale, Lease, and Finance. Each categories receives it's own queue, in which requests are stored and gathered from. Requests for vehicles are then stored and matched with existing vehicles that are hard coded into our program. Vehicles are stored in an vehicle class then paired with  a stock number. vehicle and stock number are paired in a hashmap, so that each vehicle and be identified by the same stock number.

IVehicle.java Class
Contains methods used to implement Vehicle.java Class


Vehicle.java Class

Vehicles are broken into two types cars, and light Truck. the Light Truck class extends the Vehicle class, which is implemented from the IVehicle interface. The Vehicle Class constructs the Vehicle object in which the vehicle information is stored. Getter and Setter functions  are created with in the class in order to make the data available within the package.

The Client Vehicle and Sales Request we used interfaces as a way of abstracting the variables from the user.


Client.java Class

Client class  implements the IClient The Client Class then constructs the Client Object which is used to store Client information. Clients information (Full Name, Address, Phone, Number and id number)  are then stored in the client object. Getter and Setter functions are created within the class in order to make the data available throughout the entire package.

IClient.java Class
Contains Methods used to implement Client.java Class


SaleRequest.java Class
SalesRequest Class implements the  iSalesRequest.java Class which abstracts the corresponding variables and methods. The SalesRequest.java Class Constructs the SalesRequest Object which has the parameters Vehicle Object, Type of Sale String and Client Object). The SalesRequest Object will then be used to match a customer to a vehicle.
 
FrontDeskMenu.java
Imports libraries
java.util.Scanner;
Takes user inputted client information (Full Name, address, phone number, type of sale) and stores into a client object, and a sales type object, then is placed into the respective queue list. 