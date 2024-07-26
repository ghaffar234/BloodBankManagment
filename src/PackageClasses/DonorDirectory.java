/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageClasses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class DonorDirectory {
    
    public static ArrayList<Donor> donors = new ArrayList<>();
    static final String FILE_NAME = "donors.txt";
    public static File file = new File(FILE_NAME);
   
    static{
        fetchDonars();
    
    }
    
    public static void fetchDonars(){
        try{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream input = new ObjectInputStream(fis);
            while (fis.available()>0) {    
                Object obj = input.readObject();
                if (obj instanceof Donor) {
                    Donor newObj = (Donor) obj;
                    donors.add(newObj);
                }
            }
            input.close();
            fis.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    
    
    }
    
    public static void saveDonar(Donor obj) {
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file,true));
            output.writeObject(obj);
            output.flush();
            output.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }    
    }
    public static void addDonor(Donor obj){        
        donors.add(obj);
        //save into file
        saveDonar(obj);
        //JOptionPane.showMessageDialog(null, "Donor data is saved successfully");
    }
    public static ArrayList<Donor> searchDonor(String location){
        ArrayList<Donor>selectiveDonor = new ArrayList();
        for (int i = 0; i < donors.size(); i++) {
            if (donors.get(i).getLocation().equalsIgnoreCase(location)) {
                selectiveDonor.add(donors.get(i));
                System.out.println(donors.get(i).getLocation());
            }
        }
        return selectiveDonor;
    }
    public static int getUnitCount(String bloodGroup){
        int count = 0;
        for (int i = 0; i < donors.size(); i++) {
            if (donors.get(i).getBloodGroup().equalsIgnoreCase(bloodGroup)) {
                    count++;
            }
        }
        return count;
    }
    
    public static ArrayList<Donor> getDonorList(){
        ArrayList<Donor>selectiveDonor = new ArrayList();
        for (int i = 0; i < donors.size(); i++) {
            //if (donors.get(i).getLocation().equalsIgnoreCase(location)) {
                selectiveDonor.add(donors.get(i));
                //System.out.println(donors.get(i).getLocation());
            //}
        }
        return selectiveDonor;
    }
    
    public static Donor searchById(String id){
        for (int i = 0; i < donors.size(); i++) {
            if (donors.get(i).getDonorId().equalsIgnoreCase(id)) {
                return donors.get(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Donor not found");
        return null;
    }
    public static void updateDonor(Donor obj, String id) {
        for (int i = 0; i < donors.size(); i++) {
            if (donors.get(i).getDonorId().equalsIgnoreCase(id)) {
                donors.get(i).setDonorId(obj.getDonorId());
                donors.get(i).setFullName(obj.getFullName());
                donors.get(i).setFatherName(obj.getFatherName());
                donors.get(i).setMotherName(obj.getMotherName());
                donors.get(i).setMobileNumber(obj.getMobileNumber());
                donors.get(i).setDateOfBirth(obj.getDateOfBirth());
                donors.get(i).setGender(obj.getGender());
                donors.get(i).setEmail(obj.getEmail());
                donors.get(i).setBloodGroup(obj.getBloodGroup());
                donors.get(i).setCity(obj.getCity());
                donors.get(i).setCompleteAddress(obj.getCompleteAddress());
                JOptionPane.showMessageDialog(null, "Donor is updated now");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Donor not found");
    }  
    public static ArrayList<Donor> searchDonorByBlood(String BloodGroup) {
    ArrayList<Donor> matchingDonors = new ArrayList<>();
    for (Donor donor : donors) {
        if (donor.getBloodGroup().equalsIgnoreCase(BloodGroup)) {
            matchingDonors.add(donor);
        }
    }
    return matchingDonors;
}
    public static void deleteDonor(String id) {
    for (int i = 0; i < donors.size(); i++) {
        if (donors.get(i).getDonorId().equalsIgnoreCase(id)) {
            donors.remove(i);
            JOptionPane.showMessageDialog(null, "Donor has been deleted.");
            return;
        }
    }
    JOptionPane.showMessageDialog(null, "Donor not found.");
}
    
    
}

