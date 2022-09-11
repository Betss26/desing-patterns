package creationalPatterns.singleton;

import java.util.Objects;

/**
 * This implementation is the original but is known
 * to be problematic in multithreaded scenarios
 * e.g it can result in more than one instance
 * whe need:
 * a private constructor
 * a static field containing its only instance
 * a static factory method for obtaining the instance
 */
public class PopularSingleton {

    private  static PopularSingleton INSTANCE;

    private String info = "Initial info class";

    public static PopularSingleton getInstance(){
        if (Objects.nonNull(INSTANCE)){
            INSTANCE = new PopularSingleton();
        }
        return INSTANCE;
    }

    public static PopularSingleton getINSTANCE() {
        return INSTANCE;
    }

    public static void setINSTANCE(PopularSingleton INSTANCE) {
        PopularSingleton.INSTANCE = INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
