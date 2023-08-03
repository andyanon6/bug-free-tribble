package com.certification.ttv3.f;

import com.certification.ttv3.TrainingTool;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

public final class l extends URLStreamHandler {
  private TrainingTool a;
  
  public l(TrainingTool paramTrainingTool) {
    this.a = paramTrainingTool;
  }
  
  protected final URLConnection openConnection(URL paramURL) {
    return new m(paramURL, this.a);
  }
  
  protected final String toExternalForm(URL paramURL) {
    return "ttzipimage".concat(":").concat(paramURL.getFile());
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/f/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */