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
        dash = new Dashboard(this, 300, 650, 250, 100, "Fire");
        bar = new Bar(this, height/2 + 230);
        // a = new Aim(this, mouseX, mouseY, 150, 150);
        // a = new Aim(this, mouseX, mouseY, 100, 100);
        // a = new Aim(this, mouseX, mouseY, 20, 20);
        img = loadImage("cfiber.jpg");
        moon = loadImage("Capture.PNG");
        a = new Aim(this, mouseX, mouseY, 150, 150);
        a = new Aim(this, mouseX, mouseY, 100, 100);
        a = new Aim(this, mouseX, mouseY, 20, 20);
        

        
    
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
       // mc.update();
        //mc.render();
        image(moon,0,0);
        a.render();
        s.render();
        image(img,0,598);
        a.render();
        radar.update();
        radar.render();
        radar.radardots();
        dash.render();
        dash.buttons();
        bar.update();
        bar.render();
        dash.gauge();
        dash.forwardbackward();
}
                    
	public void ellipse(Object mouseX, Object mouseY, float f, double d) {
	}

	public void stroke() {
	}
}

 