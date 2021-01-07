package pkghw1;

public class Triangle implements Figure {

    private Integer a;
    private Integer b;
    private Integer c;

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }

    public Integer getC() {
        return c;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    @Override
    public String Name() {
        return "Треугольник";
    }

    @Override
    public Integer Perimetr() {
        return a+b+c;
    }

    @Override
    public Double Area() {
        // Формула Герона
        Double HalfPerimetr;

        HalfPerimetr = (a+b+c)/2 + 0.0; // полупериметр

        return Math.sqrt(HalfPerimetr*(HalfPerimetr-a)*(HalfPerimetr-b)*(HalfPerimetr-c));
    }

    public void CheckTriangle(Integer a, Integer b, Integer c) {
        if ( (a+b>c) && (b+c>a) && (c+a>b) )
        {
            System.out.println("Треугольник может быть составлен.");
        }
        else
        {
            System.out.println("Треугольник НЕ может быть составлен.");
            System.exit(1);
        }
    }
}
