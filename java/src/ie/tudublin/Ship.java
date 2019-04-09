package ie.tudublin;

public class Ship
{
    UI ui;
    private int screenwidth;
	private int rectdown;
	private int gap;

public Ship(UI ui,int screenwidth, int rectdown,int gap)
{
    this.ui = ui;
	this.screenwidth = screenwidth;
	this.rectdown = rectdown;
	this.gap = gap;
}
	
//Drawing the Ships outline for the dash and window.
public void render()
{	
	ui.stroke(47,79,79);
	ui.strokeWeight(5);
	ui.fill(105,105,105);
	ui.rect(0, rectdown, screenwidth, gap); 
	ui.line(screenwidth,800,screenwidth - gap,rectdown); //Bottom Right Line
	ui.line(0,800,gap,rectdown); //Bottom Left Line
	ui.line(gap,rectdown,0,0); // Left Top Line
	ui.line(screenwidth, 0, screenwidth-gap, rectdown); // Right Top Line
		// ui.line(200,500,700,500); // Middle Line
}
}