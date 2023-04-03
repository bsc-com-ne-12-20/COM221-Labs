package Cube;
import java.util.Scanner;
public class CubeMain{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter length: ");
        double length = scanner.nextDouble();
        
        Cube cube = new Cube(length);

        cube.setLength(length);

        System.out.println("A cube with length " + cube.getLength() + " has a surface area of " + cube.surfaceArea() + " and a volume of " + cube.getVolume());

    }
}