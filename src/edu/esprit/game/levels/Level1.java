package edu.esprit.game.levels;

import edu.esprit.game.models.Employee;
import edu.esprit.game.utils.Data;

import java.util.Comparator;
import java.util.List;

public class Level1 {
	public static void main(String[] args) {
		List<Employee> employees = Data.employees();

		/* TO DO 1: Afficher tous les employ�s */
		employees.stream().forEach(item -> System.out.println(item));

		/*
		 * TO DO 2: Afficher les employ�s dont le nom commence par la lettre n
		 */
		employees.stream().filter(item -> item.getName().startsWith("n")).forEach(item -> System.out.println(item));

		/*
		 * TO DO 3: Afficher les employ�s dont le nom commence par la lettre n
		 * et le salaire> 1000
		 */
		employees.stream().filter(item->item.getName().startsWith("n")).filter(item->item.getSalary() > 1000)
				.forEach(item-> System.out.println(item));

		/*
		 * TO DO 4: Afficher les employ�s dont le nom commence par la lettre s
		 * tri�s par salaire
		 */
		employees.stream().filter(item->item.getName().startsWith("s")).sorted((o1,o2)->o1.getSalary()-o2.getSalary())
				.forEach(item-> System.out.println(item));

		/*
		 * TO DO 5: Afficher les noms des employ�s dont le salaire > 600 avec 2
		 * mani�res diff�rentes
		 */
		/* First Way */
		employees.stream().filter(item->item.getSalary()>600).forEach(item-> System.out.println(item.getName()));
		/* Second Way */
		employees.stream().filter(item->item.getSalary()>600).map(item->item.getName())
				.forEach(item-> System.out.println(item));

		/*
		 * TO DO 6: Ajouter 200 D pour les employ�s dont le nom commence avec m
		 * et les affich�s ensuite
		 */
		employees.stream().filter(item->item.getName().startsWith("m")).forEach(
				item-> {
					item.setSalary(item.getSalary()+200);
					System.out.println(item);
				}
		);
	}
}
