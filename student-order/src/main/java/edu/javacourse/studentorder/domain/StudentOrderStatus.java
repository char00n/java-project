package edu.javacourse.studentorder.domain;

public enum StudentOrderStatus {
    START,
    CHECKED;

    public static StudentOrderStatus fromValue(int value) {
        for (StudentOrderStatus sos: StudentOrderStatus.values()) {
            return sos;
        }
        throw new RuntimeException("Unknown value:" + value);
    }
}
