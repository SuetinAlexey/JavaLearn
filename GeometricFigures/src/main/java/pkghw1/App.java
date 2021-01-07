package pkghw1;
import java.util.Scanner;

/**
 * Geometric Figures
 */

public class App 
{
    public static void main( String[] args )
    {
        int keyFgr;
        Figure figure = null;

        Scanner in = new Scanner(System.in);
        System.out.println("Выбор фигуры: \n 1 - Квадрат \n 2 - Прямоугольник \n 3 - Треугольник \n");
        keyFgr = in.nextInt();

        if (keyFgr == 1)  // - Квадрат
        {
            Square square = new Square();
            System.out.print("Рассматриваем Квадрат \n");
            System.out.print("Укажите длинну стороны в мм:");
            square.setA(in.nextInt());
            figure = square;
        }
        else if (keyFgr == 2) // - Прямоугольник
        {
            Rectangle rectangle = new Rectangle();
            System.out.println("Рассматриваем Прямоугольник \n");
            System.out.print("Укажите длину стороны A в мм:");
            rectangle.setA(in.nextInt());
            System.out.print("Укажите длину стороны B в мм:");
            rectangle.setB(in.nextInt());
            figure = rectangle;
        }
        else if (keyFgr == 3) // - Треугольник
        {
            Triangle triangle = new Triangle();
            System.out.println("Рассматриваем Треугольник");
            System.out.println("Укажите длину стороны A в мм:");
            triangle.setA(in.nextInt());
            System.out.println("Укажите длину стороны B в мм:");
            triangle.setB(in.nextInt());
            System.out.println("Укажите длину стороны C в мм:");
            triangle.setC(in.nextInt());
            triangle.CheckTriangle(triangle.getA(), triangle.getB(), triangle.getC());
            figure = triangle;
        }
        else
        {
            System.out.println("Выбран неверный код фигуры.");
            System.exit(1);
        }

        System.out.println("Фигура = " + figure.Name());
        System.out.println("Периметр фигуры = " + figure.Perimetr());
        System.out.println("Площадь фигуры = "+ figure.Area());

    }
}
