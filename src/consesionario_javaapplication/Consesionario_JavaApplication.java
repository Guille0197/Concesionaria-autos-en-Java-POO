
package consesionario_javaapplication;
import java.util.Scanner;

public class Consesionario_JavaApplication {

    public static void main(String[] args) {
        
        // Variables para crear un nuevo vehiculo
        String codigoVehiculo; 
        String marcaVehiculo;
        String tipoDeVehiculo;
        int precioVehiculo;
        int modeloVehiculo;
        int kilometrajeVehiculo;
        
        // Variables para crear una nueva instancia de un registro de venta
        int montoDeLaVenta;
        String vehiculoVendido;
        String nombre;
        String apellido;
        int documentoComprador;
        
        int option = 1;
        
        Scanner reader = new Scanner(System.in);
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("***** BIENVENIDO AL CONCESIONARIO *****");
        
        while(option != 0){
            System.out.println("Seleccione la opcion que desea realizar");            
            System.out.println(" >> Registrar vehiculo: 1");
            System.out.println(" >> Registrar venta de vehiculo: 2");
            System.out.println(" >> Salir del consesionario: 0");
            
            option = in.nextInt();
            
            if( option == 1){
                System.out.println("\n");
                
                String[] tipoVehiculos = {"Auto","Camioneta","Motocicleta"};
                
                System.out.println("Ingrese el codigo del vehiculo:");
                codigoVehiculo = reader.next();
                
                System.out.println("Ingrese la marca del vehiculo:");
                marcaVehiculo = reader.next();
                
                System.out.println("\n");
                
                System.out.println("***** Ingrese el tipo de vehiculo *****");                
                System.out.println(">> Auto: 0");
                System.out.println(">> Camioneta: 1");
                System.out.println(">> Motocicleta: 2");
                String tipo = reader.next();
                
                int intTipo = Integer.parseInt(tipo);
                tipoDeVehiculo = tipoVehiculos[intTipo];
                
                System.out.println("Ingrese el precio del vehiculo");
                precioVehiculo = reader.nextInt();
                
                System.out.println("Ingrese el año del modelo del vehiculo");
                modeloVehiculo = reader.nextInt();
                
                System.out.println("Ingrese el kilometraje del vehiculo");
                kilometrajeVehiculo = reader.nextInt();
                
                Vehiculo vehiculo = new Vehiculo(codigoVehiculo, marcaVehiculo,
                tipoDeVehiculo, precioVehiculo, modeloVehiculo, kilometrajeVehiculo);
                
                System.out.println("\n");
                
                System.out.println("***** SU VEHICULO HA SIDO REGISTRADO *****");                
                System.out.println(" > Codigo: " + vehiculo.getCodigo() );
                System.out.println(" > Marca: " + vehiculo.getMarca() );
                System.out.println(" > Tipo: " + vehiculo.getTipo() );
                System.out.println(" > Precio: " + vehiculo.getPrecio() );
                System.out.println(" > Modelo: " + vehiculo.getModelo() );            
                System.out.println(" > Kilometraje: " + vehiculo.getKilometraje() + " Km");
            } // Fin del IF
            
            if(option == 2){
                System.out.println("Ingrese el monto de la venta:");
                montoDeLaVenta = in.nextInt();
                
                System.out.println("Ingrese el vehiculo vendido codigo:");
                vehiculoVendido =  reader.next();
                
                System.out.println("Ingrese el nombre del comprador:");
                nombre =  reader.next();
                
                System.out.println("Ingrese el apellido del comprador:");
                apellido =  reader.next();
                
                System.out.println("Ingrese el documento de indetificacion del comprador");
                documentoComprador =  reader.nextInt();
                
                Registro registroDeVenta = new Registro(montoDeLaVenta, vehiculoVendido, nombre, apellido, documentoComprador);
                
                System.out.println("\n");
                
                System.out.println("***** REGISTRO DE LA VENTA *****");
                System.out.println(" > El monto de la venta: " + registroDeVenta.getMontoDeLaVenta() );        
                System.out.println(" > El vehiculo vendido: " + registroDeVenta.getVehiculoVendido() );           
                System.out.println(" > El nombre del comprador: " + registroDeVenta.getNombre() );
                System.out.println(" > El apellido del comprador: " + registroDeVenta.getApellido() );
                System.out.println(" > El documento de indentificacion del comprador: " + registroDeVenta.getDocumentoComprador() );

            } // Fin del IF

        } // Fin del While        
        
    } // Main
    
}
