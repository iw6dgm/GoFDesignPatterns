package Singleton;

import java.util.Arrays;

/**
 * SingletonEnum An example on how an Enum can be a singleton
 * @author joshua
 */
public enum SingletonEnum {
    INSTANCE;
    private String[] myData = {"A", "B", "42"};
    public void anythingYouWant() {
        System.out.println("I am a Singleton Enum!");
        System.out.println(Arrays.toString(myData));
    }
}
