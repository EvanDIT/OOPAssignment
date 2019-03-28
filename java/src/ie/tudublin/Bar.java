package ie.tudublin;

//import processing.core.PApplet;

public class Bar
{
    private float x;
    private float dx = 0.8f;
    private float y;
    private float diameter;
    private float radius;
    UI ui;

    public Bar(UI ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        radius = diameter / 4;
    }
    
    public void render()
    {
        ui.noStroke();
        ui.fill(255,0,0);
        ui.rect(1100, y , 72, 150);
        ui.fill(180,30,22);
        // Static field
        

    }

    public void update()
    {
        y += dx;
        if ((y > ui.height- radius + 40) || (y < radius + 525))
        {
            dx *= -1;
        }
    }
}
