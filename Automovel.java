abstract class Automovel implements Veiculo{
	private String placa;
	private String modelo;
	private String cor;
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void imprime() {
		System.out.print(placa + "-");
		System.out.print(modelo + "-");
		System.out.print(cor);
	}
}