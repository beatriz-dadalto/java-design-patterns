public class Arcondicionado extends AcessoriosDecorator {

	public Arcondicionado(IVeiculo veiculo) {
		super(veiculo);
	}

	public String getDescription() {
		return super.getDescription() + ", Arcondicionado";
	}
	
	public double cost() {
		return super.cost() + 400.0;
	}

}
