/* Divide 2 integer without using /,%,* sign */

import java.util.*;
public class Divide2Int {

  public static void main (String args[])
  {
   
    int dividend = 100;
    int divisor = 9;
    
    int quo = 0;
    
    while (dividend >= divisor)
    {
      dividend = dividend - divisor;
      quo++;
    }
    
    System.out.println(quo);
    
    
  }
  
  
  
  
