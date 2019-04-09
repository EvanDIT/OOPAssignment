package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Radar
{
    private float radius;
    private PVector pos;
    private float frequency;
    private UI ui;
    private float theta = 0;

    public Radar(UI ui, float frequency, float x, float y, float radius)
    {
        this.ui = ui;
        this.frequency = frequency;
        pos = new PVector(x, y);
        this.radius = radius - 20;
    }

    public void render()
    {
        ui.fill(25,25,112);
        ui.stroke(0);
        ui.ellipse(pos.x, pos.y + 300, radius * 2, radius * 2);
        ui.noFill();
        ui.stroke(50,205,50);
        ui.strokeWeight(2);
        ui.ellipse(pos.x, pos.y + 300, radius * 2, radius * 2);
        ui.ellipse(pos.x, pos.y + 300, radius * 1, radius * 1);
        ui.ellipse(pos.x, pos.y + 300, radius * 1, radius * 1);
        ui.ellipse(pos.x, pos.y + 300, radius + 40, radius + 40);
        ui.ellipse(pos.x, pos.y + 300, radius - 40 , radius - 40);
        ui.strokeWeight(2);
        ui.line(pos.x , pos.y - radius + 300 , pos.x, pos.y + 380);  //vertical radar line
        ui.line(pos.x - radius, pos.y + 300, pos.x + radius, pos.y + 300); //horizontal radar line
        float x2 = pos.x + (float) Math.sin(theta) * radius;
        float y2 = pos.y + 300- (float) Math.cos(theta) * radius;
        ui.strokeWeight(3);
        ui.line(pos.x, pos.y + 300, x2, y2); //Moving line 
        
    }
    float rotateval = 0.0f;
    float rotateval2 = 0.0f;
    float rotateval3 = 0.0f;
    void radardots()
{
    ui.pushMatrix();
    rotateval += 0.010;
    ui.width = 1520;
    ui.translate(ui.width/2, 680);
    if (ui.keyCode == ui.UP) {
        rotateval +=-0.5;
    }
    ui.rotate(rotateval);
    ui.fill(255,0,0);
    ui.noStroke();
    ui.ellipse(40, 20, 10,10);
    ui.popMatrix();
    
    ui.pushMatrix();
    rotateval2 += 0.02;
    ui.width = 1520;
    ui.translate(ui.width/2, 690);
    if (ui.keyCode == ui.UP) {
        rotateval2 +=-0.5;
    }
    ui.rotate(rotateval2);
    ui.fill(255,0,0);
    ui.noStroke();
    ui.ellipse(40, 5, 10,10);
    ui.popMatrix();

    ui.pushMatrix();
    rotateval3 += -0.010;
    ui.width = 1520;
    ui.translate(ui.width/2, 680);
    if (ui.keyCode == ui.UP) {
        rotateval3 +=-0.5;
    }
    ui.rotate(rotateval3);
    ui.fill(255,0,0);
    ui.noStroke();
    ui.ellipse(20, 20, 10,10);
    ui.popMatrix();

}

    float timeDelta = 1.0f / 60.0f;

    public void update()
    {
        theta += PApplet.TWO_PI * timeDelta * frequency ;
    }

    /**
     * @return the radius
     */
    public float getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(float radius) {
        this.radius = radius;
    }

    /**
     * @return the pos
     */
    public PVector getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(PVector pos) {
        this.pos = pos;
    }

    /**
     * @return the frequency
     */
    public float getFrequency() {
        return frequency;
    }

    /**
     * @param frequency the frequency to set
     */
    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    
}