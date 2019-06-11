package servidor.main;

import servidor.servicio.ServidorCentralServer;

/**
 *
 * @author libardo
 */
public class RunMain {
    public static void main(String args[]){
        ServidorCentralServer regSer = new ServidorCentralServer();
        regSer.iniciar();
    }
}
