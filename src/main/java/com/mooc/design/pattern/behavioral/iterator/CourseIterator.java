package com.mooc.design.pattern.behavioral.iterator;

/**
 * Created by geely.
 */
public interface CourseIterator {
    Course nextCourse();
    boolean isLastCourse();

}
