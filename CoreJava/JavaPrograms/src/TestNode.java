import java.util.LinkedList;

public class TestNode {

	public static void main(String[] args) {
		LinkedList<Student> list= new LinkedList<Student>();
		list.add(new Student(4,"ramesh"));
		list.add(new Student(8, "kiran"));
		list.add(new Student(8, "varma"));
		System.out.println(list);
		
		//SinglyLinkedList str;
		/*list.add(2);
		list.add(5);
		list.add(9);
		System.out.println(list);
		for(int i=list.size()-1;i>=0;i--){
			System.out.println(list.get(i));
		}*/
		
	}
}
