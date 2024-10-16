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
public class Cat extends Pet{
    private String breed;

    public Cat(String breed, int age, double weight, double height, Owner owner, String name) {
        super( age, height, weight, owner,name);
        this.breed = breed;
    }
    
    
}
