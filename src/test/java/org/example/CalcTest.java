package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @BeforeAll
    public static void nastroiki() {
        System.out.println("до всех тестов");
    }

    @BeforeEach
    public void nastroiki2() {
        System.out.println("до каждого теста");
    }

    @AfterAll
    public static void nastroiki3() {
        System.out.println("после всех тестов");
    }

    @AfterEach
    public void nastroiki4() {
        System.out.println("после каждого теста");
    }

    @Test
    @DisplayName("Проверка сложения")
    void summ() {
        Calc calc = new Calc();
        int result = calc.summ(1,6);
        Assertions.assertEquals(7, result, "Не тот ответ");
    }

    @Test
    @DisplayName("Проверка вычитания")
    void vichitanie() {
        Calc calc2 = new Calc();
        int result2 = calc2.vichitanie(10,9);
        Assertions.assertEquals(1, result2, "Не тот ответ");
    }


    @ParameterizedTest(name = "#{index} - вычитание {0} и {1}, ожидаем {2}")
    @CsvSource({"10, 9, 1", "-2, -2, 0"})
    @DisplayName("Проверка вычитания")
    @Tag("paramVichitanie")
    void vichitanie2(int a, int b, int expexctedresult) {
        Calc calc3 = new Calc();
        int result3 = calc3.vichitanie(a,b);
        Assertions.assertEquals(expexctedresult, result3, "Не тот ответ");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"10, 9, 19", "-2, -2, -4"})
    @DisplayName("Проверка сложения")
    @Tag("paramSumm")
    void summa(int a, int b, int expexctedresult) {
        Calc calc4 = new Calc();
        int result4 = calc4.summ(a,b);
        Assertions.assertEquals(expexctedresult, result4, "Не тот ответ");
    }

}

