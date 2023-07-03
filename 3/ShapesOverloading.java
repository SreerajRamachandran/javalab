import java.util.Scanner;
class ShapesOverloading{
    void  getArea(int l,int b){
    int r = l*b;
    System.out.println("Area of the rectangle is :"+r);
}
void getArea(int side){
    int s = side*side;
     System.out.println("Area of the square is "+s);
}
void getArea(double radius){
    double c = 3.14*radius*radius;
    System.out.println("Area of the circle is "+c);
}


    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ShapesOverloading o=new ShapesOverloading();
    System.out.println("Area of shapes using method overloading\n");
    System.out.println();
    System.out.println("Enter the length of the Rectangle");
    int l = sc.nextInt();
    System.out.println();
    System.out.println("Enter the breadth of the Rectangle");
    int b = sc.nextInt();
    o.getArea(l,b);
    
    System.out.println("Enter the side of the square");
    double side = sc.nextDouble();
    o.getArea(side);
   
    System.out.println("Enter the radius of the circle");
    double radius = sc.nextDouble();
    
    
    
    o.getArea(radius);
    
}
}