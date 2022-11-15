import java.util.Scanner;

class Main {
  public static void main(String[] args) {

  double nota, soma = 0, media = 0;
  Scanner in = new Scanner(System.in);
  for (int i = 1; i <= 4; i++){
    
  System.out.printf("Suas notas: ",i);
  nota = in.nextDouble();
  while(nota < 0 || nota > 10){
  System.out.println("O valor tem que ser 0-10: ");
  nota = in.nextDouble();
  }
  soma += nota;
  media = soma / 4;
  }
  if (media >= 6.0){
  System.out.println("PARABENS! Você passou: " + media);
  }else{
  System.out.println("PARABENS! Você reprovou: " + media);
  }


  }
}
