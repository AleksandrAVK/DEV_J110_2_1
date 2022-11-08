package university;


import enums.Academic_degree;
import enums.Gender;
import enums.I_am;
import enums.Stage_training;

public class University_people extends Person {
    Students_graduate students_graduate;
    Students_master_bachelor students_master_bachelor;
    Teachers teachers;

//    public University_people(Students_graduate students_graduate, Students_master_bachelor students_master_bachelor, Teachers teachers) {
//        this.students_graduate = students_graduate;
//        this.students_master_bachelor = students_master_bachelor;
//        this.teachers = teachers;
//    }

    public University_people(String person_name, String person_surname, Gender gender, String name_faculty, I_am i_am, Teachers teachers) {
        super(person_name, person_surname, name_faculty, gender, i_am);
        this.teachers = teachers;

    }

    public University_people(String person_name, String person_surname, Gender gender, String name_faculty, I_am i_am, Students_graduate students_graduate) {
        super(person_name, person_surname, name_faculty, gender, i_am);

        this.students_graduate = students_graduate;
    }

    public University_people(String person_name, String person_surname, Gender gender, String name_faculty, I_am i_am, Students_master_bachelor students_master_bachelor) {
        super(person_name, person_surname, name_faculty, gender, i_am);
        this.students_master_bachelor = students_master_bachelor;

    }

    public University_people() {

    }


    public String print(University_people person) {
        String gender_person = person.gender == person.gender.MAN ? "He" : "She";
        String gender_students_graduate = person.gender == person.gender.MAN ? "His" : "Her";
        String who_are_you = person.i_am == person.i_am.Teacher ? "teaches" : "studies";
        String students_graduate_phrase = "";
        String master_bachelor_phrase = "";
        String teachers_phrase = "";
        String main_phrase = "This is " +
                person.person_name + " "+
                person.person_surname + "." +
                " " + gender_person + " " +
                who_are_you +
                ", at " + person.name_faculty + "; " ;
        if (person.teachers != null) {
             teachers_phrase = gender_person + " has " + person.teachers.academic_degree + " in " +
                    person.teachers.name_specialty + ".";
        }
        if (person.students_master_bachelor != null) {
             master_bachelor_phrase = gender_person + " is " + person.students_master_bachelor.course_number + " ‘th year "
                    + person.students_master_bachelor.stage_training + " student.";
        }
        if (person.students_graduate != null) {
             students_graduate_phrase = gender_students_graduate + " thesis title is " + person.students_graduate.dissertation_topic + ".";
        }
        if (person.i_am == person.i_am.Teacher) {
            return main_phrase + "\n" + teachers_phrase;
        } else if (person.i_am == person.i_am.Students_master_bachelor) {
            return main_phrase + "\n"  + master_bachelor_phrase;
        } else if (person.i_am == person.i_am.Students_graduate) {
            return main_phrase + "\n" + students_graduate_phrase;
        } else return main_phrase;
    }

    public void printAll(University_people[] university_people) {
        for (int i = 0; i < university_people.length - 1; i++) {
            System.out.println(print(university_people[i]));
        }
    }


//
//    public class Students_graduate {
//        String dissertation_topic;
//
//        public Students_graduate() {
//        }
//
//        public Students_graduate(String dissertation_topic) {
//            this.dissertation_topic = dissertation_topic;
//        }
//
//
//    }


//    public class Students_master_bachelor {
//        Stage_training stage_training;
//        String course_number;
//
//        public Students_master_bachelor() {
//
//        }
//
//
//        public Students_master_bachelor(Stage_training stage_training, String course_number) {
//            this.stage_training = stage_training;
//            this.course_number = course_number;
//        }
//
//
//    }

//    public class Teachers {
//        Academic_degree academic_degree;
//        String name_specialty;
//
//        public Teachers() {
//
//        }
//
//        public Teachers(Academic_degree academic_degree, String name_specialty) {
//            this.academic_degree = academic_degree;
//            this.name_specialty = name_specialty;
//        }
//    }

}
