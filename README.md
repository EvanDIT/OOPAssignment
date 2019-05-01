# SciFi UI Project

Name: Evan McEvoy

Student Number: C17308306

Fork this repository and use it a starter project for your assignment

# Description of the assignment
 My assignment is based apon a spaceship cockpit.
 The spaceship can do all sorts of stuff such as shoot large or small lasers,
 travel in cruise control to even boost to light speed. All of which are displayed
 in the YouTube video I have attached. 
 

# Instructions
| Button    | Action    |
|-----------|-----------|
| Space Bar | Puts the spaceship in Cruise Control mode.|
| Up Arrow  | Puts the spaceship in Light Speed mode.   |
| Down Arrow| Puts the spaceship in Reverse mode.       |
| Left Click| Shoots large laser from crosshair.        |
|Right Click| Shoots small laser from crosshair.        |
| R&L Click | Activates the shoot button and changes it colour when clicked.|


# How it works
 The assignment has 7 class files and 1 main file:
 1. UI.java : This java class file is impoartant. This file gets called by main.java when the program is ran. This file contains settings() where the size of the screen is delcared,setup() that holds the while loops for the star arrays. It also creates objects and calls the constructors in the other classes. The constructor also gets passed attributes inside the paramaters. Finaly the draw() method that is used to call methods in other classes and draw the graphics on screen. 
 2. Ship.java : This java class file contains all the code relevant for drawing the windscreen of the spaceship and the outline of the dashboard. The ship is passed values through the ship constructor in parameters.  It also has a render() method for drawing the graphics which gets called in the draw() method in the UI.java file.
 3. Dashboard.java : This java class file contains methods for the dashboard. render() contains code for the fire button, buttons() is for the 3 buttons over the fire button, fowardbackward() is for drawing the control knob which is controlled using up, down and spacebar keys.The method counter() displays the Satus: of the ship depending on the key pressed. Up = LightSpeed, Down = Reverse else, CruisControl.
 4. Radar.java : This java class file uses encapsulation by using getters and setters. This file has method render() that displays the radar and enemy dots. This class also rotates the dots faster or at normal speed depending on the key pressed. UP =  0.5 times the normal speed.
 5. Main.java : This java file is the main file for the running of the assignment
 6. Aim.java : This java class file has a render() method that draws the crosshair on the screen. It uses pushMatrix and popMatrix() for the rotating optical inside the crosshair. Inside the render() method it checks if left or right mouse was clicked and depending on the mouse input it draws a large or small yellow circle. 
 7. Bar.java : This java class file has an update() method that updates the drawing of the rect by updating the Y value. 
 8. Button.java : This java class file has render() method that draws a rect at the coords given in the constructor. It also contains a text in the center. 
 
 # What I am most proud of in the assignment
 I was most proud about the overall appearance and interactivity
 in my assignment. Having struggled with code throughout college I thought that I would struggle a ton with this assignment.
 However, I enjoyed java processing as it enabled me to code and to see the graphics on screen reflect
 what my code does. That satifaction and happy feeling I got when the graphics on screen 
 did what I intended to do through my code is a great feeling. I had trouble with the arrays to create the stars but after 
 hours of research and many attempts later I finall got it to work. 

#Youtube

[YouTube](https://www.youtube.com/watch?v=zK2SgnWHNNg)



