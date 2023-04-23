package phan_loai_tam_giac;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @org.junit.jupiter.api.Test
    void triangleClassifier() {
        int side1 = 8;
        int side2 = 2;
        int side3 = 3;
        String actual = TriangleClassifier.triangleClassifier(side1,side2,side3);
        String expected = "Tam giác cân";
        assertEquals(actual,expected);
    }

}