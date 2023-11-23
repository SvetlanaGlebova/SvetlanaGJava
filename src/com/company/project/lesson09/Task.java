package com.company.project.lesson09;

public class Task {
    public void main(String[] args) {
        Department department01 = new Department();
        Department department02 = new Department();
        department02.setHead(department01);
    }

    class Department {
        private String name;
        //количество сотрудников
        protected int numberOfWorkers;
        //кому подчиняется
        private Department head;

        public void setHead(Department department01) {
        }
    }
}
 
