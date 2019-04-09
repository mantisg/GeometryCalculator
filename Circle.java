public class Circle{
   private double radius;
   
   public Circle(){radius = 0.0;}
   
   public Circle(double r){radius = r;}       
                                                 
   public void setRadius(double r){radius = r;}
   
   public double getRadius(){return radius;}
   
   public double getDiameter(){return radius * 2;}
   
   public double getArea(){return Math.PI * Math.pow(radius, 2);}
   
   public double getCircumference(){return 2 * Math.PI * radius;}
}                                              
                                                 