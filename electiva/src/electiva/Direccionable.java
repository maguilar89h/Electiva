package electiva;

public abstract class Direccionable {

    private String id;
    private String nombre;
    private String direccion;
    private String mac;
    enum DiasSemana{LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO};
    
    
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
