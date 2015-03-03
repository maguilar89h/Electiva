/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electiva;

/**
 *
 * @author SISTEMAS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Controlador controlador = new Controlador("1","master");
        Aplicacion app1 = new App1();
        Aplicacion app2 = new App2();
        controlador.instalarApp(app1);
        controlador.instalarApp(app2);
        
        Switch switch1 = new Switch(controlador,"1","switch1");
        Switch switch2 = new Switch(controlador,"2","switch2");
        Switch switch3 = new Switch(controlador,"3","switch3");
        Switch switch4 = new Switch(controlador,"4","switch4");
        
        Cliente cliente1 = new Cliente("1","pc1",switch1);
        Cliente cliente2 = new Cliente("2","pc2",switch1);
        Cliente cliente3 = new Cliente("3","pc3",switch2);
        Cliente cliente4 = new Cliente("4","pc4",switch3);
        Cliente cliente5 = new Cliente("5","pc5",switch2);
        Cliente cliente6 = new Cliente("6","pc6",switch1);
        
        
        switch1.conectar(switch2);
        switch1.conectar(switch4);
        switch1.desconectar(switch2);
        cliente1.enviarFlujo(cliente4);
    }
}
