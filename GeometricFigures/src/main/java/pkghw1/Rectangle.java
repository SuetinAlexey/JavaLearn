package pkghw1;

public class Rectangle extends Square {

    private Integer b;

    public Integer getB(){
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    @Override
    public String Name() {
        return "Прямоугольник";
    }

    @Override
    public Integer Perimetr() {
        return getA()*2 + b*2;
    }

    @Override
    public Double Area() {
        return getA()*b + 0.0;
    }
}
