package university;

import enums.Academic_degree;

public class Teachers {
    Academic_degree academic_degree;
    String name_specialty;

    public Teachers() {

    }

    public Teachers(Academic_degree academic_degree, String name_specialty) {
        this.academic_degree = academic_degree;
        this.name_specialty = name_specialty;
    }
}
