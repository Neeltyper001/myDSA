
class LL{

  private  Node head;
  private  Node tail;
  private  Node traverser;
  private  int size;

    LL(){
       head = null;
       tail = null;
       traverser = null;
       size = 0;
    }    

    void insertFirst(int val){

        if(head == null && tail == null){
            Node node = new Node(val);
            head = node;
            tail = node;
        }

        else {
            Node node = new Node(val);
            node.nxt = head;
            head = node;
        }
        
        size += 1;
    }

    void insertLast(int val){
        if(head == null && tail == null){
            Node node = new Node(val);
            head = node;
            tail = node;
        }

        else {
            Node node = new Node(val);
            tail.nxt = node;
            tail = node;
        }
    }

    int getElem(int pos){

        try{
            traverser = head;

            while(--pos != 0){
                traverser = traverser.nxt;            
            }

            return traverser.val;
        }

        catch(Exception e){            
            return -1;
        }
        
    }

    void deleteFirst(){


        size -= 1;
    }

    void displayLL(){
          traverser = head;

          while(traverser != null){
                System.out.print(traverser.val+" -> ");
                traverser = traverser.nxt;
          }

          System.out.println("END");
          traverser = null;
    }


    class Node {
        private  int val;
        private  Node nxt;
    
          Node(int val){
              this.val = val;
              this.nxt = null;
          }
      }
}

class Main {
    public static void main(String[] args) {
        
        LL ll = new LL();
        for(int i=0; i<5; i++){
            ll.insertFirst(i);
        }
        ll.displayLL();
        System.out.println(ll.getElem(5));

        for(int i=1; i>-4; i--){

            ll.insertLast(i);
        }
        ll.displayLL();
    }
}




// public class LL {

//     private Node head;
//     private Node tail;
//     private int size;

//     public LL(){
//         this.size = 0;
//     }

//     public void insertFirst(int val){
//         Node node = new Node(val);
//         node.next = head;
//         head = node;

//         if(tail == null){
//             tail = head;
//         }

//         size += 1;
//     }

//     private class Node {
//         private int value;
//         private Node next;

//         public Node(int value){
//             this.value = value;
//         }

//         public Node(int value, Node next){
//             this.value = value;

//         }
//     }
// }