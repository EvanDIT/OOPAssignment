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
// CODE FOR FIREBUTTON BUTTON
    int leftside = 300;
    int leftmiddle = 330;
    int topleft = 650;
    int leftmiddletop = 680;
    int leftsidebottom = 750;
    ui.stroke(0);
    ui.fill(255,0,0);
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
    ui.text("1", 325, 615, 30); //1 text for the frst button
    ui.text("2", 425, 615, 30); //2 text for the frst button
    ui.text("3", 525, 615, 30); //3 text for the frst button

}

//CODE FOR FUEL GUAGE
void gauge()
{
    ui.fill(255,90,0);
    ui.stroke(0,0,0);
    ui.line(1170, 620, 1170, 800);
    ui.line(1100, 620, 1100, 800);

    for (int i = 620; i < 1000; i = i+20) {

        ui.line(1170, i, 1100, i);
        ui.stroke(0);
      }
}

//Drawing the Foward Backwards Knob. Controlled using up and down keys.
void forwardbackward()
{
    ui.stroke(0);
    ui.line(920, 700, 1020, 700);
    int y = 720;
    if (ui.key == ui.CODED) { 
    if (ui.keyCode == ui.UP) { //if up is pressed set the y location to be 640 pixels.
         y = 640;
         ui.fill(107,142,35); // and set it to be green.
     } else if (ui.keyCode == ui.DOWN) { //if the down is pressed set the y location to be 720 pixels.
        y = 720;
        ui.fill(255,0,0); //and set it to be red
     }
         } else { //if neither is pressed
        y = 680; //set the y value to be center of the knob
        ui.fill(255,140,0); //and fill it with an orange colour.
        }
    ui.rect(920, y, 100, 45);
    ui.textSize(20);
    ui.fill(0,0,0);
    ui.text("Foward", 970, 660, 30);
    ui.text("Reverse", 970, 740, 30);
    ui.stroke(0);
    ui.line(910,620,1030,620);
    ui.line(910,785,1030,785);
}
//To Show Status of Speed.
void counter()
    {
        String status = "Reverse"; //if in reverse, "Reverse" is displayed.
        if (ui.key == ui.CODED) {
            if (ui.keyCode == ui.UP) { //if up is pressed the status will display "light speed"
                status = "Light Speed";
            }
            ui.textSize(25);
            ui.fill(255,0,0);
            ui.text("Status : " + status,ui.width/2,570,20);
        }else status = "Cruise Control"; //else it will display "Cruise Control" when in the center.
        ui.textSize(25);
        ui.fill(255,0,0);
        ui.text("Status : " + status,ui.width/2,570,20);

}
}



