class Song{
	int songId;
	String songName;
	String artistName;
	Song(){
		System.out.println("Default Constructor");
		this.songId=0;
		this.songName="";
		this.artistName="";
		System.out.println("Object initialized\n-------------------------------------------------\n");
	}
	
	Song(int songId,String songName,String artistName){
		System.out.println("3 Parameter Constructor");
		this.songId=songId;
		this.songName=songName;
		this.artistName=artistName;
		System.out.println("Data Assigned");
		getsongId();
		getsongName();
		getartistName();
		System.out.println("\n-------------------------------------------------\n");
	}

	Song(String songName,String artistName){
		System.out.println("2 Parameter Constructor");
		this.songName=songName;
		this.artistName=artistName;
		System.out.println("Data Assigned");
		getsongName();
		getartistName();
		System.out.println("\n-------------------------------------------------\n");
	}

	Song(int songId){
		System.out.println("1 Parameter Constructor");
		this.songId=songId;
		System.out.println("Data Assigned");
		getsongId();
		System.out.println("\n-------------------------------------------------\n");
	}
	
	public void getsongId(){
		System.out.println("Patient ID : "+this.songId);
		System.out.println("\n-------------------------------------------------\n");
	}	

	public void getsongName(){
		System.out.println("Patient Name : "+this.songName);
		System.out.println("\n-------------------------------------------------\n");
	}

	public void getartistName(){
		System.out.println("Patient Location : "+this.artistName);
		System.out.println("\n-------------------------------------------------\n");
	}
}

public class ConstructorOverloading{
	public static void main(String args[]){
		Song p1=new Song();
		Song p2=new Song("Cupid","Fifty-Fifty");
		Song p3=new Song(1004);
		Song p4=new Song("Cupid","Fifty-Fifty");
		Song p5=new Song(1254,"Cupid","Fifty-Fifty");
	}
}