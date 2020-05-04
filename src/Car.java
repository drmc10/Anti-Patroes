public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;

    public Car(String brand, String model, int year, String color) throws InvalidInputException {
        if(brand.equals("") || model.equals("") || year < 1900 || year > 2020 || color.equals(""))
            throw new InvalidInputException();

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void changeColor(String newColor) {
        if(this.color.equals(newColor)) {
            System.out.print("The inserted color is the same as the current color");
            return;
        }

        this.color = newColor;
        System.out.print("Car color changed to " + this.color);
    }

    public void printCarInfo() {
        System.out.println("Brand: " + this.brand + "\nModel: " + this.model + "\nYear: " + this.year + "\nColor: " + this.color);
    }
}
