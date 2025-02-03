package task1;

import task1.discount.FixedDiscount;
import task1.discount.LoyaltyDiscount;
import task1.discount.PercentageDiscount;
import task1.discount.PriceCalculator;

import java.util.Scanner;

/*1. Изучите паттерн Стратегия. Создайте приложение для расчета цен на товары с использованием
различных стратегий скидок. Например, реализуйте:
Фиксированную скидку
Процентную скидку
Скидку для постоянных клиентов
Реализуйте класс с возможностью выбора стратегии и применения ее при расчете стоймости.
Результат применения разных стратегия продемонстрируйте в Main.*/

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double pizzaBasePrice = 20.0;
        PriceCalculator calculator = new PriceCalculator();

        System.out.println("Welcome to the pizzeria!");
        System.out.println("Pizza base price: $" + pizzaBasePrice);
        System.out.println("Select a discount:");
        System.out.println("1 - Fixed discount ($5)");
        System.out.println("2 - Percentage discount (10%)");
        System.out.println("3 - Discount for regular customers (15%)");
        System.out.println("0 - No discount");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calculator.setDiscountStrategy(new FixedDiscount(5.0));
                break;
            case 2:
                calculator.setDiscountStrategy(new PercentageDiscount(10.0));
                break;
            case 3:
                calculator.setDiscountStrategy(new LoyaltyDiscount());
                break;
            case 0:
                System.out.println("You have chosen pizza without discount.");
                break;
            default:
                System.out.println("Incorrect choice. Discount does not apply.");
        }

        double finalPrice = calculator.calculatePrice(pizzaBasePrice);
        System.out.println("Final price of your pizza: $" + finalPrice);
    }
}