package com.certification.ttv3.f;

import com.certification.ttv3.TrainingTool;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

final class m extends URLConnection {
  private TrainingTool a;
  
  protected m(URL paramURL, TrainingTool paramTrainingTool) {
    super(paramURL);
    this.a = paramTrainingTool;
  }
  
  public final void connect() {}
  
  public final InputStream getInputStream() {
    return this.a.b(this.url.getFile());
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/f/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */