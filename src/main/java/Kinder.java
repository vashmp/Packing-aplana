package main.java;

import static java.lang.Math.random;

/**
 * Class of Kinder Surprise type of candy
 */
public class Kinder extends Sweet{
    private String toy;

    public String getToy() {
        return toy;
    }

    public void setToy(String toy) {
        this.toy = toy;
    }
    public static String getIdentificator() {
        return "Kinder Surprise";
    }

    void setRandomToy(){
        String[] RandomNames = {"Robot", "Barby", "King", "Queen", "Dragon"};
        int RandomValue = 0 + (int) (random() * 5);
        this.setToy(RandomNames[RandomValue]);
    }
    void setValues(){
        this.setCost(150);
        this.setWeight(50);
    }
}
