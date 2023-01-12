package cinemaHall;

import java.util.Arrays;
import java.util.List;

public class HallListCreator {
    public static List<CinemaHall> getCinemaHallList() {
        CinemaHall Sun = new CinemaHall("Sun", HallType.HALL_TYPE_3D);
        CinemaHall capitol = new CinemaHall("Capitol", HallType.HALL_TYPE_2D);
        CinemaHall musical = new CinemaHall("Musical", HallType.HALL_TYPE_3D);
        CinemaHall locomotion = new CinemaHall("Locomotion", HallType.HALL_TYPE_4D);
        CinemaHall redBull = new CinemaHall("RedBull", HallType.HALL_TYPE_3D);
        CinemaHall lecture = new CinemaHall("Lecture", HallType.HALL_TYPE_2D);
        CinemaHall mozzarella = new CinemaHall("Mozzarella", HallType.HALL_TYPE_2D);
        CinemaHall greatIdea = new CinemaHall("GreatIdea", HallType.HALL_TYPE_2D);
        CinemaHall beer = new CinemaHall("Beer", HallType.HALL_TYPE_4D);
        CinemaHall flower = new CinemaHall("flower", HallType.HALL_TYPE_3D);
        return Arrays.asList(Sun, capitol, musical, locomotion, redBull, lecture, mozzarella, greatIdea, beer, flower);
    }


}
