package br.ufrn.imd.musicplayer;

import java.util.ArrayList;

public class MusicPlayer {

	private ArrayList<String> fileNames;
	private SoundEngine soundEngine;

	public MusicPlayer() {
		this.fileNames = new ArrayList<String>();
		this.soundEngine = new SoundEngine();
	}
	
	public void addFile(String fileName) {
		this.fileNames.add(fileName);
	}

	public int getNumberOfFiles() {
		return fileNames.size();
	}

	public void listFiles() {
		for (int i = 0; i < fileNames.size(); i++) {
			System.out.println(i + ": " + fileNames.get(i));
		}
	}

	public void removeFile(int i) {
		if (i >= 0 && i < fileNames.size()) {
			fileNames.remove(i);
		}
	}

	public void removeFile(String fileNamePart) {
		for (int i = 0; i < fileNames.size(); i++) {
			if (fileNames.get(i).contains(fileNamePart)) {
				fileNames.remove(i);
				break;
			}
		}
	}

	public void playFile(String file) {
		soundEngine.playCompletely(file);
	}

	public void playAll() {
		for(String s: fileNames) {
			soundEngine.playCompletely(s);
		}
	}

}
