public class DogI {
    private String name;
    private int age;

    public void setName (String newName) {
        this.name = newName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "DogM{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
