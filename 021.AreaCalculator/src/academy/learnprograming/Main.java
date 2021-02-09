package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	area(5.0);
	area(-1);
	area(5.0,4.0);
	area(-1.0,4.0);
    }
        public static double area(double radius)
        {
            if(radius < 0)
                return -1;

            System.out.println("Area of Circle of radius "+radius+" is "+(Math.PI*radius*radius));
            return (Math.PI*radius*radius);
        }
        public static double area(double x,double y)
        {
            if(x < 0 || y < 0)
                return -1;

            System.out.println("Area of Rectangle of length "+ x +" and breadth "+y+" is "+(x*y));
            return (x * y);
        }
}
