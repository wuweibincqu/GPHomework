package com.wwb.pattern.template.course;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.template.course
 * @ClassName BigDataCourse
 * @author: wuwb
 * @date: 2019/8/20 17:32
 */
public class BigDataCourse extends NetworkCourse {
	private boolean needHomeworkFlag = false;
	public BigDataCourse(boolean needHomeworkFlag) {
		this.needHomeworkFlag = needHomeworkFlag;
	}
	void checkHomework() {
		System.out.println("检查大数据的课后作业");
	}
	@Override
	protected boolean needHomework() {
		return this.needHomeworkFlag;
	}
}
