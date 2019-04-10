import java.util.Scanner;
public class Angles{
   private int numberOfSides;
   private double knownAngles;
   private int totalDegrees;
   public Angles(){
      numberOfSides = 0;
      knownAngles = 0.0;
      totalDegrees = 0;
   }
   public Angles(int numSides){
      numberOfSides = numSides;
      knownAngles = 0.0;
      totalDegrees = 0;
   }
   public void setNumOfSides(int numSides){
      numberOfSides = numSides;
   }
   public void setTotalDegrees(){
      switch (numberOfSides){
         case 3: totalDegrees = 180; break;
         case 4: totalDegrees = 360; break;
         case 5: totalDegrees = 540; break;
         case 6: totalDegrees = 720; break;
         case 7: totalDegrees = 900; break;
         case 8: totalDegrees = 1080; break;
         case 9: totalDegrees = 1260; break;
         case 10: totalDegrees = 1440; break;
         case 11: totalDegrees = 1620; break;
         case 12: totalDegrees = 1800; break;
      }
   }
   public double getAngles(){
      Scanner keyboard = new Scanner(System.in);
      double angleValue;
      int iterations = 2;
      System.out.println("Please enter the degree of the first angle: ");
      angleValue = keyboard.nextDouble();
      do{
         System.out.println("Please enter the degree of the next angle: ");
         angleValue += keyboard.nextDouble();
         iterations++;
      } while (iterations < numberOfSides);
      knownAngles = angleValue;
      return angleValue;
   }
   public double getMissingAngle(){
      return totalDegrees - knownAngles;
   }
}