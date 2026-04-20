import java.io.*;

public class InsertData {
    public static void insertData() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("Data_Student.csv", true));

        writer.write("103,Khushboo,AIML,90,89,78,95,81\n");
        writer.write("104,Karmanya,AIML,89,97,75,76,83\n");

        writer.close();
    }
}