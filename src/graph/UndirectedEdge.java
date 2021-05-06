package graph;

public class UndirectedEdge extends Edge{

  public UndirectedEdge( int id, String color ){
    super(id,color);
  }
  
  public String toString(){
    String affichage = "UndirectedEdge : " + super.id + " color : " + super.color;

    return affichage;
  }
  
}