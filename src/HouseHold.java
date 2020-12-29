import java.util.ArrayList;

public class HouseHold {
    private ArrayList<Person> listPerson = new ArrayList<>();
    private int numberOfPerson;
    private int houseNumber;

    public HouseHold(int numberOfPerson, int houseNumber) {
        this.numberOfPerson = numberOfPerson;
        this.houseNumber = houseNumber;
    }

    public void addNewPerson(Person person) {
        listPerson.add(person);
    }

    public boolean checkAgeGreaterThan80() {
        for (int i = 0; i < listPerson.size(); i++) {
            int age = listPerson.get(i).getAge();
            if (age >= 80) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "HouseHold{" +
                "listPerson=" + listPerson +
                ", numberOfPerson=" + numberOfPerson +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
