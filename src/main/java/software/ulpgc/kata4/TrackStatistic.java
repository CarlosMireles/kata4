package software.ulpgc.kata4;

import java.util.List;
import java.util.Map;

public interface TrackStatistic {
    Map<String,Integer> calculate(List<Track> tracks);
}
