package examples;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Arrays;
import java.util.List;

public class Car {

    private String make;
    private String model;
    private String color;

    public Car() {

        this.make = "default make";
        this.model = "default model";
        this.color = "default color";
    }

    public Car(String make, String model, String color) {

        this.make = make;
        this.model = model;
        this.color = color;
    }

    public String printInfo() {

        return String.format("I'm a %s %s %s", this.color, this.make, this.model);
    }

    @JsonIgnore
    public boolean isItalian() {

        List<String> italianCarsList = Arrays.asList("Fiat", "Alfa Romeo", "Lancia", "Maserati", "Ferrari");
        return italianCarsList.contains(this.make);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
