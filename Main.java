public class Main{
	public static void main(String args[]){
	System.out.println("ARTWORK OBJECT WITH DEFAULT ARTIST VALUE");
	Artwork a5=new Artwork("3D art",2024);
	a5.displayArtwork();
	System.out.println("_____________________");


	//creating first artwotk object and initializind its values
	System.out.println("INITIAL VALUES");
	Artwork a1=new Artwork("Natural photography",1999,new Artist("Salah ud din"));
	a1.displayArtwork();

	//creating its shallow copy
	//we give this value to new artwork obj bcz function return an obj that should be saved in new var
	System.out.println("CREATING SHALLOW COPY");
	Artwork aw1=a1.createShallowCopy(a1);
	aw1.displayArtwork();
	System.out.println("___________________________________________________________________________");
	System.out.println("The address of inner object for a1 before modifications is "+a1.getArtist());
		
	//modifcations
	a1.getArtist().setArtistName("Nasir Qazmi");
	aw1.displayArtwork();
	System.out.println("___________________________________________________________________________");
	System.out.println("The address of inner object for a1 after modifications is "+aw1.getArtist());
	System.out.println("______________________________________________________");
	System.out.println("|SAME ADDRESSES FOR ARTIST OBJECT BEFORE AND AFTER THE|");
	System.out.println("|CHANGES SHOW THE SUCCESSFUL CREATION OF SHALLOW COPY |");
	System.out.println("______________________________________________________");
	
	//creating deep copy
	Artwork a2=new Artwork("Abstract art",2007,new Artist("Mona Lisa"));
	System.out.println("INITIAL VALUES");
	a2.displayArtwork();
	
	//creating its deep copy
	System.out.println("CREATING DEEP COPY");
	Artwork aw2=a2.createDeepCopy(a2);
	aw2.displayArtwork();
	System.out.println("___________________________________________________________________________");
	System.out.println("The address of inner object for a2 before modifications is "+a2.getArtist());
	
	//modifications
	a2.getArtist().setArtistName("Anna Molka");
	a2.setYearOfCreation(2012);
	a2.displayArtwork();
	System.out.println("___________________________________________________________________________");
	System.out.println("The address of inner object for a2 after modifications is "+aw2.getArtist());
	System.out.println("________________________________________________________");
	System.out.println("|DIFFEERENY ADDRESSES FOR ARTIST OBJECT BEFORE AND AFTER|");
	System.out.println("|THE CHANGES SHOW THE SUCCESSFUL CREATION OF DEEP  COPY |");
	System.out.println("________________________________________________________");
	}
}