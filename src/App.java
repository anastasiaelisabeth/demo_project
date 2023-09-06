/*Anna 
TE22C
katt
 */

 import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Ange första talet: ");
            int first = input.nextInt();

            System.out.println("Ange andra talet: ");
            int second = input.nextInt();

            System.out.println(first + " + " + second + " = " + (first+second));

            Scanner tb = new Scanner(System.in) ;
            String name = "tb ";
            String text = tb.nextLine();
            System.out.println("Du skrev "+ text);
        }
    }
}
