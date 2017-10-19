package icebergestudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IcebergEstudy {
    
    Map <Iceberg, List<IcebergVolume>> icebergsData = new HashMap<>();
    
    public IcebergEstudy(){
        Iceberg ice1 = new Iceberg("12/04/1998", "Ice0001");
        Iceberg ice2 = new Iceberg("28/11/2005", "Ice0002");
        
        List<IcebergVolume> lice1 = new ArrayList();
        lice1.add(new IcebergVolume(ice1, "19/10/2000", 400, "28,34"));
        lice1.add(new IcebergVolume(ice1, "09/06/2004", 290, "25,31"));
        lice1.add(new IcebergVolume(ice1, "20/03/2010", 180, "22,32"));
        
        List<IcebergVolume> lice2 = new ArrayList();
        lice1.add(new IcebergVolume(ice2, "02/04/2007", 800, "40,80"));
        lice1.add(new IcebergVolume(ice2, "09/06/2016", 629, "30,50"));
        
        icebergsData.put(ice1, lice1);
        icebergsData.put(ice2, lice2);
    }

    public static void main(String[] args) {
        IcebergEstudy icebergs = new IcebergEstudy();
        icebergs.print();
    }
    
    private void print(){
        for (List<IcebergVolume> list : icebergsData.values()) {
            for (IcebergVolume element : list) {
                System.out.println(element);
            }
        }
    }

    
    
    
    
    
}
