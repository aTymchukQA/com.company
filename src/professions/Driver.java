package professions;

public class Driver extends Person {

    Integer experience;

    public Driver(String fullName, Integer age, Integer experience) {
        super(fullName, age);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

}
