package classes;

public class Subject {

    private final String code, name;
    private final int id, hoursInWeek,maxAttendance;

    public Subject(int id, String code, String name, int hoursPerDay,int maxAttendance) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.hoursInWeek = hoursPerDay;
        this.maxAttendance=maxAttendance;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getHoursInWeek() {
        return hoursInWeek;
    }

    public int getMaxAttendance() {
        return maxAttendance;
    }
    
    
}
