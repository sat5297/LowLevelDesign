package BookMyShow;

public class Movie {
    int movieID;
    String movieName;
    int movieDuration;

    public int getMovieID(){
        return movieID;
    }

    public void setMovieID(int movieID){
        this.movieID = movieID;
    }

    public String getMovieName(){
        return movieName;
    }

    public void setMovieName(String movieName){
        this.movieName = movieName;
    }

    public int getMovieDuration(){
        return movieDuration;
    }

    public void setMovieDuration(int movieDuration){
        this.movieDuration = movieDuration;
    }
}
