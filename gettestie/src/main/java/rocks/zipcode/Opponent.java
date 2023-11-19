package rocks.zipcode;

public class
Opponent implements Comparable<Opponent>{
    private String name;
    private int yearOfDebut;

    /**
     * Create a person with given name and debut.
     */
    Opponent(String name, int yearOfDebut) {
        this.name = name;
        this.yearOfDebut = yearOfDebut;
    }

    /**
     * Set a new name for this person.
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * Return the name of this person.
     */
    public String getName() {
        return name;
    }

    /**
     * Set a new debut year for this person.
     */
    public void setYearOfDebut(int newYearOfDebut) {
        yearOfDebut = newYearOfDebut;
    }

    /**
     * Return the debut year of this person.
     */
    public int getYearOfDebut() {
        return yearOfDebut;
    }

    /**
     * Return a string representation of this object.
     */
    public String toString() // redefined from "Object"
    {
        return "Name: " + name + "\n" + "Year of debut: " + yearOfDebut + "\n";
    }

    @Override
    public int compareTo(Opponent otherOpponent) {
        return Integer.compare(getYearOfDebut(), otherOpponent.getYearOfDebut());
    }
}
