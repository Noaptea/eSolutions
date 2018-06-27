package p10template;


public class AlexRequest extends LeaveRequest {
    @Override
    public String getName() {
        return "Alex Proca";
    }

    @Override
    public String getInterval() {
        return "niciodata";
    }

    @Override
    public String getAbsenceType() {
        return "nu imi place";
    }
}
