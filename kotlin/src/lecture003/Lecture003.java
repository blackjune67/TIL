package lecture003;

import lecture001.Person;

public class Lecture003 {
    public static void main(String[] args) {

    }

    public static void printAgeIfPerson(Object obj) {
        if(obj instanceof Person) {
            Person person = (Person) obj;
            System.out.println(person.getAge());
        }
    }
}
