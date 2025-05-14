package codes_in_notes;

import java.awt.*;

public class Point1 {

    public static void printPoint(Point p){
        System.out.println(p.x+" , "+p.y);
    }

    public static double distanceCal(Point p1, Point p2) {
        int dx = p2.x- p1.x;
        int dy = p2.y- p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {

        Point point1 = new Point(7,8);
        Point point2 = new Point(4,4);

        System.out.println(point2);
        printPoint(point1);

        double distance =distanceCal(point1,point2);
        System.out.println(distance);
    }

}
