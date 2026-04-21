import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int num, suma=0;
        Scanner x;
        x=new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        num=x.nextInt();
        System.out.println();

        for (int i=1; i<num+1; i++){
            System.out.println(i);
            suma+=i;
        }

        System.out.println("La suma de todos los numeros es: "+suma);
    }
}