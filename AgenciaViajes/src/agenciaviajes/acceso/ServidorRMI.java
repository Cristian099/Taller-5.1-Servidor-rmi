package agenciaviajes.acceso;

import servidormi.modelo.Cliente;

/**
 *
 * @author libardo
 */
public class ServidorRMI implements IServicio {

    private static final String IP = "localhost"; // Puedes cambiar a localhost
    private static final int PUERTO = 1100; //Si cambias aquí el puerto, recuerda cambiarlo en el servidor

    public ServidorRMI() {
    }

    @Override
    public Cliente[] consultarClientesServicio() {
        //Completar
        return null;
    }

}
