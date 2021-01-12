package ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {
        // add method examples
        ArrayList<String> names = new ArrayList<>();
        names.add("David");
        names.add("Marcus");
        names.add("John");
//ArrayList follows insertion order
        names.add(1,"Abby");
       // names.add(10,"Kushal");



        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        for (String name:names){
            System.out.println(name);
        }




       // System.out.println(names);

        // get method
       // System.out.println(names.get(3));  // index - count from 0

        //size method
        System.out.println(names.size());   // count size of number



        //Create the method will take one parameter as arrayList<String>
        //Print all the values from arraylist which has length more than equals 5



    }

    public void print(ArrayList<String>tests){
        for (int i = 0; i < tests.size();i++){
           if (tests.get(i).length() >=5){
               System.out.println("Bigger  than or equals to 5: "+ tests.get(i));
           }

        }
    }
}
