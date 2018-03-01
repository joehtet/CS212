Joseph Htet
Homework 3
CS212 


Design the simulation of a parking system using OOP principles.  Your code should include these 5 classes:

    1) ParkedCar
    2) ParkingMeter
    3) PoliceOfficer
    4) ParkingTicket
    5) ParkingSimulation



1) ParkedCar

    Description:
        Instantiating an object of this class will generate a random car (random make, model, license#, etc..) which represents a parked car in a parking spot.

    Fields:  Construct these 3 fields below which are arrays of string values. These will be used to randomize the car.

            makes[] - Make of the car:
            models[] - Model of the car
            colors[] - car colors

        Private members:        
            make, model, color - generated randomly using pickOne method. Ex. to get the make, call pickOne(makes)
            license - generate a license number using generateLicense()
            meter  - instantiate a new object of ParkingMeter class

    Methods: 
        generateLicense() - Generate a random license plate number and return it as a string. The format is 3 letters and 4 numbers (ex. "ABC1234")
        pickOne(String[] choices) - Return a random element in the given array. 
        expiredMeter() - return meter.isExpired()
        adjustMeter(int x) - adjust how much time is left on the meter by subtracting x 
        toString() - return string containing information about the color, make, model, and License number of the car.

        Getters:
            getMake() - get make
            getModel() - get model
            getColor() - get color
            getLicense() - get license
            getFine() - get fine amount from meter

2) Parking Meter

    Description:
        ParkingMeter class simulates a parking meter. So, it will randomly generated time left on the meter (Max time generated = 100 minutes). It can also check whether it is expired or get the fine amount.

    Fields:
        int timeLeft = 0 - Shows how much time is left on the meter. Initialized to 0.
        
    Methods:
        ParkingMeter()  - Constructor method which sets timeLeft to a random integer value up to 100.
        isExpired() - Check if timeLeft is less than zero. Returns boolean value.
        remove(int x) - subtracts a certain amount of time (x) from timeLeft.
        getFine() - returns the fine amount as a string (ex. "$45"). The fine is $25 if timeLeft > -60.  otherwise, the fine is equal to this formula: 
                    fine = 25 + -10 * (timeLeft/60)

3) Police Officer
    
    Description:
        This class can issue tickets to the parked cars by using the ParkingTicket class.

    Fields:
        badgeNumber - private integer which is randomly generated from 0-20
    
    Methods:
        getBadgeNumber() - return badgeNumber
        issueTicket(ParkedCar parkedCar) - return a new object called through ParkingTicket(this, parkedCar)


4) ParkingTicket
    Description:
        This class simulates a parking ticket and will contain information such as:
            - badge number of the officer who issued the ticket
            - information of the car in violation
            - fine amount

    Fields:
        These fields include three strings:
        officer - "Officer badge number: "
        car -  "Parked Car information: "
        fine - "Fine "

    Methods:
        ParkingTicket(PoliceOfficer policeOfficer, ParkedCar parkedCar) - 
        toString() - Return a string which shows information about the car, fine, and officer badge number.

5) Parking Simulation
    Description:
        This is the main program for the project. It will simulate parked cars on a busy street over a 24 hour period.

        Initialize 



