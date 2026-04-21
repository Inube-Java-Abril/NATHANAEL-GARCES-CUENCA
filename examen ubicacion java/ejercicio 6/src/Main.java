import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int num, opc;

        Scanner x;
        x=new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        num=x.nextInt();
        System.out.println();

        for(int i=1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+num*i);
            System.out.println("Ingrese 1 para salir");
            opc=x.nextInt();
            if (opc==1){
                i=15;
            }
        }
    }
}