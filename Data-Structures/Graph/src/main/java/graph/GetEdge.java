package graph;

import java.util.ArrayList;

public class GetEdge {
    public static Result GetEdge(Graph graph, String[] itinerary) {
        int cost = 0;
        Boolean canDo = true;
        for(int i = 0; i < itinerary.length-1; i++) {
            String currentKey = itinerary[i];
            ArrayList<GraphEdge> tempAdjList = graph.getNeighbors(currentKey);
            // Check if an edge already exists between the two nodes.
            for(int j = 0; j < tempAdjList.size(); j++) {
                // If yes, do not add edge.
                if(tempAdjList.get(j).getDestKey() != itinerary[i+1]){
                    canDo = false;
                    break;
                }
                if(canDo) {
                    cost += tempAdjList.get(j).getWeight();
                }
            }

        }
        Result newResult = new Result(cost, canDo);
        return newResult;
    }
}

class Result {
    int cost;
    boolean canDo;

    Result (int cost, boolean canDo) {
        this.canDo = canDo;
        if (canDo) {
            this.cost = cost;
        }
    }

    public String toString() {
        return this.canDo + ", $" + this.cost;
    }
}
