package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MoneyServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/money.csv")
    public void test(int expected, int income, int expense, int threshold) {
        MoneyService service = new MoneyService();
        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}