import java.util.*; 
public class Main 
{ 
    public static double Calc_area(double a) 
    { 
     double area=a*a; 
     return area; 
    } 
 
    public static double Calc_area(double a,double b) 
    { 
     double area=a*b; 
     return area; 
    } 
 
    public static double Calc_area(double a,double b,double c) 
    { 
     double s=(a+b+c)/2; 
     double area=Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
     return area; 
    } 
    public static void main(String[] args) 
    { 
      
             double area,n1=5,n2=3,n3=3; 
        
       area=Calc_area(n1); 
       System.out.println("Area of the Square is:"+area); 
        
       area=Calc_area(n1,n2); 
       System.out.println("Area of the Rectangle is:"+area); 
       
       area=Calc_area(n1,n2,n3); 
       System.out.println("Area of the Scalene Triangle is:"+area); 
    } 
} 
 
 