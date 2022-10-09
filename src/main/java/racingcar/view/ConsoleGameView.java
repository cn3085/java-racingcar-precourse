package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class ConsoleGameView implements GameView {

    public static final String ERROR_TAG = "[ERROR]";

    @Override
    public String inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }

    @Override
    public String inputTurn() {
        System.out.println("시도할 회수는 몇 회인가요?");
        return Console.readLine();
    }

    @Override
    public void responseError(IllegalArgumentException iae) {
        System.out.println(ERROR_TAG + iae.getMessage());
    }
}
