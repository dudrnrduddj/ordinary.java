package org.ordinary.day13.collection.music.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.ordinary.day13.collection.music.model.Music;

public class ViewMusic {
	
	private Scanner scanner;
	
	public ViewMusic() {
		this.scanner = new Scanner(System.in);
	}
	
	
	public int printMenu() {
		System.out.println("=== === 메인 메뉴 === ===");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 >> ");
		int choice = scanner.nextInt();
		
		return choice;
	}

	public Music inputMusic() {
		System.out.println("=== === 곡 추가 === ===");
		System.out.print("추가할 곡 이름 : ");
		String title = scanner.next();
		System.out.print("가수 이름 : ");
		String singer = scanner.next();
		Music music = new Music(title, singer);
		return music;
	}

	public void printMusicListInfo(List<Music> musicList) {
		System.out.println("=== === music List === ===");
		for(Music list : musicList) {
			if(list != null) {
				System.out.println("곡명 : " + list.getTitle());
				System.out.println("가수명 : " + list.getSinger());
				System.out.println("=== === === === ===");
			}
		}
	}

	

	public String searchTitle(String category) {
		System.out.println("=== === 곡 " + category + " === ===");
		System.out.print(category+"할 곡 이름 : ");
		String title = scanner.next();
		
		
		return title;
	}

	public void searchListInfo(List<Music> searchList) {
		System.out.println("=== === 검색된 곡 목록 === ===");
		for(Music music : searchList) {
				System.out.println("검색된 곡 이름 : " + music.getTitle());
				System.out.println("해당 가수 이름 : " + music.getSinger());
				System.out.println("=== === === === ===");
			
		}
	}

	public void printMsg(String msg) {
		System.out.println(msg);
	}


	


	public Music modifyMusic(Music music) {
		System.out.print("곡명 : ");
		String title = scanner.next();
		System.out.print("가수명 : ");
		String singer = scanner.next();
		
		Music modify = new Music(title, singer);
		
		return modify;
		
	}


	public Music modifyMusicInfo(Music music) {
		System.out.println("=== === 수정 정보 === ===");
		System.out.print("곡명 : ");
		String title = scanner.next();
		System.out.print("가수명 : ");
		String singer = scanner.next();
		
		music.setTitle(title);
		music.setSinger(singer);
		
		return music;
	}


	

	
	

	
}
