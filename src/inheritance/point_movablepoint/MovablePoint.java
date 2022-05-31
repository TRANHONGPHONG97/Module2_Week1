package inheritance.point_movablepoint;

import java.util.Arrays;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    MovablePoint(){}
    public void MovablePoint(float x, float y, float xSpeed, float ySpeed){
         super.getX();
         super.getY();
         this.xSpeed = xSpeed;
         this.ySpeed = ySpeed;
    }
    public void MovablePonit(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float [] getSpeed(){
        return new float[] {xSpeed,ySpeed};
    }
    public void move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }

    @Override
    public String toString() {
        return "MovablePoint{" + getX()+ "," + getY()+")"
                +"Speed: " + Arrays.toString(getSpeed());
    }
}
