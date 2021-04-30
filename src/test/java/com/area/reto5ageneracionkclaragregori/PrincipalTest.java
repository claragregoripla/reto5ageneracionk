/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.reto5ageneracionkclaragregori;

import static com.area.reto5ageneracionkclaragregori.Principal.*; // PREGUNTA: està ben referenciat així?
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;// per què és estàtic?
/**
 *
 * @author clara.gregori
 */
public class PrincipalTest {


    @Test
    void testDeleteAccents() {
    assertEquals("hola", deleteAccents("hólà"));//testejar si dos valors són iguals
    }

    @Test
    void testDeleteSpaces() {
        assertEquals("hola", deleteSpaces("ho la"));//testejar si dos valors són iguals
    }

    private static final int[] numberToOrder = new int[]{11, 12, 13, 14, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3};
    @Test
    void testSortUrlOption1() {
        assertEquals("www.google.com", sortUrlOption1(".com.googlewww".split(""), numberToOrder));//testejar si dos valors són iguals
    }


}
