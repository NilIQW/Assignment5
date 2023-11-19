import java.util.*;

public class Student extends Person{
    private String education;
    private List<GradeInfo> gradeReport = new ArrayList<>();

    public String getEducation(){
        return education;
    }
    public double getAverageGrade(){
        double sum = 0;
        for(GradeInfo gi : gradeReport){
            sum += gi.getGrade();
        }
        return sum/gradeReport.size();
    }

    public int getGrade(String subject){
        for(GradeInfo gi : gradeReport){
            if(gi.getSubject().equals(subject))
                return gi.getGrade();
        }
        return -4;
    }
    public void addGrade(GradeInfo grade){
        gradeReport.add(grade);
    }
    public Student(int ID, String name, String education) {
        super(ID, name);
        this.education = education;
    }
    public List<GradeInfo> getGradeReport(){
        return gradeReport;
    }

    @Override
    public String toString() {
        return super.toString() + "      " + getEducation() + "       " + getAverageGrade();
    }
}
