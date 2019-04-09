public class Triangle{
   private double base;
   private double height;
   private double side1;
   private double side2;
   private double side3;
   
   public Triangle(){
      base = 0.0;
      height = 0.0;
      side1 = 0.0;
      side2 = 0.0;
      side3 = 0.0;
   }
   
   public Triangle(double s1, double s2, double s3){
      side1 = s1;
      side2 = s2;
      side3 = s3;
   }
   
   public Triangle(double b, double h){
      base = b;
      height = h;
   }
   
   public void setBase(double b){base = b;}
   
   public void setHeight(double h){height = h;}
   
   public void setSide1(double s1){side1 = s1;}
   
   public void setSide2(double s2){side2 = s2;}
   
   public void setSide3(double s3){side3 = s3;}
   
   public double getBase(){return base;}
   
   public double getHeight(){return height;}
   
   public double getSide1(){return side1;}
   
   public double getSide2(){return side2;}
   
   public double getSide3(){return side3;}
   
   public double getArea(){return (1.0/2) * base * height;}
   
   public double getPerimeter(){return side1 + side2 + side3;}
}