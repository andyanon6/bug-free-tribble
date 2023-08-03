package com.certification.ttv3.f;

import com.certification.ttv3.TrainingTool;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

public final class n implements URLStreamHandlerFactory {
  private TrainingTool a;
  
  public n(TrainingTool paramTrainingTool) {
    this.a = paramTrainingTool;
  }
  
  public final URLStreamHandler createURLStreamHandler(String paramString) {
    return (paramString.compareTo("ttzipimage") == 0) ? new l(this.a) : null;
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/f/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */