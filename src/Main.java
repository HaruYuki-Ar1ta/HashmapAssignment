import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> nameGen = new ArrayList<String>();
        nameGen.add("Alex");
        nameGen.add("Mick");
        nameGen.add("Joan");

        HashSet<String> names = new HashSet<String>();
        for(String i: nameGen){
            names.add(i);
            System.out.println(names);
        }
        HashMap<String, Integer> FNamesYears = new HashMap<String, Integer>();
        for(String i : names) {

            FNamesYears.put(i, 2005);
            System.out.println(FNamesYears);

        }




    }
}
