public class TriangleAreaCalculator {
    public static double calculateArea(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Дължините на страните трябва да са положителни!");
        }
        return (base * height) / 2;
    }

    public static void printArea(double area) {
        System.out.println("Площта на триъгълника е: " + area);
    }

    public static void main(String[] args) {
        printArea(calculateArea(3,3));
    }
}