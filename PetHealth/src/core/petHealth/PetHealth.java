/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.petHealth;

import core.animal.Pet;
import core.person.Doctor;
import core.person.Owner;
import core.petHealth.treatment.Treatment;
import core.petHealth.treatment.TreatmentType;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ajcaraballo
 */
public class PetHealth {

    private ArrayList<Doctor> doctors;
    private ArrayList<Owner> owners;
    private ArrayList<Pet> pets;
    private ArrayList<Treatment> treaments;

    public PetHealth() {
        this.doctors = new ArrayList<>();
        this.owners = new ArrayList<>();
        this.pets = new ArrayList<>();
        this.treaments = new ArrayList<>();
    }

    public Owner getOwner(int index) {
        return this.owners.get(index);
    }

    public Doctor getDoctor(int index) {
        return this.doctors.get(index);
    }

    public Pet getPet(int index) {
        return this.pets.get(index);
    }

    public boolean addOwner(Owner owner) {
        if (!this.owners.contains(owner)) {
            this.owners.add(owner);
            return true;
        }
        return false;
    }

    public boolean addDoctor(Doctor doctor) {
        if (!this.doctors.contains(doctor)) {
            this.doctors.add(doctor);
            return true;
        }
        return false;
    }

    public boolean addPet(Pet pet) {
        if (!this.pets.contains(pet)) {
            this.pets.add(pet);
            return true;
        }
        return false;
    }

    public void createTreatment(Pet treatment, ArrayList<Doctor> doctors1, TreatmentType SURGERY, LocalDate of, double par) {
       ArrayList<Doctor> ntreatments = new ArrayList<>();
        
        //ntreatments.addTreatment(treatment,doctors1,SURGERY,of,par);
            
           
     
    }

    public void doctorSummary() {

    }

    public void ownerMostSpent() {

    }
    
    public void ownerPetSummary(){
        
    }
    
    public boolean valueMostSpent(){
        
        return false;
        
    }
}
