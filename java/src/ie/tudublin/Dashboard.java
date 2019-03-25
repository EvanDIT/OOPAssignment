package ie.tudublin;

import processing.core.PApplet;

public class Dashboard
{
UI ui;
private float x;
private float y;
private float width;
private float height;
private String text;

public Dashboard(UI ui, float x, float y, float width, float height, String text)
{
    this.ui = ui;
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.text = text;
}

public void render()
{
    ui.stroke(255,0,0);
    ui.rect(x , y , width, height);
    ui.line(300,650,330,680);
    ui.line(300,750,330,720);
    ui.line(330,680,330,720);
    //ui.line(330,330,330,650);
    ui.line(300 + width,650,(300 + width - 30),680);
    ui.line(300 + width,750,(300 + width - 30),720);
    ui.line(330,720,(300 + width) -30,720); // botttom horz line
    ui.line(330,680,(300 + width) - 30,680); // Top Horz Line
    ui.line((300 + width) - 30,720,(300 + width)-30,680); //right vert line

    ui.fill(255,255,10);
    ui.textAlign(PApplet.CENTER, PApplet.CENTER);
    ui.text(text, x + width * 0.5f, y + height * 0.5f);
}


}

