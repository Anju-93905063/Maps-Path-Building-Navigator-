public class BikeBehavior implements TransportBehavior {
    @Override
    public PathNode buildPath(Location A, Location B) {
        System.out.println("Building bike path from " + A + " to " + B);
        return new PathNode(A);
    }
}
