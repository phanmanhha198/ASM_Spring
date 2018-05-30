package aptech.fpt.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class AttendanceDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int attendancedetailsId;
    private int slotId;
    private int studentId;
    private int time;
    private String status;

    public int getAttendancedetailsId() {
        return attendancedetailsId;
    }

    public void setAttendancedetailsId(int attendancedetailsId) {
        this.attendancedetailsId = attendancedetailsId;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
