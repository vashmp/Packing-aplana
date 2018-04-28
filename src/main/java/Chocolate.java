package main.java;

import static java.lang.Math.random;
/**
 * Class of Chocolate type of candy
 */
public class Chocolate extends Candy{
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static String getIdentificator() {
        return "Chocolate";
    }

    String setRandomType(){
        String[] RandomNames = {"Dark", "Milk", "Yogurt"};
        int RandomValue = 0 + (int) (random() * 3);
        this.setType(RandomNames[RandomValue]);
        return RandomNames[RandomValue];
    }
    void setValues(String str){
        if (str == "Dark"){
            this.setWeight(10);
            this.setCost(50);
        }
        else if (str == "Milk"){
            this.setWeight(12);
            this.setCost(45);
        }
        else if (str == "Yogurt"){
            this.setWeight(9);
            this.setCost(60);
        }
    }
}
