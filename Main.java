import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    int poleT;
    int poleP;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Podaj pierwsza liczbe: ");
    int a = scanner.nextInt();

     System.out.print("");

    System.out.print("Podaj druga liczbe: ");
    int b = scanner.nextInt();

    System.out.print("");

    System.out.println("Pole prostokata wcisnij 1");
    System.out.println("Pole trojkata wcisnij 2");

    int wybor = scanner.nextInt();

    switch(wybor)
      {
        case 1:
          {
          poleP = a * b;
          System.out.println("Pole kwadratu wynosi: " + poleP);
            break;
          }
        case 2:
          {
            poleT = (a * b)/2;
            System.out.println("Pole trojkata prostokatnego wynosi: " + poleT);
            break;
          }
          
      }
  }
}

