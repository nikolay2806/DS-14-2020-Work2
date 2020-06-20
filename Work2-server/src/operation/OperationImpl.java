/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import types.*;

/**
 *
 * @author Nikolay
 */

public class OperationImpl extends UnicastRemoteObject implements Operation {
    public OperationImpl ()throws RemoteException{
    }
    static List<Zapchasty> lstA = new ArrayList<Zapchasty>();
    static List<Brands> lstB = new ArrayList<Brands>();
    static List<Akcii> lstP = new ArrayList<Akcii>();
    static List<Postavki> lstS = new ArrayList<Postavki>();
    static List<Garantiya> lstW = new ArrayList<Garantiya>();
    static {
        lstB.add(new Brands("Lada","Марка автомобилей, производимых АО «АвтоВАЗ»"));
        lstB.add(new Brands("Reno","Французская автомобилестроительная корпорация"));
        lstB.add(new Brands("KIA","Южнокорейская автомобилестроительная компания"));
        lstP.add(new Akcii("Под Охраной","01.05.2020",25,"Установка сигнализации"));
        lstP.add(new Akcii("Зима","06.11.2020",50,"Зимняя резина в подарок"));
        lstP.add(new Akcii("Купи сейчас","06.11.2020",60,"Скидка 10%"));
        lstS.add(new Postavki("ИНКОМ-Авто","г. Ухта, ул. Печорская, д. 36, лит. Б",78216785875L,23568906));
        lstS.add(new Postavki("ОВЕН-АВТО","г. Сыктывкар, ул. Гаражная, д. 1",78212288599L,35902146));
        lstS.add(new Postavki("NEXT запчасти RENAULT","г. Сыктывкар, ул. Сысольское шоссе, д. 20", 88212577907L,39045651));
        lstS.add(new Postavki("MGM MOTORS","г. Ухта, ул. Ветлосяновская, д. 2", 88216750710L,49890650));
        lstW.add(new Garantiya("Стандарт Lada",14));
        lstW.add(new Garantiya("Люкс Reno",24));
        lstW.add(new Garantiya("Бизнес KIA",60));
    }
    

    @Override
    public List<Zapchasty> getListA ()throws RemoteException{
        return lstA;
    }
    
    @Override
    public List<Brands> getListB ()throws RemoteException{
        return lstB;  
    }
    
    @Override
    public List<Akcii> getListP ()throws RemoteException{
        return lstP;
    }
    
    @Override
    public List<Postavki> getListS ()throws RemoteException{
        return lstS;
    }
    
    @Override
    public List<Garantiya> getListW ()throws RemoteException{
        return lstW;
    }
    
    @Override
    public List<Zapchasty> remListA (int sr)throws RemoteException{
        lstA.remove(sr);
        return lstA;
    }
    
    @Override
    public List<Brands> remListB (int sr)throws RemoteException{
        lstB.remove(sr);
        return lstB;
    }
    
    @Override
    public List<Akcii> remListP (int sr)throws RemoteException{
        lstP.remove(sr);
        return lstP;
    }
    
    @Override
    public List<Postavki> remListS (int sr)throws RemoteException{
        lstS.remove(sr);
        return lstS;
    }
    
    @Override
    public List<Garantiya> remListW (int sr)throws RemoteException{
        lstW.remove(sr);
        return lstW;
    }
    
    @Override
    public List<Zapchasty> addNewAutopart (Zapchasty item)throws RemoteException{
        lstA.add(item);
        return lstA;
    }
    
    @Override
    public List<Brands> addNewBrand (Brands item)throws RemoteException{
        lstB.add(item);
        return lstB;
    }
    
    @Override
    public List<Akcii> addNewPromotion (Akcii item)throws RemoteException{
        lstP.add(item);
        return lstP;
    }
    
    @Override
    public List<Postavki> addNewSupplier (Postavki item)throws RemoteException{
        lstS.add(item);
        return lstS;
    }
    
    @Override
    public List<Garantiya> addNewWarranty (Garantiya item)throws RemoteException{
        lstW.add(item);
        return lstW;
    }
    
    @Override
    public int getSum ()throws RemoteException{
        int sum = 0;
        for (Zapchasty autoparts: lstA)
        {
            sum += autoparts.getKol()*autoparts.getPrice();
        }
        return sum;
    }
}
