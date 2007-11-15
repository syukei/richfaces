package org.richfaces.demo.pmenu;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.richfaces.component.UIPanelMenuItem;

public class PanelMenu {
	private Object current;
	private boolean singleMode;
	public boolean isSingleMode() {
		return singleMode;
	}

	public void setSingleMode(boolean singleMode) {
		this.singleMode = singleMode;
	}

	public PanelMenu() {
	}
	
	public Object getCurrent() {
		return this.current;
	}
	
	public void setCurrent(Object current) {
		this.current = current;
	}
	public String updateCurrent() {
		FacesContext context=FacesContext.getCurrentInstance();
		setCurrent(context.getExternalContext().getRequestParameterMap().get("current"));
		System.out.println("fake called.");
		return null;
	}
	public void updateCurrent(ActionEvent event) {
		setCurrent(((UIPanelMenuItem)event.getComponent()).getLabel().toString());
	}
}
