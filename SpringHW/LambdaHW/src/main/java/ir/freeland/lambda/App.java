package ir.freeland.lambda;

import ir.freeland.lambda.model.AddToList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

	@Autowired
	private AddToList addToList;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("-----------------------");
		addToList.printStudent(addToList.sortStudents());

		System.out.println("-----------------------");
		addToList.printStudent(addToList.reverseSortStudents());
		System.out.println("-----------------------");

		addToList.groupStudentsByGradeUpper10();
		System.out.println("-----------------------");

		addToList.groupStudentsByAge();
		System.out.println("-----------------------");

		addToList.averageGrade();
		System.out.println("-----------------------");

		addToList.averageGradeAbove18yearsOld();
	}
}
