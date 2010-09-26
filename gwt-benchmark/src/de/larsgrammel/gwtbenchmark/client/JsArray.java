package de.larsgrammel.gwtbenchmark.client;

import com.google.gwt.core.client.JavaScriptObject;

class JsArray extends JavaScriptObject {

	protected JsArray() {
	}

	public static native JsArray create() /*-{ return new Object(); }-*/;
	
	public final native void add(String e) /*-{ this[length] = e; }-*/;
	
	public final native int length() /*-{ return this.length; }-*/;

	public final native String get(int i) /*-{ return this[i];     }-*/;
	
	public final native boolean contains(String e) /*-{ 
      var i = this.length;
	  while (i--) {
        if (this[i] === e) {
		  return true;
		}
      }
	  return false;
	}-*/;

	
}