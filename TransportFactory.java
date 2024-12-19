public class TransportFactory {
    public TransportBehavior createTransport(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Transport type cannot be null or empty.");
        }

        switch (type.toLowerCase()) {
            case "walk": return new WalkBehavior();
            case "car": return new CarBehavior();
            case "bus": return new BusBehavior();
            case "bike": return new BikeBehavior();
            default: throw new IllegalArgumentException("Unsupported transport type: " + type);
        }
    }
}
