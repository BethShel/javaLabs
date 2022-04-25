package main.java;

public class Department
{
        int ID;
        String name;

        Department(int ID, String name) {
            this.ID = ID;
            this.name = name;
        }

        public String toString(){
            return String.valueOf(ID) + ' ' + name;
        }
}
