package com.group6.Cdac;

public class MusicDoublyList 
{
//static class MusicTrack {
		
	
		
		//}
	//}
	
	//declaring MusicDoubly fields
	public MusicTrack head ;
	private MusicTrack currentmusic;
	
	
	public MusicDoublyList() {
		head = null;
		currentmusic = head;
	}
	public void addMusicAtFirst(MusicTrack music)
	{
		MusicTrack newadd = new MusicTrack(music);
		
		if(head==null )
		{
			head = newadd;
		}
		else{
			MusicTrack trav = head;//  track={s1 a1}
			head = newadd; // head ={s0a0} 
			head.next = trav;//{s0a0}++> track={s1 a1}
			trav.prev=head;	 //head<===track={s1 a1}
		}
		
	}
	public void addMusicAtLast(MusicTrack music) {
		
		//create a new MusicTrack and initialize it
		MusicTrack newMusic = new MusicTrack(music);
		
		//special 1 : if MusicTrack is empty then,
		if(head == null)
		{
			addMusicAtFirst(music);
			
		}
		else {
			//traverse till the last MusicTrack
			MusicTrack trav = head;//s1 a1
			while(trav.next != null)//s1 a1 //s2 a2 //  
				trav = trav.next;//
			
			//add newMusic after trav.next when it becomes null
			trav.next = newMusic ;//  s2 a2 ==> s3 a3
			
			
			newMusic.prev = trav;//  s2 a2 <==//s3 a3
		}
	}
	public void removeFirst() 
	{
		//special 1 : if list is empty, throw exception
		if(head == null)
			throw new RuntimeException("List is Empty");
		
		//special 2 : if list has single MusicTrack, make head null
		if(head.next == null) 
		{
			head = null;
			currentmusic = null;
		}
		else {
			/*private MusicTrack next;
			//private MusicTrack prev;*/
			
			//if current music pointing to head then make it pointing to head.next
			if(currentmusic==head)
			{
				currentmusic=null;
			}
			//general : make head pointing to next MusicTrack
			head = head.next;
			
			//MusicTrack : the old first MusicTrack will be garbage collected
			//second MusicTrack (newMusicTrack) previous should be null
			head.prev = null;
		}
	}
	public void removeAllmusic()
	{
		if(head== null)
		{
			System.out.println("Music List is Already EMPTY");
		}
		head=null; //     
		currentmusic = null ;	
		System.out.println("Music List is EMPTY now");
	}
	public int removeSelectedMusic(int pos) {
		
		// special 1 : if position of selected music is 1,
		if(pos == 1)
		{ 
			removeFirst();
			return 0;
		}
		// special 2 : if list is empty or the entered position is invalid
		else if(head == null || pos < 1)
			throw new RuntimeException("Music PlayList is Empty");
		
		//general method
		MusicTrack trav = head;
		for(int i = 1; i < pos; i++) {	
			// special 3 : if position of beyond list length,then throw Exception
			trav = trav.next ;
			if(trav == null)
				throw new RuntimeException("You have entered invalid position to delete");
		}
		
		//trav's previous MusicTrack's next to trav's next MusicTrack
		trav.prev.next = trav.next;
		
		if(currentmusic==trav)
		{
			//if current music pointing to trav(which we want to delete)make current music pointing to previous music
			currentmusic=null;
		}
		
		//trav's next MusicTrack's previous to trav's previous MusicTrack
		// special 3 : while deleting last MusicTrack, skip next line
		if(trav.next != null)
		trav.next.prev = trav.prev ;
		return 0;
		//trav MusicTrack will be garbage collected
	}
	
	
	
	public void updateMusicList(int pos, MusicTrack music) {	//in-short to replace the existing song with the older one
		MusicTrack newadd= new MusicTrack (music);
		if(head == null || pos <= 1)
			addMusicAtFirst(music);
		else{
			    MusicTrack trav = head;
				int i = 1;
				while(trav.next != null && i < pos-1)  
				{
					trav = trav.next;
					i++;
				}
				if(trav.next!=null)
				{
					newadd.next = trav.next;
					trav.next.prev=newadd;
				}
				newadd.prev = trav;
				trav.next = newadd;
			}
	}
			
	public void getCurrentMusic() {
		if(currentmusic==null)
		{
			throw new RuntimeException("You haven't played any music yet!!");
		}
		System.out.println(currentmusic);
		//System.out.println("current Song name : "+currentmusic..getSongName() +" Artist Name : " + currentmusic..getSongArtist() );
	}

	public MusicTrack navigatingNext() 
	{
		if(head == null) 
		{
			throw new RuntimeException("Music PlayList is Empty");
		}
		//check condition for if trav will become null or not
		else if(currentmusic==null)
		{
			currentmusic=head;
			return currentmusic ;
		}
		else if(currentmusic.next != null)//
			{
				currentmusic = currentmusic.next;//s0 ==> s1 
				return currentmusic;
			} 
			throw new RuntimeException("No more music available");
		
		
	}
	
	public MusicTrack navigatingPrevious() 
	{
			if(head == null)
			{
				throw new RuntimeException("Music PlayList is Empty");
			}
			if(currentmusic == null)
			{
				throw new RuntimeException("No music was playing earlier");
			}
			else if(currentmusic.prev != null) // s0a0<++{s1a1}
			{
				currentmusic = currentmusic.prev;
				return currentmusic ;
			} 
			throw new RuntimeException("Your Previous Music was First in the Play-List");
		}
	
	public void displayPlayList() 
	{			
			if(head==null)
			{
				System.out.println("Playlist is EMPTY");
			}
			else 
			{  
				System.out.println("MUSIC IN THE PLAYLIST ");
			    MusicTrack trav = head;
			    while(trav != null) 
			{
			    	String songName = trav.getSongName();// s1 
			        System.out.println("Song Name : " + songName);
			        String songArtist = trav.getSongArtist();
			        System.out.println("Artist Name : " + songArtist);
			        trav = trav.next; // s2 a2  s3 a3 
			}
			
	        }
    }
}
