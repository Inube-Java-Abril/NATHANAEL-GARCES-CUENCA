import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int num1, num2, menu,operacion, fin=0;

        Scanner x;
        x=new Scanner(System.in);

        do {
            System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4.Salir");
            System.out.println("Ingrese una opcion del menu: ");
            menu=x.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Ingresa el primer numero: ");
                    num1=x.nextInt();
                    System.out.println("Ingresa el segundo numero: ");
                    num2=x.nextInt();
                    operacion=num1+num2;
                    System.out.println("El resultado de la suma es: "+operacion);
                    break;
                case 2:
                    System.out.println("Ingresa el primer numero: ");
                    num1=x.nextInt();
                    System.out.println("Ingresa el segundo numero: ");
                    num2=x.nextInt();
                    operacion=num1-num2;
                    System.out.println("El resultado de la resta es: "+operacion);
                    break;
                case 3:
                    System.out.println("Ingresa el primer numero: ");
                    num1=x.nextInt();
                    System.out.println("Ingresa el segundo numero: ");
                    num2=x.nextInt();
                    operacion=num1*num2;
                    System.out.println("El resultado de la multiplicacion es: "+operacion);
                    break;
                case 4:
                    fin=1;
                    break;
                default:
                    System.out.println("opcion no valida, intente de nuevo");
            }
        }while(fin==0);
    }
}