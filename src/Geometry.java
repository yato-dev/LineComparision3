import java.util.Objects;

class Point {
   private double x;
   private double y;

   public Point(double x, double y) {
       this.x = x;
       this.y = y;
   }

   public double getX() {
       return x;
   }

   public double getY() {
       return y;
   }
}

class Geometry {
    private Point startPoint;
    private Point endPoint;

    public Geometry(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double calculateLength() {
        double x1 = startPoint.getX();
        double y1 = startPoint.getY();
        double x2 = endPoint.getX();
        double y2 = endPoint.getY();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public boolean equals(Geometry otherLine) {
        if (this == otherLine) return true;
        if (otherLine == null) return false;
        return startPoint.equals(otherLine.startPoint) && endPoint.equals(otherLine.endPoint);
    }

    public int compareLength(Geometry otherLine) {
        double thisLength = calculateLength();
        double otherLength = otherLine.calculateLength();
        return Double.compare(thisLength, otherLength);
    }
}


