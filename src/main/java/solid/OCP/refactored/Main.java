package solid.OCP.refactored;

public class Main {

    // Konkrétní implementace
    static class Circle implements Shape {
        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle implements Shape {
        private double width, height;
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        public double calculateArea() {
            return width * height;
        }
    }

    // Kalkulátor, který neporušuje OCP
    static class AreaCalculator {
        public double calculateArea(Shape shape) {
            return shape.calculateArea();
        }
    }
        public static void main(String[] args) {
            Shape circle = new Circle(5);
            Shape rectangle = new Rectangle(4, 6);

            AreaCalculator calculator = new AreaCalculator();
            System.out.println("Circle area: " + calculator.calculateArea(circle));
            System.out.println("Rectangle area: " + calculator.calculateArea(rectangle));
        }
}
