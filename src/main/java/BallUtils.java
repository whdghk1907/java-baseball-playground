public class BallUtils {

    BallException exception = new BallException();
    public int validateLocation(int location) {
        if(location > 3){
            exception.locationThrow();
        }
        return location;
    }

    public int validateNumber(int number) {
        if (number > 10) {
            exception.numberThrow();
        }
        return number;
    }
}
