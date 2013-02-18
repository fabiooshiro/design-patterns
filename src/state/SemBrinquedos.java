package state;

public class SemBrinquedos extends AbstractEstado {

	@Override
	public String colocarMoeda() {
		return "Nao dah para colocar a moeda. Maquina vazia";
	}

	@Override
	public String devolverMoeda() {
		return "Vc nao colocou uma moeda.";
	}

	@Override
	public String acionarAlavanca() {
		return "Vc girou, mas os brinquedos acabaram.";
	}

	@Override
	public String entregarBrinquedo() {
		return "Maquina vazia";
	}

}
