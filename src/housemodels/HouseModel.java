package housemodels;

import utilities.DateTimeInterface;

/**
 * Interface for a house model. A house model should is used to generate data.
 * 
 * @author Benedict Wilkins
 *
 */
public interface HouseModel {
  public Double getReading(DateTimeInterface time);
}
