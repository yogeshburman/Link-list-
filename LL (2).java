class LL {
  
  class Node{
    String data;
    Node next;
    
    Node(String data){
      this.data=data;
      this.next=null;
    }
  }
  
  Node head = null;
  Node tail = null;
  
  // adding nodes
  public void add(String value){
    Node newNode = new Node(value);
    
    if(head==null){
      head=newNode;
      tail=newNode;
      newNode.next=head;
    }
    else{
      newNode.next=head;
      head=newNode;
      tail.next=head;
    }
  }
  
  // traverse list 
  public  void get(){
    Node pointer = head;
    if(head==null){
      System.out.println("list doesn't exist");
    }
    else {
      do{
        System.out.print(pointer.data + " ");
        pointer=pointer.next;
      }
      while(pointer!=head);
    }
  }
  
  
  
  public static void main (String[]args){
    LL list = new LL();
    list.add("yogesh");
    list.add("chota don");
    list.add("Bada Don");
    list.add("kite");
    list.get();
  }
}