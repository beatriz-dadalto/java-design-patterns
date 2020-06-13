public abstract class AcessoriosDecorator implements IVeiculo {

	protected IVeiculo veiculo;

	public AcessoriosDecorator(IVeiculo veiculo) {
		this.veiculo = veiculo;
	}

	@Override
	public String getDescription() {
		return veiculo.getDescription();
	}

	public double cost() {
		return veiculo.cost();
	}

}
