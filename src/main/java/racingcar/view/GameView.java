package racingcar.view;

import racingcar.model.Cars;

public interface GameView {
    String inputCarNames();

    String inputTurn();

    void responseError(IllegalArgumentException iae);

    void showGameProgress(Cars cars);

    void notifyStartGame();
}
