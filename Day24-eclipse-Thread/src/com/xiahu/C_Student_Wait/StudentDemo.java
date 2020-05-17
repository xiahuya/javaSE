package com.xiahu.C_Student_Wait;

/*
 * ������
 * 		��Դ�ࣺStudent	
 * 		����ѧ������:SetThread(������)
 * 		��ȡѧ�����ݣ�GetThread(������)
 * 		������:StudentDemo
 * 
 * ����1������˼·д���룬��������ÿ�ζ���:null---0
 * ԭ��������ÿ���߳��ж��������µ���Դ,������Ҫ���ʱ�����úͻ�ȡ�̵߳���ԴӦ����ͬһ��
 * ���ʵ����?
 * 		������������ݴ���������ͨ�����췽�����ݸ��������ࡣ
 * 
 * ����2��Ϊ�����ݵ�Ч����һЩ���Ҽ�����ѭ�����жϣ�������ͬ��ֵ,���ʱ��������µ�����
 * 		A:ͬһ�����ݳ��ֶ��
 * 		B:���������䲻ƥ��
 * ԭ��
 * 		A:ͬһ�����ݳ��ֶ��
 * 			CPU��һ���ʱ��Ƭ��ִ��Ȩ�����㹻��ִ�кܶ�Ρ�
 * 		B:���������䲻ƥ��
 * 			�߳����е������
 * �̰߳�ȫ���⣺
 * 		A:�Ƿ��Ƕ��̻߳���		��
 * 		B:�Ƿ��й�������		��
 * 		C:�Ƿ��ж�����������������	��
 * ���������
 * 		������
 * 		ע�⣺
 * 			A:��ͬ������̶߳�Ҫ������
 * 			B:��ͬ������̼߳ӵ���������ͬһ�ѡ�
 * 
 * 
 * ����3:��Ȼ���ݰ�ȫ�ˣ������أ�һ��һ��Ƭ���ÿ����Ҿ������ε�һ��һ�������
 * ���ʵ����?
 * 		ͨ��Java�ṩ�ĵȴ����ѻ��ƽ����
 * 
 * �ȴ����ѣ�
 * 		Object�����ṩ������������
 * 			wait():�ȴ�
 * 			notify():���ѵ����߳�
 * 			notifyAll():���������߳�
 * 		Ϊʲô��Щ������������Thread������?
 * 			��Щ�����ĵ��ñ���ͨ����������ã������Ǹղ�ʹ�õ�������������������
 * 			���ԣ���Щ�������붨����Object���С�
 * 
 */
public class StudentDemo {
	public static void main(String[] args) {
		// ������Դ����
		Student s = new Student();

		//
		SetStudent set = new SetStudent(s);
		GetStudent get = new GetStudent(s);

		// �����̶߳���
		Thread th2 = new Thread(get);
		Thread th1 = new Thread(set);

		// �����߳�
		th1.start();
		th2.start();

	}

}