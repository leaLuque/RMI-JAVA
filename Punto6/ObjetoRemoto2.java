/*
 * ObjetoRemoto.java
 *
 * Created on 27 de abril de 2004, 21:18
 */

//package chuidiang.ejemplos.rmi.suma;

//import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author  Javier Abell�n
 */
public class ObjetoRemoto2 extends UnicastRemoteObject 
    implements InterfaceRemota2
{
    /**
     * Construye una instancia de ObjetoRemoto
     * @throws RemoteException
     */
    protected ObjetoRemoto2 () throws RemoteException
    {
        super();
    }

    /**
     * Obtiene la suma de los operandos que le pasan y la devuelve.
     */
    public int multiplicacion(int a, int b) 
    {
	    System.out.println ("Multiplicando " + a + " * " + b +"...");
        return a*b;
    }
    
    /**
    * Obtiene la resta de los operandos que le pasan y la devuelve.
    */
    public float division(int a, int b){
        System.out.println ("Dividiendo "+a+" / "+b + "...");
        return a/b;
    }
}
