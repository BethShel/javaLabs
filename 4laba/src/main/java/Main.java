package main.java;

import au.com.bytecode.opencsv.CSVReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        String path = "D:\\Лиза\\ВУЗ\\Java\\4laba\\src\\main\\resources\\foreign_names.csv";
        CSVReader reader = new CSVReader(new FileReader(path), ';');
        if(reader == null) {
            throw new FileNotFoundException(path);
        }
        List<Person> people = new ArrayList<>();
        String[] nextLine = reader.readNext();
        while((nextLine = reader.readNext())!= null) {
            if (nextLine != null) {
                people.add(new Person(Integer.parseInt(nextLine[0]),nextLine[1],nextLine[2],Integer.parseInt(nextLine[5]),nextLine[3],getDepartmentID(nextLine[4],people),nextLine[4]));
            }
        }
        print(people);
    }

    private static void print(List<Person> list){
        for(Person i : list) {
            System.out.println(i.toString());
        }
    }

    private static int getDepartmentID(String name, List<Person> list) {
        int id = -1, maxId = -1;
        for(Person i : list){
            if(i.department.name.compareTo(name) == 0){
                id = i.department.ID;
                break;
            }
            if(i.department.ID > maxId){
                maxId = i.department.ID;
            }
        }
        if(id==-1)
        {
            return maxId + 1;
        }
        return id;
    }
}
