package in.sp.beans;

public class Student {

	public Teacher tecr;

	public Teacher getTecr() {
		return tecr;
	}

	public void setTecr(Teacher tecr) {
		this.tecr = tecr;
	}
	
	public void SDisplay() {
		System.out.println("This is student method: "+tecr);
	}
}
