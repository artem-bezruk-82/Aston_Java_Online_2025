package Client;

public abstract class Human
{
    private String name;

    public void setName(String name) {this.name = name;}

    public String getName() {return name;}

    @Override
    public String toString() {return String.format("Name: %s", name);}
}
