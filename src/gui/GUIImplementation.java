package gui;

import image.Image;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class GUIImplementation implements GUI{

	JFrame Frame;
	
	public GUIImplementation(){
		Frame = new JFrame();
	}
	
	@Override
	public void display(Image image) {
		if (image==null) return;
		
		BufferedImage Img = GUILib.ImgToBufImg(image);
		ImageIcon Icon = new ImageIcon(Img);
		JLabel lblImg = new JLabel(Icon);
		Frame.getContentPane().add(lblImg, BorderLayout.CENTER);
		Frame.setSize(300, 400);
		Frame.setVisible(true);

	}
	


}
