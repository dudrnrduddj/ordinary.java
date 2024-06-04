package org.ordinary.day13.collection.music.model;

import java.util.ArrayList;
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



	


	
		
		
	}
	

	
	
	

