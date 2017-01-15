import java.util.*;

/* 
* Given 1->2->3->4, you should return the list as 2->1->4->3.
* Given 1->2->3->4->5, you should return the list as 2->1->4->3->5.
*/
public class Swap2Nodes {

  public static void main(String args[])
  {
    System.out.println("Hello");
    
    List<Integer> l = new LinkedList<Integer>();
     List<Integer> l1 = new LinkedList<Integer>();
    l.add(1);l.add(2);l.add(3);l.add(4);l.add(5);l.add(6);
    System.out.println(l);
      
    for(int i=0;i<l.size();i++)
    {
      //System.out.println(l.get(i));
       if((i+1)%2 == 0)
        {
          int a = l.get(i);
          int b = l.get(i-1);
          l1.add(a);l1.add(b);
        }
        
        if((i+1)%2 != 0 && i==l.size()-1)
        {
          l1.add(l.get(i));
        }
         
      
    }
    System.out.println(l1);
    
  }
  
  
}
