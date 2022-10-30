package university;

import enums.Academic_degree;
import enums.Gender;
import enums.I_am;
import enums.Stage_training;

public class Person {
    String person_name;
    String person_surname;
    String name_faculty;
    Gender gender;
    I_am i_am;

    public Person() {
    }

    public Person(String person_name, String person_surname, String name_faculty, Gender gender, I_am i_am) {
        this.person_name = person_name;
        this.person_surname = person_surname;
        this.name_faculty = name_faculty;
        this.gender = gender;
        this.i_am = i_am;
    }


}



