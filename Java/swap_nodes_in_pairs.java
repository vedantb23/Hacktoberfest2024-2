// Java program to pairwise swap elements
// in a given linked list

class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

class GfG {

    // Recursive function to swap data of nodes in pairs
    static void pairwiseSwap(Node head) {
        
        // Base case: if the list is empty or has 
          // only one node, no swap
        if (head == null || head.next == null) {
            return;
        }

        // Swap the data of the current node with the next node
        int temp = head.data;
        head.data = head.next.data;
        head.next.data = temp;

        // Recursion for the next pair
        pairwiseSwap(head.next.next);
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Creating the linked list: 
          // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        pairwiseSwap(head);

        printList(head);
    }
}
