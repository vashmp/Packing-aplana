package main.java;

/**
 * Parent class for all candies
 * Includes standart setters and getters functions
 */
public class Candy {
    public double cost;
    public double weight;

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}

