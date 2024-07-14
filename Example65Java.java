package example6.pkg5.java;
public class Example65Java {
    public static void main(String[] args) {
     int x,y;
     Integer num1, num2;
     num1 = 8;
     num2 = 16;
     System.out.println("num1 = " + num1 +" , num2 = " + num2 );
     x = 2 * num1 + num2 ;
     y = num1 + num2;
     System.out.println(" x = " + x +" , y = " +y);
     String s = new String ("12");
     x = Integer .parseInt(s);
     s = s + num1 .toString() + num2.toString();
     System.out.println(" convert int to string and concate : "+ s);
     
     
    }
    
}
