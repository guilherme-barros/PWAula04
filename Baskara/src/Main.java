import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Delta delta = new Delta();
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o Valor do A: ");
            delta.a = scan.nextInt();
            System.out.println("Digite o Valor do B: ");
            delta.b = scan.nextInt();
            System.out.println("Digite o Valor do C: ");
            delta.c = scan.nextInt();
            delta.CalcDelta();
            delta.Raiz();

        }

    }
}