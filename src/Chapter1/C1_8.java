package Chapter1;

/**
 * Program to calculate perimeter and area of a circle
 *
 * @author Chad Marshall
 */
public class C1_8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     *
     */
    public static void main(String[] args) {
        //radius is the radius given
        //pi is the constant of Pi
        //perimeter is the circumference of the circle
        // area is the area of the circle from the radius and pi

        double radius = 5.5;
        double pi = 3.14;
        double perimeter = 2 * radius * pi;
        System.out.println(" the perimeter is " + perimeter);
        double area = radius * radius * pi;
        System.out.println("The area is " + area);

    }

}
