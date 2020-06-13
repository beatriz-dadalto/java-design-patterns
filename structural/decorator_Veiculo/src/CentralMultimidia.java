public class CentralMultimidia extends AcessoriosDecorator {

	public CentralMultimidia(IVeiculo veiculo) {
		super(veiculo);
	}

	public String getDescription() {
		return super.getDescription() + ", CentralMultimidia";
	}
	
	public double cost() {
		return super.cost() + 650;
	}

}
