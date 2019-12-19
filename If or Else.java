package javaapplication3;

public class JavaApplication3 {

    public static void main(String[] args) {
        int number = 72;
        
        
        if (number > 1 ) {
            if (number < 103) {
                if (number % 2 == 0) {
                    System.out.println("valid");
                } else {
                    System.out.println("not valid 3");
                }
            } else {
                System.out.println("not valid 2");
            }
        } else {
            System.out.println("not valid 1");

        }
    }

}
