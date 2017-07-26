/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu;

import com.mycompany.hellotest.HelloTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class NewEmptyJUnitTest {
    
    private HelloTest instance;
    
    public NewEmptyJUnitTest() {
       
    }
    
   
    @Before
    public void setUp() {
         instance = new HelloTest();
    }
    
    @Test
    public void testSetGetGreet(){
        instance.setGreet("");
        assertEquals("", instance.getGreet());
        instance.setGreet("Magandang Umaga!");
        assertEquals("Magandang!", instance.getGreet());
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
