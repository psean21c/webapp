package spring.basic.beans.property;

public class Doe {

	private Tao tao;

	public Doe(Tao tao){
		this.tao = tao;
	}
	
	public Tao getTao() {
		return tao;
	}

	public void setTao(Tao tao) {
		this.tao = tao;
	}
}
