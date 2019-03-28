package ie.tudublin;

class Star{
    UI ui;
    private float x;
    private float y;
    private float z;
    private float width;
    private float height;

    public Star(UI ui, float x, float y,float z, float width, float height)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.z = z;
        this.width = width;
        this.height = height;

    }

Star()
{
   ui.x = ui.random(0,ui.width);
   ui.y = ui.random(0,ui.height);
   ui.z = ui.random(0,ui.width);

}

void update(){

}

void render()
{
    ui.fill(255);
    ui.noStroke();
    ui.ellipse(x, y, 8, 8);
}
}

    
