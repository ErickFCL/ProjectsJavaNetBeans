import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MenuFinJuego extends JPanel {
	private JButton boton1;
	private JLabel label;
	private JFrame frame;
	
	public MenuFinJuego(JFrame f,boolean victoria){
		this.frame=f;
		boton1= new JButton("Volver al menu");
		
		if(victoria)
			label= new JLabel("Enhorabuena, ha acabado con todos los alienígenas!!");
		else
			label= new JLabel("Lo sentimos, ha perdido...");
		setLayout(null);
		label.setFont(new Font("Tahoma", Font.ITALIC, 20));
		label.setForeground(Color.white);
		label.setBounds(0,40,RType.ANCHO,50);
		boton1.setBounds((RType.ANCHO/2)-70,(RType.ALTO/6)*2 , 140, 50);
		
				
		
		setBackground(Color.BLACK);
		add(label);
		add(boton1);
		
				
		boton1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame.dispose();
				new RType(0);
			}
		});
		setFocusable(true);
	    requestFocus();
	}
	
}
