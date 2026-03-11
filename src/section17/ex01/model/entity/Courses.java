package section17.ex01.model.entity;

public enum Courses {
    A,
    B,
    C

    // Pensei em atribuir id's para cada constante, mas é desnecessário nesse caso
    // já que as constantes já estão em ordem, basta usar Course.values()[índice]


    /*
    private final int id;

    Courses(int id) {
        this.id = id;
    }

    public static Courses whithId(int id) {
        for (Courses course: values()) {
            if (course.id == id) return course;
        }
        return A;
    }
    */


}
