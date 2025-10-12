package calculator;

public class Main {
    public static void main(String[] args) {
        double Bubblegum = 202;
        double Toffee = 118;
        double Icecream = 2250;
        double Milkchocolate = 1680;
        double Pancake = 80;
        double Doughnut = 1075;
        double income = Bubblegum + Toffee + Icecream + Milkchocolate + Doughnut + Pancake;

        System.out.println("Earned amount:\nBubblegum: $202\nToffee: $118\nIce cream: $2250\nMilk chocolate: $1680\nDoughnut: $1075\nPancake $80");
        System.out.println("Income: $" + income);
    }
}