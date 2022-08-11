package com.vaadin.starter.skeleton;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;

public class InAppLinks {

  public static Button buildInAppLink(String target, String label) {
    final Button button = new Button(label);

    button.addClickListener(l -> UI.getCurrent().navigate(target));

    return button;
  }

  public static Button linkToMain() {
    return buildInAppLink("", "Open main view");
  }

  public static Button linkToSecond() {
    return buildInAppLink("second", "Open second view");
  }

  public static Button linkToThird() {
    return buildInAppLink("third", "Open third view");
  }
}
