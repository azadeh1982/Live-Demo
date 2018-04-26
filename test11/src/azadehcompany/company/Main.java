package azadehcompany.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String name1 = "Azi";
        String name2 = "Azi";
        if (name1.equals (name2)) {
           name1= name1 + "5";
            System.out.println(name1);
        } else {
            name2 =name2+ "2";
            System.out.println(name2);
        }

       String name= "azadeh12asghar12vahideh";
       String [] firstname =name.split("12");
        System.out.println(firstname[0]);
        System.out.println(firstname[1]);
        System.out.println(firstname[2]);


        Map<Integer, String> idName = new HashMap<Integer, String>();
        idName.put(1, "Azi");
        idName.put(2, "Mayur");

        System.out.println(idName.get(2));
        System.out.println(idName.get(1));

        Map<Integer, String> idName1= new HashMap<Integer, String>();
        idName.put(56, "Syntel");
        idName.put(65,"Home Depot");

        System.out.println(idName.get(56));
        System.out.println(idName.get(65));


        int [] azi = {2, 5, 7, 9, 6};

        for (int i = 0; i < azi.length; i++) {
            System.out.println(azi[i]);
        }

        //Create an array of
                //5,10,15,20, 25
        int [] may= {5,10,15,20,25};

        for (int i=0; i< may.length; i++) {
            System.out.println(may[i]);
        }
    }
}
