/**
 * This Student class is responsible for create a new student by defining
 * student properties like student name,id,room etc
 */
public class Student {
    String name;
    String id;
    String phone;
    String batch;
    String room;
    String department;
    String year;
    String blood_group;
    String parents_contact;

    public Student(String name, String id, String phone, String batch, String room, String department, String year,
            String blood_group, String parents_contact) {

        this.name = name;
        this.id = id;
        this.phone = phone;
        this.batch = batch;
        this.room = room;
        this.department = department;
        this.year = year;
        this.blood_group = blood_group;
        this.parents_contact = parents_contact;
    }
}