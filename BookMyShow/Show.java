package BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Show {
    int showID;
    Movie movie;
    Screen screen;
    int showStartTime;
    List < Integer > bookedSeatIDs = new ArrayList<>();

    public int getShowId(){
        return showID;
    }

    public void setShowID(int showID){
        this.showID = showID;
    }

    public Movie getMovie(){
        return movie;
    }

    public void setMovie(Movie movie){
        this.movie = movie;
    }

    public Screen getScreen(){
        return screen;
    }

    public void setScreen(Screen screen){
        this.screen = screen;
    }

    public int getShowStartTime(){
        return showStartTime;
    }

    public void setShowStartTime(int showStartTime){
        this.showStartTime = showStartTime;
    }

    public List<Integer> getBookedIDs(){
        return bookedSeatIDs;
    }

    public void setBookedIDs(List<Integer> bookedSeatIDs){
        this.bookedSeatIDs = bookedSeatIDs;
    }
}
