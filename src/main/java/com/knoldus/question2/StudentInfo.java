package com.knoldus.question2;

public class StudentInfo {
    /**
     * Retrieves the stream name of the given student.
     *
     * @param student the student object
     * @return the stream name of the student
     */
    public String StreamName(Student student){
        return student.getStream();
    }
}
