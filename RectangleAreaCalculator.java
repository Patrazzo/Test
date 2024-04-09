public class RectangleAreaCalculator {
    public static double calculateArea(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Дължините на страните трябва да бъдат положителни!");
        }
        return length * width;
    }

    public static void printArea(double area) {
        System.out.println("Площта на правоъгълника е: " + area);
    }
}