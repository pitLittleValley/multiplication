package microservices.book.pattern.strategy;

import java.util.List;

public class DibujaUnVehiculoPorLinea implements DibujaCatalogo {
    @Override
    public void dibuja(List<VistaVehiculo> contenido) {
        System.out.println("Dibuja los vehículos mostrando un vehículo por línea.");
        for(VistaVehiculo vistaVehiculo : contenido) {
            vistaVehiculo.dibuja();
            System.out.println();
        }
        System.out.println();
    }
}
