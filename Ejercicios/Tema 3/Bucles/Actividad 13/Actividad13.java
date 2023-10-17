import java.util.Random;
	public class Actividad13{
		public static void main(String [] args){
			Random random = new Random();
			int cara = 0;
			int cruz = 1;
			int numCaras = 0;
			int numCruces = 0;
			int aleatorio; 
			final int MIN = 10;
			final int MAX = 20;	

			for (int i = 0; i <=1000000000; i++){	
				
				aleatorio = random.nextInt(2);
				switch (aleatorio){
					case cara:
						numCaras++;
						break;
					case cruz:
						numCruces++;
						break;
			    }		
		    }
		double porcentajeCaras = ((double)numCaras / (numCaras + numCruces)) * 100;
		double porcentajeCruces = ((double)numCruces / (numCaras + numCruces)) * 100;	

		System.out.println("Caras " + porcentajeCaras);
		System.out.println("Cruces " + porcentajeCruces);

	}		
}	