package Task6;
import java.util.Scanner;
public class PhoneMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Phone mass[] = new Phone[5];
		Phone p1 = new Phone(1, "Alex", "Medov", "Nikolaevich", "Checkstreer", 4865);
		Phone p2 = new Phone(2, "Nikolai", "Chertov", "Michailovich", "Numberstreet", 3324, 30, 0, 40, 10);
		Phone p3 = new Phone(3, "Sima", "Prokopovich", "Olegovna", "Esstreet", 4192, 0, 20, 20, 15);
		Phone p4 = new Phone(4, "Nina", "Lesova", "Izmailovna", "Retterstreet", 9934);
		Phone p5 = new Phone(5, "Yaroslav", "Beret", "Sergeev", " Nitestreet", 1145, 10, 10, 35, 40);
		mass[0] = p1;
		mass[1] = p2;
		mass[2] = p3;
		mass[3] = p4;
		mass[4] = p5;
		mass[3].timeIn = 15;
		//Task #1. Print id that have inner callings more than entered
		System.out.print("Enter boreder for inner calls - ");
		int k=sc.nextInt();
		for (int i=0;i<5;i++){
			Phone.showBiggerOut(mass[i], k);
		}
		//Task #2 Print all id that have out calls
		for (Phone pTemp: mass){
			if(pTemp.timeOut>0)
				System.out.println("Subscriber " + pTemp.toString() + " had outer calls");
		}
		//Task #3 sort massive and print sorted.
		for (int i=0;i<4;i++){
			if(mass[i].name.compareTo(mass[i+1].name)>0){
				Phone pTemp = mass[i+1];
				mass[i+1] = mass[i];
				mass[i] = pTemp;
			}
		}
		System.out.println("Sorted massive: ");
		for (Phone pTemp:mass){
			System.out.println(pTemp.toString());
		}

	}
}
