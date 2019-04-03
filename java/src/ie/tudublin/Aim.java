package ie.tudublin;

public class Aim
{

    UI ui;
    // private float x;
    // private float y;
    // private float width;
    // private float height;

    public Aim(UI ui)
    {
        this.ui = ui;
    //     this.x = x;
    //     this.y = y;
    //     this.width = width;
    //     this.height = height;
     }

    public void render()
    {
         int diameter = 150;
         int diameter2 = 100;
         int diameter3 = 20;
        //Outter Large Circle
        ui.stroke(25,25,112);
        ui.strokeWeight(5);
        ui.noFill();
        ui.ellipse(ui.mouseX, ui.mouseY, diameter, diameter);
        //Smaller Circles
        ui.stroke(0,0,255);
        ui.ellipse(ui.mouseX, ui.mouseY, diameter2, diameter2);
        if (ui.mousePressed == true) {
            ui.fill(255,255,35); 
        }
        ui.ellipse(ui.mouseX, ui.mouseY, diameter3, diameter3);
        //Top Lines
        ui.stroke(25,25,112);
        ui.line(ui.mouseX -75, ui.mouseY, 0, 0);
        ui.line(ui.mouseX  + 75, ui.mouseY, 1520, 0);
        //Bottom Lines
        ui.line(ui.mouseX +  75, ui.mouseY, 1520,595);
        ui.line(ui.mouseX -  75, ui.mouseY, 0,595);
    }
}