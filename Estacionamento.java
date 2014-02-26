class Estacionamento {

	private Endereco endereco;
	private int capacidadecarro = 0;
	private int capacidademoto = 0;
	private int capacidadebicicleta = 0;
	
	private int quantidadecarro = 0;
	private int quantidademoto = 0;
	private int quantidadebicicleta	= 0;
	
	private Carro[] carros;
	
	public Estacionamento (Endereco endereco, int capacidadecarro, int capacidademoto, int capacidadebicicleta) {
		this.endereco = endereco;
		this.capacidadecarro = capacidadecarro;
		this.capacidademoto = capacidademoto;
		this.capacidadebicicleta = capacidadebicicleta;
		
		carros = new Carro[capacidadecarro];
	}
	
	public void guarda (Carro carro, DataHora dataHora) {
		if (quantidadecarro < capacidadecarro ){
		carros [ quantidadecarro ] = carro;
		quantidadecarro++;
		}
	}
	
	public Carro[] listaCarros() {
		return this.carros;
	}
	
	public void imprime(){
	for (int posicao = 0; posicao < carros.length; posicao++){
			Carro carro = carros [posicao];
			if (carro!=null) {
			carro.imprime();
		}
	}
	}
	}