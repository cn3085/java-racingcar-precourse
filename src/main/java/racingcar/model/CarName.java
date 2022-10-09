package racingcar.model;

public class CarName {

    public static final int CAR_NAME_MAX_LENGTH = 5;
    private final String name;

    public CarName(String name) {
        if(name == null || name.length() > CAR_NAME_MAX_LENGTH){
            throw new IllegalArgumentException("자동차 이름은 1글자 이상, 5글자 이하여야합니다!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
