GROUP AA LAB ASSESMENT

Using objects and classes create a simple java program that prompts the user to enter the coordinates
of two points, create two "Point" objects with those coordinates, calculate the distance between
them using the "distance" method, and print out the result.

Create a class named "Point" with the following properties:
x-coordinate (double).
y-coordinate (double).
Add a constructor to the "Point" class that takes two double parameters (x and y) and initializes
the properties.
Add a method named "distance" to the "Point" class that takes another "Point" object as a
parameter and returns the distance. between the two points using the distance formula:
distance = sqrt((x2 - x1)^2 + (y2 - y1)^2).
Create a new class named "Distance Calculator" that contains the main method.
In the main method of the "Distance Calculator" class, create two "Point" objects and initialize
them with user input for the x and y coordinates.
Call the "distance" method on one of the "Point" objects, passing in the other "Point" object as a
parameter.