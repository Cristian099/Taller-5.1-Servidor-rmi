package agenciaviajes.negocio;

import agenciaviajes.acceso.IServicio;
import java.rmi.RemoteException;
import mvcf.AModel;

import java.util.ArrayList;
import servidormi.modelo.Cliente;


/**
 * Representa el modelo (Observable) de datos Cuando hay cambios en el estado,
 * notifica a todas sus vistas (observadores)
 *
 * @author Julio, Libardo, Ricardo
 */
public class GestorClientes extends AModel {

    private final IServicio servidor;
    private ArrayList<Cliente> clientes;
    private int totalHombres;
    private int totalMujeres;

    public GestorClientes() {
        Fabrica fabrica = new Fabrica();
        //servidor = fabrica.getServidor("SOCKET");
        servidor = fabrica.getServidor();

    }
    
    //Completar


}
