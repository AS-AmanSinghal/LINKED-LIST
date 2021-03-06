package CIRCULAR_NON_PRIMITIVE.linkedlist;

import CIRCULAR_NON_PRIMITIVE.node.StudentNode;

public class MyLinkedListStudent {
    StudentNode head;
    //insert
    public void insert(StudentNode node){
        if(head==null){
            head=node;
            node.next=head;
            node.previous=head;
        }
        else{
            StudentNode temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            node.next=head;
            node.previous=temp;
            temp.next=node;
            head.previous=node;

        }
    }

    // dusplay
    public void display(){
        System.out.println("MyLinkedList:");
        StudentNode temp=head;
        while(temp.next!=head){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data+" ");

    }





    //gethead
    public StudentNode getHead() {
        return head;
    }
}
