package ie.tudublin;

import processing.core.PApplet;

public class Button
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String text;

    public Button(UI ui, float x, float y, float width, float height, String text)
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
        ui.stroke(0);
        ui.rect(x , y , width, height);//Drawing the button
        ui.textAlign(PApplet.CENTER, PApplet.CENTER); //Draw Text In Center Of Button
        ui.text(text, x + width * 0.5f, y + height * 0.5f); //Text Location
    }
}