public class Main {
    public static void main(String[] args) {

        Student studentas = new Student();

        studentas.setName("Egidijus");
        studentas.surname = "Paskauskas";
        studentas.age = 26;


        System.out.println(studentas.getName() + " " + studentas.surname + " " + studentas.age );

        Student studentas2 = new Student("Vakaris", "Alzbergas", 14);
        Student studentas3 = new Student("Vakaris2", "Alzbergas2", 12);
        Student studentas4 = new Student(25, "Vakaris2", "Kiesa");

        studentas3.age = 16;

        int sk = 17;
        int sk2 = 13;

//        sk == sk2;
//        String txt = "labas";
//        txt.equals("labas");

        System.out.println(studentas3);

        Matematika.intSq(186);
        studentas2.getName();
    }
}