/*
* Author: Jatinder Singh
* Section: CS114004
* ID: 31374749
*/

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Staff staff = new Staff();

        Scanner in = new Scanner(System.in);

        ArrayList<StaffMember> members = new ArrayList<>();


        for (int i = 0; i < staff.getSize(); i++) {
            members.add(staff.getStaff(i));
        }

        System.out.println("Enter 1 to Display Employee information or " +
                "enter 2 to Modify a record or 3 to delete a record");

        int decision = in.nextInt();

        if (decision == 1) {

            System.out.print("Enter the employee name: ");

            String name = in.next();

            for (int i = 0; i < members.size(); i++) {
                if (members.get(i).name.equals(name)) {

                    System.out.println(members.get(i));
                    System.out.println("Type: " + members.get(i).getClass().getSimpleName());
                    System.out.println("Pay rate " + members.get(i).pay());
                } else {
                    System.out.print("No employee of such name " + name + "!");
                }
            }

        } else if(decision == 2) {

            System.out.println("Enter the name of the employee whose address" +
            " should be modified");

            String name = in.next();


            for (int i = 0; i < members.size(); i++) {
                if (members.get(i).name.equals(name)) {

                    System.out.print("Enter new address of " + name);

                    String test = in.next();
                    test += in.nextLine();

                    System.out.println(test);

                    members.get(i).address = test;

                    System.out.println(members.get(i));


                }
            }

        } else if(decision == 3) {

            System.out.println("Enter name of employee who should be removed from the list");

            String name = in.next();

            for(int i = 0; i < members.size(); i++) {

                if (members.get(i).name.equals(name)) {
                    members.remove(i);
                }

            }

        }

    }
}