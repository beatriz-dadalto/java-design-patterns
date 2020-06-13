public class Alarme extends AcessoriosDecorator {
	
	public Alarme(IVeiculo veiculo) {
		super(veiculo);
	}

	public String getDescription() {
		return super.getDescription() + ", Alarme";
	}
	
	public double cost() {
		return super.cost() + 1000;
	}

}
