import processing.core.PApplet;

public class ProcessingOOPAttempt extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static final int SPEED = 1;
    int x = 0;

    public static void main(String[] args) {
        PApplet.main("ProcessingOOPAttempt",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        Balls b1 = new Balls(HEIGHT/5,SPEED);
        Balls b2 = new Balls(HEIGHT*2/5,SPEED*2);
        Balls b3 = new Balls(HEIGHT*3/5,SPEED*3);
        Balls b4 = new Balls(HEIGHT*4/5,SPEED*4);
        drawCircle(b1.speed,b1.height);
        drawCircle(b2.speed,b2.height);
        drawCircle(b3.speed,b3.height);
        drawCircle(b4.speed,b4.height);
        x++;
    }

    private void drawCircle(int speedOfBall,int heightFromTop)
    {
        ellipse(x*speedOfBall,heightFromTop,DIAMETER,DIAMETER);
    }
}
