import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int num1, num2, num3, maximo;

        Scanner x;
        x=new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        num1=x.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2=x.nextInt();
        System.out.println("Ingrese el tercero numero: ");
        num3=x.nextInt();

        maximo=Math.max(num1, Math.max(num2,num3));
        System.out.println("El numero mayor es: "+maximo);

        if(num1==num2){
            System.out.println("Hay 2 o mas numeros iguales");
        } else if (num1==num3) {
            System.out.println("Hay 2 o mas numeros iguales");
        } else if (num2==num3) {
            System.out.println("Hay 2 o mas numeros iguales");
        }
    }
}