import java.util.Scanner;

public class Main {
    public static HouseholdManagement management = new HouseholdManagement();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("1.Add new household");
            System.out.println("2.Display household has person with age greater than 80");
            System.out.println("0.Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Enter number of household you want to add");
                    int number = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < number; i++) {
                        addNewHousehold();
                    }
                    break;
                case 2:
                    management.displayHouseholdHasOldPerson();
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);
    }
    public static void addNewHousehold(){
        System.out.println("Enter number of person in household");
        int numberOfPerson = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter house number");
        int houseNumber=Integer.parseInt(scanner.nextLine());
        HouseHold houseHold = new HouseHold(numberOfPerson,houseNumber);
        addPersonToHousehold(numberOfPerson,houseHold);
        management.addNewHousehold(houseHold);
        System.err.println("Successfully added new Household");
    }
    public static void addPersonToHousehold(int numberOfPerson, HouseHold houseHold){
        for (int i = 0; i < numberOfPerson; i++) {
            System.out.println("Enter name");
            String name = scanner.nextLine();
            int dayOfBirth;
            do{
                System.out.println("Enter day of birth");
                dayOfBirth = Integer.parseInt(scanner.nextLine());
            } while( dayOfBirth< 1 && dayOfBirth >31);
            int monthOfBirth;
            do{
                System.out.println("Enter month of birth");
                monthOfBirth= Integer.parseInt(scanner.nextLine());
            } while (monthOfBirth<1 && monthOfBirth >12);
            int yearOfBirth;
            do{
                System.out.println("Enter year of birth");
                yearOfBirth = Integer.parseInt(scanner.nextLine());
            } while(yearOfBirth>2020);
            System.out.println("Enter job");
            String job = scanner.nextLine();
            Person person = new Person(name,dayOfBirth,monthOfBirth,yearOfBirth,job);
            houseHold.addNewPerson(person);
        }
    }
}
