package gof.creational.builder.product;

import com.imorochi.gof.creational.builder.parts.basement.Basement;
import com.imorochi.gof.creational.builder.parts.interior.Interior;
import com.imorochi.gof.creational.builder.parts.roof.Roof;
import com.imorochi.gof.creational.builder.parts.structure.Structure;

public class Cabin extends House {

  public Cabin(Basement basement, Structure structure, Roof roof, Interior interior) {
    super(basement, structure, roof, interior);
  }
  
}
