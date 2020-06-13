public class Isufilme extends AcessoriosDecorator {

	public Isufilme(IVeiculo veiculo) {
		super(veiculo);
	}

	public String getDescription() {
		return super.getDescription() + ", Isufilme";
	}
	
	public double cost() {
		return super.cost() + 145.0;
	}
}
