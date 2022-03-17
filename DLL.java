// Doubly link list 
class DLL {
  
  int size;
  DLL(){
    this.size=0;
  }
  class Node{
    String data;
    Node previous;
    Node next;
    
    Node(String data){
      this.data=data;
      this.previous=null;
      this.next=null;
    }
  }
  
  Node head = null;
  Node tail = null;
  
  // adding Nodes 
  public void add(String value){
    Node newNode = new Node(value);
    if(head==null){
      head=newNode;
      tail=newNode;
    }
    else{
      head.previous=newNode;
      newNode.next=head;
      head=newNode;
      
      
    }
    size++;
  }
  
  // traversing list
  public void get(){
    Node pointer = head;
    if(head==null){
      System.out.println("list doesnt exist");
    }
    else{
      do{
        System.out.print(pointer.data + " ,");
        pointer=pointer.next;
      }
      while(pointer!=null);
    }
  } 
  
  // adding node to beginning
  public void addFirst(String value ){
    Node newNode = new Node(value);
    Node pointer = head;
    if(head==null){
      System.out.println("List is empty");
    }
    else{
      pointer.previous=newNode.next;
      newNode.next=pointer;
      head=newNode;
    }
    size++;
  }
  
  // add node to last 
  public void addLast(String value){
    Node newNode = new Node(value);
    
    if(head==null){
      System.out.println("list is empty");
    }
    else{
      tail.next=newNode;
      newNode.previous=tail;
      tail=newNode;
    }
    size++;
  }
  
  // add to specific position 
  public void add_to_position(int position,String value){
    Node newNode = new Node(value);
    Node pointer1 = head;
    Node pointer2 = pointer1.next;
    if(head==null){
      System.out.println("list is empty");
    }
    else{
      for(int i=1;i<position-1;i++){
        pointer1 = pointer2;
        pointer2 = pointer2.next;
      }
      pointer1.next=newNode;
      newNode.previous=pointer1;
      pointer2.previous=newNode;
      newNode.next=pointer2;
      size++;
    }
  }
  
  // deleting first node 
  public void deleteFirst(){
    Node pointer = head;
    if(head==null){
      System.out.println("list is empty");
    }
    else{
      head = pointer.next;
      pointer.previous=null;
      
    }
    size--;
  }
  
  // delete from last 
  public void deleteLast(){
    Node pointer=tail;
    if(head==null){
      System.out.println("list is empty");
    }
    else{
      tail=pointer.previous;
      tail.next=null;
      
    }
    size--;
  }
  
  // delete from position 
  public void delete_to_position(int position){
    Node pointer1 =head;
    Node pointer2 =pointer1.next;
    if(head==null){
      System.out.println("list is empty");
    }
    else{
      for(int i=1;i<position-1;i++){
        pointer1=pointer2;
        pointer2=pointer2.next;
      }
      pointer1.next=pointer2.next;
      
    }
    size--;
  }
  
  // size of list 
  public int size(){
    return size;
  }
  
  public static void main (String[]args){
    DLL list = new DLL();
    list.add("yogesh");
    list.add("sourabh");
    list.add("bharat");
    list.add("sanjay");
    list.add("Adarsh");
    
    
    list.addFirst("first");
    list.addLast("last");
    list.add_to_position(2,"second");
    list.deleteFirst();
    list.deleteLast();
    list.delete_to_position(4);
    list.get();
    System.out.print(list.size());
    
  }
}