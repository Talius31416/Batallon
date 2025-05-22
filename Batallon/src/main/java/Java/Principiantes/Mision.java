package Java.Principiantes;

import java.time.LocalDate;

public class Mision {
    private LocalDate fecha;
    private String ubicacion;
    private String personalAsignado;
    private String IdVehiculo;
    private String IDMision;
    public Mision(LocalDate fecha, String ubicacion, String personalAsignado, String IdVehiculo, String IDMision) {
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.personalAsignado = personalAsignado;
        this.IdVehiculo = IdVehiculo;
        this.IDMision = IDMision;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getPersonalAsignado() {
        return personalAsignado;
    }
    public void setPersonalAsignado(String personalAsignado) {
        this.personalAsignado = personalAsignado;
    }
    public String getIdVehiculo() {
        return IdVehiculo;
    }
    public void setIdVehiculo(String IdVehiculo) {
        this.IdVehiculo = IdVehiculo;
    }
    public String getIDMision() {
        return IDMision;
    }
    public void setIDMision(String IDMision) {
        this.IDMision = IDMision;
    }
}
