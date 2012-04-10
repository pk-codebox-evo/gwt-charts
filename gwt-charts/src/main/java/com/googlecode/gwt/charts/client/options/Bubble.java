/*
 * Copyright 2012 Rui Afonso
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.googlecode.gwt.charts.client.options;

import com.google.gwt.core.client.JavaScriptObject;

/**
 */

public class Bubble extends JavaScriptObject {
	public static Bubble create() {
		return createObject().cast();
	}

	protected Bubble() {
	}

	/**
	 * 
	 * @param opacity
	 */
	public final native void setOpacity(double opacity) /*-{
		this.opacity = opacity;
	}-*/;

	/**
	 * 
	 * @param stroke The color of the bubbles' stroke.
	 */
	public final native void setStroke(String stroke) /*-{
		this.stroke = stroke;
	}-*/;

	/**
	 * 
	 * @param textStyle
	 */
	public final native void setTextStyle(TextStyle textStyle) /*-{
		this.textStyle = textStyle;
	}-*/;

}
