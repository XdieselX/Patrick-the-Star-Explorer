
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class Location implements Comparable<Location.LocationParams>{
    public LocationParams locParams;
    public double Temperature;
    public double Calculated_PH;
 

    public Location(float Longitude, float Latitude, double Temperature, double Calculated_PH, ZonedDateTime ocurrence) {
        this.locParams = new LocationParams(Longitude, Latitude, ocurrence);
        this.Temperature = Temperature;
        this.Calculated_PH = Calculated_PH;
    }
    
    public Location(String Message)
    {
        StringTokenizer strtok = new StringTokenizer(Message, "/");
        this.locParams.Longitude = Float.valueOf((String)strtok.nextElement());
        this.locParams.Latitude = Float.valueOf((String)strtok.nextElement());
        this.Temperature = Float.valueOf((String)strtok.nextElement());
        this.Calculated_PH = Float.valueOf((String)strtok.nextElement());
        this.locParams.ocurrence = ZonedDateTime.parse((String)strtok.nextElement());
    }


    public Location() {
    }

    @Override
    public String toString() {
        return "Longitude : "+this.locParams.Longitude+" Latitude : "+this.locParams.Latitude+" Temperature :"+this.Temperature+"°C Calculated PH :"+this.Calculated_PH+" occured on :"+this.locParams.ocurrence; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(LocationParams o) {
        return this.locParams.ocurrence.compareTo(o.ocurrence);
    }
    public class LocationParams
    {
        public float Longitude;
        public float Latitude;
        public ZonedDateTime ocurrence; 

        public LocationParams(float Longitude, float Latitude, ZonedDateTime ocurrence) {
            this.Longitude = Longitude;
            this.Latitude = Latitude;
            this.ocurrence = ocurrence;
        }    
    }
}
