package azadehcompany.company;


import com.sun.org.apache.xpath.internal.SourceTree;

public class Demo {

    public static void main(String[] args) {

	// write your code here
        String name = "Azaadh is great";

        System.out.println(name);


        int x= 5;
        int y= 7;
        sum1(5, 7);
        sum(7, 5);

        int [] N = { 1, 20, 3};
        int valueAtFirstIndex = N[0];

        int valuesecond= N[1];
        int valuethird= N[2];

        System.out.println(valuesecond);

        System.out.println(N[2]);


        System.out.println(N[0]);

        System.out.println("Ineger array and value at index 0 = " + valueAtFirstIndex);
        System.out.println(valueAtFirstIndex);


        System.out.println();

    }

     public static int sum (int x, int y) {
         int total = x + y;
         return total;
     }

     public static void sum1(int x, int y) {
         System.out.println(x+y);
     }


}

