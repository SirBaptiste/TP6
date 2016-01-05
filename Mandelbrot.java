import java.awt.image.BufferedImage;
import java.awt.Color;

public class Mandelbrot{
	private Complexe zn;
	private Complexe c;
	
	public Mandelbrot(Complexe c){
		zn = new Complexe(0);
		this.c = new Complexe(c);
	}
	public Mandelbrot(double cReel, double cImaginaire){
		zn = new Complexe(0);
		this.c = new Complexe(cReel, cImaginaire);
	}
	public Mandelbrot(Mandelbrot that){
		this.zn = that.zn;
		this.c = that.c;
	}
	
	
	public void suivante(){
		zn.carre();
		zn.ajouter(c);
	}
	
	public int diverge(){
		Mandelbrot inter;
		int i=0;
		boolean fini = false;
		
		inter = new Mandelbrot(this);
		
		while(!fini){
			inter.suivante();
			i++;
			fini = (inter.zn.module()>=2 || inter.c.module()>=2 || i==200);		
		}
		
		return( (i==200) ? -1 : i );
	}
	
	public BufferedImage dessine(double r1, double i1, double r2, double i2,int larg, int haut){
		BufferedImage resultat;
		int nbPas;
		int rgb = HSBtoRGB(Color.black, 12, 6);

		nbPas = ((diverge() == -1) ? 200 : diverge());
		resultat = new BufferedImage(larg, haut, BufferedImage.TYPE_INT_RGB
);
		
		for(int i=0; i<larg; i++){
			for(int j=0; j<haut; j++){
				if(){
					resultat.setRGB(i,j,rgb);
				}
			}
		}
		
		return resultat;
	}
}
