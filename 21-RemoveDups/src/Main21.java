
import java.util.HashSet; 
  
public class Main21  
{ 
     public static void main(String[] args)  
    { 
        
        node ND = new node(10); 
        ND.next = new node(12); 
        ND.next.next = new node(11); 
        ND.next.next.next = new node(11); 
        ND.next.next.next.next = new node(12); 
        ND.next.next.next.next.next = new node(11); 
        ND.next.next.next.next.next.next = new node(10); 
  
        System.out.println(" List of nodes before removing duplicates :"); 
        printList(ND); 
  
        deleteDups(ND); 
  
        System.out.println("\n list of nodes  after removing duplicates :"); 
        printList(ND); 
    } 

    static class node  
    { 
        int data; 
        node next; 
  
        public node(int data)  
        { 
            this.data = data; 
        } 
    } 

    static void printList(node head)  
    { 
        while (head != null)  
        { 
            System.out.print(head.data + " "); 
            head = head.next; 
        } 
    } 
      
    
    static void deleteDups(node n)  
    { 
        HashSet<Integer> set=new HashSet<Integer>();
        node previous= null;
        while(n!=null){
            if(set.contains(n.data)){
                previous.next=n.next;
            }
            else{
                set.add(n.data);
                previous=n;
            }
            n=n.next;
        }
   
} 
  
}
