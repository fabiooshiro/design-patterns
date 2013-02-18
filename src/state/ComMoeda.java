package state;

public class ComMoeda extends AbstractEstado {
	
	public ComMoeda(MaquinaDoPokemon maquina) {
		this.maquina = maquina;
	}

	public String colocarMoeda(){
		return "Cabe apenas uma moeda, jah tem uma.";
	}

	@Override
	public String devolverMoeda() {
		maquina.setState(new SemMoeda(maquina));
		return "Moeda devolvida.";
	}

	@Override
	public String acionarAlavanca() {
		maquina.setState(new Vendido(maquina));
		return "Vc vira a alavanca e " + maquina.entregarBrinquedo();
	}

	@Override
	public String entregarBrinquedo() {
		return "Gire a alavanca, ou pegue a moeda de volta.";
	}
}
