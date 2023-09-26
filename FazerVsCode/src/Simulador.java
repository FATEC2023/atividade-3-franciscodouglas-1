import java.util.Scanner;

public class Simulador {
    Scanner ler = new Scanner(System.in);

    public void cenario1(){
        int a, b, c, d;
        System.out.printf("Digite o valor de A:");
        a = ler.nextInt();
        
        System.out.printf("Digite o valor de B:");
        b = ler.nextInt();
        
        System.out.printf("Digite o valor de C:");
        c = ler.nextInt();

        d = (a+b+c);
        System.out.println("O valor total e: "+d);


    }

}
