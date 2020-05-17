package com.xiahu.Buffered_Copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ���󣺰ѵ�ǰ��ĿĿ¼�µ�a.txt���ݸ��Ƶ���ǰ��ĿĿ¼�µ�b.txt��
 * ����Դ��a.txt
 * Ŀ�ĵ�:b.txt
 */
public class Buffered_Copy_Test1 {
	public static void main(String[] args) throws IOException {
		// ��װ����Դ
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		// ��װĿ�ĵ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

		// ��������
		// ��������
		// int ch = 0;
		// while ((ch = br.read()) != -1) {
		// bw.write((char) ch);
		// }

		// ���鸴��
		char[] chs = new char[1024];
		int len = 0;
		while ((len = br.read(chs)) != -1) {
			bw.write(chs, 0, len);
		}
		bw.flush();

		bw.close();
	}

}