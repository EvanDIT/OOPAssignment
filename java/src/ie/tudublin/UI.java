package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
    Ship s;
  

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
        mc = new MovingCircle(this, width / 2, height / 2, 50);
        s = new Ship(this,width,height);
        radar = new Radar(this, 1, width / 2, height / 2, 100);
    }

    
    Radar radar;
    public void draw()
    {
        background(0);
        b.render();
        mc.update();
        mc.render();
        s.render();
        radar.update();
        radar.render();


        noFill();
        ellipse(mouseX, mouseY, 50, 50);
        stroke(255);


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

