package com.awt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameExample extends Frame{
	
	FrameExample()
	{
		Button b=new Button("click me");  
		
		b.setBounds(30,100,80,30);
		
		add(b);
		
		setSize(300,300); 
		
		setLayout(null); 
		
		setVisible(true);
		
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				b.setName("surbhi");
				
			}
		});
		} 
	
	

	public static void main(String[] args) {
		FrameExample obj=new FrameExample();
		

	}

}
