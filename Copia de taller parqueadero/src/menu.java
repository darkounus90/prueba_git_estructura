import javax.swing.JOptionPane;

public class menu {

    private static Parqueadero XD = new Parqueadero();

    public static void main(String[] args) {
        while (true) {

            String[] options = {"Registrar un vehículo", "Retirar un vehículo", "Consultar la capacidad disponible", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null,
                    "Sistema de Gestión de Parqueadero",
                    "Menú Principal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]);


            switch (opcion) {
                case 0:
                    registrarVehiculo();
                    break;
                case 1:
                    retirarVehiculo();
                    break;
                case 2:
                    consultarCapacidadDisponible();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el Sistema de Gestión de Parqueadero.");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }

    private static void registrarVehiculo() {

        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de vehículo (carro, moto, etc.):");


        Vehiculo vehiculo = new Vehiculo(placa, tipo);


        XD.registrarVehiculo(vehiculo);


        JOptionPane.showMessageDialog(null, "El vehículo se registró correctamente.");
    }

    private static void retirarVehiculo() {

        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo a retirar:");


        Vehiculo XE = XD.buscarVehiculo(placa);


        if (XE == null) {
            JOptionPane.showMessageDialog(null, "El vehículo no se encuentra en el parqueadero.");

        }

            XD.calcularTarifa(XE);
            double tarifaf = XD.calcularTarifa(XE);


            JOptionPane.showMessageDialog(null, "La tarifa del vehículo es: $" + tarifaf);
            XD.retirarVehiculo(XE);




            JOptionPane.showMessageDialog(null, "El vehículo se retiró correctamente.");


    }
    private static void consultarCapacidadDisponible() {

        int capacidadDisponible = XD.getCapacidadDisponible();


        JOptionPane.showMessageDialog(null, "La capacidad disponible del parqueadero es: " + capacidadDisponible);
    }
}
