package electiva;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Controlador {
	private String id;
	private String nombre;
        private Map<Integer,List<Direccionable>> rutas;
	private List<Aplicacion> aplicaciones;

        public Controlador(String id, String nombre) {
            this.id = id;
            this.nombre = nombre;
            aplicaciones = new ArrayList<>();
        }
        
        public void enrutar(Flujo f) {
            f = procesarFlujo(f);
            //TODO enrutar segun destino (switch y cliente)
	}
	
	private Flujo procesarFlujo(Flujo f) {
            //TODO: procesar flujo segun apps
            return f;
	}
        
        public void instalarApp(Aplicacion app){
            if(!aplicaciones.contains(app)){
                aplicaciones.add(app);
            }
        }
        
        public void desinstalarApp(Aplicacion app){
            if(aplicaciones.contains(app)){
                aplicaciones.remove(app);
            }
        }
}
