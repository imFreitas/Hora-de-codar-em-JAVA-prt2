import java.util.Scanner;

class Main {
  public static void main(String[] args) {

  System.out.println("Informe um número: ");
  Scanner in = new Scanner(System.in);
    
  double num = in.nextInt();
    
  if(num < 0) {
  System.out.println("Número é negativo");
  }
  if(num  > 0) {
  System.out.println("Número é positivo");
  }
  else {
  System.out.println("Número = 0");
  }


  }
}
