public class LuzDeRe extends AcessoriosDecorator {

	public LuzDeRe(IVeiculo veiculo) {
		super(veiculo);
	}

	public String getDescription() {
		return super.getDescription() + ", LuzDeRe";
	}
	
	public double cost() {
		return super.cost() + 120.50;
	}

}
