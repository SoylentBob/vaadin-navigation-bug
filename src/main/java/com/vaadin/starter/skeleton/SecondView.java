package com.vaadin.starter.skeleton;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.Route;

@Route("second")
public class SecondView extends Div {

  public SecondView() {
    super();

    add(new H1("Second View"), InAppLinks.linkToMain(), InAppLinks.linkToThird());
  }
}
