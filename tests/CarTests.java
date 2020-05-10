import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTests {
    //TheLoudmouth
    //TheSecretCatcher
    @Test
    public void invalidInputBrand() throws InvalidInputException {
        System.out.println("Este teste vai tentar criar um objeto da classe 'Car' com os seguintes dados:");
        System.out.println("Brand: ");
        System.out.println("Model: Model");
        System.out.println("Year: 1990");
        System.out.println("Color: Green");
        Assertions.assertThrows(InvalidInputException.class, () -> new Car("", "Model", 1999, "Green"));
        System.out.println("Como nao foi dado nenhum dado 'Brand', o construtor recorreu a excecao 'InvalidInputException'");
        System.out.println("Isto quer dizer que o construtor fez o que era suposto, logo o teste passou");
    }
    
    
    //Cuckoo(akaStranger)
    @Test
    public void getBrand() throws InvalidInputException {
        Car car = new Car("Brand", "Model", 2000, "Blue");
        Assertions.assertEquals("Brand", car.getBrand());
    }

    //Cuckoo(akaStranger)
    @Test
    public void getModel() throws InvalidInputException {
        Car car = new Car("Brand", "Model", 2000, "Blue");
        Assertions.assertEquals("Model", car.getModel());
    }

    //Cuckoo(akaStranger)
    @Test
    public void getYear() throws InvalidInputException {
        Car car = new Car("Brand", "Model", 2000, "Blue");
        Assertions.assertEquals(2000, car.getYear());
    }

    //Cuckoo(akaStranger)
    @Test
    public void getColor() throws InvalidInputException {
        Car car = new Car("Brand", "Model", 2000, "Blue");
        Assertions.assertEquals("Blue", car.getColor());
    }
}
