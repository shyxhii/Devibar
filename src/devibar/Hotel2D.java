package devibar;

import java.util.Scanner;

public class Hotel2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//initialization
		int hotel[][] = new int[7][5];
		hotel[1][3] = 1;
		hotel[0][1] = 1;
		hotel[0][4] = 1;

		int choice = 0, floor = 0, room = 0;

		//menu loop


		do {
			System.out.println("=== HOTEL RESERVATION SYSTEM ===");
			System.out.println("[1] View Rooms\n[2] Check In\n[3] Check Out\n[4] Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("---------------------\nView Rooms");
				for (int i = 6; i >= 0; i--) {
					System.out.print("Floor " + (i+1) + ": ");
					for (int j = 0; j < 5; j++) {
						System.out.print("[" + hotel[i][j] + "]");
					}
					System.out.println();
				}
				break;

			case 2:
				System.out.println("---------------------\nCheck In");
				System.out.print("Enter floor (1-7): ");
				floor = sc.nextInt();
				System.out.print("Enter room (1-5): ");
				room = sc.nextInt();
				
				if (floor < 1 || floor > 7 || room < 1 || room > 5) {
					System.out.println("Invalid floor or room number.");
				} else if (hotel[floor-1][room-1] == 0) {
					hotel[floor-1][room-1] = 1;
                    System.out.println("Check-in successful!");
                } else {
                    System.out.println("Room already occupied");
                }
                break;

			case 3:
				System.out.println("---------------------\nCheck Out");
				System.out.print("Enter floor (1-7): ");
				floor = sc.nextInt();
				System.out.print("Enter room (1-5): ");
				room = sc.nextInt();
				
				if (floor < 1 || floor > 7 || room < 1 || room > 5) {
					System.out.println("Invalid floor or room number.");
				} else if (hotel[floor-1][room-1] == 1) {
					hotel[floor-1][room-1] = 0;
                    System.out.println("Check-out successful!");
                } else {
                    System.out.println("Room already empty");
                }
                break;

			case 4:
				System.out.println("\nThank you for staying with us!");
				break;

			default:
				System.out.println("Invalid choice!");;
			}
			
		} while (choice != 4);

		sc.close();
	}

}
