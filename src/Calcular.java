public class Calcular {
    public double calcularValorEnvio(Paquete paquete) {
        double valorPorKilo = 0;
        String tipoEnvio = paquete.getTipoEnvio();
        String contenido = paquete.getContenido();
        double peso = paquete.getPeso();

        if (tipoEnvio.equals("nacional") || tipoEnvio.equals("Nacional")) {
            if (contenido.equals("documento") || contenido.equals("Documento")) {
                if (peso <= 2) {
                    valorPorKilo = 400;
                } else {
                    valorPorKilo = 600;
                }
            } else if (contenido.equals("mercancia") ||contenido.equals("Mercancia")) {
                if (peso <= 5) {
                    valorPorKilo = 800;
                } else {
                    valorPorKilo = 1000;
                }
            }
        } else if (tipoEnvio.equals("internacional") || tipoEnvio.equals("Internacional")) {
            if (contenido.equals("documento") || contenido.equals("Documento")) {
                if (peso <= 2) {
                    valorPorKilo = 4000;
                } else {
                    valorPorKilo = 6000;
                }
            } else if (contenido.equals("mercancia") ||contenido.equals("Mercancia")) {
                if (peso <= 5) {
                    valorPorKilo = 9000;
                } else {
                    valorPorKilo = 12000;
                }
            }
        }
        return (valorPorKilo * peso);
    }
}
