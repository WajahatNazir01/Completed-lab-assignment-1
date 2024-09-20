public class Artwork{
	private String artworkTitle;
	private int yearOfCreation;
	private Artist artist;
	
	//getters
	public String getArtworkTitle(){
	return artworkTitle;
	}
	public int getYearOfCreation(){
	return yearOfCreation;
	}
	public Artist getArtist(){
	return artist;
	}
	//setters
	public void setArtworkTitle(String artworkTitle){
	this.artworkTitle=artworkTitle;
	}
	public void setYearOfCreation(int yearOfCreation){
	this.yearOfCreation=yearOfCreation;
	}
	public void setArtist(Artist artist){
	this.artist=artist;
	}
	
	
	//constructor no 1
	Artwork(String artworkTitle, int yearOfCreation, Artist artist){
	this.artworkTitle=artworkTitle;
	this.yearOfCreation=yearOfCreation;
	this.artist=artist;
	}	

	//constructor no 2
	Artwork(String artworkTitle, int yearOfCreation){
	this.artworkTitle=artworkTitle;
	this.yearOfCreation=yearOfCreation;
	this.artist=new Artist("Unknown artist");
	}

 
	//calling shallow and deep copy in method
	public Artwork createShallowCopy(Artwork aw){
	Artwork obj=new Artwork(aw.getArtworkTitle(),aw.getYearOfCreation(),aw.getArtist());
	return obj;
	}

 
	public Artwork createDeepCopy(Artwork aw1){
	Artwork obj1=new Artwork(aw1.getArtworkTitle(),aw1.getYearOfCreation(),new Artist(aw1.getArtist().getArtistName()));
	return obj1;
	}


	//method to display information
	public void displayArtwork(){
	artist.display();
	System.out.println("Title of Artwork :"+artworkTitle);
	System.out.println("Year of Creation :"+yearOfCreation);

	}
	


}