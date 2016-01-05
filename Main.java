import java.awt.image.BufferedImage;

public class Main{
	public static void main(String[] args){
		Mandelbrot a;
		BufferedImage im;
		double r1, i1, r2, i2;
		int larg, haut;
	
		larg = 600;
		haut = 800;
		r1 = ;
		i1 = ;
		r2 = ;
		i2 = ;
		
		a = new Mandelbrot(2,3);
		im = a.dessine(x1, y1, x2, y2, larg, haut);
		
		File file = new File("result.png");
		try {
			ImageIO.write(im, "png", file);
		} catch(IOException e) {
			System.out.println("Write error for " + file.getPath() +": " + e.getMessage());
		}
	}
}
