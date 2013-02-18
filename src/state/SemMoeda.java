package state;

public class SemMoeda extends AbstractEstado {
	
	public SemMoeda(MaquinaDoPokemon maquinaDoPokemon) {
		maquina = maquinaDoPokemon;
	}

	public String colocarMoeda(){
		maquina.setState(new ComMoeda(maquina));
		return "Ok, moeda recebida.";
	}

	@Override
	public String devolverMoeda() {
		return "Vc nao colocou uma moeda.";
	}

	@Override
	public String acionarAlavanca() {
		return "Vc girou, mas sem moeda.";
	}

	@Override
	public String entregarBrinquedo() {
		return "Coloque a moeda primeiro.";
	}
}
