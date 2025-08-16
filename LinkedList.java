class LinkedList{
int size;
LinkedList(){
 size=0;
}
   class Node{

   private int data;
   private Node next;
   
    Node(int data){


    this.data=data;

    this.next=null;
   size++;
    }
    }
private Node head;
private Node tail;

public boolean isEmpty(){
return head==null;
}
   public void  addFirst(int data){
    Node Newnode=new Node(data);
    if(isEmpty()){
     
     head=tail=Newnode;

    return;
     }
   
     Newnode.next=head;

     head=Newnode;
     
     
    }
public void addLast(int data){
Node Newnode=new Node(data);
if(isEmpty()){

head=tail=Newnode;
return;

}
tail.next=Newnode;
tail=Newnode;



}

public void print(){
Node current=head;

while(current!=null){

System.out.print(current.data+"->");

current=current.next;

}

System.out.println("null");
}

public void removeFirst(){

if(isEmpty()){

System.out.print("no element in a LinkedList to delete");
System.out.print("null");
return;
}
size--;
if(head==tail){

head=tail=null;
return;
}

Node current=head;

head=null;

head=current.next;


}

public void removeLast(){

if(isEmpty()){

System.out.print("no element to delete");

}
size--;
if(head==tail){
head=tail=null;
return;
}

Node current=head;

Node nextnode=current.next;

while(nextnode.next!=null){
current=current.next;

nextnode=nextnode.next;

}
tail=current;
current.next=null;





}

public void addAt(int data,int ind){

if(ind<size){

size++;
Node newnode=new Node(data);
if(isEmpty()||ind==0){

newnode.next=head;
head=null;
head=newnode;
return;
}


Node current=head;
Node nextnode=current.next;
for(int i=1;i<size;i++){
if(i==ind){
current.next=newnode;
newnode.next=nextnode;

return;
}
current=current.next;
nextnode=nextnode.next;


}

}
else{
System.out.print("invalid size");
}

}
public void reverse(){

Node previous=null;
Node current=head;
while(current!=null){
Node nextnode=current.next;
current.next=previous;
previous=current;
current=nextnode;
}
tail=head;
head=previous;



}


public static void main(String[] args){

LinkedList list=new LinkedList();
list.addFirst(10);
list.addFirst(20);
list.addFirst(30);
list.addAt(25,0);
list.print();
list.reverse();
list.print();
}
}