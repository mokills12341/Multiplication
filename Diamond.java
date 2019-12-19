
package malintad20;


public class Malintad20 {

    public static void main(String[] args) {
        
        int size =5;
        for (int i = size; i >= -size; i--)
        {
            for (int j = 1; j <= Math.abs(i); j++) 
            {
                System.out.print(" ");   
            }
            for (int j = size; j >= Math.abs(i); j--) 
            {
                System.out.print("* ");   
            }
            System.out.println();
        }
        
    }
    
}
