package testRdm;







public class gsAlgoMain {
	
	private enum inter { reaction, diffusion }
	
	private gsAlgo2 inter;
	
	public gsAlgoMain (gsAlgo2 inter) {
		this.inter = inter;
	}
	
	public void setInter (gsAlgo2 inter) {
		this.inter = inter ;
	}
	
	public void interaction () {
		inter.gsAlgoExecute();
	}
}
