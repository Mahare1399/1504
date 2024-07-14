public class Example2Java {
    public static void main(String[] args) {
   long salary =1000000;
   double tax, netsalary ;
   tax = salary * 10 / 100;
   netsalary = salary - tax ;
   System.out.print("your salary is : \t" + salary);
   System.out.println();
   System .out.println("Tax of salary is :\t" + tax);
   System.out.print(" your net salary is :\t" +netsalary );
    }
    
}
