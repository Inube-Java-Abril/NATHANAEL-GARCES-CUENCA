import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numero;
        Scanner x;
        x=new Scanner(System.in);

        System.out.println("Escribe un numero: ");
        numero=x.nextInt();

        if(numero==0){
            System.out.println("Tu numero "+numero+" es neutro");
        }else {
            if (numero % 2 == 0) {
                System.out.println("Tu numero " + numero + " es par");
            } else {
                System.out.println("Tu numero " + numero + " es impar");
            }
        }

        if(numero<0){
            System.out.println("Tu numero "+numero+" es negativo");
        }else if (numero==0){
            System.out.println("Tu numero "+numero+" es 0");
        }else {
            System.out.println("Tu numero "+numero+" es positivo");
        }
    }
}