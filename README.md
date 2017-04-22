# Smart Home
This project is for Distributed Systems Year 4 in National College of Ireland. Aim of project 

## Collaborators
- Niall Quinn 
- Andrei Ivanov 
- Ronan Ratty 

## Usage
Netbeans Project should have 2 run configurations:  
CORBA - main class smarthome.SmartHomeServer  
HTTP - main class jmdns.HttpServer  

1 - Start the ORB server `tnameserv -ORBInitialPort 49001`  
2 - Run the CORBA build configuration  
3 - Run the HTTP build configuration  
4 - Use HTTP to activate the CORBA Methods  

##HTML Page
Uses ajax to call the url schemes defined in HTTPServer and displays the response from CORBA

`http://localhost:8002/index.html`

### Current Methods
http://localhost:8001/livingroom?turnLightsOn  
http://localhost:8001/livingroom?turnLightsOff  
http://localhost:8001/livingroom?lockDoor  
http://localhost:8001/livingroom?unlockDoor  

All this does is find the method on CORBA tree and invoke it, returning the response which is rendered on the webpage. Needs work to integrate to GUI

To extend to other objects:
Add objects to the CORBA tree in SmarthomeServer class
Create a new context in HTTPServer, like livingroom one
Create a handler for the query in Smarthome.java, like livingroom one (like CORBA client in CA)
