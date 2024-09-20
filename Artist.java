public class Artist{

  	 private String artistName;
   
	//getter and setter
	public void setArtistName(String ArtistName){
	this.artistName=ArtistName;
	}
	public String getArtistName(){
	return artistName;
	}
	Artist(){
	artistName="Unknown Artist";
	}
	
	Artist(String artistName){
	this.artistName=artistName;
	}
	//copy constructor
	Artist(Artist a){
	this.artistName=a.getArtistName();
	}


	//display method
	public void display(){
	System.out.println("Artist's name    : "+artistName);
	}

}