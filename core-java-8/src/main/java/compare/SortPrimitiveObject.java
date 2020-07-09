package compare;

import java.util.Arrays;

public class SortPrimitiveObject {

    public static void main(String[] args) {
        //sort primitive int array
        int num[] = {2,5,1,7,0,4};
        Arrays.sort(num);
        System.out.println("Sort int - primitive");
        for(int i : num) {
            System.out.print( i + ", ");
        }

        String []names = {"abhi", "raju", "amar", "babli", "mohit"};
        Arrays.sort(names);
        System.out.println("Sort String - object");
        for(String s : names) {
            System.out.print( s + ", ");
        }
        System.out.println("\nSort person array");
        Person[] persons = new Person[4];
        persons[0] = new Person("abhi", 23, "ghy", 2000);
        persons[1] = new Person("ravi", 33, "sil", 2030);
        persons[2] = new Person("moti", 43, "del", 2007);
        persons[3] = new Person("rani", 21, "mon", 2011);

        // sort the person array
        Arrays.sort(persons); // Need to use Comparable interface to sort
        //Else we find below exception
        // Exception in thread "main" java.lang.ClassCastException:
        // class compare.Person cannot be cast to class java.lang.Comparable
        // (compare.Person is in unnamed module of loader 'app'; java.lang.Comparable is in module
        // java.base of loader 'bootstrap')

        //
        for(Person person : persons) {
            System.out.println( person + ", ");
        }

    }

}
