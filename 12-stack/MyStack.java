public class MyStack {

    private Node top;
    private int numElts;
    private int ind;

    public MyStack(){
	top = null;
	numElts = 0;
	String []stack = new String[10];
	ind = 0;
	stack[ind] = top.getData();
    }

    public void push(String s){ 
	Node n = new Node(s);
	/*n.setNext(top);
	top = n;
	numElts = numElts+1;
	*/
	if (ind == stack.length()){
	    String[]tmp = new String[stack.length+1];
	    System.arrayCopy(stack,0,tmp, 0, stack.length);
	    stack = tmp;
	}
	stack[ind] = s;
	ind = ind  +1;
    }

    public String pop() {
	String ret = top.getData();
	top = top.getNext();
	numElts = numElts-1;
	return ret;
    }

    public String peek() {
	return top.getData();

    }
    
    public int size() {
	return numElts;
    }

    public boolean isEmpty() {
	return top==null;
    }

    public String toString() {
	String s="";
	
	for (Node tmp = top; tmp != null; tmp = tmp.getNext()){
	    s = s + tmp.getData()+", ";
	}
	/*
	  Node tmp = top;
	  while(tmp!=null) {
	      s = s + tmp.getData()+", ";
	          tmp = tmp.getNext();
		  }
	*/
	return s.substring(0,s.length()-2);
    }
    
}