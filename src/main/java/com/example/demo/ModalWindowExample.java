package com.example.demo;

import org.apache.wicket.Page;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow;
import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow.PageCreator;
import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow.WindowClosedCallback;
import org.apache.wicket.markup.html.WebPage;

public class ModalWindowExample extends WebPage {

	private ModalWindow modalWindow;

	public <T> ModalWindowExample() {
		modalWindow = new ModalWindow("modalWindow");
		modalWindow.setPageCreator(new PageCreator() {
			@Override
			public Page createPage() {
				return new WelcomePage();
			}
		});

		modalWindow.setTitle("ModalWindowExample");
		modalWindow.setWindowClosedCallback(new WindowClosedCallback() {

			@Override
			public void onClose(AjaxRequestTarget target) {
				// TODO Auto-generated method stub

			}
		});

		add(new AjaxLink<T>("viewLink") {

			@Override
			public void onClick(AjaxRequestTarget target) {
				modalWindow.show(target);
			}
		});

		add(modalWindow);
	}

}
