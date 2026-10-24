

import java.util.*;

public class Main {

    static final double EPS = 1e-8;

    static class Point {
        double x, y;

        Point(double x, double y) {
            this.x = Math.round(x * 100.0) / 100.0;
            this.y = Math.round(y * 100.0) / 100.0;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Point)) return false;
            Point p = (Point) obj;
            return Double.compare(x, p.x) == 0
                    && Double.compare(y, p.y) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(Math.round(x * 100),
                                Math.round(y * 100));
        }
    }

    static class Stick {
        Point a, b;

        Stick(Point a, Point b) {
            this.a = a;
            this.b = b;
        }
    }

    static Map<Point, Set<Point>> graph;
    static Map<Point, Integer> state;
    static Map<Point, Point> parent;
    static List<Point> cycle;

    static double distance(Point a, Point b) {
        return Math.hypot(a.x - b.x, a.y - b.y);
    }

    static Point intersection(Stick s1, Stick s2) {
        double ax = s1.a.x, ay = s1.a.y;
        double bx = s1.b.x, by = s1.b.y;
        double cx = s2.a.x, cy = s2.a.y;
        double dx = s2.b.x, dy = s2.b.y;

        double rx = bx - ax, ry = by - ay;
        double sx = dx - cx, sy = dy - cy;

        double den = rx * sy - ry * sx;

        if (Math.abs(den) < EPS) return null;

        double t = ((cx - ax) * sy - (cy - ay) * sx) / den;
        double u = ((cx - ax) * ry - (cy - ay) * rx) / den;

        if (t < -EPS || t > 1 + EPS ||
            u < -EPS || u > 1 + EPS) {
            return null;
        }

        return new Point(ax + t * rx, ay + t * ry);
    }

    static void addEdge(Point a, Point b) {
        if (a.equals(b)) return;

        graph.computeIfAbsent(a, k -> new LinkedHashSet<>()).add(b);
        graph.computeIfAbsent(b, k -> new LinkedHashSet<>()).add(a);
    }

    static boolean dfs(Point u, Point par) {
        state.put(u, 1);

        for (Point v : graph.getOrDefault(
                u, Collections.emptySet())) {

            if (v.equals(par)) continue;

            int st = state.getOrDefault(v, 0);

            if (st == 0) {
                parent.put(v, u);

                if (dfs(v, u)) return true;

            } else if (st == 1) {
                // Found a back edge: reconstruct the cycle.
                cycle = new ArrayList<>();

                Point cur = u;
                cycle.add(cur);

                while (!cur.equals(v)) {
                    cur = parent.get(cur);

                    if (cur == null) {
                        cycle.clear();
                        break;
                    }

                    cycle.add(cur);
                }

                if (cycle.size() >= 3) return true;
            }
        }

        state.put(u, 2);
        return false;
    }

    static double polygonArea(List<Point> polygon) {
        double sum = 0;
        int n = polygon.size();

        for (int i = 0; i < n; i++) {
            Point a = polygon.get(i);
            Point b = polygon.get((i + 1) % n);

            sum += a.x * b.y - a.y * b.x;
        }

        return Math.abs(sum) / 2.0;
    }

    static double polygonPerimeter(List<Point> polygon) {
        double perimeter = 0;
        int n = polygon.size();

        for (int i = 0; i < n; i++) {
            perimeter += distance(
                    polygon.get(i),
                    polygon.get((i + 1) % n));
        }

        return perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Stick> sticks = new ArrayList<>();
        List<List<Point>> splitPoints = new ArrayList<>();

        double totalLength = 0;

        for (int i = 0; i < n; i++) {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());

            sticks.add(new Stick(a, b));

            List<Point> points = new ArrayList<>();
            points.add(a);
            points.add(b);
            splitPoints.add(points);

            totalLength += distance(a, b);
        }

        // Find intersections and add them to both sticks.
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Point p = intersection(sticks.get(i), sticks.get(j));

                if (p != null) {
                    splitPoints.get(i).add(p);
                    splitPoints.get(j).add(p);
                }
            }
        }

        graph = new HashMap<>();

        // Split each stick into consecutive segments.
        for (int i = 0; i < n; i++) {
            Stick s = sticks.get(i);

            List<Point> points = new ArrayList<>(
                    new LinkedHashSet<>(splitPoints.get(i)));

            double vx = s.b.x - s.a.x;
            double vy = s.b.y - s.a.y;

            points.sort(Comparator.comparingDouble(p ->
                    (p.x - s.a.x) * vx + (p.y - s.a.y) * vy));

            for (int j = 0; j + 1 < points.size(); j++) {
                addEdge(points.get(j), points.get(j + 1));
            }
        }

        state = new HashMap<>();
        parent = new HashMap<>();
        cycle = null;

        // Find the closed figure.
        for (Point p : graph.keySet()) {
            if (state.getOrDefault(p, 0) == 0) {
                parent.put(p, null);

                if (dfs(p, null)) break;
            }
        }

        if (cycle == null || cycle.size() < 3) {
            System.out.println("Abandoned");
            sc.close();
            return;
        }

        double kalyanArea = polygonArea(cycle);
        double figurePerimeter = polygonPerimeter(cycle);

        // Remaining stick length can be cut and rearranged.
        double remainingLength = Math.max(
                0, totalLength - figurePerimeter);

        // Maximum area for a given perimeter: P^2 / (4*pi).
        double computerArea =
                remainingLength * remainingLength
                / (4.0 * Math.PI);

        if (computerArea > kalyanArea) {
            System.out.println("Computer");
        } else {
            System.out.println("Kalyan");
        }

        sc.close();
    }
}
