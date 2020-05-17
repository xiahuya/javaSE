package com.xiahu.IO_Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  ����2:��c���µ�a.txt�����ݸ��Ƶ�d���µ�b.txt��
 */
public class IO_Test2 {
	public static void main(String[] args) throws IOException {
		// ��װ����Դ
		FileInputStream fis = new FileInputStream("c:\\a.txt");
		// ��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream("d:\\b.txt");

		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				"c:\\a.txt"));

		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("d:\\b.txt"));

		
		// �����ֽ���һ�ζ�дһ���ֽڣ�
		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		// �����ֽ���һ�ζ�дһ���ֽ�����
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}

		// ��Ч�ֽ���һ�ζ�дһ���ֽ�
		int by2 = 0;
		while ((by2 = bis.read()) != -1) {
			fos.write(by2);
		}

		// ��Ч�ֽ���һ�ζ�дһ���ֽ�����
		byte[] bys2 = new byte[1024];
		int len2 = 0;
		while ((len2 = bis.read()) != -1) {
			bos.write(bys2, 0, len2);
		}

		// �ͷ���Դ
		fis.close();
		fos.close();
		bos.close();
		bis.close();
	}

}