package Opdrachten.Exceptions;

public class Car {
    private String automerk;

    public String getAutomerk(){
        return automerk;
    }

    public void setAutomerk(String automerk) throws MyOwnException {
        if (automerk.equals("BMW") || automerk.equals("Audi")) {
            throw new MyOwnException("ge zijt nen dikkenek");
        } else System.out.println("Goei keus man");
        this.automerk = automerk;
    }
}
