package com.vaadin.starter.skeleton;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("second")
public class SecondView extends VerticalLayout {

  public SecondView() {
    super();

    add(new H1("Second View"), InAppLinks.linkToMain(), InAppLinks.linkToThird());
  }
}
