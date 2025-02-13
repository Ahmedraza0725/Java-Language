/*package hierarchicaldemo;
class PolyLine extends Shape {
    private int[][] points;

    public PolyLine(int[][] points) {
        super(points[0][0], points[0][1]);
        this.points = points;
    }

    @Override
    public void show() {
        System.out.println("PolyLine: " + toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Points: ");
        for (int[] point : points) {
            sb.append("(").append(point[0]).append(", ").append(point[1]).append(") ");
        }
        return sb.toString();
    }
}*/