package day01;

public class School {

    public static void main(String[] args) {

        Students student = new Students();
        student.addHeight(156);
        student.addHeight(163);
        student.addHeight(176);
        student.addHeight(175);
        student.addHeight(181);

        System.out.println(student.isHeightsIncreasin());
    }
}