package ie.tudublin;



public class Ship
{
    UI ui;
    private int height;
    private int width;


public Ship(UI ui,int height,int width)
{
    this.ui = ui;
    this.width = width;
    this.height = height;
}

public void render()
{
    int height = 700;
	int width = 900;
	ui.stroke(255,0,0);
	ui.strokeWeight(5);
	ui.rect(0, 500, 900, 250);
	ui.fill(0,169,169);
	ui.line(height,width -400, width, height); //Bottom Right Line
	ui.line(0,height,200,height -200); //Bottom Left Line
	ui.line(200,500,0,0); // Left Top Line
	ui.line(width,0,height, width - 400); // Right Top Line
	ui.line(200,500,700,500); // Middle Line
}
}