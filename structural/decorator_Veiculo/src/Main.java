public class Main {

	public static void main(String[] args) {
		
		IVeiculo voyage = new Voyage();
		System.out.println(voyage.getDescription() + " $" + voyage.cost());
		
		IVeiculo up = new UP();
		up = new Alarme(up);
		up = new Arcondicionado(up);
		System.out.println(up.getDescription() + " $" + up.cost());
		
		IVeiculo gol = new Gol();
		gol = new CentralMultimidia(gol);
		gol = new Airbag(gol);
		System.out.println(gol.getDescription() + " $" + gol.cost());

		IVeiculo polo = new Polo();
		polo = new RodaLigaLeve(polo);
		polo = new LuzDeRe(polo);
		polo = new Isufilme(polo);
		System.out.println(polo.getDescription() + " $" + polo.cost());

	}

}
