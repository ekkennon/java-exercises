package org.launchcode.java.prepwork.school;

/**
 * Created by raefo on 24-May-17.
 */
public class GraduateStudent extends Student {
    public GraduateStudent(String name) {
        super(name);
    }

    public String getGradeLevel() {
        if (getNumCredits() < 150) {
            return "Master's";
        } else {
            return "PhD";
        }
    }
}
