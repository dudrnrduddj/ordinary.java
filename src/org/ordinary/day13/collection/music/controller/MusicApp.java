package org.ordinary.day13.collection.music.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.ordinary.day13.collection.music.model.ManageMusic;
import org.ordinary.day13.collection.music.model.Music;
import org.ordinary.day13.collection.music.view.ViewMusic;

public class MusicApp {
	public static void main(String[] args) {

		ViewMusic view = new ViewMusic();
		ManageMusic manage = new ManageMusic();

		while (true) {
			int choice = view.printMenu();

			switch (choice) {
			case 1:
				// 마지막 위치에 곡 추가
				Music music = view.inputMusic();
				manage.addMusic(music, "last");
				break;
			case 2:
				// 2. 첫 위치에 곡 추가
				music = view.inputMusic();
				manage.addMusic(music, "first");
				break;
			case 3:
				// 3. 전체 곡 목록 출력
				List<Music> musicList = manage.selectAllMusicList();
				if(musicList.size() > 0) {
					view.printMusicListInfo(musicList);
				}else {
					view.printMsg("정보가 존재하지 않습니다.");
				}
				break;
			case 4:
				// 4. 특정 곡 검색
				String title = view.searchTitle("검색");
				List<Music> searchList = manage.searchMusicByTitle(title);
				if(searchList.size() > 0) {
					view.searchListInfo(searchList);
				}else {
					view.printMsg("검색된 결과가 없습니다.");
				}
				break;
			case 5:
				//5. 특정 곡 삭제
				title = view.searchTitle("삭제");
				int index = manage.searchTitleIndex(title);	// index는 1부터시작
				if(index == 0) {
					System.out.println("일치하는 곡이 없습니다.");
				}else {
					manage.deleteMusic(index-1);
				}
				break;
			case 6:
				//6. 특정 곡 정보수정
				title = view.searchTitle("수정");
//				index = manage.searchTitleIndex(title); // index 1부터 시작
//				music = manage.searchOneMusicByTitle(title);
//				music = view.modifyMusic(music);
//				manage.modifyMusic(index-1, music);
				
				// map써서 index, music 각각 저장해서 활용하기
//				Map<String, Object> result = manage.modifyMusic(title);
//				Music modifiedMusic = view.modifyMusicInfo((Music)result.get("music"));
//				manage.modifyMusic(((int)result.get("index")-1), modifiedMusic);
				
				break;
			case 7:

				break;
			case 8:

				break;
			case 9:

				break;
			case 10:

				break;
			case 0:
				view.printMsg("프로그램을 종료합니다.");
				break;
			default:
				view.printMsg("메뉴를 잘못선택하셨습니다.");
				break;
			}
		}
	}
}
