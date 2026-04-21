import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int suma, resta, multiplicacion, division, numero1, numero2, menu;
        Scanner x;
        x=new Scanner(System.in);

        System.out.println("Escribe el primer numero: ");
        numero1=x.nextInt();
        System.out.println("Escribe el segundo numero: ");
        numero2=x.nextInt();

        System.out.println("Escribe el numero de la opcion correspondiente: ");
        System.out.println("1. suma\n2. Resta\n3. Multiplicacion\n4.Division");
        menu= x.nextInt();

        switch (menu){
            case 1:
                suma=numero1+numero2;
                System.out.println("suma: "+suma);
                break;
            case 2:
                resta=numero1-numero2;
                System.out.println("resta: "+resta);
                break;
            case 3:
                multiplicacion=numero1*numero2;
                System.out.println("multiplicacion: "+multiplicacion);
                break;
            case 4:
                if(numero1!=0&numero2!=0){
                    division=numero1/numero2;
                    System.out.println("division: "+division);
                }else{
                    System.out.println("operacion invalida");
                }
                break;
            default: System.out.println("Respuesta no valida");
        }

    }
}