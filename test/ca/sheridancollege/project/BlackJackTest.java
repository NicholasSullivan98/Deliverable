/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Nicholas Sullivan, Tuedsay April, 20, 2021
 */
public class BlackJackTest {
    
    public BlackJackTest() {
    }
    
    /**
     * Test of checkDealerCardCreation method, of class BlackJack.
     */
    @Test
    public void testCheckDealerCardCreationGood() {
        System.out.println("checkDealerCardCreation Good");
        boolean expResult = true;
        int CreateCardCall = 1;
        boolean result = BlackJack.checkDealerCardCreation(CreateCardCall);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckDealerCardCreationBad() {
        System.out.println("checkDealerCardCreation Bad");
        boolean expResult = false;
        int CreateCardCall = 0;
        boolean result = BlackJack.checkDealerCardCreation(CreateCardCall);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckDealerCardCreationBoundary() {
        System.out.println("checkDealerCardCreation Boundary");
        boolean expResult = true;
        int CreateCardCall = 1;
        boolean result = BlackJack.checkDealerCardCreation(CreateCardCall);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckPlayerCardCreationGood() {
        System.out.println("checkPlayerCardCreation Good");
        boolean expResult = true;
        int CreateCardCall = 1;
        boolean result = BlackJack.checkPlayerCardCreation(CreateCardCall);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckPlayerCardCreationBad() {
        System.out.println("checkPlayerCardCreation Bad");
        boolean expResult = false;
        int CreateCardCall = 0;
        boolean result = BlackJack.checkPlayerCardCreation(CreateCardCall);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckPlayerCardCreationBoundary() {
        System.out.println("checkPlayerCardCreation Boundary");
        boolean expResult = true;
        int CreateCardCall = 1;
        boolean result = BlackJack.checkPlayerCardCreation(CreateCardCall);
        assertEquals(expResult, result);
    }
}
