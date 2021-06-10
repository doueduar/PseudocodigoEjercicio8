import java.util.Scanner;

/**
 * Ejercicio8
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s="";
        do {
            int ale = (int)(Math.random()*100+1);
            int multi = ale*5;
            System.out.println("multiplos de 5 es: "+multi+" Deseas seguir (s)");
            s = scanner.next();
        } while (s.equalsIgnoreCase("s"));
    }
}