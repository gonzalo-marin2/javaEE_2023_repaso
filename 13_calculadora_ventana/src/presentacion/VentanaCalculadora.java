package presentacion;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import service.Calculadora;

public class VentanaCalculadora extends JFrame {
	public VentanaCalculadora(String titulo) {
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
	public VentanaCalculadora(String titulo, int x, int y, int w, int h) {
		super(titulo);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(x,y,w,h);
		inicializarComponentes();
		setVisible(true);
	}
	
	void inicializarComponentes() {
		setLayout(null);//desactivamos esta opción para poder poner los controles
		//PASO 1
		JLabel lbl1=new JLabel("Número 1: ");
		JLabel lbl2=new JLabel("Número 2: ");
		JTextField txtNum1=new JTextField();
		JTextField txtNum2=new JTextField();
		JButton btnSumar=new JButton("Sumar");
		JButton btnRestar=new JButton("Restar");
		JButton btnMultiplicar=new JButton("Multiplicar");
		JButton btnDividir=new JButton("Dividir");
		
		//PASO 2
		lbl1.setBounds(140, 50, 120, 40);
		lbl2.setBounds(140, 120, 120, 40);
		txtNum1.setBounds(250, 50, 120, 40);
		txtNum2.setBounds(250, 120, 120, 40);
		btnSumar.setBounds(150, 180, 150, 30);
		btnRestar.setBounds(350, 180, 150, 30);
		btnMultiplicar.setBounds(150, 250, 150, 30);
		btnDividir.setBounds(350, 250, 150, 30);
		//PASO 3
		add(lbl1); add(lbl2);
		add(txtNum1); add(txtNum2);
		add(btnSumar);add(btnRestar);add(btnMultiplicar);add(btnDividir);
		
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
		/*ActionListener listener=e->{
			if(txtUsuario.getText().equals("admin")&&txtPassword.getText().equals("pwd")) {
				JOptionPane.showMessageDialog(MiVentana.this, "Usuario válido");	
			}else {
				JOptionPane.showMessageDialog(MiVentana.this, "Usuario incorrecto");
			}
		
		};*/
		
		//Asociar botón con objeto que implementa la interfaz
		btnSumar.addActionListener(a->{
			JOptionPane.showMessageDialog(VentanaCalculadora.this, "La suma es: "+
					new Calculadora(Integer.parseInt(txtNum1.getText()),Integer.parseInt(txtNum2.getText())).sumar());
		});
		
		btnRestar.addActionListener(a->{
			JOptionPane.showMessageDialog(VentanaCalculadora.this, "La resta es: "+
					new Calculadora(Integer.parseInt(txtNum1.getText()),Integer.parseInt(txtNum2.getText())).restar());
		});
		
		btnMultiplicar.addActionListener(a->{
			JOptionPane.showMessageDialog(VentanaCalculadora.this, "La multiplicación es: "+
					new Calculadora(Integer.parseInt(txtNum1.getText()),Integer.parseInt(txtNum2.getText())).multiplicar());
		});
		
		btnDividir.addActionListener(a->{
			JOptionPane.showMessageDialog(VentanaCalculadora.this, "La división es: "+
					new Calculadora(Integer.parseInt(txtNum1.getText()),Integer.parseInt(txtNum2.getText())).dividir());
		});
		
		
		
	}

}
