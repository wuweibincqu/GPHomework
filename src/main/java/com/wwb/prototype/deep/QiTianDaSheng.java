package com.wwb.prototype.deep;

import java.io.*;
import java.util.Date;

/**
 * @Description TODO
 * @Package: com.wwb.prototype.deep
 * @ClassName QiTianDaSheng
 * @author: wuwb
 * @date: 2019/8/14 15:42
 */
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {

	public JinGuBang jinGuBang;

	public QiTianDaSheng() {
		this.birthday = new Date();
		this.jinGuBang = new JinGuBang();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return this.deepClone();
	}

	/**
	 * 深克隆
	 * @return
	 */
	private Object deepClone() {
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
			QiTianDaSheng copy = (QiTianDaSheng) ois.readObject();
			copy.birthday = new Date();
			return copy;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "QiTianDaSheng{" +
				"jinGuBang=" + jinGuBang +
				", height=" + height +
				", weight=" + weight +
				", birthday=" + birthday +
				"} " + super.toString();
	}

	/**
	 * 浅克隆
	 * @return
	 * @throws CloneNotSupportedException
	 */
	public Object shallowClone() throws CloneNotSupportedException {
		return super.clone();
	}
}
