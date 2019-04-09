public class Rectangle{
   private double length;
   private double width;
   
   public Rectangle(){
      length = 0.0;
      width = 0.0;
   }
   
   public Rectangle(double len, double wid){
      length = len;
      width = wid;
   }
   
   public void setLength(double len){
      length = len;
   }
   
   public void setWidth(double wid){
      width = wid;
   }
   
   public double getLength(){
      return length;
   }
   
   public double getWidth(){
      return width;
   }
   
   public double getArea(){
      return length * width;
   }
   
   public double getPerimeter(){
      return (2 * length) + (2 * width);
   }
}