package graph;
import java.lang.Object;

public class Vertex {
  private int id;
  private Object info;
  private String color;
  private int cptVertices; // Count the number of vertex declared

  public Vertex(int id, Object info, String color){
    this.id = id;
    this.info = info;
    this.color = color;
    cptVertices++;
  }

  public String toString(){
    String affichage = " Vertex : " + this.id + "color : " + this.color;

    return affichage;
  }

  public int nbOfVertices(){
    return this.cptVertices;
  }

}