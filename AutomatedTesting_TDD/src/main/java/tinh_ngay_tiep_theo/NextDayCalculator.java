package tinh_ngay_tiep_theo;

import java.time.LocalDate;

public class NextDayCalculator {
    public static LocalDate nextDayCalculator(LocalDate date) {
        return date.plusDays(1);
    }
}
