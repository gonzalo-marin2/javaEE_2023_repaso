package presentacion;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
Crear un tipo de ventana para crear ventanas con:
* fondo amarillo chillón
* tamaño 600x400
* título personalizado
*/

public class MiVentana extends JFrame {
	public MiVentana(String titulo) {
		super(titulo);//llamamos al constructor definido en JFrame, cf documentación
		//cambiar comportamiento de botón de cierre
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//establecemos tamaño, posición y visibilidad
		setBounds(100,50,600,400);
		getContentPane().setBackground(Color.YELLOW);
		setVisible(true);
	}
	//incluir un constructor que permita establecer:
	//título, posición y tamaño de la ventana
	public MiVentana(String titulo, int x, int y, int w, int h) {
		super(titulo);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(x,y,w,h);
		inicializarComponentes();
		setVisible(true);
	}
	
	void inicializarComponentes() {
		setLayout(null);//desactivamos esta opción para poder poner los controles
		//PASO 1
		JLabel lbl1=new JLabel("Usuario: ");
		JLabel lbl2=new JLabel("Password: ");
		JTextField txtUsuario=new JTextField();
		JTextField txtPassword=new JTextField();
		JButton btnEntrar=new JButton("Entrar");
		//PASO 2
		lbl1.setBounds(150, 100, 120, 40);
		lbl2.setBounds(150, 170, 120, 40);
		txtUsuario.setBounds(350, 100, 120, 40);
		txtPassword.setBounds(350, 170, 120, 40);
		btnEntrar.setBounds(250, 230, 150, 30);
		//PASO 3
		add(lbl1); add(lbl2);
		add(txtUsuario); add(txtPassword);
		add(btnEntrar);	
	}
}
