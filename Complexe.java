public class Complexe {
	private double reel;
	private double imaginaire;
	
	/**
	* Constructeur basique
	*/
	public Complexe(double reel, double imaginaire){
		this.reel = reel;
		this.imaginaire = imaginaire;
	}

	/**
	* Constructeur pour une partie reelle uniquement
	*/
	public Complexe(double reel){
		this.reel = reel;
		this.imaginaire = 0;
	}

	/**
	* Constructeur par copie
	*/
	public Complexe(Complexe that){
		this.reel = that.reel;
		this.imaginaire = that.imaginaire;
	}
	
	/**
	* Methode additionnant le complexe "that" au complexe courant
	*/
	public void ajouter(Complexe that){
		this.reel += that.reel;
		this.imaginaire += that.imaginaire;
	}
	
	/**
	* Methode multipliant le complexe "that" au complexe courant
	*/
	public void multiplier(Complexe that){
		this.reel = this.reel*that.reel - this.imaginaire*that.imaginaire;
		this.imaginaire = this.reel*that.imaginaire + this.imaginaire*that.reel;
	}
	
	/**
	* Methode calculant le module de notre complexe
	*/
	public double module(){
		return(Math.sqrt(reel*reel + imaginaire*imaginaire));
	}
	
	/**
	* Methode calculant le carre de notre complexe
	*/
	public void carre(){
		this.multiplier(this);
	}
	
	/* Accesseurs */
	public double getReel(){
		return this.reel;
	}
	public void setReel(double reel){
		this.reel = reel;
	}
	
	public double getImaginaire(){
		return this.imaginaire;
	}
	public void setImaginaire(double imaginaire){
		this.imaginaire = imaginaire;
	}

	
	public String toString(){
		return (reel+" + "+imaginaire+"i\n");
	}
}
