public class Calculator2{
    public static void main(String[] args){
        int n1=10;
        int n2=30;
        int n3=40;

        CalculatorClass cal = new CalculatorClass();
        cal.calculatorName="Casio";
        cal.type="Scientific";

        int add1=cal.add(n1,n2);
        System.out.println("Addition of 2 integers: "+add1);
        int add2=cal.add(n1,n2,n3);
        System.out.println("Addition of 3 integers: "+add2);
    }
    
}