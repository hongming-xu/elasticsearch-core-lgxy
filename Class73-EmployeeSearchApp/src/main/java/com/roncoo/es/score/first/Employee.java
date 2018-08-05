package com.roncoo.es.score.first;

import java.util.Date;

public class Employee {
    private String name;
    private int age;
    private String position;
    private String country;
    private Date join_date;
    private long salary;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("name: ").append(this.name);
        sb.append(", age: ").append(this.age);
        sb.append(", position: ").append(this.position);
        sb.append(", country: ").append(this.country);
        sb.append(", join_date: ").append(this.join_date);
        return sb.toString();
    }
}
