
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class LocationCollection {
    public TreeMap<Location.LocationParams,Location> TilesOverTime;

    public LocationCollection(TreeMap<Location.LocationParams, Location> TilesOverTime) {
        this.TilesOverTime = TilesOverTime;
    }

    public LocationCollection() {
        this.TilesOverTime = new TreeMap<>();
    }

    public ArrayList<String> toStrings() {
        ArrayList<String> arrStr = new ArrayList<>();
        
        for(Entry<Location.LocationParams,Location> entry : TilesOverTime.entrySet())
        {
            arrStr.add(entry.getValue().toString());
        }
        return arrStr;
    }
    
    
    
}
