package one;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();

        name.add( "Alex");
        name.add( "Boris" );
        name.add( "Doris");
        name.add( "Alex" );
        name.add( "Jack" );
        name.add( "Michael" );
        name.add( "Jack" );
        name.add( "Lili" );
        name.add( "Poul" );
        name.add( "Morpheus" );
        name.add( "Neo" );
        name.add( "Morpheus" );
        name.add( "Trinity " );
        name.add( "Bob");
        name.add( "Trinity ");
        name.add( "Lola" );
        name.add( "Nicola " );
        name.add( "Olivia" );
        name.add( "Barbara" );
        name.add( "Bob" );

        Map<String, Integer> names = new HashMap<>();
        for (String string : name) {
            if(names.keySet().contains(string)) {
                names.put(string, names.get(string) + 1);
            } else {
                names.put(string, 1);
            }
        }
        System.out.println(names);
    }
}
