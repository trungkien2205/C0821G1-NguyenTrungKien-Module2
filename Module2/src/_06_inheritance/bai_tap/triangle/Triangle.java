package _06_inheritance.bai_tap.triangle;

public class Triangle extends Shape{
    private double side1=1.0;
    private double side2=1.0;
    private double side3=1.0;

    public Triangle(){

    }
    public Triangle(double side1,double side2,double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public void setSide1(double side1){
        this.side1=side1;
    }
    public void setSide2(double side2){
        this.side2=side2;
    }
    public void setSide3(double side3){
        this.side3=side3;
    }
    public double getSide1(){
        return this.side1;
    }
    public double getSide2(){
        return this.side2;
    }
    public double getSide3(){
        return this.side3;
    }
    public double getArea(){
        double p=getPerimeter()/2;
        double area=p*Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
        return area;
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "side 1="+
                getSide1()
                +" side 2="
                +getSide2()
                +" side 3="
                +getSide3()
                +" Area ="
                +getArea()
                +" Perimeter ="
                +getPerimeter();
    }
}
