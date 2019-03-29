package ie.tudublin;

import processing.core.PApplet;

public class Aim
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;

    public Aim(UI ui, float x, float y, float width, float height)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void render()
    {
        ui.stroke(25,25,112);
        ui.noFill();
        ui.ellipse(ui.mouseX, ui.mouseY, 150, 150);

        ui.stroke(0,0,255);
        ui.ellipse(ui.mouseX, ui.mouseY, 100, 100);

        ui.stroke(25,25,112);
        ui.line(ui.mouseX -75, ui.mouseY, 0, 0);
        ui.line(ui.mouseX  + 75, ui.mouseY, 1520, 0);

        ui.line(ui.mouseX +  75, ui.mouseY, 1520,595);
        ui.line(ui.mouseX -  75, ui.mouseY, 0,595);



    }
}