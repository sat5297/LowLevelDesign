package BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    int theatreID;
    String address;
    City city;
    List < Screen > screens = new ArrayList<>();
    List < Show > shows = new ArrayList<>();

    public List < Screen > getScreens(){
        return screens;
    }

    public void setScreens(List < Screen > screens){
        this.screens = screens;
    }

    public List < Show > getShows(){
        return shows;
    }

    public void setShows(List < Show > shows){
        this.shows = shows;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public City getCity(){
        return city;
    }

    public void setCity(City city){
        this.city = city;
    }

    public int getTheatreID(){
        return theatreID;
    }

    public void setTheatreID(int theatreID){
        this.theatreID = theatreID;
    }
}
