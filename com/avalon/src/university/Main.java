package university;

import enums.Academic_degree;
import enums.Gender;
import enums.I_am;
import enums.Stage_training;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        University_people universityPeople  = new University_people();

        Teachers teachers_Turner = new Teachers(Academic_degree.PhD, "Programming paradigms");
        Teachers teachers_Hollings = new Teachers(Academic_degree.Candidate_Sciences, "Domestic arbitration");

        Students_master_bachelor Students_master_bachelor_Wilkinson = new Students_master_bachelor(Stage_training.Bachelor, "III");
        Students_master_bachelor Students_master_bachelor_Cunningham = new Students_master_bachelor(Stage_training.Bachelor, "I");
        Students_master_bachelor Students_master_bachelor_Lundqvist = new Students_master_bachelor(Stage_training.Master, "I");

        Students_graduate student_graduate_Correa = new Students_graduate("Design of a functional programming language.");


        University_people[] university_peopleArray = {
                new University_people("Ronald", "Turner", Gender.MAN, "Computer science", I_am.Teacher,
                        teachers_Turner),
                new University_people("Ruth", "Hollings", Gender.MAN, "Jurisprudence", I_am.Teacher,
                        teachers_Hollings),
                new University_people("Anna", "Wilkinson", Gender.WOMAN, "World economy", I_am.Students_master_bachelor,
                        Students_master_bachelor_Wilkinson),
                new University_people("Ruth", "Cunningham", Gender.MAN, "Jurisprudence", I_am.Students_master_bachelor,
                        Students_master_bachelor_Cunningham),
                new University_people("Jill", "Lundqvist", Gender.WOMAN, "Jurisprudence", I_am.Students_master_bachelor,
                        Students_master_bachelor_Lundqvist),
                new University_people("Ronald", "Correa", Gender.MAN, "Computer science", I_am.Students_graduate,
                        student_graduate_Correa),
        };


        universityPeople.printAll(university_peopleArray);
    }


//    public void printAll(University_people[] university_people) {
//        for (int i = 0; i < university_people.length - 1; i++) {
//            System.out.println(universityPeople.print(university_people[i]));
//        }
//    }
}
