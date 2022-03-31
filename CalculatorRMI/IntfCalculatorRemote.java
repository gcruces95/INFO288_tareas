import java.rmi.*;
import java.rmi.server.*;
import java.math.*;

public class IntfCalculatorRemote extends UnicastRemoteObject implements IntfCalculator {

    public IntfCalculatorRemote () throws RemoteException{

        super();
    }
    public int sum(int x,int y) throws RemoteException{
        return x+y;
    }
    public int res(int x,int y) throws RemoteException{
        return x-y;
    }
    public int mul(int x,int y) throws RemoteException{
        return x*y;
    }
    public int div(int x,int y) throws RemoteException{
        return x/y;
    }
    public int mod(int x,int y) throws RemoteException{
        return x%y;
    }
    public int pot(int x,int y) throws RemoteException{
        return (int) Math.pow(x,y);
    }
}
