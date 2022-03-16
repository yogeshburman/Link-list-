// Circular link list
class LL {
  int size;
  LL(){
    this.size=0;
  }
  
  class Node {
    String data;
    Node next ;
    
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
      newNode.next=newNode;
    }
    else{
      newNode.next=head;
      head=newNode;
      tail.next=head;
    }
    size++;
  }
  
  // traversing data 
  public void get(){
    Node pointer = head;
    if(head==null){
      System.out.println("list doesn't exist");
    }
    else{
      do{
      System.out.print(pointer.data + " ,");
      pointer=pointer.next;
      }
      while(pointer!=tail.next);
    }
  }
  
  // adding into beginning
  public void addFirst(String value){
    Node newNode = new Node(value);
    if(head==null){
      System.out.print("list is empty");
      head=newNode;
      tail=newNode;
      newNode.next=newNode;
      size++;
    }
    else{
      newNode.next=head;
      head=newNode;
      tail.next=head;
      size++;
    }
    
  }
  
  // adding to last 
  public void addLast(String value){
    Node newNode = new Node(value);
    if(head==null){
      System.out.println("list is empty");
    }
    else{
      tail.next=newNode;
      tail=newNode;
      newNode.next=head;
      
    }
    size++;
  }
  
  // adding to specific location
  public void add_to_position(int position , String value){
    Node newNode = new Node(value);
    Node pointer = head;
    if(head==null){
      System.out.println(" list is empty");
    }
    else{
      for(int i=1;i<position-1;i++){
      pointer=pointer.next;
    }
      newNode.next=pointer.next;
      pointer.next=newNode;
    }
    size++;
  }
  // size of list 
  public int size(){
    return size;
  }
  
  // delete all
  public void deleteAll(){
    head=null;
    System.out.println("list is deleted ");
  }
  
  // delete first element 
  public void deleteFirst(){
    Node pointer=head;
    if(head==null){
      System.out.println("list is empty");
    }
    else{
      head=pointer.next;
      tail.next=head;
      size--;
    }
  }
  
  // delete last element 
  public void deleteLast(){
    Node pointer1 = head;
    Node pointer2 = pointer1.next;
    if(head==null){
      System.out.println("list is empty");
    }
    else{
      while(pointer2.next!=tail.next){
        pointer1=pointer2;
        pointer2=pointer2.next;
        
      }
      tail=pointer1;
      tail.next=head;
      size--;
    }
  }
  
  // delete at specific position
  public void delete_at_position(int position){
    Node pointer1 = head;
    Node pointer2 = pointer1.next;
    if(head==null){
      System.out.println("list is empty");
    }
    else{
      for(int i=1;i<=position-2;i++){
        pointer1=pointer2;
        pointer2=pointer2.next;
      }
      pointer1.next=pointer2.next;
      size--;
    }
  }
  
  
  public static void main (String[]args){
    LL list = new LL();
     list.add("yogesh");
    list.add("sourabh");
    list.add("bharat");
    list.add("sanjay");
    list.add("chota don");
    list.add("bada don");
    // list.addFirst("twinkle");
    // list.addLast("ooooo");
    list.add_to_position(3,"ttttt");
    
    list.get();
    System.out.println(list.size());
   // list.deleteAll();
    list.deleteFirst();
    list.get();
    System.out.println(list.size());
    list.deleteLast();
    list.get();
    System.out.println(list.size());
    list.delete_at_position(5);
    list.get();
    System.out.println(list.size());
    
    
  }
}
