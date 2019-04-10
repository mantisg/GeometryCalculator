import java.util.Scanner;
public class GeometryCalculator{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      int menuChoice;
      char continueKey;
      int numberOfSides;
      double angleDegrees;
      double knownAngles;
      double returnValue;
      double radiusOfACircle;
      double rectangleSideLength;
      double rectangleSideWidth;
      double triangleBase;
      double triangleHeight;
      double triangleSide1;
      double triangleSide2;
      double triangleSide3;

      do{
         printMenu();
         menuChoice = keyboard.nextInt();

         switch(menuChoice){
            case 1:
               System.out.print("Enter the radius of the circle: ");
               radiusOfACircle = keyboard.nextDouble();
               Circle circle1 = new Circle(radiusOfACircle);
               returnValue = circle1.getArea();
               System.out.println("The area of the circle is " + returnValue);
               break;
            case 2:
               System.out.print("Enter the length of the rectangle: ");
               rectangleSideLength = keyboard.nextDouble();
               System.out.print("Enter the width of the rectangle: ");
               rectangleSideWidth = keyboard.nextDouble();
               Rectangle rectangle1 = new Rectangle(rectangleSideLength, rectangleSideWidth);
               returnValue = rectangle1.getArea();
               System.out.println("The area of the rectangle is " + returnValue);
               break;
            case 3:
               System.out.print("Enter the height of the triangle: ");
               triangleHeight = keyboard.nextDouble();
               System.out.print("Enter the base of the triangle: ");
               triangleBase = keyboard.nextDouble();
               Triangle triangle1 = new Triangle(triangleBase, triangleHeight);
               returnValue = triangle1.getArea();
               System.out.println("The area of the triangle is " + returnValue);
               break;
            case 4:
               System.out.print("Enter the radius of the circle: ");
               radiusOfACircle = keyboard.nextDouble();
               Circle circle2 = new Circle(radiusOfACircle);
               returnValue = circle2.getCircumference();
               System.out.println("The circumference of the circle is " + returnValue);
               break;
            case 5:
               System.out.print("Enter the length of the rectangle: ");
               rectangleSideLength = keyboard.nextDouble();
               System.out.print("Enter the width of the rectangle: ");
               rectangleSideWidth = keyboard.nextDouble();
               Rectangle rectangle2 = new Rectangle(rectangleSideLength, rectangleSideWidth);
               returnValue = rectangle2.getPerimeter();
               System.out.println("The perimeter of the rectangle is " + returnValue);
               break;
            case 6:
               System.out.print("Enter the length of side 1 of the triangle: ");
               triangleSide1 = keyboard.nextDouble();
               System.out.print("Enter the length of side 2 of the triangle: ");
               triangleSide2 = keyboard.nextDouble();
               System.out.print("Enter the length of side 3 of the triangle: ");
               triangleSide3 = keyboard.nextDouble();
               Triangle triangle2 = new Triangle(triangleSide1, triangleSide2, triangleSide3);
               returnValue = triangle2.getPerimeter();
               System.out.println("The perimeter of the triangle is " + returnValue);
               break;
               
               case 7:

                  System.out.println("Choose how many sides are in the shape \n" +
                                     "(the calculator will only handle up to 12 sides): ");
                  numberOfSides = keyboard.nextInt();
                  Angles polygon1 = new Angles(numberOfSides);
                  polygon1.setTotalDegrees();
                  angleDegrees = polygon1.getAngles();
                  returnValue = polygon1.getMissingAngle();
                  System.out.println("The degree of the missing angle is: " + 
                                     returnValue);
                  break;              
                  
            default:
               System.out.println("You did not enter " +
                                  "a valid choice.");
         }
         keyboard.nextLine(); // Consume the new line

         System.out.println("Do you want to exit the program (Y/N)?: ");
         String answer = keyboard.nextLine();
         continueKey = answer.charAt(0);
      } while(continueKey != 'Y' && continueKey != 'y');
   }
   public static void printMenu(){
      System.out.println("This is a Geometry Calculator.");
      System.out.println("Choose what you would like to calculate.");
      System.out.println("1. Find the area of a circle");
      System.out.println("2. Find the area of a rectangle");
      System.out.println("3. Find teh area of a triangle");
      System.out.println("4. Find the circumferance of a circle");
      System.out.println("5. Find the perimeter of a rectangle");
      System.out.println("6. Find the perimeter of a triangle");
      System.out.println("7. Find missing angle value of a shape");
      System.out.print("Enter the number of your choice: ");
   }
}