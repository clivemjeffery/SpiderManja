/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosedene.spidermanja;

import java.io.Serializable;

/**
 *
 * @author Clive
 */
public class Pupil implements Serializable {

    public Pupil(String yearGroup, String regGroup, String firstName, String lastName, String gender, int assessment) {
        this.yearGroup = yearGroup;
        this.regGroup = regGroup;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.assessment = assessment;
    }

    private static final long serialVersionUID = 1L;

    public Pupil(String[] fields) {
        this.yearGroup = fields[0];
        this.regGroup = fields[1];
        this.firstName = fields[3];
        this.lastName = fields[2];
        this.gender = fields[4];
        this.assessment = 0;
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName;
    }

    public int getAssessment() {
        return assessment;
    }

    public void setAssessment(int assessment) {
        this.assessment = assessment;
    }

    public String getYearGroup() {
        return yearGroup;
    }

    public void setYearGroup(String yearGroup) {
        this.yearGroup = yearGroup;
    }

    public String getRegGroup() {
        return regGroup;
    }

    public void setRegGroup(String regGroup) {
        this.regGroup = regGroup;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    private String yearGroup;
    private String regGroup;
    private String firstName;
    private String lastName;
    private String gender;
    private int assessment;
    
}
