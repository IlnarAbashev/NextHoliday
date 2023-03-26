package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class NextHolidayTest {

    @ParameterizedTest
//    @CsvSource({
//            "3, 10000, 3000, 20000",
//            "2, 100000, 60000, 150000"
//    })
    @CsvFileSource(files = "src/test/resources/holiday.csv")
    void NextHolidayMonths(int expected, int income, int expenses, int threshould) {
        NextHoliday service = new NextHoliday();

//        int expected = 3;
//        int income = 10_000;
//        int expenses = 3_000;
//        int threshould = 20_000;

        int actual = service.calculate(income, expenses, threshould);
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    void NextHolidayThreeMonths() {
//        NextHoliday service = new NextHoliday();
//
//        int expected = 2;
//        int income = 100_000;
//        int expenses = 60_000;
//        int threshould = 150_000;
//
//        int actual = service.calculate(income, expenses, threshould);
//        Assertions.assertEquals(expected, actual);
//    }
}
