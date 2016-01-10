import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.*;
import java.io.IOException;

public class Main{
	public static void main(String[] args){
		Mandelbrot a;
		BufferedImage im;
		double r1, i1, r2, i2;
		int larg, haut;
	
		larg = 600;
		haut = 800;
		r1 = -2;
		i1 = -2;
		r2 = 2;
		i2 = 2;
		
		a = new Mandelbrot(new Complexe(2,5),new Complexe(1, 4));
		im = a.dessine(r1, i1, r2, i2, larg, haut);
		
		File file = new File("result.png");
		try {
			ImageIO.write(im, "png", file);
		} catch(IOException e) {
			System.out.println("Write error for " + file.getPath() +": " + e.getMessage());
		}
	}
}
