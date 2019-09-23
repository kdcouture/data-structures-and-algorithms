package graph;

public class GraphEdge {
    private int weight;
    private String destKey;

    public GraphEdge(String dest, int weight) {
        this.destKey = dest;
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setDestKey(String destKey) {
        this.destKey = destKey;
    }

    public String getDestKey() {
        return destKey;
    }

    public String toString() {
        return "Dest > " + this.destKey + ", Weight > " + this.weight;
    }
}
