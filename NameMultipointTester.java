package Point;
import java.util.Scanner;

public class NameMultipointTester extends SixPointDistanceTester{
    Scanner input = new Scanner(System.in);

    public static NamedPoint[] enterPointName() {
        char name = 'a';
        NamedPoint[] points = new NamedPoint[6];
        for (int i = 0; i < points.length; i++) {
            System.out.print("Point " + name + ": ");
            double x = input.nextDouble();
            double y = input.nextDouble();
            input.nextLine();
            points[i] = new NamedPoint(Character.toString(name), x, y);
            name++;
        }
        return points;
    }

    public static void computeShortestDistance(Point[] points){

        //we will complete this part on Thursday
        double shortestDistance = Point.distance(points[0], points[1]); //this line has a logic error. figure it out.
        Point p1 = points[0];
        Point p2 = points[1] ;

        for(int i = 0; i < points.length; i++){

            for(int j = i + 1; j < points.length; j++){

                double aDistance =  Point.distance(points[i], points[j]);

                if(aDistance < shortestDistance){
                    shortestDistance = aDistance;
                    p1 = points[i];
                    p2 = points[j];
                }
            }
        }

        System.out.printf("The shortest distance between two points %s(%.1f, %.1f) and %s(%.1f, %.1f) is %.2f%n"), p1.getName(), p1.getX(), p1.getY(), p2.getName(), p2.getX(), p2.getY(),shortestDistance );

    }

    public static void main(String[] args) {
        computeShortestDistance(enterPointName(points));
    }
}
