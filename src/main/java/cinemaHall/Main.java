package cinemaHall;


public class Main {
    public static void main(String[] args) {
        System.out.println("Liczba sal typu 2D wynosi: ");
        System.out.println(HallTypeCounter.getNumberOfType(HallType.HALL_TYPE_2D));
        System.out.println("Liczba sal typu 3D wynosi: ");
        System.out.println(HallTypeCounter.getNumberOfType(HallType.HALL_TYPE_3D));
        System.out.println("Liczba sal typu 4D wynosi: ");
        System.out.println(HallTypeCounter.getNumberOfType(HallType.HALL_TYPE_4D));


    }


}
