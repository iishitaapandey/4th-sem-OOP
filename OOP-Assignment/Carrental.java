class Carrental {
    int carId;
    String carType;
    float rent;

    void getCar(int id, String type) {
        carId = id;
        carType = type;
    }

    void getRent() {
        if(carType.equals("Small"))
            rent = 1000;
        else if (carType.equals("Van"))
            rent = 800;
        else
            rent = 2500;
    }

    void showCar() {
        System.out.println(carId + " " + carType + " " + rent);
    }

    public static void main(String[] args) {
        Carrental c = new Carrental();
        c.getCar(1, "SUV");
        c.getRent();
        c.showCar();
    }
}