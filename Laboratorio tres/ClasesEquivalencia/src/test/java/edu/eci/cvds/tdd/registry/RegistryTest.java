package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();
    
    @Test
    public void verificaEdadLimiteInferior() {
        Person person = new Person("Jose Gomez", 145152122, 17, Gender.MALE, true);
        Assert.assertEquals(registry.registerVoter(person), RegisterResult.UNDERAGE); 
    }
    
    @Test
    public void verificaEdadLimite() {
        Person person = new Person("Jose Gomez", 145152122, 18, Gender.MALE, true);
        Assert.assertEquals(registry.registerVoter(person), RegisterResult.VALID); 
    }
    
    @Test
    public void verificaEdadLimiteSuperior() {
        Person person = new Person("Jose Gomez", 145152122, 19, Gender.MALE, true);
        Assert.assertEquals(registry.registerVoter(person), RegisterResult.VALID); 
    }
    
    
    @Test
    public void verificarEdadAdulta() {
        Person person = new Person("Jose Gomez", 145152122, 69, Gender.MALE, true);
        Assert.assertEquals(registry.registerVoter(person), RegisterResult.VALID); 
    }
    
    
    @Test
    public void validaMuertos() {
        Person person = new Person("Jose Gomez", 145152122, 19, Gender.MALE, false);
        Assert.assertEquals(registry.registerVoter(person), RegisterResult.DEAD); 
    }
    
    @Test
    public void validaVivos() {
        Person person = new Person("Jose Gomez", 145152122, 19, Gender.MALE, true);
        Assert.assertNotEquals(registry.registerVoter(person), RegisterResult.DEAD); 
    }
    
    @Test
    public void validaEdadInvalidaNegativa() {
        Person person = new Person("Jose Gomez", 145152122, -1, Gender.MALE, true);
        Assert.assertEquals(registry.registerVoter(person), RegisterResult.INVALID_AGE); 
    }
    
    @Test
    public void validaEdadInvalidaSuperior() {
        Person person = new Person("Jose Gomez", 145152122, 151, Gender.MALE, true);
        Assert.assertEquals(registry.registerVoter(person), RegisterResult.INVALID_AGE); 
    }
    
    @Test
    public void validaDuplicado() {
        Person person = new Person("Jose Gomez", 145152123, 19, Gender.MALE, true);
        Person person2 = new Person("Jose Gomez", 145152123, 18, Gender.MALE, true);
        Assert.assertEquals(registry.registerVoter(person), RegisterResult.VALID);
        Assert.assertEquals(registry.registerVoter(person2), RegisterResult.DUPLICATED);
    }
    
    
    @Test
    public void validaSiEsMujerNoVota() {
        Person person = new Person("Maria Jose", 145152122, 25, Gender.FEMALE, true);
        Assert.assertEquals(registry.registerVoter(person), RegisterResult.INVALID_GENDER); 
    }
    
    
    
    

    // TODO Complete with more test cases
}