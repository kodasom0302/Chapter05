package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhoneBookApp {
	
	public static void main(String[] args) throws IOException {
		
		//reader 준비
			//리더 + 버퍼 => 빨대 (PhoneDB.txt, UTF-8)
		Reader fr=new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br=new BufferedReader(fr);
		
		//반복
		while (true) {
			
			//파일을 한 줄씩 읽는다
			String str=br.readLine();
			
			//null이면(=글자가 없으면) 반복 종료
			if (str==null) {
				break;
			}
			
			//','로 문장을 나눈다
			String[] personInfo=str.split(",");
			
			//name, hp, company로 구분
			String name=personInfo[0];
			String hp=personInfo[1];
			String company=personInfo[2];
		
			//출력
			System.out.println("이름: "+name);
			System.out.println("핸드폰: "+hp);
			System.out.println("회사: "+company);
			System.out.println("");
		}
		
		//종료
		br.close();

	}

}
