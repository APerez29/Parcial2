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
public class Parrot extends Pet {

    public Parrot(String name, int age, double weight, double height, Owner owner) {
        super(age, height, weight, owner,name);
    }
    
}
