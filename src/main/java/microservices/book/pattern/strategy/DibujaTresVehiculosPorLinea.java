package microservices.book.pattern.strategy;

import java.util.List;

public class DibujaTresVehiculosPorLinea implements DibujaCatalogo {
    @Override
    public void dibuja(List<VistaVehiculo> contenido) {
        int contador = 0;

        System.out.println("Dibuja los vehiculos mostrando tres vehiculos por linea.");

        for (VistaVehiculo vistaVehiculo : contenido) {

            vistaVehiculo.dibuja();
            contador++;
            if (contador == 3) {
                System.out.println();
                contador = 0;
            } else {
                System.out.println(" ");
            }
        }
        if (contador != 0) {
            System.out.println();
        }
        System.out.println();
    }
}
