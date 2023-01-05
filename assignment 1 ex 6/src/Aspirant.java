public class Aspirant extends Student{
    boolean specificWork = true;

    Aspirant(){}

    Aspirant(String firstName, String lastName, String group, double averageMark, boolean specificWork){
        super(firstName, lastName, group, averageMark);
        this.specificWork = specificWork;
    }

    @Override
    public String getScholarship() {
        if(averageMark == 5) {
            return "$200";
        } else {
            return "$180";
        }
    }
    
    public boolean isSpecificWork() {
        return specificWork;
    }

    public void setSpecificWork(boolean specificWork) {
        this.specificWork = specificWork;
    }
}
