
public class Main23  
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
  
        System.out.println(" List of nodes  :"); 
        printList(ND); 
        deleteNode(ND);
        System.out.println(" \n List of nodes after  :"); 
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
      
    
    static boolean deleteNode(node n)  
    { 
        if(n==null || n.next==null){
            return false;
        }
        node next=n.next;
        n.data=next.data;
        n.next=next.next;
        return true;
       
    } 
  
}
