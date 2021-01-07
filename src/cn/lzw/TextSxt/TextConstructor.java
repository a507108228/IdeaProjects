package cn.lzw.TextSxt;

class Point {
    double x, y;

    public Point(double _x, double _y) {
        x = _x;
        y = _y;
    }

    public double getDistance(Point p) {
        return Math.sqrt ((x - p.x) * (y - p.x) * (y - p.y));
    }
}

public class TextConstructor {
    public static void main (String[] args){
     Point p =new Point (4.0,4.0)  ;
     Point origin = new Point (0.0,0.0);


     System.out.println(p.getDistance (origin));
    }
}
