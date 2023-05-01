import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calcular calcular = new Calcular();
        Ingresar ingresar = new Ingresar();
        Scanner scanner = new Scanner(System.in);

        Paquete paquete = ingresar.ingresar(scanner);
        System.out.println("Total a pagar por el envio: $" + calcular.calcularValorEnvio(paquete));
    }
}
