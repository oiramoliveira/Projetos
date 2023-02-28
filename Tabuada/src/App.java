import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leia = new Scanner(System.in);

        int tabuada;

        System.out.print("Digite a tabuada: ");
        tabuada = leia.nextInt();

        for (int i = 1; i <= 10; i++) {
            
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }
    }
}
