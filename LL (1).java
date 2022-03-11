// singly link list in java 
class LL {
  int size;
  LL(){
    this.size=0;
  }
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
      size++;
    }
    else{
      
      newNode.next=head;
      head=newNode;
      size++;
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
       size++;
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
      size++;
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
    size++;
  }
  
  
  // deleting first element 
 public void deleteFirst(){
   if(head==null){
     System.out.println("List is empty");
   }
   else{
     Node pointer=head;
     
     pointer=pointer.next;
     head=pointer;
     size--;
   }
 }
 
 // delete last element
 public void deleteLast(){
   
   if(head==null){
     System.out.println("List is Empty");
   }
   else{
    Node pointer1=head;
    Node pointer2=pointer1.next;
    while(pointer2.next!=null){
      pointer1=pointer2;
      pointer2=pointer2.next;
    }
    pointer1.next=null;
   System.out.println();
     size--;
   }
 }
 
 // size of list
 public int size(){
   return size;
 }
  

    public static void main (String[]args){
      LL list = new LL();
      //list.add("1");
     // list.add("2");
      list.add("2");
     // list.add("4");
      // list.beginning("chota don");
      // list.last("bada don");
      // list.add_to_position(3,"gggg");
      // list.get();
      // list.deleteFirst();
      // list.get();
      // list.deleteLast();
      
      list.beginning("1");
      list.last("3");
       list.get();
      System.out.println(list.size());
      
      
      
      
    }
}
