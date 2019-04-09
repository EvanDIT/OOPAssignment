package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class UI extends PApplet {
    Button b;
    MovingCircle mc;
    Ship s;
    Dashboard dash;
    float circleC;
    float circleC2;
    float circleC3;
    PImage img;
    PImage moon;
    Aim a;
    Bar bar;


    // 3 Arrays for the moving star field
    float[] x = new float[100];
    float[] y = new float[100];
    float[] speed = new float[250];
 
 


    boolean[] keys = new boolean[1024];

    public void keyPressed() {
        keys[keyCode] = true;
    }

    public void keyReleased() {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c) {
        return keys[c] || keys[Character.toUpperCase(c)];
    }

    public void settings() {
        size(1520, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        // fullScreen();
    }

    public void setup() {

        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height / 2, 100);
        s = new Ship(this, 1516, 595, 200);
        radar = new Radar(this, 1, width / 2, height / 2, 100);
        dash = new Dashboard(this, 300, 650, 250, 100, "Fire");
        bar = new Bar(this, height / 2 + 230);
        img = loadImage("cfiber.jpg");
        moon = loadImage("Capture.PNG");
        a = new Aim(this);
        a = new Aim(this);
        a = new Aim(this);

        // Circles for Radar
        circleC = width / 2;
        circleC2 = (float) (width / 2);
        circleC3 = (float) (width / 2);

        // Moving Stars
        int i = 0;
        while (i < 100) {
            x[i] = random(0, width / 2); //X Stars are given a random location on the x axis.
            y[i] = random(0, height);// When Y stars are created they are given a random location on the y axis.
            speed[i] = random(1,10);//Speed is random between  1 and 10.
            i = i + 1;
        }

        
    }

    Radar radar;
	public double rotateval;

    public void draw() {
        background(0);
        // b.render();
        // mc.update();
        // mc.render();
        image(moon,30,30);

        // For the Moving Star Field
        int i = 0;
        while (i < 100) {
            stroke(255, 255, 0);
            strokeWeight(2);
            fill(255);
            ellipse(x[i], y[i], 10, 10);
        if (keyCode == UP) {
            x[i] = x[i] - speed[i]; //Stars Going right to left 
            }
        else
            x[i] = x[i] - speed[i] / 3; //Stars going from right to left.
         if (x[i] < 0) { //If left boarder is reached then wrap around
            x[i] = width /2; //Spawn In The Middle, Wrap From Middle.
            }
            i = i + 1;
    }

        // Code To Have A Flash When Shooting
        if (mousePressed == true && (mouseButton == LEFT)) {
            strokeWeight(20);
            ellipse(mouseX, mouseY, 20, 20);

        } else if(mousePressed == true && (mouseButton == RIGHT)){
            strokeWeight(20);
        }


        a.render();
        s.render();
        image(img,0,598);
        radar.update();
        radar.render();
        radar.radardots();
        dash.render();
        dash.buttons();
        bar.update();
        bar.render();
        dash.gauge();
        dash.forwardbackward();
        dash.counter();
        
}
                    

    public void ellipse(Object mouseX, Object mouseY, float f, double d) {
	}

	public void stroke() {
	}
}

 