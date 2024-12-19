public class BusBehavior implements TransportBehavior {
    @Override
    public PathNode buildPath(Location A, Location B) {
        System.out.println("Building bus path from " + A + " to " + B);
        return new PathNode(A);
    }
}
