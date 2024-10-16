/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.animal;

import core.person.Owner;
import core.petHealth.treatment.Treatment;
import java.util.ArrayList;

/**
 *
 * @author ajcaraballo
 */
public abstract class Pet {
    protected String name;
    protected int age;
    protected double height;
    protected double weight;
    protected Owner owner;
    protected ArrayList<Treatment> treatments;

    public Pet( int age, double weight, double height, Owner owner, String name) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.owner = owner;
        this.treatments = new ArrayList<>();
    }

    public Owner getOwner() {
        return owner;
    }
    
    
}
