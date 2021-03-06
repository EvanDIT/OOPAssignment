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
     float rotateval = 0.0f;
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

       
        ui.pushMatrix();
        rotateval += 0.005;
        ui.width = 1520;
        ui.translate(ui.mouseX, ui.mouseY);
        ui.rotate(rotateval);
        if (ui.mousePressed == true) {
            ui.rotate(rotateval * 100); 
        }
        ui.fill(0,0,255);
        ui.noStroke();
        ui.ellipse(50,0, 50,5);
        ui.ellipse(0,50, 5,50);
        ui.ellipse(-50,0, 50,5);
        ui.ellipse(0,-50, 5,50);

        ui.popMatrix();

                // Code To Have A Flash When Shooting
                if (ui.mousePressed == true && (ui.mouseButton == ui.LEFT)) {
                   ui. strokeWeight(20);
                   ui.fill(255,255,0);
                   ui.stroke(255,255,0);
                   ui.ellipse(ui.mouseX, ui.mouseY, 20, 20);
        
                } else if(ui.mousePressed == true && (ui.mouseButton == ui.RIGHT)){
                    ui.fill(255,255,0);
                    ui.stroke(255,255,0);
                    ui.strokeWeight(20);
                    ui.ellipse(ui.mouseX, ui.mouseY, 5, 5);
                }
    }
}