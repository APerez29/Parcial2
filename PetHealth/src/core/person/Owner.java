/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.animal.Pet;
import core.petHealth.PetHealth;
import java.util.ArrayList;

/**
 *
 * @author ajcaraballo
 */
public class Owner extends Person{
    private PetHealth pethealth;
    private ArrayList<Pet> pets;

    public Owner(int id, String name) {
        super(id, name);
        this.pethealth = pethealth;
        this.pets = new ArrayList<>();
    }
    @Override
     public String getName() {
        return name;
    }
    
}
