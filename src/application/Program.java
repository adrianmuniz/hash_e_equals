package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("maria@gmail.com", "Maria");
		Client c2 = new Client("alex@gmail.com", "Maria");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
	}

}
