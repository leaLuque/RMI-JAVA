/*
 * ObjetoRemoto.java
 *
 * Created on 27 de abril de 2004, 21:18
 */

//package chuidiang.ejemplos.rmi.suma;

//import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ObjetoRemoto extends UnicastRemoteObject 
    implements InterfaceRemota
{
   
    protected ObjetoRemoto () throws RemoteException
    {
        super();
    }

    /**
     * Obtiene la suma de los operandos que le pasan y la devuelve.
     */
    public int suma(int a, int b) 
    {
	    System.out.println ("Sumando " + a + " + " + b +"...");
        return a+b;
    }
    
    /**
    * Obtiene la resta de los operandos que le pasan y la devuelve.
    */
    public int resta(int a, int b){
        System.out.println ("Restando "+a+" - "+b + "...");
        return a-b;
    }
}
