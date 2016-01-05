import java.awt.image.BufferedImage;

public class Mandelbrot{
	private Complexe zn;
	private Complexe c;
	
	public void suivante(){
		zn.carre();
		zn.ajouter(c);
	}
	
	public int diverge(){
		int i=0;
		boolean fini = false;
		
		while(!fini){
			suivante();
			i++;
			fini = (zn.module()>=2 || c.module()>=2 || i==200);		
		}
		
		return( (i==200) ? -1 : i );
	}
	
	BufferedImage dessine(double r1, double i1, double r2, double i2,int larg, int haut){
		BufferedImage resultat;
		resultat = new BufferedImage(larg, haut, BufferedImage.TYPE_INT_RGB
);
		for(int i=0; i<larg; i++){
			for(int j=0; j<haut; j++){
			
			}
		}
		
		return resultat;
	}
}
