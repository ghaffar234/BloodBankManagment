/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageClasses;

import java.io.Serializable;

/**
 *
 * @author Hp
 */
public class Donor implements Serializable{

    static Donor fromString(String line) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 private String donorId;
 private String fullName;
 private String fatherName;
 private String location;
 private String motherName ;
 private String mobileNumber ;
 private String email ;
 private String bloodGroup ;
 private String city ;
 private String completeAddress ;
 private String dateOfBirth ;
 private String gender ;
    public Object getdonorId;
    public Donor(){}
    public Donor(String donorId, String fullName, String fatherName, String location, String motherName, String mobileNumber, String email, String bloodGroup, String city, String completeAddress, String dateOfBirth, String gender) {
        this.donorId = donorId;
        this.fullName = fullName;
        this.fatherName = fatherName;
        this.location = location;
        this.motherName = motherName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.bloodGroup = bloodGroup;
        this.city = city;
        this.completeAddress = completeAddress;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }


    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompleteAddress() {
        return completeAddress;
    }

    public void setCompleteAddress(String completeAddress) {
        this.completeAddress = completeAddress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
 

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDonorId() {
        return donorId;
    }

    public void setDonorId(String donorId) {
        this.donorId = donorId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    
}
