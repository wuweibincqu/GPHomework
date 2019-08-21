package com.wwb.pattern.template.course;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.template.course
 * @ClassName NetworkCourseTest
 * @author: wuwb
 * @date: 2019/8/20 17:33
 */
public class NetworkCourseTest {
	public static void main(String[] args) {
		System.out.println("---Java 架构师课程---");
		NetworkCourse javaCourse = new JavaCourse();
		javaCourse.createCourse();
		System.out.println("---大数据课程---");
		NetworkCourse bigDataCourse = new BigDataCourse(true);
		bigDataCourse.createCourse();
	}
}
