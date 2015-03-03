package electiva;

import java.util.List;

public class Flujo {
	private String id;
	private Boolean activo;
	private String nombre;
	public List<Direccionable> destino;
	private Boolean enrutada;

    public Flujo(String id, Boolean activo, String nombre, List<Direccionable> destino, Boolean enrutada) {
        this.id = id;
        this.activo = activo;
        this.nombre = nombre;
        this.destino = destino;
        this.enrutada = enrutada;
    }
	
        
}
