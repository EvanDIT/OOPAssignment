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

public Dashboard(UI ui, float x, float y, float width, float height, String text,float circleC,float circleC2,float circleC3)
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
// CODE FOR LANDING GEAR BUTTON
int leftside = 300;
int leftmiddle = 330;
int topleft = 650;
int leftmiddletop = 680;
int leftsidebottom = 750;
    ui.stroke(255,0,0);
    ui.fill(25,25,112);
    ui.rect(x , y , width, height);
    ui.line(leftside,topleft,leftmiddle,leftmiddletop);
    ui.line(leftside,leftsidebottom,leftmiddle,720);
    ui.line(leftmiddle,leftmiddletop,leftmiddle,720);
    ui.line(leftside + width,topleft,(leftside + width - 30),leftmiddletop);
    ui.line(leftside + width,leftsidebottom,(leftside + width - 30),720);
    ui.line(leftmiddle,720,(leftside + width) -30,720); // botttom horz line
    ui.line(leftmiddle,leftmiddletop,(leftside + width) - 30,leftmiddletop); // Top Horz Line
    ui.line((leftside + width) - 30,720,(leftside + width)-30,leftmiddletop); //right vert line
    ui.fill(255,255,10);
    ui.textAlign(PApplet.CENTER, PApplet.CENTER);
    ui.text(text, x + width * 0.5f, y + height * 0.5f);
}

void buttons()
{
//Loop to draw 3 buttons that spread over the landing gear button.
    ui.stroke(0,100,0);
    int gridSize = 3;	
    for(int i = 0 ; i < gridSize ; i ++)
    {
        float x = i * 100 + 300;
        ui.fill(255,225,10);           
        ui.rect(x, 605, 50,30);
    }
}

void radardots()
{
   ui.fill(255,0,0);
    ui.noStroke();
    ui.circleC = ui.circleC + random((float) -0.1, (float) 0.1);
    ui.ellipse(ui.circleC, 680, 10,10);
    ui.circleC2= ui.circleC2 + random((float) -0.09, (float) 0.05);
    ui.ellipse(ui.circleC2, 700, 10,10);
    ui.circleC2=ui.circleC2+ random((float) -0.02, (float) 0.04);
    ui.ellipse(ui.circleC3, 750, 10,10);  
}

    private float random(float f, float g) {
        return 0;
    }

}

