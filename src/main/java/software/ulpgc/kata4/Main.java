package software.ulpgc.kata4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:chinook.db")){
            List<Track> tracks = SqliteTrackLoader.with(connection).loadAll();

            for (Track track : tracks){
                System.out.println(track);
            }

            System.out.println("---------------------");

            TrackStatistic statistic = new GenreTrackStatistic();
            Map<String,Integer> map = statistic.calculate(tracks);

            for (String key : map.keySet()){
                System.out.println(key + " = " + map.get(key));
            }
        }
    }
}
