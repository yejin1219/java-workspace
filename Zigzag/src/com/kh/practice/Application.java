package com.kh.practice;

import java.util.Scanner;

import com.kh.practice.controller.MusicController;
import com.kh.practice.model.Music;



public class Application {

	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	public static void main(String[] args) {

		Application app = new Application();
		app.mainMenu();
	}
	
	
	public void mainMenu() {
		
		boolean result = true;
		while(true) {
			System.out.println("==== 메인 메뉴 ====");
			System.out.println("1. 마지막 위치에 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			
			
			switch(Integer.parseInt(sc.nextLine())){
			case 1 :
				addList();
				break;
			case 2 :
				addAtZero();
			    break;
			case 3 :
				printAll();
				break;
			case 4 :
				searchMusic();
				break;
			case 5 :
				removeMusic();
				break;
			case 6 :
				setMusic();
				break;
			case 7 :
				ascTitle();
				break;
			case 8 :
				descArtist();
				break;
			case 9 :
				System.out.println("종료");
				result = false;
				break;
				
			}
			
		}
		
}
   
	
	
	public void addList() {
		
		System.out.println("***** 마지막 위치에 곡 추가 *****");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String artist = sc.nextLine();
		
		
		

		if(mc.addList(new Music(title,artist))) {
			System.out.println("추가 성공");
		} else System.out.println("추가 실패");
	}
	
	public void addAtZero() {
		System.out.println("***** 첫 위치에 곡 추가 *****");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String artist = sc.nextLine();
		
		
		

		if(mc.addAtZero(new Music(title,artist))) {
			System.out.println("추가 성공");
		} else System.out.println("추가 실패");
		
	}
	
	public void printAll() {
		System.out.println("***** 전체 곡 목록 출력 *****");
		
		for(Music m : mc.printAll()) {
			System.out.println(m);
		}
		
	}
	
	public void searchMusic() {
		System.out.println("***** 특정 곡 검색 *****");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		if(mc.searchMusic(title)== null) {
			System.out.println("검색한 곡이 없습니다.");
		}else {
			
			System.out.println(mc.searchMusic(title).getArtist() + "-" + mc.searchMusic(title).getTitle() + "을 검색했습니다.");
		}
	}
	
	public void removeMusic() {
		System.out.println("***** 특정 곡 삭제 *****");
		System.out.print("삭제할 곡 명 : ");
		String title = sc.nextLine();
		
		if(mc.searchMusic(title)== null) {
			System.out.println("삭제할 곡이 없습니다.");
		}else {
			
			System.out.println(mc.searchMusic(title).getArtist() + "-" + 
					mc.searchMusic(title).getTitle() + "을 삭제 했습니다.");
		}
	}
	
	public void setMusic() {
		System.out.println("***** 특정 곡 정보 수정 *****");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
		
		
		System.out.print("수정할 곡 명 : ");
		String title1 = sc.nextLine();
		System.out.print("수정할 가수 명 : ");
		String artist = sc.nextLine();
		
		Music m = new Music(title1, artist);
		
		mc.setMusic(title, m);
		
		if(mc.setMusic(title, m) == null) {
			System.out.println("수정할 곡이 없습니다.");
		}else {
			
			System.out.println(title + "-" + 
					mc.searchMusic(title).getArtist() + "의 값이 변경되었습니다.");
		}
		
		
	}
		
	
	
	public void ascTitle() {
		System.out.println("****** 곡 명 오름차순 정렬 ******");
		
		
		for(Music music : mc.ascTitle()) {
			System.out.println(music);
		}
	}
	
	public void descArtist() {
		
		System.out.println("****** 가수 명 내림차순 정렬 ******");
		for(Music music : mc.descArtist()) {
			System.out.println(music);
		}
	}
		
		
 
	


}
