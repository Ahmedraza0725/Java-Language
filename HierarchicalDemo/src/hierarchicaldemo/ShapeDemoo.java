/*package hierarchicaldemo;
import java.util.Random;

public class ShapeDemoo {
    public static void main(String[] args) {
        Random random = new Random();
        Shape[] shapes = new Shape[10];

        for (int i = 0; i < shapes.length; i++) {
            int shapeType = random.nextInt(4);
            switch (shapeType) {
                case 0:
                    shapes[i] = new Line(
                        random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100)
                    );
                    break;
                case 1:
                    shapes[i] = new Circle(
                        random.nextInt(100), random.nextInt(100),
                        random.nextInt(50)
                    );
                    break;
                case 2:
                    shapes[i] = new Rectangle(
                        random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100)
                    );
                    break;
                case 3:
                    shapes[i] = new PolyLine(new int[][] {
                        {random.nextInt(100), random.nextInt(100)},
                        {random.nextInt(100), random.nextInt(100)},
                        {random.nextInt(100), random.nextInt(100)}
                    });
                    break;
            }
        }

        for (Shape shape : shapes) {
            shape.show();
        }
        System.out.println("Made by Ahmed Raza Roll No: 008");
    }
}*/