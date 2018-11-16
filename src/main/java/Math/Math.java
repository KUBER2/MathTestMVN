
package Math;

public class Math {

    public static int findMax(int [] numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    public static int power(int number) {
        int power =1;
        if (number<0){
            System.out.println("Invalide number, number must be positive(>0)");
            int i = -1;
            return i;
        }
        if (number==0){
            int i = 1;
            return i;
        }
        for (int i =1; i<=number;i++) {
            power=power*i;
        }
        return power;
    }
    public static int multiply(int [] numbers) {
        int multi = 1;
        for (int number : numbers) {
            multi=multi*number;
        }
        return multi;
    }

}
