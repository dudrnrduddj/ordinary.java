package org.ordinary.day13.collection.music.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class ManageMusic {

	private List<Music> musicList;
	
	public ManageMusic() {
		this.musicList = new ArrayList<Music>();
	}


	
	public void addMusic(Music music, String index) {
		if(index.equals("first")) {
			musicList.add(0, music);
		}else if(index.equals("last")) {
			musicList.add(music);
		}
	}

	public List<Music> selectAllMusicList() {
		return this.musicList;
	}



	public List<Music> searchMusicByTitle(String title) {
		List<Music> searchList = new ArrayList<Music>();
		for(Music list : musicList) {
			if(list != null && list.getTitle().equals(title)) {
				searchList.add(list);
			}
		}
		return searchList;
	}



	public int searchTitleIndex(String title) {
		if(title != "" && title != null) {
			int count = 1;
			for(Music list : musicList) {
				if(list != null && list.getTitle().equals(title)) {
					return count;
				}
				count++;
			}
		}
		return 0;
	}



	public void deleteMusic(int index) {
		musicList.remove(index);
	}



	public Map<String, Object> modifyMusic(String title) {
		if(musicList != null) {
			int count = 1;
			Map<String, Object> result = new HashMap<String, Object>();
			for(Music list : musicList) {
				if(list.getTitle().equals(title)) {
					result.put("music", list);
					result.put("index", count);
					return result;
				}
				count++;
			}
		}
		
		return null;
	}



	public Music searchOneMusicByTitle(String title) {
		Music searchMusic = new Music();
		for(Music list : musicList) {
			if(list != null && list.getTitle().equals(title)) {
				searchMusic = list;
			}
		}
		return searchMusic;
	}



	public void modifyMusic(int index, Music music) {
		musicList.set(index, music);
		
	}


	// 내가 직접 짜본 코드 - 각각의 객체의 title 문자열에 접근해 각 문자(char는 아스키코드로 대소비교가 가능)마다의 대소비교를 통한 정렬 구현
	public void sortByTitleAsc() {
		for(int i = 0; i < musicList.size()-1; i++) {
			for(int j = 0; j < musicList.size()-1-i; j++) {
				int minLength;
				if(musicList.get(j).getTitle().length() > musicList.get(j+1).getTitle().length()) {
					minLength = musicList.get(j+1).getTitle().length();
				}else{
					minLength = musicList.get(j).getTitle().length();
				}
				for(int x = 0; x < minLength; x++) {
					if(musicList.get(j).getTitle().charAt(x) > musicList.get(j+1).getTitle().charAt(x)){
						Music temp = musicList.get(j);
						musicList.set(j, musicList.get(j+1));
						musicList.set(j+1, temp);
						break;
					}else if(musicList.get(j).getTitle().charAt(x) == musicList.get(j+1).getTitle().charAt(x)){
						continue;
					}else {
						break;
					}
				}
			}
		}
	}
	
//	public void sortByTitleAsc() {
//		for(int i = 0; i < musicList.size()-1; i++) {
//			for(int j = 0; j < musicList.size()-1-i; j++) {
//				Music mOne = musicList.get(j);
//				Music mTwo = musicList.get(j+1);
//				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
//					musicList.set(j, mTwo);
//					musicList.set(j+1, mOne);
//				}
//			}
//		}
//	}



	public void sortByTitleDesc() {
//		List<String> strList = new ArrayList<String>();
//		strList.add("김만우");
//		strList.add("강진형");
//		strList.add("박은진");
//		Collections.sort(strList);
//		
		Collections.sort(musicList, new DescTitle());
//		for(int i = 0; i < musicList.size()-1; i++) {
//			for(int j = 0; j < musicList.size()-1-i; j++) {
//				Music mOne = musicList.get(j);
//				Music mTwo = musicList.get(j+1);
//				if(mOne.getTitle().compareTo(mTwo.getTitle()) < 0) {
//					musicList.set(j, mTwo);
//					musicList.set(j+1, mOne);
//				}
//			}
//		}
	}



	public void sortBySingerAsc() {
		for(int i = 0; i < musicList.size()-1; i++) {
			for(int j = 0; j < musicList.size()-1-i; j++) {
				Music mOne = musicList.get(j);
				Music mTwo = musicList.get(j+1);
				if(mOne.getSinger().compareTo(mTwo.getSinger()) > 0) {
					musicList.set(j, mTwo);
					musicList.set(j+1, mOne);
				}
			}
		}
	}



	public void sortBySingerDesc() {
		for(int i = 0; i < musicList.size()-1; i++) {
			for(int j = 0; j < musicList.size()-1-i; j++) {
				Music mOne = musicList.get(j);
				Music mTwo = musicList.get(j+1);
				if(mOne.getSinger().compareTo(mTwo.getSinger()) < 0) {
					musicList.set(j, mTwo);
					musicList.set(j+1, mOne);
				}
			}
		}
	}



	


	
		
		
	}
	

	
	
	

