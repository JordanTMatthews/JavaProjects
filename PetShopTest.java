import java.util.*;

public class PetShopTest {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		System.out.println("Please enter the size of the array");
		int x = stdin.nextInt();

		String[] names = new String[x];
		String[] petName = new String[x];
		String[] petType = new String[x];
		addName(names, petName, petType);

	}

	public static void addName(String[] names, String[] petName, String[] petType) {
		Scanner name = new Scanner(System.in);
		String[] name2 = new String[names.length + 1];
		String[] pn2 = new String[names.length + 1];
		String[] pt2 = new String[names.length + 1];
		for (int i = 0; i < names.length; i++) {
			name2[i] = names[i];
			pn2[i] = petName[i];
			pt2[i] = petType[i];
		}
		name2[name2.length - 1] = name.next();
		pn2[pn2.length - 1] = name.next();
		pt2[pt2.length - 1] = name.next();
		names = name2;
		petName = pn2;
		petType = pt2;
	}
}
