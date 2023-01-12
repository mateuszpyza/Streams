package cinemaHall;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class HallTypeCounterTest {


    @Test
    void getNumberOfType2D() {
        //given
        HallType hallType = HallType.HALL_TYPE_2D;
        long expected = 4;
        //when
        long result = HallTypeCounter.getNumberOfType(hallType);
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getNumberOfType3D() {
        //given
        HallType hallType = HallType.HALL_TYPE_3D;
        long expected = 4;
        //when
        long result = HallTypeCounter.getNumberOfType(hallType);
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getNumberOfType4D() {
        //given
        HallType hallType = HallType.HALL_TYPE_4D;
        long expected = 2;
        //when
        long result = HallTypeCounter.getNumberOfType(hallType);
        //then
        Assertions.assertEquals(expected, result);
    }
}