import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MenuPrincipal extends JPanel {
	private JButton boton1,boton2,boton3, boton4;
	private JLabel label;
	private JFrame frame;
	
	public MenuPrincipal(JFrame f){
		this.frame=f;
		boton1= new JButton("FACIL");
		boton2= new JButton("NORMAL");
		boton3= new JButton("COMPLICADO");
		boton4= new JButton("IMPOSIBLE");
		label= new JLabel("Seleccione la dificultad:");
		
		setLayout(null);
		label.setFont(new Font("Tahoma", Font.ITALIC, 24));
		label.setForeground(Color.white);
		label.setBounds((RType.ANCHO/2)-130,40,260,50);
		boton1.setBounds((RType.ANCHO/2)-70,(RType.ALTO/6)*2 , 140, 50);
		boton2.setBounds((RType.ANCHO/2)-70,(RType.ALTO/6)*3, 140, 50);
		boton3.setBounds((RType.ANCHO/2)-70,(RType.ALTO/6)*4 , 140, 50);
		boton4.setBounds((RType.ANCHO/2)-70,(RType.ALTO/6)*5 , 140, 50);
				
		
		setBackground(Color.BLACK);
		add(label);
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
				
		boton1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame.dispose();
				new RType(1);
			}
		});
		boton2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame.dispose();
				new RType(2);
			}
		});
		boton3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame.dispose();
				new RType(3);
			}
		});
		boton4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame.dispose();
				new RType(4);
			}
		});
		setFocusable(true);
	    requestFocus();
	}
	
}
