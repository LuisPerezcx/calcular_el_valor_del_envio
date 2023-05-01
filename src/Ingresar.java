import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ingresar {
    public Paquete ingresar(Scanner scanner){
        String tipoEnvio,contenido;
        double peso;
        System.out.println("ingresa el tipo de envio");
        tipoEnvio = scanner.nextLine();
        System.out.println("ingresa el contenidio del paquete ");
        contenido = scanner.nextLine();
        System.out.println("ingresa el peso del paquete (KGs)");
        peso = scanner.nextDouble();
        scanner.nextLine();
        return new Paquete(tipoEnvio,contenido,peso,scanner);
    }
}
