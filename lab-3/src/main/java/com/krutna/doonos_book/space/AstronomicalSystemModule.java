package com.krutna.doonos_book.space;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.krutna.doonos_book.space.objects.AstronomicalObject;

class AstronomicalSystemModule implements Module {

  @Override
  public void configure(Binder binder) {
    binder.bind(AstronomicalObject.class).to(AstronomicalObject.class);
  }
}
