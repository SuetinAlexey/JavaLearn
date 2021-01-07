package pkghw1;

public class Square implements Figure {

    private Integer a;

    public Integer getA(){
        return a;
    }

    public void setA(Integer a){
        this.a = a;
    }

    @Override
    public String Name() {
        return "Квадрат";
    }

    @Override
    public Integer Perimetr() {
        return a*4;
    }

    @Override
    public Double Area(){
        return a*a + 0.0;
    }
}
