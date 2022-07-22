public class Index {


    private Node head;      //creating first node

    private static class Node {

        private int value;
        private Node next;

        Node(int value) {
            this.value = value;

        }
    }

    public void addToLastNode(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }

    public void showList(Node head) {

        Node temp = head;
        while (temp != null) {
            System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node reverseLinkedList(Node currentNode)
    {
        Node prevN=null;
        Node nextN;

        while(currentNode != null)
        {
            nextN=currentNode.next;
            currentNode.next=prevN;
            prevN=currentNode;
            currentNode=nextN;

        }
        return prevN;
    }

    public static void main(String[] args) {

        Index list = new Index();

        System.out.println("Before Reverse LinkList:");

        Node head=new Node(7);
        list.addToLastNode(head);
        list.addToLastNode(new Node(3));
        list.addToLastNode(new Node(8));
        list.addToLastNode(new Node(4));
        list.addToLastNode(new Node(5));

        list.showList(head);

        Node revsHead=reverseLinkedList(head);
        System.out.println("After Reverse LinkList");
        list.showList(revsHead);

    }

}