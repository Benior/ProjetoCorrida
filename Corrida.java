package CorridaDeRua;

import java.util.*;

public class Corrida {
	
		  private Carro desafiante, desafiado;
		  private int disputa;
		  private boolean aprovada;
		  
		  Scanner ler = new Scanner(System.in);
		  Random dados = new Random();
		  
		  public Carro getDesafiante () {
		  return desafiante;
		}
		  
		  public void setDesafiante (Carro desa) {
		    desafiante = desa;
		}

		  public Carro getDesafiado () {
		  return desafiado;
		}
		  
		  public void setDesafiado (Carro desa) {
		    desafiado = desa;
		}

		  
		  public int getDisputa() {
			return disputa;
		}

		public void setDisputa(int disputa) {
			this.disputa = disputa;
		}

		public boolean isAprovada() {
			return aprovada;
		}

		public void setAprovada(boolean aprovada) {
			this.aprovada = aprovada;
		}

		void marcarCorrida (Carro car1, Carro car2){
			  
			  System.out.println("A corrida vai começar! \n");
			  System.out.println("Entre com os dados dos seus competidores \n");
			  do {
				  System.out.println("Primeiro carro: ");
				  car1.apresentar();
				  System.out.println("Segundo carro: ");
				  car2.apresentar();
				  

				  if((car1.getMotor() != car2.getMotor())) {
					  System.out.println("Corrida não aprovada, motores diferentes");
					  System.out.println("\nEntre novamente com os dados dos competidores!");
				  }
				  else {
					  this.setAprovada(true);
					  System.out.println("Corrida APROVADA!\n\n");
				  }
			  } while (isAprovada()!=true);
			  
		  }

		  void correr (Carro car1, Carro car2){
			  double dado;
			  this.marcarCorrida(car1, car2);
			  System.out.println("Será uma disputa de quantas rodadas: ");
			  this.setDisputa(ler.nextInt());

			  System.out.println("\n\nA corrida vai começar!\n");
			  System.out.println("Preparar!\n");
			  System.out.println("Apontar já!\n");
			  
			  
			  for(int x=0; x<this.getDisputa(); x++){
				  
				  System.out.println(x+1+"ª rodada\n");
				  dado = dados.nextDouble((20-1)+1)+1;
				  System.out.printf("O carro "+car1.getNomeCarro()+" andou %.2fKm\n",dado*car1.getMotor());
				  car1.setPotencia(car1.getPotencia()+(dado*car1.getMotor()));
				  System.out.printf("O carro "+car1.getNomeCarro()+" está na altura de %.2fKm\n\n",car1.getPotencia());
				  
				  dado = dados.nextDouble((20-1)+1)+1;
				  System.out.printf("O carro "+car2.getNomeCarro()+" andou %.2fKm\n",dado*car2.getMotor());
				  car2.setPotencia(car2.getPotencia()+(dado*car2.getMotor()));
				  System.out.printf("O carro "+car2.getNomeCarro()+" está na altura de %.2fKm\n\n",car2.getPotencia());
			  }
			  
			  System.out.println("\nResultado da partida\n");
			  
			  if(car1.getPotencia()==car2.getPotencia()) {
				  car1.empatarRace(car1, car2);
			  }else if (car1.getPotencia()>car2.getPotencia()) {
				  car1.ganharRace();
				  car2.perderRace();
			  }else {
				  car2.ganharRace();
				  car1.perderRace();
			  }
			  
		  }
		  

}
