import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's Friend!");
        System.out.println("What's your name?");
        String myName = input.nextLine();
        System.out.println("Enter a floating-point number:");
        Float myNumber = input.nextFloat();
        double spiceValue = (4.0/3)*(Math.pow(2, ((Math.sqrt(5))/(Math.pow(myNumber, 3)))));
        System.out.println("Well " + myName + ", the spice value resulted in " + spiceValue);
        String convertedValue = String.format("%.2f", spiceValue);
        System.out.println("And the converted value is " + convertedValue);
        //TODO : Replace this comment with your code
    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        // define our named constants
        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();
        double wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");
        double gallonNeeded =  Math.round(100*(wallArea / squareFeetPerGallons));
        String paintNeeded = String.format("%.2f", gallonNeeded/100);
        System.out.println("Paint needed: " + paintNeeded + " gallons");
        double cans = Math.ceil(gallonNeeded/100);
        int cansNeeded = (int) Math.round(cans);
        System.out.println("Cans needed: " + cansNeeded + " can(s)");

        // TODO: Calculate and output the wall's area

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall

        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
    }
}
