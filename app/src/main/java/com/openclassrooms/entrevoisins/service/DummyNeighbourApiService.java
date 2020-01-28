package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.List;

/**
 * Dummy mock for the Api
 */
public class DummyNeighbourApiService implements  NeighbourApiService {

  private List<Neighbour> neighbours = DummyNeighbourGenerator.generateNeighbours();


  /**
   * {@inheritDoc}
   */
  @Override
  public List<Neighbour> getNeighbours() {
    
    return neighbours;
  }


  @Override
  public void addNeighbour(){
    Neighbour toto = new Neighbour(99, "toto", "http://i.pravatar.cc/150?u=a042581f4e29026704d");
    neighbours.add(toto);
  }



  /**
   * {@inheritDoc}
   */
  @Override
  public void deleteNeighbour(Neighbour neighbour) {
    neighbours.remove(neighbour);
  }
}
