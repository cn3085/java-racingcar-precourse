package racingcar.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void 자동차이름_입력받아_자동차_만들기(){
        Car car = new Car(new CarName("빨간차"));
        assertEquals(car.getCarName(), "빨간차");
    }

    @Test
    void 자동차이름_여러개_입력받아_자동차들_만들기() {
        Cars cars = new Cars(Arrays.asList("빨간차", "노란차"));
        assertEquals(cars.length(), 2);
    }

    @Test
    void 유효하지않은_자동차이름_입력받아_에러내기() {
        assertThrows(IllegalArgumentException.class, () -> new Cars(Arrays.asList("빨간차", "노란차차차설운도차차차")));
    }
}
