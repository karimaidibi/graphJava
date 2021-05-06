package graph;

public abstract class Edge{
  protected int id;
  protected String color;
  protected Vertex[] ends = new Vertex[2];
  private int nbOfEdges; //Count the number of Edges declared

   

  public Edge( int id, String color){
    this.id = id;
    this.color = color;
  } 

  public String toString(){
    String affichage = " Edge : " + this.id + " Color : " + this.color;

    return affichage;
  }

  public int nbOfEdges(){
    return this.nbOfEdges;
  }

}
  