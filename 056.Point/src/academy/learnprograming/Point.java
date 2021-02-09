package academy.learnprograming;
import java.math.*;

public class Point {
    private int x;
    private int y;

    public Point()
    {
        x = 0;
        y = 0;
    }
    public Point(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    public double distance(int x,int y)
    {
        return (Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y)));
    }

    public double distance()
    {
      return distance(0,0);
    }
    public double distance(Point point )
    {
        return ( distance(point.getX(),point.getY()));
    }
}