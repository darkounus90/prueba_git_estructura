import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class Parqueadero {

    private int capacidad;
    private List<Vehiculo> vehiculos;

    public Parqueadero() {
        this.capacidad = 10;
        this.vehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    public Vehiculo retirarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.remove(vehiculo);
        return vehiculo;
    }

    public Vehiculo buscarVehiculo(String placa) {
        for (Vehiculo XE : this.vehiculos) {
            if (XE.getPlaca().equals(placa)) {
                return XE;
            }
        }
        return null;
    }

    public double calcularTarifa(Vehiculo XE) {

        LocalDateTime horaDeEntrada = XE.getHoraDeEntrada();


        LocalDateTime horaDeSalida = XE.getHoraDeSalida();


        Duration diferencia = Duration.between(horaDeEntrada, horaDeSalida);


        long horas = diferencia.toMinutes();


        double tarifaf = horas * 1000;

        return tarifaf;
    }

    public int getCapacidadDisponible() {
        return this.capacidad - this.vehiculos.size();
    }

}

