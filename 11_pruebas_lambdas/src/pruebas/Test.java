package pruebas;

interface I1{
	void print(int a);
}
interface I2{
	int cal(String s);
}
interface I3{
	String construct(int a, int b);
}
interface I4{
	boolean test(int a, int b);
}
interface I5{
	int get();
}
interface I6{
	void tx(String a, int b);
}

public class Test {

	public static void main(String[] args) {
		// crear una implementación libre de cada interfaz con expresiones lamda
		
		I1 i1=a->System.out.println(a);//si solo hay una instrucción no hace falta llaves
		I2 i2=s->s.length();//cuando el código devuelve una sola cosa, no hace falta las llaves ni el return
		I3 i3=(a,b)->a+"-"+b;
		I4 i4=(a,b)->a==b;
		I5 i5=()->3;
		I6 i6=(x,y)->System.out.println(x+y);
		I6 i6bis=(a,b)->{a="Hola";b=5;};
	}
}
