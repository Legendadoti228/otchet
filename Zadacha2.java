import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("ширину прямоугольника: ");
            double shirina = scanner.nextDouble();
            System.out.println("высоту прямоугольника: ");
            double vysota = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(shirina, vysota);
            System.out.println("Площадь прямоугольника: " + rectangle.getPloshad());
            System.out.println("Периметр прямоугольника: " + rectangle.getPerimetr());

            System.out.println("Введите радиус круга: ");
            double radius = scanner.nextDouble();
            Circle circle = new Circle(radius);
            System.out.println("Площадь круга: " + circle.getPloshad());
            System.out.println("Периметр круга: " + circle.getPerimetr());

            System.out.println("первая сторона треугольника: ");
            double storonaA = scanner.nextDouble();
            System.out.println("вторая сторона треугольника: ");
            double storonaB = scanner.nextDouble();
            System.out.println("третья сторона треугольника: ");
            double storonaC = scanner.nextDouble();
            Triangle triangle = new Triangle(storonaA, storonaB, storonaC);
            System.out.println("Площадь треугольника: " + triangle.getPloshad());
            System.out.println("Периметр треугольника: " + triangle.getPerimetr());
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }
}

class Rectangle {
    private double shirina;
    private double vysota;

    public Rectangle(double shirina, double vysota) {
        if (shirina <= 0 || vysota <= 0) {
            throw new RuntimeException("Не существует фигуры с данными параметрами.");
        }
        this.shirina = shirina;
        this.vysota = vysota;
    }

    public double getPloshad() {
        return shirina * vysota;
    }

    public double getPerimetr() {
        return 2 * (shirina + vysota);
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Не существует фигуры с данными параметрами.");
        }
        this.radius = radius;
    }

    public double getPloshad() {
        return Math.PI * radius * radius;
    }

    public double getPerimetr() {
        return 2 * Math.PI * radius;
    }
}

class Triangle {
    private double storonaA;
    private double storonaB;
    private double storonaC;

    public Triangle(double storonaA, double storonaB, double storonaC) {
        if (storonaA <= 0 || storonaB <= 0 || storonaC <= 0 ||
            storonaA + storonaB <= storonaC || storonaA + storonaC <= storonaB || storonaB + storonaC <= storonaA) {
            throw new RuntimeException("Не существует фигуры с данными параметрами.");
        }
        this.storonaA = storonaA;
        this.storonaB = storonaB;
        this.storonaC = storonaC;
    }

    public double getPloshad() {
        double poluperimetr = (storonaA + storonaB + storonaC) / 2;
        return Math.sqrt(poluperimetr * (poluperimetr - storonaA) * (poluperimetr - storonaB) * (poluperimetr - storonaC));
    }

    public double getPerimetr() {
        return storonaA + storonaB + storonaC;
    }
}
