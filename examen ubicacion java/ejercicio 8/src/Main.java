import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int num1, num2, cont=0, suma;
        String palabra="";

        Scanner x;
        x=new Scanner(System.in);

        while(!palabra.equals("no")){
            System.out.println("Escribe el primer numero: ");
            num1=x.nextInt();
            System.out.println("Escribe el segundo numero: ");
            num2=x.nextInt();
            suma=num1+num2;
            System.out.println("La suma es: "+suma);
            cont++;
            System.out.println("Escribe 'no' para salir, cualquier otra cosa para continuar");
            palabra=x.next();
        }
        cont=cont*2;
        System.out.println("cantidad de numeros ingresados: "+cont);
    }
}