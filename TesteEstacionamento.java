class TesteEstacionamento {
	public static void main (String[]args) {
	
		Endereco endereco = new Endereco ("AV. 23 de Maio",42,"01234-567");
		
		Estacionamento estacionamento = new Estacionamento (endereco, 70, 25, 15);
		
		DataHora dataHora = new DataHora (25,4,2014,21,30);
		
		Carro gol = new Carro ("ABC-1234","Gol","Branco");
		estacionamento.guarda(gol, dataHora);
		
		Carro fiat147 = new Carro ("ABC-1569","Fiat147","Verde");
		estacionamento.guarda(fiat147, dataHora);
		
		Carro [] carros = estacionamento.listaCarros();
		
		
		
		
	}
	
}