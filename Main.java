public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        // Define locations
        Location locA = new Location(12.9716, 77.5946); // Bangalore
        Location locB = new Location(28.7041, 77.1025); // Delhi

        // Set transport mode to walk
        System.out.println("Using Walk:");
        navigator.setTransportBehavior("walk");
        navigator.getPath(locA, locB);

        // Change transport mode to car
        System.out.println("\nUsing Car:");
        navigator.setTransportBehavior("car");
        navigator.getPath(locA, locB);

        // Change transport mode to bus
        System.out.println("\nUsing Bus:");
        navigator.setTransportBehavior("bus");
        navigator.getPath(locA, locB);

        // Change transport mode to bike
        System.out.println("\nUsing Bike:");
        navigator.setTransportBehavior("bike");
        navigator.getPath(locA, locB);
    }
}
