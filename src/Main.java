public class Main {
    public static void main(String[] args) {

        Square square = new Square();
        System.out.println(square.render() + " " + square.getColor());
        Circle circle = new Circle();
        System.out.println(circle.render() + " " + circle.getColor());

        Shape square1 = new Square();//polymorphism
        System.out.println(square1.render() + " " + square1.getColor());

        Shape circle1 = new Circle();//polymorphism

        System.out.println(circle1.render() + " " + circle1.getColor());

        Shape polygon = new Polygon();//polymorphism
        System.out.println(polygon.render() + " " + polygon.getColor());




    }
} 