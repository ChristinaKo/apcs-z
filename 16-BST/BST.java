public class BST {
    private Node root;

    public BST() {
        root = null;
    }
    public void insert(int n){
	Node c = root;
	while (c!=null){
	    if(c.getData()<n){
		c=c.getRight();
	    }
	    else{
		c = c.getLeft();
	    }
	}
	Node newn = new Node(n);
	c.setLeft(newn);

    }
    public Node  search (int n){
	Node c = root;
	while(c!= null && c.getData()!=n){
	    if(c.getData()<n){
		c=c.getRight();
	    }
	    else{
		c = c.getLeft();
	    }
	}
	return c;
    }
    public Node search2(Node c, int x){
	if(c.getData()== c){
	    return c;
	}
	else{
	    if(c.getData()<n){
		search(c.getRight(), n);
	    }
	    else{
		search(c.getLeft(), n);
	    }
	}
	    return c;
    }

}