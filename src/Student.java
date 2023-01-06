public class Student {

    private String name;
    public String surname;
    public int age;

    public Student() {

    }

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Student(int age, String surname, String name) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "vardas yra'" + name + '\'' +
                ", o pavarde yra '" + surname + '\'' +
                ".  Studentui  metu" + age +
                '}';
    }



}
