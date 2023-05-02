public class Conditional{
    public static void main(String[] args){
        char char1='A';
        switch(char1)
        {

            case 'A':
            System.out.println("Character is A");
            break;

            case 'B':
            System.out.println("Character is B");
            break;

            case 'C':
            System.out.println("Character is C");
            break;
             
            default:
            System.out.println("null");

        }
        //Ternary

        int number = 12;
        int num = (number==12)? 1  : 2;
    System.out.println("Value of num = "+num);
    
}
}