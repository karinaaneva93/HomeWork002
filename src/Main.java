import java.util.Scanner;

public class Main {

	/*
	 * Напишете програма, която взема дадена цифра (0-9) и я изписва с дума (на
	 * англ. език)
	 */

	public static void task1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert number");
		int num = sc.nextInt();
		switch (num) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("tree");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		case 8:
			System.out.println("eigth");
			break;
		case 9:
			System.out.println("nine");
			break;
		default:
			System.out.println("Not a digit");

		}

	}
	// Напишете програма, която изчислява бонус точки на база резултат от
	// игра. Потребителят трябва да въведе своите точки в интервалa[1;9].
	// Ако точките са в интервала [1;3], умножете ги по 5.
	// Ако точките са в интервала [4;6], умножете ги по 10. Ако точките са
	// в интервала [7;9], умножете ги по 50. Резултатът изведете на екрана.

	public static void task2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert point");
		int point = sc.nextInt();
		int result = 0;

		if (point >= 1 && point <= 3) {
			result = point * 5;

		}
		if (point >= 4 && point <= 6) {
			result = point * 10;

		}
		if (point >= 7 && point <= 9) {
			result = point * 50;

		}
		System.out.println(result);

	}

	/*
	 * Класическото тесте карти се състои от 13 различни вида карти съответно 2,
	 * 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K and A. Направете програма, която приема
	 * от конзолата един символ и принтира "Валидна карта", ако символът
	 * представлява валидна карта, и съответно принтира "Невалидна карта", ако
	 * символът е на невалидна карта.
	 */
	public static void task3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert card");
		String card = sc.nextLine();
		switch (card) {
		case "2":
			System.out.println("Валидна карта");
			break;
		case "3":
			System.out.println("Валидна карта");
			break;
		case "4":
			System.out.println("Валидна карта");
			break;
		case "5":
			System.out.println("Валидна карта");
			break;
		case "6":
			System.out.println("Валидна карта");
			break;
		case "7":
			System.out.println("Валидна карта");
			break;
		case "8":
			System.out.println("Валидна карта");
			break;
		case "9":
			System.out.println("Валидна карта");
			break;
		case "10":
			System.out.println("Валидна карта");
			break;
		case "J":
			System.out.println("Валидна карта");
			break;
		case "K":
			System.out.println("Валидна карта");
			break;
		case "Q":
			System.out.println("Валидна карта");
			break;

		case "A":
			System.out.println("Валидна карта");
			break;
		default:
			System.out.println("НЕ Валидна карта");
		}

	}

	public static void main(String[] args) {
		task1();
		task2();
		task3();

	}

}
