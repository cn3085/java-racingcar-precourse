package racingcar.control;

import java.util.Arrays;
import racingcar.model.Cars;
import racingcar.view.GameView;

public class RacingCarGame implements Game {

    public static final String CAR_NAME_DELIMITER = ",";

    private final GameView view;
    private Cars cars;

    public RacingCarGame(GameView gameView) {
        this.view = gameView;
    }

    @Override
    public void init() {
        initCar();
    }

    private void initCar() {
        String carNames = view.inputCarNames();
        try {
            this.cars = new Cars(Arrays.asList(carNames.split(CAR_NAME_DELIMITER)));
        } catch (IllegalArgumentException iae) {
            view.responseError(iae);
            initCar();
        }
    }

    @Override
    public void start() {

    }

    @Override
    public void quit() {

    }


}
