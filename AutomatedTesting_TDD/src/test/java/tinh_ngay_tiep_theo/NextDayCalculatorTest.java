package tinh_ngay_tiep_theo;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @org.junit.jupiter.api.Test
    void nextDayCaculatorTest() {
        LocalDate date = LocalDate.of(2018,1,1);
        LocalDate expected = LocalDate.of(2018,1,2);
        LocalDate result=NextDayCalculator.nextDayCalculator(date);
        assertEquals(expected,result);
    }

}