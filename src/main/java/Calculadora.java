
import java.rmi.RemoteException;

/**
 *
 * @author loren
 */
public class Calculadora implements ICalculadora {

    private double valorA;
    private double valorB;

    public Calculadora() {
        this(0.0, 0.0);
    }

    public Calculadora(double valorA, double valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    @Override
    public void setValorA(double valorA) throws RemoteException {
        this.valorA = valorA;
    }

    @Override
    public void setValorB(double valorB) throws RemoteException {
        this.valorB = valorB;
    }

    @Override
    public double getValorA() {
        return valorA;
    }

    @Override
    public double getValorB() {
        return valorB;
    }

    @Override
    public double getSoma() throws RemoteException {
        return (getValorA() + getValorB());
    }

    @Override
    public double getSubtrair() throws RemoteException {
        return (getValorA() - getValorB());
    }

    @Override
    public double getMultiplicar() throws RemoteException {
        return (getValorA() * getValorB());
    }

    @Override
    public double getDividir() throws RemoteException {
        return (getValorA() / getValorB());
    }

}
