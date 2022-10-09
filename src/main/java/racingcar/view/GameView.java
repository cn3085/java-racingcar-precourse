package racingcar.view;

public interface GameView {
    String inputCarNames();

    String inputTurn();

    void responseError(IllegalArgumentException iae);

}
