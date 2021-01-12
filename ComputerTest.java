package ArrayList;

import java.util.ArrayList;

public class ComputerTest {

    public static void main(String[] args) {
        Computer computer1 = new Computer("Apple", "Macbook Pro", 1500, 13d);
        Computer computer2 = new Computer("Apple", "Macbook Pro", 2000, 16d);
        Computer computer3 = new Computer("Dell", "XPS", 1500, 13d);
        Computer computer4 = new Computer("Asus", "asus16", 1600, 14d);
        Computer computer5 = new Computer("HP", "Envy", 1500, 15d);
        Computer computer6 = new Computer("Lenovo", "ThinkPad", 1500, 15d);
        Computer computer7 = new Computer("Microsoft", "SurfacePro", 1200, 13d);

        ArrayList<Computer>computers = new ArrayList<>();
        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);
        computers.add(computer4);
        computers.add(computer5);
        computers.add(computer6);
        computers.add(computer7);

        Computer computerCheapest = computers.get(0);
        for (int i = 1; i < computers.size(); i++){
            if (computers.get(i).price < computers.get(i-1).price){
                computerCheapest = computers.get(i);
            }
        }
        System.out.println(computerCheapest.toString());

    }
    /*

        // I need computers from Apple
        for (int i = 0; i < computers.size(); i++){
            if(computers.get(i).manufacturer.equals("Apple"))
                System.out.println(computers.get(i));
        }
        // I need computer which price is in the range of $500 - $1300
​
​
​
​
    }

     */


}
