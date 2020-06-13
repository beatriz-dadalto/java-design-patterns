public class Voyage implements IVeiculo {

	@Override
	public String getDescription() {
		return "Veiculo Voyage";
	}

	@Override
	public double cost() {
		return 12000.0;
	}

}
