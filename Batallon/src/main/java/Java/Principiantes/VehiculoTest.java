package Java.Principiantes;
import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class VehiculoTest{
    @Test
    public void testAgregarMision(){
        VehiculoBlindado vehiculo = new VehiculoBlindado("10723543", "apache", 2021, 74.5f, EstadoOperativo.DISPONIBLE, 10);
        Mision mision = new Mision(LocalDate.of(2022,03,05), "Colombia", "Peloton1", "10723543", "34565543");
        int tamanioAntesIngresarMision = vehiculo.getNumMisiones();
        vehiculo.setMisiones(mision);
        int tamanioMisionDespues = vehiculo.getNumMisiones();
        Assertions.assertTrue(tamanioAntesIngresarMision<tamanioMisionDespues, "no se registro la mision correctamente");
    }
}