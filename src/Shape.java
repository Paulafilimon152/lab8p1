public class Shape {
    public double calculateArea() {
        return 0.0;
    }
    public double calculateArea1()
    {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length=length;
        this.width=width;
    }
    
    public double calculateArea1(){
        return length*width;
    }

    public static void main(String[] args) {
        Circle cerc = new Circle(5.0);
        Rectangle dreptunghi = new Rectangle(4.0, 6.0);
        System.out.println("Aria cerc" + cerc.calculateArea());
        System.out.println("Aria dreptunghi" + dreptunghi.calculateArea1());
    }
}
