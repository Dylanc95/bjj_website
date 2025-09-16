package com.cdbjj.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="instructor")
public class Instructor {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="full_name")
    private String fullName;

    @Column(name="email")
    private String email;

    @Column(name="belt")
    private String belt;

    @Column(name="hours")
    private int hours;

    public Instructor() {}

    public Instructor(String fullName, String email, String belt, int hours) {
        this.fullName = fullName;
        this.email = email;
        this.belt = belt;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBelt() {
        return belt;
    }

    public void setBelt(String belt) {
        this.belt = belt;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", belt='" + belt + '\'' +
                ", hours=" + hours +
                '}';
    }
}
