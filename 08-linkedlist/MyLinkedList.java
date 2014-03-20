import java.util.*;
import java.io.*;

public class MyLinkedList{
    private Node head;
    public MyLinkedList(){
	head = null;
    }
    public void add(String d){
	Node tmp = new Node(d);
	//head=tmp;
	tmp.setNext(head);
	head = tmp;
    }
    // public void add(int i, String s){
    // 	int count = 0;
    // 	for (int 
    // 		 }
    public String get(int i){
	int count = 0;
	for (Node n = head; n != null; n = n.getNext()){
	    if (count == i){
		return n.getData();

	    }
	    count = count + 1;
	}
	throw new IndexOutOfBoundsException();
    }
    public String set(int i, String s){
	int count = 0;
	Node tmp = new Node();
	Node nn = new Node(s);
	for (Node n = head; n!= null; n=n.getNext()){
	    if (count == i-1){ 
		tmp = new Node(n.getNext().getData());
		n.setNext(nn);
	    }
	    count = count +1;
	}
	return tmp.getData();
    }
	    // public String remove(int i){
	    // }
	    // public String find(String s){
	    // }
    public int length(){
	int len = 0;
	for (Node n = head; n!= null; n=n.getNext()){
	    len = len + 1;
	}
	return len;
    }
    public String toString(){
	String s = "";
	for (Node n = head; n!= null; n = n.getNext()){
	    s = s  + n + "  ";
	}
	return s;
    }
}