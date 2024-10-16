/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.petHealth.treatment;

import core.animal.Pet;
import core.person.Doctor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ajcaraballo
 */
public class Treatment {
    private int id;
    private TreatmentType type;
    private Date date;
    private float Cost;
    private Pet pet;
    private ArrayList<Doctor> doctors;

    public Treatment(int id, TreatmentType type, Date date, float Cost, Pet pet, ArrayList<Doctor> doctors) {
        this.id = id;
        this.type = type;
        this.date = date;
        this.Cost = Cost;
        this.pet = pet;
        this.doctors = doctors;
    }
    public Treatment addTreatment(Pet treatment, ArrayList<Doctor> doctors1, TreatmentType SURGERY, LocalDate of, double par) {
   
     
   
       
       
        return null;
   
     
   
       
       
}
    
}
