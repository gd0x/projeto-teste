package entities;

public class Grades {

    public double num1;
    public double num2;
    public double num3;

    public double gradeSum() {
        return num1 + num2 + num3;
    }

    public double missingPoints() {
        return 60 - gradeSum();
    }


}
