package entities;

public class Sumario {
		 public String name;
		 public Double not1;
		 public Double not2;
		 public Double not3;
		 
		 public double notfinal() {
			return not1 + not2 + not3;
		}
		 
		 public double falta() {
			 return notfinal() - 60;
		 }
}

	
