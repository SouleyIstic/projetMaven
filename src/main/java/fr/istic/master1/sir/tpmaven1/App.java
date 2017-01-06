package fr.istic.master1.sir.tpmaven1;

/**
 * Hello world!
 *
 */
public class App 
{
	private int a;
	private int b;

	
	
	
    public int getA() {
		return a;
	}




	public void setA(int a) {
		this.a = a;
	}




	public int getB() {
		return b;
	}




	public void setB(int b) {
		this.b = b;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		App other = (App) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "App [a=" + a + ", b=" + b + "]";
	}




	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
