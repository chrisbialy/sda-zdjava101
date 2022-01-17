package pl.sdacademy.java.adv.school.domain.grade;

import java.util.List;
import java.util.stream.Collectors;

public class GradeService {
    private final GradeRepository gradeRepository;

    public GradeService(GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }

    public long countMathGrades() {
        long allGrades = gradeRepository.finAllGrades().stream()
                .filter(grade -> grade.getSchoolSubjectCode().equals("MAT"))
                .count();
        return allGrades;
    }
}
