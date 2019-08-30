package edu.eci.cvds.tdd.registry;
import java.util.*;

public class Registry {

    private ArrayList<Integer> people = new ArrayList<>();
    
    
    public RegisterResult registerVoter(Person p) {
        
        RegisterResult resultado = RegisterResult.VALID;
        if (p.getAge() < 18 && p.getAge() >= 0) {
            resultado = RegisterResult.UNDERAGE;
        } else if (!p.isAlive()) {
            resultado = RegisterResult.DEAD;
        } else if (p.getAge() < 0 || p.getAge() > 150) {
            resultado = RegisterResult.INVALID_AGE;
        } else if (people.contains(p.getId())) {
            resultado = RegisterResult.DUPLICATED;
        } else if (p.getGender().equals(Gender.FEMALE)) {
            resultado = RegisterResult.INVALID_GENDER;
        } else if (!people.contains(p.getAge())) {
             people.add(p.getId());
        }
      
        return resultado;
    }
}