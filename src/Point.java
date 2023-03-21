public class Point {
    //mushroom instance variables
    private int x;
    private int y;
    private String label;

    //mushrooms constructor
    public Point (String label, int x, int y) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

//    //get x value
//    public int getX() {
//        return x;
//    }
//    //get y vale
//    public int getY() {
//        return y;
//    }

    //mushrooms override equal
    @Override
    public boolean equals(Object obj) {
        //guard
        if (!(obj instanceof Point)) {
            return false;
        }
        //check x and y
        Point p = (Point) obj;
        return (x == p.x) && (y == p.y);
//        if (this.x == ((Point) obj).getX() && this.y == ((Point) obj).getY()) {
//            return true;
//        } else {
//            return false;
//        }
    }

    //mushroom override toString
    public String toString() {
        return "Point " + label + " is at x = " + x + " and y = " + y;
    }

}
