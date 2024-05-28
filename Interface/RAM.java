public class RAM {
     String make = "DDR4";

     int readOff = 3;
     float writeOff = 2.5f;

     @Override
    public String toString() {
        return "RAM{" +
                "name='" + make + '\'' +
                ", readspeed=" + readOff +
                ", writespeed=" + writeOff +
                '}';
    }
}
