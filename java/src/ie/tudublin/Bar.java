package ie.tudublin;

//import processing.core.PApplet;

public class Bar
{
    private float dx = 0.2f;
    private float y;

    UI ui;

    public Bar(UI ui,float y)
    {
        this.ui = ui;
        this.y = y;

    }
    
    public void render()
    {
        ui.noStroke();
        ui.fill(89,218,42);
        ui.rect(1100, y , 72, 200);
        // Static field
        

    }

    public void update()
    {
        y += dx;
        if ((y > ui.height - 30) || (y < 620))
        {
            dx *= -1;
        }
    }
}
