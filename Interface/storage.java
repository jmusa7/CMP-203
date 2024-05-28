public class storage {
    String type = "ssd";

    String manufacturer = "samsung";

    int capacity = 512;

     @Override
    public String toString() {
        return "storage{" +
                "type='" + type + '\'' +
                ", manufacturer='" + manufacturer+ '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
