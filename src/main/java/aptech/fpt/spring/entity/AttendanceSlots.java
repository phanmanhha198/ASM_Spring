package aptech.fpt.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class AttendanceSlots {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int attendanceslotsId;
    private int classId;
    private int timeslotId;


    public AttendanceSlots(int classId, int timeslotId) {
        this.classId = classId;
        this.timeslotId = timeslotId;
    }

    public int getAttendanceslotsId() {
        return attendanceslotsId;
    }

    public void setAttendanceslotsId(int attendanceslotsId) {
        this.attendanceslotsId = attendanceslotsId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getTimeslotId() {
        return timeslotId;
    }

    public void setTimeslotId(int timeslotId) {
        this.timeslotId = timeslotId;
    }
}
