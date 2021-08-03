package professions;

public class Person {
    String fullName;
    Integer age;

    public Person(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

}
