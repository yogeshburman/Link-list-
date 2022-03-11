// singly link list in java 
class LL {
  
  class Node {
    String data;
    Node next;
    
    Node(String data){
      this.data=data;
      this.next=null;
    }
  }
  
  Node head = null;
  
  // adding values
  
  public void add(String value){
    
    Node newNode = new Node(value);
    
    if(head==null){
      head=newNode;
    }
    else{
      
      newNode.next=head;
      head=newNode;
    }
  }
  
  // adding values at beginning 
  public void beginning(String value){
     Node newNode = new Node(value);
     if(head==null){
       System.out.println("list doest exist");
     }
     else{
       newNode.next=head;
       head=newNode;
     }
  }
  
  // adding value at last 
  public void last(String value){
    Node pointer=head;
    Node newNode = new Node(value);
    if(head==null){
      System.out.println("list doesnt exist");
    }
    else{
      while(pointer.next!=null){
          pointer=pointer.next;
      }
      pointer.next=newNode;
    }
  }
  
  // display values 
  public void get(){
    Node pointer=head;
    if(head==null){
      System.out.println("list doesnt exist");
    }
    else{
      while(pointer!=null){
        System.out.print(pointer.data + " ");
      pointer=pointer.next;
        
      }
      
    }
  }
  
  // add value at position
  public void add_to_position(int position , String value ){
    Node newNode = new Node(value);
    Node pointer=head;
    for(int i=0;i<position;i++){
      pointer=pointer.next;
    }
    newNode.next=pointer.next;
    pointer.next=newNode;
  }
  

    public static void main (String[]args){
      LL list = new LL();
      list.add("yogesh");
      list.add("bharat");
      list.add("sourabh");
      list.add("sanjay");
      list.beginning("chota don");
      list.last("bada don");
      list.add_to_position(3,"gggg");
      list.get();
      
    }
}