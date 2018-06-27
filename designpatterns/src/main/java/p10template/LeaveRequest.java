package p10template;

public abstract class LeaveRequest {

    public abstract String getName();

    public abstract  String getInterval();

    public abstract String getAbsenceType();

    public String getLeaveRequest(){
        return String.format("Domnule Director, \n" +
                "Subsemnatul %s in calitate de angajat\n" +
                "doresc sa nu mai lucrez in intervalul:\n" + "%s \n" +
                "Vreau liber pentru ca: %s \n", getName(), getInterval(), getAbsenceType());
    }

    @Override
    public String toString() {
        return getLeaveRequest();
    }
}
