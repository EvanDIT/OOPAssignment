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

	int screenwidth = 1516;
	int rectdown = 595;
	int gap = 200;


	ui.stroke(47,79,79);
	ui.strokeWeight(5);
	ui.fill(150,200,255);
	ui.rect(0, rectdown, screenwidth, gap); 
	ui.line(screenwidth,800,screenwidth - gap,rectdown); //Bottom Right Line
	ui.line(0,800,gap,rectdown); //Bottom Left Line
	ui.line(gap,rectdown,0,0); // Left Top Line
	ui.line(screenwidth, 0, screenwidth-gap, rectdown); // Right Top Line
		// ui.line(200,500,700,500); // Middle Line
	
}
}