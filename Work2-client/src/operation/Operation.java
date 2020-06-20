/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import types.*;

/**
 *
 * @author Nikolay
 */
public interface Operation extends Remote{
    List<Zapchasty> getListA ()throws RemoteException;
    List<Brands> getListB ()throws RemoteException;
    List<Akcii> getListP ()throws RemoteException;
    List<Postavki> getListS ()throws RemoteException;
    List<Garantiya> getListW ()throws RemoteException;
    
    List<Zapchasty> remListA (int sr)throws RemoteException;
    List<Brands> remListB (int sr)throws RemoteException;
    List<Akcii> remListP (int sr)throws RemoteException;
    List<Postavki> remListS (int sr)throws RemoteException;
    List<Garantiya> remListW (int sr)throws RemoteException;
    
    List<Zapchasty> addNewAutopart (Zapchasty item)throws RemoteException;
    List<Brands> addNewBrand (Brands item)throws RemoteException;
    List<Akcii> addNewPromotion (Akcii item)throws RemoteException;
    List<Postavki> addNewSupplier(Postavki item)throws RemoteException;
    List<Garantiya> addNewWarranty (Garantiya item)throws RemoteException;
    int getSum ()throws RemoteException;
}
