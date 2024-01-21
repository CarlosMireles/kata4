package software.ulpgc.kata4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenreTrackStatistic implements TrackStatistic{
    @Override
    public Map<String, Integer> calculate(List<Track> tracks) {
        Map<String, Integer> map = new HashMap<>();
        for (Track track : tracks){
            map.put(track.genre(), map.getOrDefault(track.genre(), 0) + 1);
        }
        return map;
    }
}
