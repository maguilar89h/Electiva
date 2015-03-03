package taller_electiva;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Direccionable {
    private Switch switch1;
    
    public Cliente(String id, String nombre, Switch switch1) {
        super.setId(id);
        super.setNombre(nombre);
        this.switch1 = switch1;
        this.switch1.conectar(this);
    }

    public Flujo enviarFlujo(Cliente destino) {            
        this.switch1.direccionarFlujo(generarFlujo(destino));
        return null;
    }

    public Switch getSwitch() {
        return switch1;
    }

    public void setSwitch(Switch switch1) {
        this.switch1 = switch1;
        this.switch1.conectar(this);
    }

    public Flujo generarFlujo(Cliente destino){
        List<Direccionable> destinos = new ArrayList<>();
        destinos.add(destino);
        return new Flujo("1", true, "flujo1", destinos, false);
    }
    
}
