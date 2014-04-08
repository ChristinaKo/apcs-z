public class Driver{
    public static void main(String[] args){
	MyStack m = new MyStack();
	m.calc("123");
	m.push("132");
	m.calc("+");
	System.out.println(m);
	m.calc("1245561");
	m.calc("/");
	System.out.println(m);
	m.calc("24");
	System.out.println(m);
	m.calc("-");
	System.out.println(m);
    }
}