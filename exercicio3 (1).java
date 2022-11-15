import java.util.Scanner;

class Main {
  public static void main(String[] args) {

  Scanner in = new Scanner(System.in);
  System.out.println("Primeiro número ");
  Float num1 = in.nextFloat();
  System.out.println("Segundo número: ");
  Float num2 = in.nextFloat();
  System.out.println("Terceiro número: ");
  Float num3 = in.nextFloat();

  if (num1 > num2 && num1 > num3 ) {
  System.out.println(num1 + " O maior é");
 }
    if (num2 > num1 && num2 > num3 ) {
  System.out.println(num2 + " O maior é");
 }
    else  {
  System.out.println(num3 + " O maior é");
 }


  }
}
