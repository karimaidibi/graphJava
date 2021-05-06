package graph;

public class DirectedEdge extends Edge{
  private int source;

  public DirectedEdge(int source, int id, String color){
    super(id, color);
    this.source = source;
  }

  public Vertex getSource(){
    return super.ends[source];
  }

  public Vertex getSink(){
    if(this.source == 0){
      return super.ends[1];
    } else{
      return super.ends[0];
    }
  }
}