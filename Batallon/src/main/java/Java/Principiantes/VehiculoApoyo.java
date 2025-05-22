package Java.Principiantes;

import java.util.ArrayList;

public class VehiculoApoyo extends Vehiculo {
    private TipoFuncion tipoFuncion;
    public VehiculoApoyo(String id, String modelo, int anioFabricacion, float kilometraje, EstadoOperativo estadoOperativo, TipoFuncion tipoFuncion) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo);
        this.tipoFuncion = tipoFuncion;
    }
    public TipoFuncion getTipoFuncion() {
        return tipoFuncion;
    }
    public void setTipoFuncion(TipoFuncion tipoFuncion) {
        this.tipoFuncion = tipoFuncion;
    }

}
