package Task4;

public class MainThread extends Thread {
	private int i = 0;
	MainThread (String name){
		super(name);
	}
	public void run(){
		StringBuffer str = new StringBuffer();
		str = str.append(this.getName()+ ":");
		for(i=1;i<101;i++)
		{
			str = str.append(" " + i);
			if( i%10 == 0){
				i+=10;
				System.out.println(str);
				str.delete(0, str.length());
				str = str.append(this.getName()+ ":");
			}
		}
	}
}
