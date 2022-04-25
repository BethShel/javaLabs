package main.java;

class Person {
    int ID;
    String name;
    String gender;
    Department department;
    int salary;
    String birthday;

    Person(int ID, String name, String gender, int salary, String birthday, int departmentId, String departmentName) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.birthday = birthday;
        this.department = new Department(departmentId, departmentName);
    }

    public String toString(){
        return String.valueOf(ID) + ' ' + name + ' ' + gender + ' ' + department.toString() + ' ' + String.valueOf(salary) + ' ' + birthday;
    }
}
