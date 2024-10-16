package Coordinates;

//Smelly code: Data class with only instance variables
class Coordinates {
 private double xCoordinate;
 private double yCoordinate;
 private double zCoordinate;

 public Coordinates(double x, double y, double z) {
     this.xCoordinate = x;
     this.yCoordinate = y;
     this.zCoordinate = z;
 }
}

public class Main {
 public static void main(String[] args) {
     Coordinates myCoordinates = new Coordinates(4, -7, 43);

    
 }
}
