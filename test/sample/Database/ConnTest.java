package sample.Database; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.*;

/** 
* Conn Tester. 
* 
* @author <Authors name> 
* @since <pre>6ÔÂ 24, 2020</pre> 
* @version 1.0 
*/ 
public class ConnTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: finalize() 
* 
*/ 
@Test
public void testFinalize() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getConnection() 
* 
*/ 
@Test
public void testGetConnection() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: checkUser(String name, String pw) 
* 
*/ 
@Test
public void testCheckUser() throws Exception { 
//TODO: Test goes here...
    assertFalse(Conn.checkUser("test1", "234"));
    assertTrue(Conn.checkUser("test", "123"));
} 


} 
