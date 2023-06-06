package BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    Map < City, List < Theatre > > cityVsTheatre;
    List < Theatre > allTheatres;

    TheatreController(){
        cityVsTheatre = new HashMap<>();
        allTheatres = new ArrayList<>();
    }

    void addTheatre(Theatre theatre, City city){
        allTheatres.add(theatre);
        List < Theatre > theatres = cityVsTheatre.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);
        cityVsTheatre.put(city, theatres);
    }

    Map < Theatre, List < Show >> getAllShows(Movie movie, City city){
        Map < Theatre, List<Show>> theatreVsShow = new HashMap<>();
        List < Theatre > theatres = cityVsTheatre.get(city);

        for(Theatre theatre : theatres){
            List < Show > getMovieShows = new ArrayList<>();
            List < Show > shows = theatre.getShows();


            for(Show show : shows){
                if(show.movie.getMovieID() == movie.getMovieID()){
                    getMovieShows.add(show);
                }
            }

            if(!getMovieShows.isEmpty()){
                theatreVsShow.put(theatre, getMovieShows);
            }
        }
        return theatreVsShow;
    }
}
