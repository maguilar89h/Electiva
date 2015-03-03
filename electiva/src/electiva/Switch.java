package electiva;

import java.util.ArrayList;
import java.util.List;

public class Switch extends Direccionable {

	private Boolean estado;
	private Integer puerto;
	private Controlador controlador;
        private List<Direccionable> conectados; 
        
        public Switch(Controlador c, String id, String nombre) {
            this.controlador = c;
            conectados = new ArrayList<>();
            super.setId(id);
            super.setNombre(nombre);
	}

	public void direccionarFlujo(Flujo flujo) {
            this.controlador.enrutar(flujo);
	}
        
        public void conectar(Direccionable disp){
            if(!conectados.contains(disp)){
                conectados.add(disp);
                System.out.println("Se conectó " + disp.getNombre() + " a "+this.getNombre());
            }
        }
        
        public void desconectar(Direccionable disp){
            if(conectados.contains(disp)){
                conectados.remove(disp);
                System.out.println("Se desconectó " + disp.getNombre() + " de "+this.getNombre());
            }
        }
}
