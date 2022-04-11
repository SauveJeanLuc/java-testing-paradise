package com.testing.paradise.ArrayAsList;

import java.util.Arrays;
import java.util.List;

enum EShortCourseStatus{
    DIE, YOUNG, OLD
}

class ShortCourse{
    private EShortCourseStatus status;

    public EShortCourseStatus getStatus() {
        return status;
    }

    public void setStatus(EShortCourseStatus status) {
        this.status = status;
    }
}
public class TryArray {
    public static void mustHaveStatuses(ShortCourse course, EShortCourseStatus... statuses) {
//        List listOfStatuses = Arrays.asList(statuses);
//        listOfStatuses.contains(course.getStatus());
        if (!Arrays.asList(statuses).contains(course.getStatus())) {
//            throw new IllegalStateException("Course status is not in the correct state");
            System.out.println("Course status is not in the correct state");
        }else {
            System.out.println("Ok It runs");
        }
    }

    public static void main(String[] args) {
        ShortCourse course = new ShortCourse();
        course.setStatus(EShortCourseStatus.YOUNG);

        mustHaveStatuses(course, EShortCourseStatus.DIE, EShortCourseStatus.OLD);
    }
}
