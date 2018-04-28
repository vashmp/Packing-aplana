package main.java;

import static java.lang.Math.*;
/**
 * Class of Sweet type of candy
 */
public class Sweet extends Candy{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String getIdentificator() {
        return "Sweet";
    }

    String setRandomName(){
        String[] RandomNames = {"Bounty", "Snickers", "Mars"};
        int RandomValue = 0 + (int) (random() * 3);
        this.setName(RandomNames[RandomValue]);
        return RandomNames[RandomValue];
        }
    void setValues(String str){
        if (str == "Bounty"){
            this.setWeight(5);
            this.setCost(20);
        }
        else if (str == "Snickers"){
            this.setWeight(7);
            this.setCost(25);
        }
        else if (str == "Mars"){
            this.setWeight(4);
            this.setCost(18);
        }
    }
    }
