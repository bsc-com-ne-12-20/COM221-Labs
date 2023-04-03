package Cube;

public class Cube {
    private double length;

    public Cube(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length >0){
            this.length = length;
        }
        else {
            this.length = 0;
        }
        
    }
    
    public double surfaceArea(){
        return 6 * Math.pow(length, 2);
    }

    public double getVolume() {
        return Math.pow(length, 3);
    }

}
