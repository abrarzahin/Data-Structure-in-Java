

  
public class Main22  
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
  
        System.out.println(" List of nodes after  :"); 
        printList(nthTOLast(ND,4));
        
         
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
      
    
    static node nthTOLast(node head, int k)  
    { 
       node p1=head;
       node p2=head;
       for(int i=0;i<k;i++){
           if(p1==null)
           return null;
           p1=p1.next;
       }
       while(p1!=null){
           p1=p1.next;
           p2=p2.next;
       }
        return p2;
    } 
  
}
