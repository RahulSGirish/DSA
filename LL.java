class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class LL {
  Node head;

  void insert(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      return;
    }
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
  }

  void delete(int key) {
    Node temp = head;
    if (head == null)
      return;
    if (head.data == key) {
      head = head.next;
      return;
    }
    while (temp.next != null && temp.next.data != key) {
      temp = temp.next;
    }
    if (temp.next != null) {
      temp.next = temp.next.next;
    }
  }

  boolean search(int key){
    Node temp = head;
    while(temp != null){
      if(temp.data == key){
       return true;
      } 
      temp = temp.next;
    }
    return false;
  }

  void display(LL list) {
    Node temp = list.head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");
  }
}

class Main {
  public static void main(String[] args) {
    LL list = new LL();
    list.insert(10);
    list.insert(20);
    list.insert(30);

    list.display(list);
    list.delete(20);
    list.display(list);
    System.out.println(list.search(30));
  }
}
