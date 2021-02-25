import processing.core.PApplet;

public class Balls extends PApplet {
    public int height;
    public int speed;
    private PApplet ball;
    public int DIAMETER=10;
    public static int x=0;

    public Balls(PApplet ball,int height,int speed) {
        this.ball=ball;
        this.height = height;
        this.speed = speed;
    }

    public static void ballSpeed()
    {
        x++;
    }

    public void drawCircle()
    {
        ball.ellipse(x*speed,height,DIAMETER,DIAMETER);
    }
}


