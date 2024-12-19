public class WalkBehavior implements TransportBehavior {
    @Override
    public PathNode buildPath(Location A, Location B) {
        System.out.println("Building walking path from " + A + " to " + B);
        return new PathNode(A);
    }
}
