
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author loren
 */
public interface ICalculadora extends Remote {

    public void setValorA(double valorA) throws RemoteException;

    public void setValorB(double valorB) throws RemoteException;

    public double getValorA() throws RemoteException;

    public double getValorB() throws RemoteException;

    public double getSoma() throws RemoteException;

    public double getSubtrair() throws RemoteException;

    public double getMultiplicar() throws RemoteException;

    public double getDividir() throws RemoteException;
    
}
