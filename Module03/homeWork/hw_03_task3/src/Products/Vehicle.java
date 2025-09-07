package Products;

import Products.parts.Part;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle
{
    protected List<Part> parts;
    protected String manufacturer;

    public Vehicle() {parts = new ArrayList<>();}

    public void setManufacturer(String manufacturer) {this.manufacturer = manufacturer;}

    public String getManufacturer() {return manufacturer;}

    public void add(Part part) {parts.add(part);}

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nManufacturer: %s \nParts:", manufacturer));
        for (Part part: parts)
            sb.append(String.format("\n\t- %s", part));
        return sb.toString();
    }
}
