public class CarBehavior implements TransportBehavior {
    @Override
    public PathNode buildPath(Location A, Location B) {
        System.out.println("Building car path from " + A + " to " + B);
        return new PathNode(A);
    }
}
