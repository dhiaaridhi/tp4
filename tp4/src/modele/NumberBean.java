package modele;

import java.util.Scanner;

public class NumberBean {
 private String nbr ;

public NumberBean() {
	
}

public NumberBean(String nombre) {
	super();
	this.nbr = nombre;
}

public String getNombre() {
	return nbr;
}

public void setNombre(String nbr) {
	this.nbr = nbr;
}

public double calculer(String nbr ) {
	Scanner clavier = new Scanner (System.in);
	  String x = clavier.nextLine();
	return Math.random();
}

}
