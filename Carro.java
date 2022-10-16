package CorridaDeRua;

import java.util.Scanner;

public class Carro {

		private String nomeCarro, modelo, nomePiloto;
		private double motor, potencia;
		private int ano;

		Scanner ler = new Scanner(System.in);
	  
		public String getNomeCarro () {
			return nomeCarro;
	  }
	  
		public void setNomeCarro (String nomeCar) {
		  	nomeCarro = nomeCar;
	  }

		public String getModelo () {
		  	return modelo;
	  }
	  
		public void setModelo (String modeloCar) {
			modelo = modeloCar;
	  }

		public String getNomePiloto () {
			return nomePiloto;
	  }
	  
		public void setNomePiloto (String pilotoCar) {
			nomePiloto = pilotoCar;
	  }

		public double getMotor () {
			return motor;
	  }
	  
		public void setMotor (double motorCar) {
		  	motor = motorCar;
	  }
	  
		public double getPotencia () {
			return potencia;
	  }
	  
		public void setPotencia (double potenciaCar) {
			potencia = potenciaCar;
	  }

		public double getAno () {
			return ano;
	  }
	  
		public void setAno (int anoCar) {
			ano = anoCar;
	  }

	  void apresentar (){

	    System.out.println("\nEscreva o nome do carro: ");
	    this.setNomeCarro(ler.next());

	    System.out.println("\nEscreva o modelo do carro: ");
	    this.setModelo(ler.next());
	    
	    System.out.println("\nEscreva o nome do piloto do Carro: ");
	    this.setNomePiloto(ler.next());

	    System.out.println("\nEscreva o motor do carro: ");
	    this.setMotor(ler.nextDouble());

	    System.out.println("\nEscreva o ano do carro: ");
	    this.setAno(ler.nextInt());
	    System.out.println("\n\n");
	    
	  }
	  
	  void status (){
	    
	    System.out.println("O nome do carro é: "+ this.getNomeCarro());
	    System.out.println("Pilotando ele é o: "+ this.getNomePiloto());
	    System.out.println("Modelo: "+ this.getNomeCarro());
	    System.out.println("Motor: "+this.getMotor());
	    System.out.println("Ano"+ this.getAno());
	    
	  }
	  
	  void ganharRace (){
		System.out.println("O carro que ganhou a corrida foi: "+getNomeCarro());
	  }
	  
	  void perderRace (){
		  System.out.println("O carro que perdeu a corrida foi: "+getNomeCarro());
	  }
	  
	  void empatarRace(Carro car1, Carro car2){
		  System.out.println("Os carros "+car1.getNomeCarro()+" e "+car2.getNomeCarro()+" empataram!");
	  }
	
}
