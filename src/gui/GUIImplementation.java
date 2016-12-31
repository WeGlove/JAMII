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
		BufferedImage Img = ImgToBufImg(image);
		ImageIcon Icon = new ImageIcon(Img);
		JLabel lblImg = new JLabel(Icon);
		Frame.getContentPane().add(lblImg, BorderLayout.CENTER);
		Frame.setSize(300, 400);
		Frame.setVisible(true);

	}
	
	private BufferedImage ImgToBufImg(Image image){
		BufferedImage BufImg = new BufferedImage(image.getWidth(), image.getHeight(), 0);
		for(int x=0; x<image.getWidth(); x++){
			for(int y=0; y<image.getHeight(); y++){	
				BufImg.setRGB(x, y, (image.getPixel(x, y).getR()<<16) | 
									(image.getPixel(x, y).getG()<<8)  | 
									 image.getPixel(x, y).getB());
			}
		}
		return BufImg;
	}

}
