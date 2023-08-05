package july29;
class Car {

    private String car_name;
    private int model;
    private String color;

    public void setModel(int model) {
        this.model = model;              // by his keyword instance variable model initialized by local variable
    }

    // initialize means set to the value
    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car_name='" + car_name + '\'' +
                ", model=" + model +
                ", color='" + color + '\'' +
                '}';
    }
}

    public class CarThisKeyWord {
        public static void main(String[] args) {
            Car input = new Car();
            input.setCar_name("infinity");
            input.setColor("Midnight blue");
            input.setModel(1001);

            System.out.println(input);

        }
    }


