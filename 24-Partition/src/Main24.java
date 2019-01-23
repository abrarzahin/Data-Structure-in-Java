
public class Main24  
{ 
     public static void main(String[] args)  
    { 
        
        NodeList ND = new NodeList(3); 
        ND.next = new NodeList(5); 
        ND.next.next = new NodeList(8); 
        ND.next.next.next = new NodeList(5); 
        ND.next.next.next.next = new NodeList(10); 
        ND.next.next.next.next.next = new NodeList(2); 
        ND.next.next.next.next.next.next = new NodeList(1); 
  
        System.out.println(" List of NodeLists  :"); 
        printList(ND); 
        partition(ND,5);
        System.out.println(" \n List of NodeLists after  :"); 
        printList(ND);
        
         
    } 

    static class NodeList  
    { 
        int data; 
        NodeList next; 
  
        public NodeList(int data)  
        { 
            this.data = data; 
        } 
    } 

    static void printList(NodeList head)  
    { 
        while (head != null)  
        { 
            System.out.print(head.data + " "); 
            head = head.next; 
        } 
    } 
      
    
    static NodeList partition(NodeList node, int x)  
    { 
        NodeList head = node;
        NodeList tail = node;

        while(node!= null){
            NodeList next=node.next;
            if(node.data<x){
                node.next=head;
                head=node;
            }
            else {
                tail.next=node;
                tail=node;
            }
            node=next;
        }
        tail.next=null;
        return head;
    } 
  
}
