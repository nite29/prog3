
public class Controller {

	public void createRecord(Person Record[], int n){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter ID: ");
		Record[n].idNumber = sc.nextInt();
		sc.nextLine();

		System.out.print("\nEnter first name: ");
		Record[n].firstName = sc.nextLine();

		System.out.print("\nEnter last name: ");
		Record[n].lastName = sc.nextLine();

		System.out.print("\nAre you a student? y/n: ");
		
		if (sc.nextLine() == y)
			Record[n].isTeacher = false;

		else if (sc.nextLine() == n)
			Record[n].isTeacher = true;

		sc.close();
	}

	public void displayRecord(Person Record[], int n){
		for (int i = 0; i < n; i++){
			System.out.println(Record[i].idNumber+" "+Record[i].firstName+" "+Record[i].lastName+Record[i].isTeacher);
		}
		
	}

	public int searchRecord(Person Record[], int n, int searchID){
		for (int i = 0; i < n; i++){
			if (searchID == Record[i].idNumber)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Person[] Record = new Person[100];

		bool isDone = false;
		int temp, choice;

		System.out.println("[1] Create a record");
		System.out.println("[2] Display records");
		System.out.println("[3] Search records");

		switch (choice){
		case 1:
			
			break;
		case 2:
			

			break;
		case 3:
			
		}


	}
}