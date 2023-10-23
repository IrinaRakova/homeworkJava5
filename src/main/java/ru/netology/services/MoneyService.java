package ru.netology.services;

public class MoneyService {
    public int calculate(int income, int expense, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 1; month < 12; month++) {
            money = money + income - expense;
            if (money >= threshold) {
                money = (money - expense) / 3;
                count++;
                month++;
            }
        }
        return count;
    }
}
