package com.xiaxia.JDK_NewS_Enum;

public class DirectionDemo {
	public static void main(String[] args) {
		Direction d = Direction.FRONT;
		System.out.println(d);
		System.out.println("-----------");

		Direction2 d2 = Direction2.FRONT;
		System.out.println(d2);
		System.out.println(d2.getName());
		System.out.println("-----------");

		Direction3 d3 = Direction3.FRONT;
		System.out.println(d3);
		System.out.println(d3.getName());
		d3.show();
		System.out.println("-----------");

		Direction3 dd = Direction3.FRONT;
		switch (dd) {
		case FRONT:
			System.out.println("你选择了前");
			break;
		case BEHING:
			System.out.println("你选择了后");
			break;
		case LEFT:
			System.out.println("你选择了左");
			break;
		case RIGHT:
			System.out.println("你选择了右");
			break;

		}

	}

}
