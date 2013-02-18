package state;

public class Vendido extends AbstractEstado {

	
	public Vendido(MaquinaDoPokemon maquina) {
		this.maquina = maquina;
	}

	@Override
	public String colocarMoeda() {
		return "Um momento, peque o brinquedo primeiro.";
	}

	@Override
	public String devolverMoeda() {
		return "Desculpe, mas vc jah virou a alavanca...";
	}

	@Override
	public String acionarAlavanca() {
		return "Vc nao vai ganhar outro brinquedo girando 2x.";
	}

	@Override
	public String entregarBrinquedo() {
		if(maquina.getTotalDeBrinquedos() == 0){
			maquina.setState(new SemBrinquedos());
			return "Os brinquedos acabaram";
		}else{
			maquina.diminuirBrinquedos(1);
			maquina.setState(new SemMoeda(maquina));
			return "um brinquedo aparece!";
		}
	}

}
