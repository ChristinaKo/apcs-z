public class LLDriver{
    public static void main(String[] args){
	MyLinkedList L = new MyLinkedList();
	L.add("Sully");
	//	System.out.println(L);
	L.add("Mike");
	L.add("Randall");
	L.add("johnson");
	System.out.println(L);
	System.out.println(L.get(1));
	System.out.println(L.length());
	System.out.println(L.set(2, "Max"));
 

   }
}