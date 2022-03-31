import java.rmi.*;

public interface IntfCalculator extends Remote{
    public int sum(int x, int y) throws RemoteException;
    public int res(int x, int y) throws RemoteException;
    public int mul(int x, int y) throws RemoteException;
    public int div(int x, int y) throws RemoteException;
    public int mod(int x, int y) throws RemoteException;
    public int pot(int x, int y) throws RemoteException;
}
    