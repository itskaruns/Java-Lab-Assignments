public class VehicleMain {
    public static void main(String[] args){

        Vehicle v = new Vehicle();
        v.brand = "BMW";
        v.model = "330d";
        v.yearOfMfg = java.time.Year.of(2025);
        v.color = "Navy";
        v.fuelType = 'D';
        v.price = 6500000;
        v.seatingCapacity = 5;
        Vehicle.vehicleDetails(v);
        System.out.println();
        Vehicle v1 = new Vehicle("Honda", "City", 1200000, "Silver");
        Vehicle.vehicleDetails(v1);
        System.out.println();
        Vehicle v2 = new Vehicle('P', 2000000, "H12qwe23");
        Vehicle.vehicleDetails(v2);
        System.out.println("the mileage of v1 is:" + v1.mileage(35.5, 200));


        Vehicle[] garage = new Vehicle[3];
        garage[0] = v;
        garage[1] = v1;
        garage[2] = v2;
        System.out.println("Brand\tModel\tYear\tColor\tFuel\tSeats\tPrice\tMileage\tMfgCode\tServices");
        for(int i = 0; i < garage.length; i++){
            garage[i].accelerate(20);
            
            if (garage[i].fuelType == 'D'){
                double m = garage[i].mileage(50, 500);
                printTabular(garage[i], m );
        
            }
            else if (garage[i].fuelType == 'P' || garage[i].fuelType == 'C'){
                double m = garage[i].mileage(40, 500);
                printTabular(garage[i], m );
    
            }
            else{
                float m = 0;
                printTabular(garage[i], m );
            }
        } 
    }

    public static void printTabular(Vehicle v, double m){
        System.out.println(v.brand + "\t" + v.model + "\t" + v.yearOfMfg + "\t" + v.color + "\t" + v.fuelType + "\t" + v.seatingCapacity + "\t" + v.price + "\t" + m + "\t" + v.getMfgCode() + "\t" + v.getNoOfServices());
    }
    }