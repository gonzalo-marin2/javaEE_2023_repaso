package pruebas;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> dias=new ArrayList<>();
		dias.add("lunes");
		dias.add("martes");
		dias.add(1, "miércoles");
		dias.add("jueves");
		
		for(int i=0;i<dias.size();i++) {
			System.out.println(dias.get(i));
		}
		
		dias.remove(0);
		
		for(String s:dias) {
			System.out.println(s);
		}

	}

}
