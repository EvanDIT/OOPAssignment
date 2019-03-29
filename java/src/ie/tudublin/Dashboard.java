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
// CODE FOR LANDING GEAR BUTTON
    int leftside = 300;
    int leftmiddle = 330;
    int topleft = 650;
    int leftmiddletop = 680;
    int leftsidebottom = 750;
    ui.stroke(0);
    ui.fill(255,100,0);
    if (ui.mousePressed == true) {
        ui.fill(107,142,35); 
    } 
    ui.rect(x , y , width, height);
    ui.line(leftside,topleft,leftmiddle,leftmiddletop);
    ui.line(leftside,leftsidebottom,leftmiddle,720);
    ui.line(leftmiddle,leftmiddletop,leftmiddle,720);
    ui.line(leftside + width,topleft,(leftside + width - 30),leftmiddletop);
    ui.line(leftside + width,leftsidebottom,(leftside + width - 30),720);
    ui.line(leftmiddle,720,(leftside + width) -30,720); // botttom horz line
    ui.line(leftmiddle,leftmiddletop,(leftside + width) - 30,leftmiddletop); // Top Horz Line
    ui.line((leftside + width) - 30,720,(leftside + width)-30,leftmiddletop); //right vert line
    ui.fill(0);
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
    ui.fill(0);
    ui.text("1", 325, 615, 30);
    ui.text("2", 425, 615, 30);
    ui.text("3", 525, 615, 30);

}

//CODE FOR FUEL GUAGE
void gauge()
{
    ui.fill(255,90,0);
    ui.stroke(0,0,0);
    ui.line(1170, 620, 1170, 800);
    ui.line(1100, 620, 1100, 800);
    //ui.rect(1100, 590, 70, 300);
  //  int gridSize = 5;
   // float w = width / gridSize - 20;		
    // Nested loop
    // for(int i = 0 ; i < gridSize ; i ++)
    // {
    //     for(int j = 0 ; j < gridSize ; j ++)
    //     {
    //         //float x = i * w + w;
    //         float y = j * w + w;

    //         ui.rect(1170, y, w, w);
    //     }
    // }   
    for (int i = 620; i < 1000; i = i+20) {

        ui.line(1170, i, 1100, i);
        ui.stroke(0);
      
        //ui.rect(1100, 590, 70, 300);
      }
}
}



