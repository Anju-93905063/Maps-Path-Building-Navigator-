public class PathNode {
    PathNode prev;
    PathNode next;
    Location location;

    public PathNode(Location _location) {
        location = _location;
    }

    @Override
    public String toString() {
        return location.toString();
    }
}
