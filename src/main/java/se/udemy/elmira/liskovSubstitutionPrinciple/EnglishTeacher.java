package se.udemy.elmira.liskovSubstitutionPrinciple;

public class EnglishTeacher extends SchoolStaff implements CourseInstructor{
    @Override
    public void teach() {
        System.out.println("Taught English...");
    }
}
