
package consesionario_javaapplication;

public class Registro {
    private int montoDeLaVenta;
    private String VehiculoVendido;
    private String nombre;
    private String apellido;
    private int documentoComprador;

    public Registro(int montoDeLaVenta, String VehiculoVendido, String nombre, String apellido, int documentoComprador) {
        this.montoDeLaVenta = montoDeLaVenta;
        this.VehiculoVendido = VehiculoVendido;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoComprador = documentoComprador;
    }
    
    public int getMontoDeLaVenta() {
        return montoDeLaVenta;
    }

    public void setMontoDeLaVenta(int montoDeLaVenta) {
        this.montoDeLaVenta = montoDeLaVenta;
    }

    public String getVehiculoVendido() {
        return VehiculoVendido;
    }

    public void setVehiculoVendido(String VehiculoVendido) {
        this.VehiculoVendido = VehiculoVendido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumentoComprador() {
        return documentoComprador;
    }

    public void setDocumentoComprador(int documentoComprador) {
        this.documentoComprador = documentoComprador;
    }
    
    
}
