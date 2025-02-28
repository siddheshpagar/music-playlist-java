package com.group6.Main;


import com.group6.Cdac.MusicDoublyList;
import com.group6.Cdac.MusicTrack;

import java.util.Scanner;
public class ProjectMusic 
{
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int choice=0, pos;
		String songName, songArtist;
		
		MusicDoublyList list = new MusicDoublyList(); 
		
		MusicTrack track;
		 do{
			
		    choice=enterChoice();
			switch(choice) {
			case 0 :
				System.out.println("PlayList Ended");
				break;
				
			case 1 : //add music to the playlist
				sc.nextLine();
				System.out.println("Enter Song Name : ");
				songName = sc.nextLine();
				//sc.nextLine();
				System.out.println("Enter Song Artist : ");
				songArtist = sc.nextLine();
				
				track = new MusicTrack(songName, songArtist);//s3 a3
				list.addMusicAtLast(track);
				break;
			case 2 :
				sc.nextLine();
				System.out.println("Song name");
				songName = sc.nextLine();
				System.out.println("Song Artist : ");
				songArtist = sc.nextLine();
				track = new MusicTrack(songName, songArtist);
				list.addMusicAtFirst(track);
				break;
			case 3 : //remove song from the playlist
				try{
					System.out.println("Enter Song Position to Remove from the Play-List : ");
					pos = sc.nextInt();
					list.removeSelectedMusic(pos);
				}catch(RuntimeException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4 :
				list.removeAllmusic();
				break;
			case 5 : //update the music playlist
				System.out.println("Enter position to add song in that position ");
				pos = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter new Song Name : ");
				songName = sc.nextLine();
				System.out.println("Enter new Song Artist : ");
				songArtist = sc.nextLine();
				track = new MusicTrack(songName, songArtist);
				list.updateMusicList(pos,track);
				break;
				
			case 6 : //navigate to next music
				try {
					MusicTrack track1 = list.navigatingNext();
					System.out.println("Next Music : " + track1);
				}catch(RuntimeException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 7 : //navigate to previous music
				try {
					MusicTrack track1 = list.navigatingPrevious();
					System.out.println("Previous Music : " + track1);
				}catch(RuntimeException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 8 :
				try {
					 list.getCurrentMusic();
				}catch(RuntimeException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 9 : //display the music play list
				list.displayPlayList();
				break;
				
			default : 
				System.out.println("Enter Valid Choice and Try again ");
			}
		}while(choice !=0 );
		
		
	}
     
	private static int enterChoice() 
	{
				System.out.println();
			 	System.out.println("0. Exit");
		        System.out.println("1. Add Music to the Playlist");
		        System.out.println("2. Add your Favourite Song to TOP : ");
		        System.out.println("3. Remove Music from the Playlist");
		        System.out.println("4. Remove All Music from the Playlist");
		        System.out.println("5. Update Music in the Playlist");
		        System.out.println("6. Navigate to Next Music");
		        System.out.println("7. Navigate to Previous Music");
		        System.out.println("8. current music??");
		        System.out.println("9. Display the Music Playlist");
		        System.out.print("Enter your choice : ");
		        return sc.nextInt();
	}
}
