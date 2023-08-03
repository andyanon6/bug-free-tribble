package com.certification.ttv3.f;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class a {
  private static final byte[] a;
  
  private static final byte[] b;
  
  private static final byte[] c;
  
  private static final byte[] d;
  
  private static final byte[] e;
  
  private static final byte[] f;
  
  static {
    a = new byte[] { 
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47 };
    b = new byte[] { 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, 
        -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 
        54, 55, 56, 57, 58, 59, 60, 61, -9, -9, 
        -9, -1, -9, -9, -9, 1, 2, 3, 4, 5, 
        6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 
        16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 
        -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 
        30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 
        40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 
        50, 51, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9 };
    c = new byte[] { 
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 45, 95 };
    d = new byte[] { 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, 
        -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 
        54, 55, 56, 57, 58, 59, 60, 61, -9, -9, 
        -9, -1, -9, -9, -9, 1, 2, 3, 4, 5, 
        6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 
        16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 
        -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 
        30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 
        40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 
        50, 51, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9 };
    e = new byte[] { 
        45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 
        57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 
        74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 
        84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 
        99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 
        109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 
        119, 120, 121, 122 };
    f = new byte[] { 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, 
        -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, 1, 2, 3, 
        4, 5, 6, 7, 8, 9, 10, -9, -9, -9, 
        -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 
        17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 
        27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 
        -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 
        42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 
        52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 
        62, 63, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9 };
  }
  
  private static final byte[] b(int paramInt) {
    return ((paramInt & 0x10) == 16) ? d : (((paramInt & 0x20) == 32) ? f : b);
  }
  
  private static byte[] a(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3, int paramInt4) {
    byte[] arrayOfByte = (((paramInt4 = paramInt4) & 0x10) == 16) ? c : (((paramInt4 & 0x20) == 32) ? e : a);
    int i = ((paramInt2 > 0) ? (paramArrayOfbyte1[paramInt1] << 24 >>> 8) : 0) | ((paramInt2 > 1) ? (paramArrayOfbyte1[paramInt1 + 1] << 24 >>> 16) : 0) | ((paramInt2 > 2) ? (paramArrayOfbyte1[paramInt1 + 2] << 24 >>> 24) : 0);
    switch (paramInt2) {
      case 3:
        paramArrayOfbyte2[paramInt3] = arrayOfByte[i >>> 18];
        paramArrayOfbyte2[paramInt3 + 1] = arrayOfByte[i >>> 12 & 0x3F];
        paramArrayOfbyte2[paramInt3 + 2] = arrayOfByte[i >>> 6 & 0x3F];
        paramArrayOfbyte2[paramInt3 + 3] = arrayOfByte[i & 0x3F];
        return paramArrayOfbyte2;
      case 2:
        paramArrayOfbyte2[paramInt3] = arrayOfByte[i >>> 18];
        paramArrayOfbyte2[paramInt3 + 1] = arrayOfByte[i >>> 12 & 0x3F];
        paramArrayOfbyte2[paramInt3 + 2] = arrayOfByte[i >>> 6 & 0x3F];
        paramArrayOfbyte2[paramInt3 + 3] = 61;
        return paramArrayOfbyte2;
      case 1:
        paramArrayOfbyte2[paramInt3] = arrayOfByte[i >>> 18];
        paramArrayOfbyte2[paramInt3 + 1] = arrayOfByte[i >>> 12 & 0x3F];
        paramArrayOfbyte2[paramInt3 + 2] = 61;
        paramArrayOfbyte2[paramInt3 + 3] = 61;
        return paramArrayOfbyte2;
    } 
    return paramArrayOfbyte2;
  }
  
  public static String a(byte[] paramArrayOfbyte) {
    String str = null;
    try {
      str = a(paramArrayOfbyte, 0, paramArrayOfbyte.length, 0);
    } catch (IOException iOException) {
      if (!g)
        throw new AssertionError(iOException.getMessage()); 
    } 
    if (!g && str == null)
      throw new AssertionError(); 
    return str;
  }
  
  private static String a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    paramArrayOfbyte = b(paramArrayOfbyte, 0, paramInt2, 0);
    try {
      return new String(paramArrayOfbyte, "US-ASCII");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      return new String(paramArrayOfbyte);
    } 
  }
  
  private static byte[] b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    if (paramArrayOfbyte == null)
      throw new NullPointerException("Cannot serialize a null array."); 
    if (paramInt1 < 0)
      throw new IllegalArgumentException("Cannot have negative offset: " + paramInt1); 
    if (paramInt2 < 0)
      throw new IllegalArgumentException("Cannot have length offset: " + paramInt2); 
    if (paramInt1 + paramInt2 > paramArrayOfbyte.length)
      throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramArrayOfbyte.length) })); 
    if ((paramInt3 & 0x2) != 0) {
      ByteArrayOutputStream byteArrayOutputStream = null;
      GZIPOutputStream gZIPOutputStream = null;
      b b = null;
      try {
        byteArrayOutputStream = new ByteArrayOutputStream();
        b = new b(byteArrayOutputStream, 0x1 | paramInt3);
        (gZIPOutputStream = new GZIPOutputStream(b)).write(paramArrayOfbyte, paramInt1, paramInt2);
        gZIPOutputStream.close();
      } catch (IOException iOException2) {
        IOException iOException1;
        throw iOException1 = null;
      } finally {
        try {
          gZIPOutputStream.close();
        } catch (Exception exception) {}
        try {
          b.close();
        } catch (Exception exception) {}
        try {
          byteArrayOutputStream.close();
        } catch (Exception exception) {}
      } 
      return byteArrayOutputStream.toByteArray();
    } 
    boolean bool = ((paramInt3 & 0x8) != 0) ? true : false;
    int i = (paramInt2 / 3 << 2) + ((paramInt2 % 3 > 0) ? 4 : 0);
    if (bool)
      i += i / 76; 
    byte[] arrayOfByte = new byte[i];
    byte b1 = 0;
    byte b2 = 0;
    i = paramInt2 - 2;
    byte b3 = 0;
    while (b1 < i) {
      a(paramArrayOfbyte, b1 + paramInt1, 3, arrayOfByte, b2, paramInt3);
      b3 += true;
      if (bool && b3 >= 76) {
        arrayOfByte[b2 + 4] = 10;
        b2++;
        b3 = 0;
      } 
      b1 += 3;
      b2 += 4;
    } 
    if (b1 < paramInt2) {
      a(paramArrayOfbyte, b1 + paramInt1, paramInt2 - b1, arrayOfByte, b2, paramInt3);
      b2 += 4;
    } 
    if (b2 <= arrayOfByte.length - 1) {
      paramArrayOfbyte = new byte[b2];
      System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, 0, b2);
      return paramArrayOfbyte;
    } 
    return arrayOfByte;
  }
  
  private static int b(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, int paramInt3) {
    if (paramArrayOfbyte1 == null)
      throw new NullPointerException("Source array was null."); 
    if (paramArrayOfbyte2 == null)
      throw new NullPointerException("Destination array was null."); 
    if (paramInt1 < 0 || paramInt1 + 3 >= paramArrayOfbyte1.length)
      throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", new Object[] { Integer.valueOf(paramArrayOfbyte1.length), Integer.valueOf(paramInt1) })); 
    if (paramInt2 < 0 || paramInt2 + 2 >= paramArrayOfbyte2.length)
      throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", new Object[] { Integer.valueOf(paramArrayOfbyte2.length), Integer.valueOf(paramInt2) })); 
    byte[] arrayOfByte = b(paramInt3);
    if (paramArrayOfbyte1[paramInt1 + 2] == 61) {
      i = (arrayOfByte[paramArrayOfbyte1[paramInt1]] & 0xFF) << 18 | (arrayOfByte[paramArrayOfbyte1[paramInt1 + 1]] & 0xFF) << 12;
      paramArrayOfbyte2[paramInt2] = (byte)(i >>> 16);
      return 1;
    } 
    if (i[paramInt1 + 3] == 61) {
      i = (arrayOfByte[i[paramInt1]] & 0xFF) << 18 | (arrayOfByte[i[paramInt1 + 1]] & 0xFF) << 12 | (arrayOfByte[i[paramInt1 + 2]] & 0xFF) << 6;
      paramArrayOfbyte2[paramInt2] = (byte)(i >>> 16);
      paramArrayOfbyte2[paramInt2 + 1] = (byte)(i >>> 8);
      return 2;
    } 
    int i = (arrayOfByte[i[paramInt1]] & 0xFF) << 18 | (arrayOfByte[i[paramInt1 + 1]] & 0xFF) << 12 | (arrayOfByte[i[paramInt1 + 2]] & 0xFF) << 6 | arrayOfByte[i[paramInt1 + 3]] & 0xFF;
    paramArrayOfbyte2[paramInt2] = (byte)(i >> 16);
    paramArrayOfbyte2[paramInt2 + 1] = (byte)(i >> 8);
    paramArrayOfbyte2[paramInt2 + 2] = (byte)i;
    return 3;
  }
  
  public static byte[] b(byte[] paramArrayOfbyte) {
    return paramArrayOfbyte = c(paramArrayOfbyte, 0, paramArrayOfbyte.length, 0);
  }
  
  private static byte[] c(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    if (paramArrayOfbyte == null)
      throw new NullPointerException("Cannot decode null source array."); 
    if (paramInt2 + 0 > paramArrayOfbyte.length)
      throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", new Object[] { Integer.valueOf(paramArrayOfbyte.length), Integer.valueOf(0), Integer.valueOf(paramInt2) })); 
    if (paramInt2 == 0)
      return new byte[0]; 
    if (paramInt2 < 4)
      throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + paramInt2); 
    byte[] arrayOfByte1 = b(paramInt3);
    int i;
    byte[] arrayOfByte2 = new byte[i = paramInt2 * 3 / 4];
    int j = 0;
    byte[] arrayOfByte3 = new byte[4];
    byte b1 = 0;
    for (byte b2 = 0; b2 < paramInt2 + 0; b2++) {
      byte b;
      if ((b = arrayOfByte1[paramArrayOfbyte[b2] & 0xFF]) >= -5) {
        if (b >= -1) {
          arrayOfByte3[b1++] = paramArrayOfbyte[b2];
          if (b1 > 3) {
            j += b(arrayOfByte3, 0, arrayOfByte2, j, paramInt3);
            b1 = 0;
            if (paramArrayOfbyte[b2] == 61)
              break; 
          } 
        } 
      } else {
        throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", new Object[] { Integer.valueOf(paramArrayOfbyte[b2] & 0xFF), Integer.valueOf(b2) }));
      } 
    } 
    paramArrayOfbyte = new byte[j];
    System.arraycopy(arrayOfByte2, 0, paramArrayOfbyte, 0, j);
    return paramArrayOfbyte;
  }
  
  public static byte[] a(String paramString) {
    return a(paramString, 0);
  }
  
  private static byte[] a(String paramString, int paramInt) {
    if (paramString == null)
      throw new NullPointerException("Input string was null."); 
    try {
      arrayOfByte = paramString.getBytes("US-ASCII");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      arrayOfByte = paramString.getBytes();
    } 
    byte[] arrayOfByte;
    if ((arrayOfByte = c(arrayOfByte, 0, arrayOfByte.length, 0)).length >= 4) {
      int i = arrayOfByte[0] & 0xFF | arrayOfByte[1] << 8 & 0xFF00;
      if (35615 == i) {
        ByteArrayInputStream byteArrayInputStream = null;
        GZIPInputStream gZIPInputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        byte[] arrayOfByte1 = new byte[2048];
        try {
          byteArrayOutputStream = new ByteArrayOutputStream();
          byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
          gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
          int j;
          while ((j = gZIPInputStream.read(arrayOfByte1)) >= 0)
            byteArrayOutputStream.write(arrayOfByte1, 0, j); 
          arrayOfByte = byteArrayOutputStream.toByteArray();
        } catch (IOException iOException) {
          (arrayOfByte1 = null).printStackTrace();
        } finally {
          try {
            byteArrayOutputStream.close();
          } catch (Exception exception) {}
          try {
            gZIPInputStream.close();
          } catch (Exception exception) {}
          try {
            byteArrayInputStream.close();
          } catch (Exception exception) {}
        } 
      } 
    } 
    return arrayOfByte;
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */