import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int num=0,cont=0;
        int numRan = ThreadLocalRandom.current().nextInt(1,51);

        Scanner x;
        x = new Scanner(System.in);

        while (numRan!=num){
            System.out.println("ingrese un numero: ");
            num=x.nextInt();
            cont++;
            if(num==numRan){
                System.out.println("Adivinaste");
            } else if (num<numRan) {
                System.out.println("Tu numero es menor");
            } else {
                System.out.println("Tu numero es mayor");
            }
        }

        System.out.println("Adivinaste en "+cont+" intentos");
    }
}