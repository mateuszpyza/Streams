package cinemaHall;

public class CinemaHall {
    private final String name;
    private final HallType hallType;


    public CinemaHall(String name, HallType hallType) {
        this.name = name;
        this.hallType = hallType;
    }

    public String getName() {
        return name;
    }

    public HallType getHallType() {
        return hallType;
    }


}
