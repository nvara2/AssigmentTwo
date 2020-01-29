import java.util.Scanner;

public class Assignment2 {



        interface Shape {
            public double calculateArea();
            public void display();
        }
        static class Rectangle implements Shape {
            private double length;
            private double width;
            public Rectangle(double length, double width) {
                this.length = length;
                this.width = width;
            }
            public double calculateArea() {
                return length * width;
            }
            public void display() {
                System.out.println("\nRectangle Calculations");
                System.out.println("Length: " + length);
                System.out.println("Width: " + width);
                System.out.println("Area: " + calculateArea());
            }
        }
        static class Circle implements Shape {
            private double radius;
            public Circle(double radius) {
                this.radius = radius;
            }
            public double calculateArea() {
                return Math.PI * Math.pow(radius,  2);
            }
            public void display() {
                System.out.println("\nCircle Calculations");
                System.out.println("Radius: " + radius);
                System.out.println("Area " + calculateArea());
            }
        }
        static class Triangle implements Shape {
            private double base;
            private double height;
            public Triangle(double base, double height) {
                this.base = base;
                this.height = height;
            }
            public double calculateArea() {
                return base * height / 2;
            }
            public void display() {
                System.out.println("\nTriangle Calculations");
                System.out.println("Base: " + base);
                System.out.println("Height: " + height);
                System.out.println("Area: " + calculateArea());
            }
        }
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String[] input = null;
            long sum = 0;

            System.out.println("Please enter numbers with spaces to be added:");
            input = s.nextLine().split(" ");
            for (String i : input) {
                try {
                    sum += Long.parseLong(i);
                } catch (Exception e) { }
            }
            System.out.println("Sum is: " + sum);

            Integer max=Integer.MIN_VALUE, x=-1, y=-1;
            int[][] a = {{2,4,6}, {8,10,12}, {14,16,18}};
            for (int i=0; i<a.length; i++) {
                for (int j=0; j<a[i].length; j++) {
                    int num = a[i][j];
                    if (num > max) {
                        max = num;
                        x = i;
                        y = j;
                    }
                }
            }
            System.out.println("Max: " + max + ", x: " + x + ", y: " + y);

            Rectangle rect = new Rectangle(10, 10);
            rect.display();
            Circle cir = new Circle(10);
            cir.display();
            Triangle tri = new Triangle(10, 10);
            tri.display();
        }
    }

