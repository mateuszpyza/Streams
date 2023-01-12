package cinemaHall;

import java.util.List;
import java.util.stream.Collectors;

public class HallTypeCounter {
    public static long getNumberOfType(HallType type) {
        List<CinemaHall> cinemaHalls = HallListCreator.getCinemaHallList();
        return cinemaHalls.stream().filter(cinemaHall -> cinemaHall.getHallType() == type).count();
    }
}
