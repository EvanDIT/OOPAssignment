package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class UI extends PApplet
{
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
  

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        size(1520,800);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(); 
    }
    
public void setup()
    {
        
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height / 2, 100);
        s = new Ship(this,1516,595,200);
        radar = new Radar(this, 1, width / 2, height / 2, 100);
        dash = new Dashboard(this, 300, 650, 250, 100, "Landing Gear");
        bar = new Bar(this, height/2 + 230);
        a = new Aim(this, mouseX, mouseY, 100, 100);
        img = loadImage("cfiber.jpg");
        moon = loadImage("Capture.PNG");
        

        
    
        //Circles for Radar
        circleC = width / 2;
        circleC2 = (float) (width / 2);
        circleC3 = (float) (width / 2);
    }

    
    Radar radar;
	public Object y;
	public Object x;
	public float z;
   
    public void draw()
    {
        background(0);   
       // b.render();
        mc.update();
        mc.render();
        image(moon,0,0);
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
        

       //FOWARDS BACKWARDS CODE
        stroke(0);
        line(920, 700, 1020, 700);
        int y = 720;
        if (key == CODED) {
        if (keyCode == UP) {
             y = 640;
             fill(107,142,35);
         } else if (keyCode == DOWN) {
            y = 720;
            fill(255,0,0);
         }
             } else {
              y = 680;
              fill(255,140,0);
            }
        rect(920, y, 100, 45);
        textSize(20);
        fill(0,0,0);
        text("Foward", 970, 660, 30);
        text("Reverse", 970, 740, 30);
        stroke(0);
        line(910,620,1030,620);
        line(910,785,1030,785);

}
                    
    //     if (checkKey(LEFT))
    //     {
    //         System.out.println("Left arrow key pressed");
    //     }
    // }


	public void ellipse(Object mouseX, Object mouseY, float f, double d) {
	}

	public void stroke() {
	}
}

 