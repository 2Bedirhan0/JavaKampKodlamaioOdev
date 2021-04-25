
public class Main {

	public static void main(String[] args) {
		
		// Kurslar�n G�z�kece�i K�s�m
		Course course1 = new Course(1, "C# E�itimi", "2 Ay S�recek Olan Muazzam Bir Kurs.", "Engin Demiro�", 10);
		Course course2 = new Course(2, "Python E�itimi", "D�nyan�n En �yi E�itimi Olacak.", "Bedirhan G�rler", 15);
		Course course3 = new Course(3, "Java E�itimi", "React �le �yi Gider.", "Engin Demiro�", 20);
		Course course4 = new Course(4, "C++ E�itimi", "Syntax'�n� Bilirsen Hepsi Ayn�.", "Engin Demiro�", 0);
		
		Course[] courses = {course1,course2,course3,course4};
		for (Course course : courses) {
			System.out.println("Kurs Ad�: " + course.courseName + "\n" + 
							   "Kurs A��klamas�: " + course.description + "\n" + 
							   "Kursun E�itmeni: " + course.instructorName + "\n" +
							   "Kursun �creti: " + course.unitPrice + " TL" + "\n"
							);	
					
		}
		
		System.out.println("********************************************************************************");
		
		// E�itmenlerin G�z�kece�i K�s�m
		Instructor instructor1 = new Instructor(1, "Bedirhan G�rler");
		Instructor instructor2 = new Instructor(2, "Engin Demio�");
		
		Instructor[] instructors = {instructor1,instructor2};
		System.out.println("E�itmenler:" + "\n" + "----------------------");
		for (Instructor instructor : instructors) {
			
			System.out.println(instructor.fullName + "\n");
			
		}
		
		// E�itmen Ekleme Ve Silme Metotlar�
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.instructorAdd(instructor1);
		instructorManager.instructorDelete(instructor2);

	}

}
