import processing.core.PApplet;

public class ProcessingOOPAttempt extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int SPEED = 1;

    Balls b1 = new Balls(this,HEIGHT/5,SPEED);
    Balls b2 = new Balls(this,HEIGHT*2/5,SPEED*2);
    Balls b3 = new Balls(this,HEIGHT*3/5,SPEED*3);
    Balls b4 = new Balls(this,HEIGHT*4/5,SPEED*4);

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
        Balls.ballSpeed();
        b1.drawCircle();
        b2.drawCircle();
        b3.drawCircle();
        b4.drawCircle();
    }
}
