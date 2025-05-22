package Java.Principiantes;

import java.util.ArrayList;

public class TransporteTropas extends Vehiculo{
    private int capacidadSoldados;
    public TransporteTropas(String id, String modelo, int anioFabricacion, float kilometraje, EstadoOperativo estadoOperativo, int capacidadSoldados) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo);
        this.capacidadSoldados = capacidadSoldados;
    }
    public int getCapacidadSoldados() {
        return capacidadSoldados;
    }
    public void setCapacidadSoldados(int capacidadSoldados) {
        this.capacidadSoldados = capacidadSoldados;
    }
}
