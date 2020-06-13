public class RodaLigaLeve extends AcessoriosDecorator{

	public RodaLigaLeve(IVeiculo veiculo) {
		super(veiculo);
	}

	public String getDescription() {
		return super.getDescription() + ", RodaLigaLeve";
	}
	
	public double cost() {
		return super.cost() + 800.0;
	}

}
