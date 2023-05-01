import java.util.Scanner;

public class Paquete {
    private Persona remitente;
    private Persona destinatario;
    private String tipoEnvio;
    private String contenido;
    private double peso;
    static int cont=0;

    public Paquete(){

    }

    public Paquete(String tipoEnvio, String contenido, double peso,Scanner scanner) {
        this.remitente = construirPersona(scanner);
        cont++;
        this.destinatario = construirPersona(scanner);
        this.tipoEnvio = tipoEnvio;
        this.contenido = contenido;
        this.peso = peso;
    }
    private class Persona {
        private String nombres;
        private String apellidos;
        private String numeroDocumento;
        private String direccion;
        private String telefono;

        public Persona(String nombres, String apellidos, String numeroDocumento, String direccion, String telefono) {
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.numeroDocumento = numeroDocumento;
            this.direccion = direccion;
            this.telefono = telefono;
        }
    }
    private Persona construirPersona(Scanner scanner){
        if(cont==0){
            System.out.println("- INGRESA DATOS DEL REMITENTE -");
        }else System.out.println("- INGRESA DATOS DEL DESTINATARIO -");
        String nombre,apellido,numeroDocumento,direccion,telefono;
        System.out.println("Ingresa nombre : ");
        nombre=scanner.nextLine();
        System.out.println("Ingresa apellido: ");
        apellido=scanner.nextLine();
        System.out.println("Ingresa numero de documento de identidad: ");
        numeroDocumento=scanner.nextLine();
        System.out.println("Ingresa Direccionm: ");
        direccion=scanner.nextLine();
        System.out.println("Ingresa telefono: ");
        telefono=scanner.nextLine();
        return new Persona(nombre,apellido,numeroDocumento,direccion,telefono);
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public String getContenido() {
        return contenido;
    }

    public double getPeso() {
        return peso;
    }
}