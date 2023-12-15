package presentacion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		
		//crear clases de gestión de eventos. Necesitamos acceder a los componentes de la ventana. Serán clases anónimas.
		//Mediante clase anónima definimos la clase (sin nombre) y creamos un objeto de la misma
		//importamos y cuando escribamos new, espacio y control+espacio y damos a la primera opción
		/*ActionListener listener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtUsuario.getText().equals("admin")&&txtPassword.getText().equals("pwd")) {
					JOptionPane.showMessageDialog(MiVentana.this, "Usuario válido");	
				}else {
					JOptionPane.showMessageDialog(MiVentana.this, "Usuario incorrecto");
				}
			}
		};*/
		
		//ActionListener es una interfaz funcional, por lo que podemos implementarla con una expresión lambda
		//Nos ahorramos la clase anónima
		ActionListener listener=e->{
			if(txtUsuario.getText().equals("admin")&&txtPassword.getText().equals("pwd")) {
				JOptionPane.showMessageDialog(MiVentana.this, "Usuario válido");	
			}else {
				JOptionPane.showMessageDialog(MiVentana.this, "Usuario incorrecto");
			}
		
		};
		
		//Asociar botón con objeto que implementa la interfaz
		btnEntrar.addActionListener(listener);
		
	}
}
