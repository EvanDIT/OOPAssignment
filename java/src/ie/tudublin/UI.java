package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
    Ship s;
    Dashboard dash;
    float circleC;
    float circleC2;
    float circleC3;
  

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
        s = new Ship(this,width,height);
        radar = new Radar(this, 1, width / 2, height / 2, 100);
        dash = new Dashboard(this, 300, 650, 250, 100, "Landing Gear",width / 2f,width /2f,width/2f);
    
        //Circles for Radar
        circleC = width / 2;
        circleC2 = (float) (width / 2);
        circleC3 = (float) (width / 2);
    }

    
    Radar radar;
    int value = 0;
    public void draw()
    {
        background(0);   
        b.render();
        mc.update();
        mc.render();
        s.render();
        radar.update();
        radar.render();
        dash.render();
        dash.buttons();
        dash.radardots();
                    
        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }


	public void ellipse(Object mouseX, Object mouseY, float f, double d) {
	}

	public void stroke() {
	}
}

