package classes;

public class classIntermediate {
	String name;
	String s1,s2,s3;
	int s1mm, s2mm, s1om, s2om,s3mm,s3ob;
	public classIntermediate()
	{
		s1="Physics";
		s2="Chemistry";
		s3="Maths";
		s1mm=100;
		s2mm=100;
		s3mm=100;
	}
	public void main(String nameZ,int s1omZ,int s2omZ, int s3omZ) {
		System.out.println("Name:"+nameZ);
		System.out.println("Subject Name:"+s1+"	MM:"+s1mm+"	OM: "+s1omZ);
		System.out.println("Subject Name:"+s2+"	MM:"+s2mm+"	OM: "+s2omZ);
		System.out.println("Subject Name:"+s3+"	MM:"+s3mm+"	OM: "+s3omZ);
	}

}
