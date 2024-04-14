package lecture001;

public class Person {
    String name;
    Long age;

    public Person(String name, Long age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Long getAge() {
        return age;
    }
}
