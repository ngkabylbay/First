import java.io.Serializable;

public class Phone implements Serializable  {
    private String number;

    private String model;

    private double weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    };

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String callerName) {
        System.out.println(callerName + " is ringing");
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println(callerName + " is ringing with number : " + callerNumber);
    }

    public void sendMessage(String... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //сигнатура = модификатор доступа + возвращаемый тип + название метода

}
