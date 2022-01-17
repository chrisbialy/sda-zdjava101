package pl.sdacademy.java.adv.school.domain.grade;

import pl.sdacademy.java.adv.school.domain.student.model.Student;

import java.util.List;

public class GradeListRepository implements GradeRepository {
    private final List<Grade> grades;

    public GradeListRepository(List<Grade> grades) {
        this.grades = grades;
    }

    @Override
    public List<Grade> finAllGrades() {

        return grades;
    }
}
