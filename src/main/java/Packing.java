package main.java;

/**
 * @author Nikita Blokhin
 */
public class Packing {
    /**
     * Packing your gift with random Candies
     * @param args
     */
    public static void main(String args[]){
        double totalCost = 0;
        double totalWeight = 0;
        System.out.println("Your New Year gift contain:");
        Sweet pos1[] = new Sweet[5];
        for (int i = 0; i<5; i++){
            pos1[i] = new Sweet();
            pos1[i].setValues(pos1[i].setRandomName());
            totalCost += pos1[i].getCost();
            totalWeight += pos1[i].getWeight();
            System.out.print(Sweet.getIdentificator() + " " + pos1[i].getName());
            System.out.println(". With cost " + pos1[i].getCost() + " rub. And with weight " + pos1[i].getWeight() + " gram");
        }
        Chocolate pos2[] = new Chocolate[5];
        for (int i = 0; i<5; i++){
            pos2[i] = new Chocolate();
            pos2[i].setValues(pos2[i].setRandomType());
            totalCost += pos2[i].getCost();
            totalWeight += pos2[i].getWeight();
            System.out.print(Chocolate.getIdentificator() + " with " + pos2[i].getType());
            System.out.println(" stuff inside. With cost " + pos2[i].getCost() + " rub. And with weight " + pos2[i].getWeight() + " gram");
        }
        Kinder pos3[] = new Kinder[3];
        for (int i = 0; i<3; i++){
            pos3[i] = new Kinder();
            pos3[i].setValues();
            pos3[i].setRandomToy();
            totalCost += pos3[i].getCost();
            totalWeight += pos3[i].getWeight();
            System.out.print(Kinder.getIdentificator() + " with " + pos3[i].getToy());
            System.out.println(" toy inside. With cost " + pos3[i].getCost() + " rub. And with weight " + pos3[i].getWeight() + " gram");

        }
        System.out.println("Total cost of gift is: " + totalCost);
        System.out.println("Total weight of gift is: " + totalWeight);
        System.out.println("Happy New Year!");
    }
}
