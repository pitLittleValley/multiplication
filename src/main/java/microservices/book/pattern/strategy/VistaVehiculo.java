package microservices.book.pattern.strategy;

public class VistaVehiculo {
    protected String descripcion;

    public VistaVehiculo(String descripcion) {
        super();
        this.descripcion = descripcion;
    }

    public void dibuja() {
        System.out.println(descripcion);
    }
}
