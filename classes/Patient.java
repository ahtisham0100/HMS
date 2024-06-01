package Project.classes;

import java.lang.reflect.ParameterizedType;

public class Patient {
    private String name ;
    private int age;
    private  boolean bedstatus ;
    private String appointmentdate;
    private  String DocReffered;

    Patient(String name, int age ,boolean bedstatus, String appointmentdate, String docReffered){
        this.age=age;
        this.name= name;
        this.bedstatus=bedstatus;
        this.appointmentdate=appointmentdate;
        this.DocReffered= docReffered;

    }

    //crating getter and setter for creating a patient;


    public boolean isBedstatus() {
        return bedstatus;
    }

    public void setBedstatus(boolean bedstatus) {
        this.bedstatus = bedstatus;
    }

    public String getDocReffered() {
        return DocReffered;
    }

    public void setDocReffered(String docReffered) {
        DocReffered = docReffered;
    }

    public String getAppointmentdate() {
        return appointmentdate;
    }

    public void setAppointmentdate(String appointmentdate) {
        this.appointmentdate = appointmentdate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
