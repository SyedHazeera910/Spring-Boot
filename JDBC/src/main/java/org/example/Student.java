package org.example;

public class Student {

    int serial_no;
    String name;
    int gender;
    int register;
    String email;
    String date_of_birth;

    public Student(String name, int gender, int register, String email, String date_of_birth) {
        this.name = name;
        this.gender = gender;
        this.register = register;
        this.email = email;
        this.date_of_birth = date_of_birth;
    }

    public int getSerial_no() { return serial_no; }
    public String getName() { return name; }
    public int getGender() { return gender; }
    public int getRegister() { return register; }
    public String getEmail() { return email; }
    public String getDate_of_birth() { return date_of_birth; }
}
