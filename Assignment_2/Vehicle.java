public class Vehicle{

    public String brand;
    public String model;
    public  java.time.Year yearOfMfg;
    public String color;
    public char fuelType; //E-Electric, P-Petrol, D-Diesel
    // public float mileage;
    public double price;
    public int seatingCapacity;
    private String mfgCode;
    private int noOfServices;

    //constructor
    public Vehicle(){
        brand = "Toyota";
        model = "Camry";
        yearOfMfg = java.time.Year.of(2025);
        fuelType = 'P';
        seatingCapacity = 5;
        price = 2400000; 
    }

    public Vehicle(String brand, String model, double price, String color){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public Vehicle(char fuelType, double price, String mfgCode){
        this.fuelType = fuelType;
        this.price = price;
        this.mfgCode = mfgCode;
    }

    //setter and getter
    public void setMfgCode(String mCode){
        mfgCode = mCode;
    }

    public String getMfgCode(){
        return mfgCode;
    }

    public int getNoOfServices(){
        return noOfServices; 
    }

    public void start(){
        System.out.println("start ignition by pressing the start button");
        System.out.println("Your intital speed is 10 kmph\n");
    }

    public void stop(){
        System.out.println("stop ignition by pressing the start/stop button");
        System.out.println("You are stopped.\n");
    }

    public void drive(){
        System.out.println("wear your seatbelt");
        System.out.println("Stay in your lane");
        System.out.println("stop at red and go at green");
        System.out.println("Average speed is 50 kmph\n");

    }

    public int accelerate(int initSp){
        return initSp += 20;
    }

    public double mileage(double fuelAmt, double distance){
        return distance/fuelAmt;
    }
    



    public static void vehicleDetails(Vehicle ve){
        System.out.println("********************************************");
        System.out.println("Vehicle Details: ");
        System.out.println("Brand Name: " + ve.brand);
        System.out.println("model: " + ve.model);
        System.out.println("Year of MAnufacturing: " + ve.yearOfMfg);
        System.out.println("Fuel Type: " + ve.fuelType);
        System.out.println("Price: " + ve.price);
        System.out.println("Seating Capacity: " + ve.seatingCapacity);
        System.out.println("********************************************");




    }
}




