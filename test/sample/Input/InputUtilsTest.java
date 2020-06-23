package sample.Input; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
/** 
* InputUtils Tester. 
* 
* @author <Authors name> 
* @since <pre>6ÔÂ 23, 2020</pre> 
* @version 1.0 
*/ 
public class InputUtilsTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: inputString() 
* 
*/ 
@Test
public void testInputString() throws Exception { 
//TODO: Test goes here...
    System.out.println(InputUtils.inputString());
    System.out.println(InputUtils.inputString());
    System.out.println(InputUtils.inputString());

} 

/** 
* 
* Method: inputInt() 
* 
*/ 
@Test
public void testInputInt() throws Exception { 
//TODO: Test goes here...
    int x = InputUtils.inputInt();
    System.out.println(x);
    x = InputUtils.inputInt();
    System.out.println(x);
    x = InputUtils.inputInt();
    System.out.println(x);
} 

/** 
* 
* Method: inputDouble() 
* 
*/ 
@Test
public void testInputDouble() throws Exception { 
//TODO: Test goes here...
    System.out.println(InputUtils.inputDouble());
    System.out.println(InputUtils.inputDouble());
    System.out.println(InputUtils.inputDouble());
} 


} 
