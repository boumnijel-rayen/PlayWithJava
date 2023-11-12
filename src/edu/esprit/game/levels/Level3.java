package edu.esprit.game.levels;

import edu.esprit.game.models.Employee;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import edu.esprit.game.utils.Data;

public class Level3 {
	public static void main(String[] args) {
	List<Employee> employees = Data.employees();
		

	/* TO DO 1: Retourner une chaine de caract�re qui contient tous les noms des employ�s */	
	String names = employees.stream().map(item->item.getName()).reduce("",(a,b)->a+" "+b);
		System.out.println(names);
						
	/* TO DO 2: Retourner une chaine de caract�re qui contient tous les noms des employ�s en majuscule separ�s par # */	
	String namesMajSplit = employees.stream().map(item->item.getName().toUpperCase()).reduce("",(a,b)->a+"#"+b);
		System.out.println(namesMajSplit);

	/* TO DO 3: Retourner une set d'employ�s*/
	Set<Employee> emps = employees.stream().collect(Collectors.toSet());

	/* TO DO 4: Retourner une TreeSet d'employ�s (tri par nom) */
	TreeSet<Employee> emps2 = employees.stream().collect(Collectors.toCollection(TreeSet::new));

	/* TO DO 5: Retourner une Map qui regroupe les employ�s par salaire */
	Map<Integer, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getSalary));
			
	/* TO DO 6: Retourner une Map qui regroupe les nom des employ�s par salaire */
	Map<Integer, String> mm = employees.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.mapping(Employee::getName, Collectors.joining(","))));

	/* TO DO 7: Retourner le  min, max,average, sum,count des salaires */
	String s = employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).toString();
		System.out.println(s);
				

	}
}
