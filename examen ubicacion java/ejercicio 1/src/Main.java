import java.util.Scanner;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String nombre;
        int edad;
        int ActualYear= LocalDate.now().getYear(), year;


        Scanner x;
        x=new Scanner(System.in);

        System.out.println("Escribe tu nombre: ");
        nombre= x.next();

        System.out.println("Escribe tu edad: ");
        edad= x.nextInt();

        year=ActualYear-edad;
        System.out.println("Hola, "+nombre+". Tienes "+edad+" años. ¡Bienvenido a Java!, naciste en el año "+year);

    }
}