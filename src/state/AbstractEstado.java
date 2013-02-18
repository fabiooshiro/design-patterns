package state;

public abstract class AbstractEstado {
	
	MaquinaDoPokemon maquina;
	
	public abstract String colocarMoeda();

	public abstract String devolverMoeda();

	public abstract String acionarAlavanca();

	public abstract String entregarBrinquedo();
	
}
