package com.imorochi.gof.creational.builder.product;

import com.imorochi.gof.creational.builder.parts.basement.Basement;
import com.imorochi.gof.creational.builder.parts.interior.Interior;
import com.imorochi.gof.creational.builder.parts.roof.Roof;
import com.imorochi.gof.creational.builder.parts.structure.Structure;

public abstract class House {
  
  public Basement basement;
  public Structure structure;
  public Roof roof;
  public Interior interior;

  public House(Basement basement, Structure structure, Roof roof, Interior interior) {
    this.basement = basement;
    this.structure = structure;
    this.roof = roof;
    this.interior = interior;
  }
}
