package Java.Principiantes;

import java.util.ArrayList;

public class VehiculoBlindado extends Vehiculo {
    private int nivelBlindado;
    public VehiculoBlindado(String id, String modelo, int anioFabricacion, float kilometraje, EstadoOperativo estadoOperativo, int nivelBlindado) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo);
        this.nivelBlindado = nivelBlindado;
    }
    public int getNivelBlindado() {
        return nivelBlindado;
    }
    public void setNivelBlindado(int nivelBlindado) {
        this.nivelBlindado = nivelBlindado;
    }

}
