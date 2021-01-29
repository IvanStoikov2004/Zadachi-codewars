package com.company;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Scanner;

class Student {


    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }


    public static class Index {
//Run || Debug

        public static  void  main(String[]args) {
Scanner scanner=new Scanner(System.in);
            Scanner scanint=new Scanner(System.in);
           //Define
         LinkedList<Student> students=new LinkedList<Student>() ;
         for (int i=0;i<students.size();i++){
             System.out.println("Enter name and id for student "+(i+i));
             students.add(new Student(scanner.nextLine(),scanint.nextInt()));
         }
          //Buble sort by id

          Student temp;
         for (int i=0;i<students.size();i++){
             for (int j=0;j<i;j++){
                 if (students.get(j).getId()<students.get(j-1).getId()){
                     temp=students.get(j);
                     students.set(j,students.get(j-1));
                     students.set(j-1,temp);
                 }
             }
         }
            // add /remove

            students.add(new Student("Name",12));
         students.remove(4);

            // Find by name
            String name=scanner.nextLine();
            Student output = null;
            for (int i=0;i<students.size();i++){
                Student tempStudent=students.get(i);
                if (tempStudent.getName()==name){
                    output=tempStudent;
                    break;
                }
            }

            if ( output!=null){
                System.out.println("Name:"+output.getName()+"id:"+output.getId());
            }

            System.out.println(students);
            scanner.close();
            scanint.close();



    }

    }
}




















    /**/