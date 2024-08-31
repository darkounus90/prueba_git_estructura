import java.time.LocalDateTime;

class Vehiculo {

    private String placa;
    private String tipo;
    private LocalDateTime horaDeEntrada;
    private LocalDateTime horaDeSalida;

    public Vehiculo(String placa, String tipo) {
        this.placa = placa;
        this.tipo = tipo;
        this.horaDeEntrada = LocalDateTime.now();
        this.horaDeSalida = LocalDateTime.now();
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getTipo() {
        return this.tipo;
    }

    public LocalDateTime getHoraDeEntrada() {
        return this.horaDeEntrada;
    }

    public LocalDateTime getHoraDeSalida() {
        return this.horaDeSalida;

    }

}