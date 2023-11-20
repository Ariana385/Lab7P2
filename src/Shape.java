public class Shape {
 public double calculateArea(){
     return 0.0;
 }
}

class Circle extends Shape {
    int radius;

    public Circle(int radius){ this.radius=radius;
    }

    public static void main(String[] args){
        Circle circle=new Circle(3);
        System.out.println(circle.calculateArea());

    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;

    }
}

    class Rectangle extends Shape {
        int length;
        int width;

        public Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }

        public double calculateArea() {

            return length * width;
        }

        public static void main(String[] args) {
            Rectangle area = new Rectangle(2, 5);
            System.out.println(area.calculateArea());


        }
    }