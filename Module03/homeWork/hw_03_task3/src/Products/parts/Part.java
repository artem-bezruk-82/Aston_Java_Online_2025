package Products.parts;

public abstract class Part
{
    private String name;

    public Part(String name) {this.name = name;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    @Override
    public String toString() {return String.format("Part: %s", name);}
}
