package phan_loai_tam_giac;

public class TriangleClassifier {
    static String triangleClassifier(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return "Không phải là tam giác";
        } else if (side1 >= side2 + side3 || side2 >= side1 + side3 || side3 >= side1 + side2) {
            return "Không phải là tam giác";
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            if (side1 != side3 || side2 != side1 || side2 != side3)
                return "Tam giác cân";

            else
                return "Tam giác đều";


        }
        else  return "Tam giác thường";
    }
}

