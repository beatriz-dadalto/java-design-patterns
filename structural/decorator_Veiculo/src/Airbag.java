public class Airbag extends AcessoriosDecorator {

	public Airbag(IVeiculo veiculo) {
		super(veiculo);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Airbag";
	}

	@Override
	public double cost() {
		return super.cost() + 501.50;
	}

}
