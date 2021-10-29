package day05;

public class School {

    public static void main(String[] args) {

        Journal journal = new Journal();
        journal.addStudent("Kis Béla");
        journal.addStudent("Petike");
        journal.addStudent("Tóth Nóra Linda");
        journal.addStudent("Madonna");
        journal.addStudent("Nagy Tamás");

        System.out.println(journal.getNames().size());
    }
}