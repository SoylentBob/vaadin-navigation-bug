package com.vaadin.starter.skeleton;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.Route;

@Route("third")
public class ThirdView extends Div {

  public ThirdView() {
    super();

    add(new H1("Third view"), InAppLinks.linkToMain(), InAppLinks.linkToSecond());
  }
}
