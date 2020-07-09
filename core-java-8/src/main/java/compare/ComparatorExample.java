package compare;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample {

    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Person("abhi", 23, "ghy", 2000);
        persons[1] = new Person("ravi", 33, "sil", 2030);
        persons[2] = new Person("moti", 43, "del", 2007);
        persons[3] = new Person("rani", 21, "mon", 2011);

        System.out.println("sort Person array by age");
        //sort Person array by age
        Arrays.sort(persons, new AgeComparator());
        for(Person p : persons) {
            System.out.println(p);
        }

        System.out.println("sort Person array by name");
        //sort Person array by name
        Arrays.sort(persons, new NameComparator());
        for(Person p : persons) {
            System.out.println(p);
        }

        System.out.println("sort Person array by salary");
        //sort Person array by Salary
        Arrays.sort(persons, new SalaryComparator());
        for(Person p : persons) {
            System.out.println(p);
        }

        // Using Anonymous class for all compare()
        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        System.out.println("sort Person array by age using anonymous");
        Arrays.sort(persons, ageComparator);
        //sort Person array by age
        for(Person p : persons) {
            System.out.println(p);
        }

        // Using lambda expression to implement compare()
        System.out.println("sort by name using Lambda expression");
        Arrays.sort(persons, (name1, name2) -> name1.getName().compareTo(name2.getName()));
        for(Person p : persons) {
            System.out.println(p);
        }
    }

}
