/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.petHealth.PetHealth;
import core.petHealth.treatment.Treatment;
import java.util.ArrayList;

/**
 *
 * @author ajcaraballo
 */
public class Doctor extends Person {
    private PetHealth petHealth;
    private ArrayList<Treatment> treameants;

    public Doctor(int id, String name) {
        super(id, name);
        this.petHealth = petHealth;
        this.treameants = new ArrayList<>();
    }

 
    
    
}
