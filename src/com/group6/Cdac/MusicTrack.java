package com.group6.Cdac;

public class MusicTrack 
{
	private String songName;
	private String songArtist;
	public MusicTrack next ;
	public MusicTrack prev; 

	public MusicTrack ( ) {
		
		next = null ;
		prev = null;
	}
	
	public MusicTrack ( MusicTrack m ) {
		this.songName = m.songName ;//
		this.songArtist = m.songArtist;
		next = null ;
		prev = null;
	}	
	
	public MusicTrack ( String songName, String songArtist ) {
		this.songName = songName ;//
		this.songArtist = songArtist;
		next = null ;
		prev = null;
	}
	public String getSongName() {
		return songName;
	}
	
	public void setSongName(String songName) {
		this.songName = songName;
	}
	
	public String getSongArtist() {
		return songArtist;
	}
	
	public void setSongArtist(String songArtist) {
		this.songArtist = songArtist;
	}

	

	@Override
	public String toString() {
		return "Song Name : " +songName+ " , Artist : " +songArtist;
	}

}
