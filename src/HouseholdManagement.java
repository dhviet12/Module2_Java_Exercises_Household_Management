import java.util.ArrayList;

public class HouseholdManagement {
    private ArrayList<HouseHold> listHousehold = new ArrayList<>();

    public void addNewHousehold(HouseHold houseHold) {
        listHousehold.add(houseHold);
    }

    public void displayHouseholdHasOldPerson() {
        for (int i = 0; i < listHousehold.size(); i++) {
            HouseHold houseHold = listHousehold.get(i);
            boolean check = houseHold.checkAgeGreaterThan80();
            if (check) {
                System.out.println(houseHold.toString());
            }
        }
    }
}
