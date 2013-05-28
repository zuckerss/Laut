package com;

import com.vaadin.data.Property;
import com.vaadin.event.FieldEvents;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

/**
 * Created with IntelliJ IDEA.
 * User: makisi
 * Date: 28.05.13 (22)
 * Time: 01:21
 * To change this template use File | Settings | File Templates.
 */
public class LautApp extends UI{
    Label label1;
    TextField searchField;
    @Override
    public void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        searchField = new TextField();
	    label1 = new Label("Heldasdald!");
	    label1.setValue("liebe");

        searchField.addTextChangeListener(new FieldEvents.TextChangeListener() {
	        @Override
	        public void textChange(FieldEvents.TextChangeEvent event) {
		        label1.setValue(event.getText());
		        //Notification.show(event.getText());
	        }
        });

        setContent(layout);
	    layout.addComponent(searchField);

	    layout.addComponent(label1);
    }


}
