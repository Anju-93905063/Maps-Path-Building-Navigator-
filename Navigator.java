public class Navigator {
    private TransportBehavior transportBehavior;

    public void setTransportBehavior(String type) {
        TransportFactory factory = new TransportFactory();
        this.transportBehavior = factory.createTransport(type);
    }

    public PathNode getPath(Location A, Location B) {
        if (transportBehavior == null) {
            throw new IllegalStateException("Transport mode not set. Please select a transport mode.");
        }
        return transportBehavior.buildPath(A, B);
    }
}
