package Task4;

public class SecondThread extends Thread {
	private int i = 11;
	SecondThread (String name){
		super(name);
	}
	public void run(){
		StringBuffer str = new StringBuffer();
		str = str.append(this.getName()+ ":");
		for(i=11;i<101;i++)
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
