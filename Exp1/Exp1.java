import java.util.*;
class Product
{
String Pname;
String Pcode;
int Price;
void getdata()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Product Name: ");
Pname = sc.nextLine();
System.out.println("Enter Product Code: ");
Pcode = sc.nextLine();
System.out.println("Enter Product Price: ");
Price = sc.nextInt();
}
void display()
{
System.out.println("The Product Name Is: " +Pname);
System.out.println("The Product Code Is: " +Pcode);
System.out.println("The Product Price Is: " +Price);
}
}

public class Exp1{
public static void main(String[] args)
{
Product P1 = new Product();
Product P2 = new Product();
Product P3 = new Product();

System.out.println("Product 1");
P1.getdata();
System.out.println("Product 2");
P2.getdata();
System.out.println("Product 3");
P3.getdata();


Product lowest;
if(P1.Price < P2.Price && P1.Price < P3.Price)
lowest = P1;
else if(P2.Price < P3.Price)
lowest = P2;
else
lowest = P3;

System.out.println("THe Lowest Price Is  ");
lowest.display();
}
}
