//71. School კლასი(2018 წლის გამოცდის ამოცანა).
//თქვენი მიზანია დაწეროთ School კლასი, რომლის საშუალებითაც შევძლებთ
//უნივერსიტეტის მართვას. კლასს უნდა ჰქონდეს კონსტრუქტორი და 5 public მეთოდი.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class School {

	//	
	private HashMap<String, ArrayList<String>> teachers = new HashMap<String, ArrayList<String>>();
	private HashMap<String, ArrayList<String>> pupilsOnSubjects = new HashMap<String, ArrayList<String>>();
	private ArrayList<String> pupils = new ArrayList<String>();
//	კონსტრუქტორს არაფერი არ გადაეცემა. აქ შეგიძლიათ ინიციალიზაცია გაუკეთოთ
//	თქვენთვის საჭირო ცვლადებს.
	public School() {
		 
	}
	
//	addTeacher მეთოდის საშუალებით შეგიძლიათ სკოლას დაამატოთ ახალი
//	მასწავლებელი. მეთოდს გადაეცემა მასწავლებლის სახელი. შეგიძლიათ ჩათვალოთ,
//	რომ მასწავლებლის სახელი უნიკალურია.
	public void addTeacher(String teacher) {
		// TIP:	you can use System.out.println() to print your structures for testing 
		if(teachers.containsKey(teacher)){
			System.out.println(teacher + "already added");
			return;
		}
		teachers.put(teacher, null);
	}
	
//	addSubject მეთოდის საშუალებით შეგიძლიათ მასწავლებელს დაუმატოთ საგანი.
//	მეთოდს გადაეცემა მასწავლებლის სახელი და საგნის სახელი. ჩათვალეთ, რომ საგნის
//	სახელი უნიკალურია. ერთი და იგივე მასწავლებელი შეიძლება რამდენიმე საგანს
//	კითხულობდეს, ასევე ერთსა და იმავე საგანს შეიძლება რამდენიმე მასწავლებელი
//	კითხულობდეს ერთდროულად.
//	თუკი teacher სახელის მქონე მასწავლებელი არ არის აქამდე დამატებული, მაშინ
//	მეთოდმა არაფერი არ უნდა გააკეთოს.
	public void addSubject(String teacher, String subject) {
        if (!teachers.containsKey(teacher)) {
            System.out.println(teacher + " nonexistent");
            return;
        }

        ArrayList<String> subjects = teachers.get(teacher);
        if (subjects.contains(subject)) {
            System.out.println(subject + " already in list");
        } else {
            subjects.add(subject);
        }
    }

	
//	addPupil მეთოდის საშუალებით შეგიძლიათ საგანზე დაამატოთ მოსწავლე. ერთი და
//	იგივე მოსწავლე შეიძლება ერთ ან რამდენიმე საგანს სწავლობდეს.
	public void addPupil(String pupil, String subject) {
		// TIP:	you can use System.out.println() to print your structures for testing
		ArrayList<String> newPupil = new ArrayList<String>();
		if(pupilsOnSubjects.containsKey(subject)){
			System.out.println(pupil + "already in list");
		} 
		else{
			pupils.add(pupil);
			newPupil.add(pupil);
			pupilsOnSubjects.put(subject, newPupil);
			
		}
	}
	
//	getTeachers მეთოდს გადაეცემა მოსწავლის სახელი და მან უნდა დააბრუნოს ამ
//	მოსწავლის ყველა მასწავლებელზე იტერატორი. ანუ მხოლოდ იმ მასწავლებლების
//	სახელები, რომლებიც ასწავლიან იმ საგნებს, რომლებზეც მოსწავლეა
//	დამატებული(სწავლობს). თუკი pupil სახელის მოსწავლე არ გვყავს მაშინ მეთოდმა
//	უნდა დააბრუნოს null.
	public Iterator<String> getTeachers(String pupil){
		ArrayList<String> pupilsTeachers = new ArrayList<String>();
		ArrayList<String> pupilsSubjects = new ArrayList<String>();
		boolean pupilNonexistent = true;
		for(String pup : pupils){
			if(pup.equals(pupil)){
				pupilNonexistent = false;
			}
		}
		if(pupilNonexistent){
			System.out.println(pupil + "nonexistent");
		} else{
			for (Entry<String, ArrayList<String>> entry : pupilsOnSubjects.entrySet()) {
				if (entry.getValue().contains(pupil)) {
	                String subject = entry.getKey();
	                pupilsSubjects.add(subject);
		}
			}
			
	}
		for(String sub : pupilsSubjects){
			for (Entry<String, ArrayList<String>> entry : teachers.entrySet()){
				if(entry.getValue().contains(sub)){
					String pupilsTeacher = entry.getKey();
					pupilsTeachers.add(pupilsTeacher);
				}
			}
		}
		return pupilsTeachers.iterator();
	}


	//	getPupils მეთოდს გადაეცემა მასწავლებლის სახელი და მან უნდა დააბრუნოს ამ
//	მასწავლებლის ყველა სტუდენტზე იტერატორი. ანუ მხოლოდ იმ სტუდენტების
//	სახელები, რომლებიც მის რომელიმე საგანს სწავლობენ. თუკი teacher სახელის მქონე
//	ლექტორი არ გვყავს მაშინ მეთოდმა უნდა დააბრუნოს null.
	public Iterator<String> getPupils(String teacher){
		return null;
	}
	
//	მეთოდმა უნდა წაშალოს მასწავლებლის შესახებ ყველა ინფორმაცია. ამ მეთოდის
//	გამოძახების, შემდეგ getTeachers მეთოდმა არ უნდა დააბრუნოს teacher სახელი არც
//	ერთი სტუდენტისთვის.
	public void removeTeacher(String teacher) {
		// TIP:	you can use System.out.println() to print your structures for testing
	}
	
}