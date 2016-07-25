package ClassProject;

public interface Wear{
	int percent = 1000;
	public default void WearMsg(){
		System.out.println("My wear is " + percent + " now");
	}
}