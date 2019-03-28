package ie.tudublin;

//import processing.core.PApplet;

public class Bar
{
    private float x;
    private float dx = 0.2f;
    private float y;

    UI ui;

    public Bar(UI ui, float x, float y)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;

    }
    
    public void render()
    {
        ui.noStroke();
        ui.fill(255,0,0);
        ui.rect(1100, y , 72, 200);
        ui.stroke(255,0,0);
        ui.line(1100,620,402,77);
        ui.stroke(255,0,0);
        // Static field
        

    }

    public void update()
    {
        y += dx;
        if ((y > ui.height - 40) || (y < 620))
        {
            dx *= -1;
        }
    }
}
