package encapulation;

public class physics {

    float calVelocity (float distance, int time){
        return (distance/time);
    }

    float calVelocity (float initialVelocity, float acceleration, int time){
        return initialVelocity + (acceleration/time);
    }
}
