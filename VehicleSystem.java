class Vehicle {
    String make;
    String model;
    int registrationNo;
    Vehicle(String make, String model,int registrationNo){
        this.make = make;
        this.model = model;
        this.registrationNo = registrationNo;
    }
    void display() {
        System.out.println("Make: " + make + ", Model: " + model + ", Reg: " + registrationNo);
    }
}
class ElectricVehicle extends Vehicle{
    int batteryCapacity;
    ElectricVehicle(String make,String model, int registrationNo,int batteryCapacity){
        super(make, model, registrationNo);
        this.batteryCapacity = batteryCapacity;
    }
    void displayEV() {
        display();
        System.out.println("Battery: " + batteryCapacity + " kWh");
    }
}
class FastChargingEV extends ElectricVehicle{
    int chargingSpeed;
    FastChargingEV(String make, String model,int registrationNo,int batteryCapacity,int chargingSpeed){
        super(make,model,registrationNo,batteryCapacity);
        this.chargingSpeed = chargingSpeed;
    }
    void displayAll() {
        displayEV();
        System.out.println("Charging Speed: " + chargingSpeed + " kW");
    }
}
public class VehicleSystem {
    public static void main(String[]args){
        FastChargingEV EV1 = new FastChargingEV("Tesla","123",456,45,60);
        EV1.displayAll();
    }
}
