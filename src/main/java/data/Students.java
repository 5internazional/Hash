package data;

public class Students {
    private String surname;
    private int matriculationNumber;

    public Students(String surname, int matriculationNumber) {
   //     super();
        this.surname = surname;
        this.matriculationNumber = matriculationNumber;
    }

    @Override
    public String toString() {
        return "Student" + "[" + "sur= " + surname  + " " + matriculationNumber + "]";
    }
    public int getMatriculationNumber() {
        return matriculationNumber;
    }
}