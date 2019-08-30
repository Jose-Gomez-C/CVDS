/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2153014
 */
public class TarifasTest {
    
    private CalculadorDescuentos cal = new CalculadorDescuentos();
    
    @Test
    public void deberiaSerMenorEdad(){
        assertTrue(cal.calculoTarifa(20000, 15, 17) == 19000);
    }
    @Test
    public void deberiaSerMayorEdad(){
        assertTrue(cal.calculoTarifa(20000, 15, 18) == 20000);
    }
    @Test
    public void deberiaSerMayorEdadSuperior(){
        assertTrue(cal.calculoTarifa(20000, 15, 19) == 20000);
    }
    @Test
    public void deberiaSerEdadInferior(){
        assertTrue(cal.calculoTarifa(20000, 15, 65) == 20000);
    }
    @Test
    public void deberiaSerEdadsuperior(){
        assertTrue(cal.calculoTarifa(20000, 15, 66) == 20000 - 20000*8/100);
    }
    @Test
    public void deberiaSerDescuento20(){
        assertTrue(cal.calculoTarifa(20000, 21, 17) == 20000 - 20000*20/100);
    }
    @Test
    public void deberiaSerDescuento15(){
        assertTrue(cal.calculoTarifa(20000, 21, 18) == 20000 - 20000*15/100);
    }
    @Test
    public void deberiaSerDescuentoDel15(){
        assertTrue(cal.calculoTarifa(20000, 21, 19) == 20000 - 20000*15/100);
    }
    @Test
    public void deberiaSerDescuento23(){
        assertTrue(cal.calculoTarifa(20000, 21, 66) == 20000 - 20000*23/100);
    }
}
