package Java.Principiantes;

import java.util.ArrayList;

public class Batallon {
    private ArrayList<TransporteTropas> vehiculosTransporte = new ArrayList<>();
    private ArrayList<VehiculoBlindado> vehiculosBlindados = new ArrayList<>();
    private ArrayList<VehiculoApoyo> vehiculosApoyo = new ArrayList<>();
    private ArrayList<Mision> misiones = new ArrayList<>();

    public String crearVehiculo(int tipoVehiculo, String id, String modelo, int anioFabricacion, float kilometraje, EstadoOperativo estadoOperativo, int capacidadSoldados, TipoFuncion tipoFuncion, int nivelBlindado) {
        String texto = "El vehiculo fue registrado con exito";
        if (tipoVehiculo == 0) {
            TransporteTropas transporteTropas = new TransporteTropas(id, modelo, anioFabricacion, kilometraje, estadoOperativo, capacidadSoldados);
            this.vehiculosTransporte.add(transporteTropas);
        }else if (tipoVehiculo == 1) {
            VehiculoBlindado vehiculoBlindado = new VehiculoBlindado(id, modelo, anioFabricacion, kilometraje, estadoOperativo, nivelBlindado);
            this.vehiculosBlindados.add(vehiculoBlindado);
        }else{
            VehiculoApoyo vehiculoApoyo = new VehiculoApoyo(id, modelo, anioFabricacion, kilometraje, estadoOperativo, tipoFuncion);
            this.vehiculosApoyo.add(vehiculoApoyo);
        }

        return texto;
    }
    public String mostrarVehiculo(int tipoVehiculo, String id) {
        if (tipoVehiculo == 0) {
            for (Vehiculo vehiculo : vehiculosTransporte) {
                if (vehiculo.getId().equals(id)) {
                    return vehiculo.toString();
                }
            }
        }else if (tipoVehiculo == 1) {
            for (Vehiculo vehiculo : vehiculosBlindados) {
                if (vehiculo.getId().equals(id)) {
                    return vehiculo.toString();
                }
            }
        }else{
            for (Vehiculo vehiculo : vehiculosApoyo) {
                if (vehiculo.getId().equals(id)) {
                    return vehiculo.toString();
                }
            }
        }
        return "El vehiculo no existe";
    }
    public String editarVehiculo(int tipoVehiculo, String id, String modelo, int anioFabricacion, float kilometraje, EstadoOperativo estadoOperativo, int capacidadSoldados, TipoFuncion tipoFuncion, int nivelBlindado) {
        String texto = "El vehiculo fue editado con exito";
        if (tipoVehiculo == 0) {
            for (TransporteTropas vehiculo : vehiculosTransporte) {
                if (vehiculo.getId().equals(id)) {
                    vehiculo.setModelo(modelo);
                    vehiculo.setAnioFabricacion(anioFabricacion);
                    vehiculo.setKilometraje(kilometraje);
                    vehiculo.setEstadoOperativo(estadoOperativo);
                    vehiculo.setCapacidadSoldados(capacidadSoldados);
                }
            }
        }else if (tipoVehiculo == 1) {
            for (VehiculoBlindado vehiculo : vehiculosBlindados) {
                if (vehiculo.getId().equals(id)) {
                    vehiculo.setModelo(modelo);
                    vehiculo.setAnioFabricacion(anioFabricacion);
                    vehiculo.setKilometraje(kilometraje);
                    vehiculo.setEstadoOperativo(estadoOperativo);
                    vehiculo.setNivelBlindado(nivelBlindado);
                }
            }
        }else{
            for (VehiculoApoyo vehiculo : vehiculosApoyo) {
                if (vehiculo.getId().equals(id)) {
                    vehiculo.setModelo(modelo);
                    vehiculo.setAnioFabricacion(anioFabricacion);
                    vehiculo.setKilometraje(kilometraje);
                    vehiculo.setEstadoOperativo(estadoOperativo);
                    vehiculo.setTipoFuncion(tipoFuncion);
                    return texto;
                }
            }
        }
        return "El vehiculo no se encontro";
    }
    public String eliminarVehiculo(int tipoVehiculo, String id) {
        if (tipoVehiculo == 0) {
            for (Vehiculo vehiculo : vehiculosTransporte) {
                if (vehiculo.getId().equals(id)) {
                    return vehiculo.toString();
                }
            }
        }else if (tipoVehiculo == 1) {
            for (Vehiculo vehiculo : vehiculosBlindados) {
                if (vehiculo.getId().equals(id)) {

                }
            }
        }else{
            for (Vehiculo vehiculo : vehiculosApoyo) {
                if (vehiculo.getId().equals(id)) {
                    return vehiculo.toString();
                }
            }
        }
        return "";
    }
}
