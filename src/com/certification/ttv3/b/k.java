package com.certification.ttv3.b;

import com.certification.ttv3.TrainingTool;
import com.certification.ttv3.e.e;

public final class k {
  private TrainingTool a;
  
  private e b;
  
  public k(TrainingTool paramTrainingTool, e parame) {
    this.a = paramTrainingTool;
    this.b = parame;
  }
  
  public final f a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lcom/certification/ttv3/TrainingTool;
    //   4: invokevirtual r : ()Ljava/util/Properties;
    //   7: astore_2
    //   8: new com/certification/ttv3/b/f
    //   11: dup
    //   12: aload_0
    //   13: getfield a : Lcom/certification/ttv3/TrainingTool;
    //   16: aload_0
    //   17: getfield b : Lcom/certification/ttv3/e/e;
    //   20: invokespecial <init> : (Lcom/certification/ttv3/f/c;Lcom/certification/ttv3/e/e;)V
    //   23: dup
    //   24: astore_3
    //   25: iload_1
    //   26: invokevirtual c : (I)V
    //   29: iload_1
    //   30: ifne -> 48
    //   33: aload_2
    //   34: getstatic com/certification/ttv3/d/A.am : Ljava/lang/String;
    //   37: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   40: invokestatic parseInt : (Ljava/lang/String;)I
    //   43: istore #4
    //   45: goto -> 60
    //   48: aload_2
    //   49: getstatic com/certification/ttv3/d/A.at : Ljava/lang/String;
    //   52: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   55: invokestatic parseInt : (Ljava/lang/String;)I
    //   58: istore #4
    //   60: aload_0
    //   61: getfield b : Lcom/certification/ttv3/e/e;
    //   64: invokevirtual h : ()Ljava/util/ArrayList;
    //   67: astore #5
    //   69: new java/util/HashMap
    //   72: dup
    //   73: invokespecial <init> : ()V
    //   76: astore #6
    //   78: iconst_1
    //   79: istore #7
    //   81: iconst_0
    //   82: istore #8
    //   84: iconst_0
    //   85: istore #9
    //   87: iconst_0
    //   88: istore #10
    //   90: iload_1
    //   91: ifne -> 161
    //   94: aload_2
    //   95: getstatic com/certification/ttv3/d/A.an : Ljava/lang/String;
    //   98: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   101: ldc 'N'
    //   103: invokevirtual compareTo : (Ljava/lang/String;)I
    //   106: ifne -> 140
    //   109: iconst_0
    //   110: istore #7
    //   112: aload_2
    //   113: getstatic com/certification/ttv3/d/A.ao : Ljava/lang/String;
    //   116: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   119: invokestatic parseInt : (Ljava/lang/String;)I
    //   122: istore #9
    //   124: aload_2
    //   125: getstatic com/certification/ttv3/d/A.ap : Ljava/lang/String;
    //   128: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   131: invokestatic parseInt : (Ljava/lang/String;)I
    //   134: istore #10
    //   136: goto -> 140
    //   139: pop
    //   140: aload_2
    //   141: getstatic com/certification/ttv3/d/A.aq : Ljava/lang/String;
    //   144: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   147: ldc 'Y'
    //   149: invokevirtual compareTo : (Ljava/lang/String;)I
    //   152: ifne -> 225
    //   155: iconst_1
    //   156: istore #8
    //   158: goto -> 225
    //   161: aload_2
    //   162: getstatic com/certification/ttv3/d/A.au : Ljava/lang/String;
    //   165: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   168: ldc 'N'
    //   170: invokevirtual compareTo : (Ljava/lang/String;)I
    //   173: ifne -> 207
    //   176: iconst_0
    //   177: istore #7
    //   179: aload_2
    //   180: getstatic com/certification/ttv3/d/A.av : Ljava/lang/String;
    //   183: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   186: invokestatic parseInt : (Ljava/lang/String;)I
    //   189: istore #9
    //   191: aload_2
    //   192: getstatic com/certification/ttv3/d/A.aw : Ljava/lang/String;
    //   195: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   198: invokestatic parseInt : (Ljava/lang/String;)I
    //   201: istore #10
    //   203: goto -> 207
    //   206: pop
    //   207: aload_2
    //   208: getstatic com/certification/ttv3/d/A.ax : Ljava/lang/String;
    //   211: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   214: ldc 'Y'
    //   216: invokevirtual compareTo : (Ljava/lang/String;)I
    //   219: ifne -> 225
    //   222: iconst_1
    //   223: istore #8
    //   225: iload #7
    //   227: ifeq -> 1765
    //   230: iconst_0
    //   231: istore #7
    //   233: goto -> 260
    //   236: aload #6
    //   238: iload #7
    //   240: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   243: aload #5
    //   245: iload #7
    //   247: invokevirtual get : (I)Ljava/lang/Object;
    //   250: checkcast com/certification/ttv3/e/u
    //   253: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   256: pop
    //   257: iinc #7, 1
    //   260: iload #7
    //   262: aload #5
    //   264: invokevirtual size : ()I
    //   267: if_icmplt -> 236
    //   270: new java/util/ArrayList
    //   273: dup
    //   274: aload #6
    //   276: invokevirtual keySet : ()Ljava/util/Set;
    //   279: invokespecial <init> : (Ljava/util/Collection;)V
    //   282: astore_1
    //   283: aload_2
    //   284: getstatic com/certification/ttv3/d/A.aE : Ljava/lang/String;
    //   287: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   290: ldc 'N'
    //   292: invokevirtual compareTo : (Ljava/lang/String;)I
    //   295: ifne -> 357
    //   298: aload_1
    //   299: invokevirtual iterator : ()Ljava/util/Iterator;
    //   302: astore #5
    //   304: goto -> 347
    //   307: aload #5
    //   309: invokeinterface next : ()Ljava/lang/Object;
    //   314: checkcast java/lang/Integer
    //   317: astore #7
    //   319: aload #6
    //   321: aload #7
    //   323: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   326: checkcast com/certification/ttv3/e/u
    //   329: dup
    //   330: astore #9
    //   332: invokevirtual c : ()I
    //   335: iconst_1
    //   336: if_icmpeq -> 347
    //   339: aload #6
    //   341: aload #7
    //   343: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   346: pop
    //   347: aload #5
    //   349: invokeinterface hasNext : ()Z
    //   354: ifne -> 307
    //   357: aload_2
    //   358: getstatic com/certification/ttv3/d/A.aH : Ljava/lang/String;
    //   361: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   364: ldc 'Y'
    //   366: invokevirtual compareTo : (Ljava/lang/String;)I
    //   369: ifne -> 458
    //   372: new java/util/ArrayList
    //   375: dup
    //   376: aload #6
    //   378: invokevirtual keySet : ()Ljava/util/Set;
    //   381: invokespecial <init> : (Ljava/util/Collection;)V
    //   384: dup
    //   385: astore_1
    //   386: invokevirtual iterator : ()Ljava/util/Iterator;
    //   389: astore #9
    //   391: goto -> 448
    //   394: aload #9
    //   396: invokeinterface next : ()Ljava/lang/Object;
    //   401: checkcast java/lang/Integer
    //   404: astore #5
    //   406: aload #6
    //   408: aload #5
    //   410: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   413: checkcast com/certification/ttv3/e/u
    //   416: astore_1
    //   417: aload_0
    //   418: getfield a : Lcom/certification/ttv3/TrainingTool;
    //   421: aload_1
    //   422: invokevirtual a : ()Ljava/util/UUID;
    //   425: invokevirtual a : (Ljava/util/UUID;)Ljava/lang/String;
    //   428: invokevirtual trim : ()Ljava/lang/String;
    //   431: dup
    //   432: astore #7
    //   434: invokevirtual length : ()I
    //   437: ifne -> 448
    //   440: aload #6
    //   442: aload #5
    //   444: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   447: pop
    //   448: aload #9
    //   450: invokeinterface hasNext : ()Z
    //   455: ifne -> 394
    //   458: aload_2
    //   459: getstatic com/certification/ttv3/d/A.aA : Ljava/lang/String;
    //   462: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   465: ldc 'Topics'
    //   467: invokevirtual compareTo : (Ljava/lang/String;)I
    //   470: ifne -> 744
    //   473: aload_0
    //   474: getfield b : Lcom/certification/ttv3/e/e;
    //   477: invokevirtual a : ()Ljava/util/ArrayList;
    //   480: astore #7
    //   482: new java/util/HashMap
    //   485: dup
    //   486: invokespecial <init> : ()V
    //   489: astore #5
    //   491: iconst_0
    //   492: istore #9
    //   494: goto -> 654
    //   497: aload_2
    //   498: new java/lang/StringBuilder
    //   501: dup
    //   502: getstatic com/certification/ttv3/d/A.aC : Ljava/lang/String;
    //   505: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   508: invokespecial <init> : (Ljava/lang/String;)V
    //   511: iload #9
    //   513: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   516: invokevirtual toString : ()Ljava/lang/String;
    //   519: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   522: ifnull -> 604
    //   525: aload_2
    //   526: new java/lang/StringBuilder
    //   529: dup
    //   530: getstatic com/certification/ttv3/d/A.aC : Ljava/lang/String;
    //   533: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   536: invokespecial <init> : (Ljava/lang/String;)V
    //   539: iload #9
    //   541: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   544: invokevirtual toString : ()Ljava/lang/String;
    //   547: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   550: ldc 'Y'
    //   552: invokevirtual compareTo : (Ljava/lang/String;)I
    //   555: ifne -> 581
    //   558: aload #5
    //   560: aload #7
    //   562: iload #9
    //   564: invokevirtual get : (I)Ljava/lang/Object;
    //   567: checkcast com/certification/ttv3/e/y
    //   570: iconst_1
    //   571: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   574: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   577: pop
    //   578: goto -> 651
    //   581: aload #5
    //   583: aload #7
    //   585: iload #9
    //   587: invokevirtual get : (I)Ljava/lang/Object;
    //   590: checkcast com/certification/ttv3/e/y
    //   593: iconst_0
    //   594: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   597: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   600: pop
    //   601: goto -> 651
    //   604: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   607: new java/lang/StringBuilder
    //   610: dup
    //   611: getstatic com/certification/ttv3/d/A.aC : Ljava/lang/String;
    //   614: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   617: invokespecial <init> : (Ljava/lang/String;)V
    //   620: iload #9
    //   622: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   625: invokevirtual toString : ()Ljava/lang/String;
    //   628: invokevirtual println : (Ljava/lang/String;)V
    //   631: aload #5
    //   633: aload #7
    //   635: iload #9
    //   637: invokevirtual get : (I)Ljava/lang/Object;
    //   640: checkcast com/certification/ttv3/e/y
    //   643: iconst_0
    //   644: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   647: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   650: pop
    //   651: iinc #9, 1
    //   654: iload #9
    //   656: aload #7
    //   658: invokevirtual size : ()I
    //   661: if_icmplt -> 497
    //   664: new java/util/ArrayList
    //   667: dup
    //   668: aload #6
    //   670: invokevirtual keySet : ()Ljava/util/Set;
    //   673: invokespecial <init> : (Ljava/util/Collection;)V
    //   676: dup
    //   677: astore_1
    //   678: invokevirtual iterator : ()Ljava/util/Iterator;
    //   681: astore_1
    //   682: goto -> 735
    //   685: aload_1
    //   686: invokeinterface next : ()Ljava/lang/Object;
    //   691: checkcast java/lang/Integer
    //   694: astore #9
    //   696: aload #6
    //   698: aload #9
    //   700: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   703: checkcast com/certification/ttv3/e/u
    //   706: astore #10
    //   708: aload #5
    //   710: aload #10
    //   712: invokevirtual b : ()Lcom/certification/ttv3/e/y;
    //   715: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   718: checkcast java/lang/Boolean
    //   721: invokevirtual booleanValue : ()Z
    //   724: ifne -> 735
    //   727: aload #6
    //   729: aload #9
    //   731: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   734: pop
    //   735: aload_1
    //   736: invokeinterface hasNext : ()Z
    //   741: ifne -> 685
    //   744: aload_2
    //   745: getstatic com/certification/ttv3/d/A.aB : Ljava/lang/String;
    //   748: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   751: ldc 'Types'
    //   753: invokevirtual compareTo : (Ljava/lang/String;)I
    //   756: ifne -> 1000
    //   759: aload_2
    //   760: new java/lang/StringBuilder
    //   763: dup
    //   764: getstatic com/certification/ttv3/d/A.aD : Ljava/lang/String;
    //   767: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   770: invokespecial <init> : (Ljava/lang/String;)V
    //   773: ldc 'Single Choice'
    //   775: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   778: invokevirtual toString : ()Ljava/lang/String;
    //   781: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   784: ldc 'Y'
    //   786: invokevirtual compareTo : (Ljava/lang/String;)I
    //   789: ifne -> 796
    //   792: iconst_1
    //   793: goto -> 797
    //   796: iconst_0
    //   797: istore #7
    //   799: aload_2
    //   800: new java/lang/StringBuilder
    //   803: dup
    //   804: getstatic com/certification/ttv3/d/A.aD : Ljava/lang/String;
    //   807: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   810: invokespecial <init> : (Ljava/lang/String;)V
    //   813: ldc 'Multiple Choice'
    //   815: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   818: invokevirtual toString : ()Ljava/lang/String;
    //   821: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   824: ldc 'Y'
    //   826: invokevirtual compareTo : (Ljava/lang/String;)I
    //   829: ifne -> 836
    //   832: iconst_1
    //   833: goto -> 837
    //   836: iconst_0
    //   837: istore #5
    //   839: aload_2
    //   840: new java/lang/StringBuilder
    //   843: dup
    //   844: getstatic com/certification/ttv3/d/A.aD : Ljava/lang/String;
    //   847: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   850: invokespecial <init> : (Ljava/lang/String;)V
    //   853: ldc 'Interactive'
    //   855: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   858: invokevirtual toString : ()Ljava/lang/String;
    //   861: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   864: ldc 'Y'
    //   866: invokevirtual compareTo : (Ljava/lang/String;)I
    //   869: ifne -> 876
    //   872: iconst_1
    //   873: goto -> 877
    //   876: iconst_0
    //   877: istore #9
    //   879: new java/util/ArrayList
    //   882: dup
    //   883: aload #6
    //   885: invokevirtual keySet : ()Ljava/util/Set;
    //   888: invokespecial <init> : (Ljava/util/Collection;)V
    //   891: dup
    //   892: astore_1
    //   893: invokevirtual iterator : ()Ljava/util/Iterator;
    //   896: astore #10
    //   898: goto -> 990
    //   901: aload #10
    //   903: invokeinterface next : ()Ljava/lang/Object;
    //   908: checkcast java/lang/Integer
    //   911: astore_1
    //   912: aload #6
    //   914: aload_1
    //   915: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   918: checkcast com/certification/ttv3/e/u
    //   921: dup
    //   922: astore #11
    //   924: invokevirtual d : ()I
    //   927: tableswitch default -> 978, 1 -> 948, 2 -> 963
    //   948: iload #7
    //   950: ifne -> 990
    //   953: aload #6
    //   955: aload_1
    //   956: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   959: pop
    //   960: goto -> 990
    //   963: iload #5
    //   965: ifne -> 990
    //   968: aload #6
    //   970: aload_1
    //   971: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   974: pop
    //   975: goto -> 990
    //   978: iload #9
    //   980: ifne -> 990
    //   983: aload #6
    //   985: aload_1
    //   986: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   989: pop
    //   990: aload #10
    //   992: invokeinterface hasNext : ()Z
    //   997: ifne -> 901
    //   1000: aload_2
    //   1001: getstatic com/certification/ttv3/d/A.aF : Ljava/lang/String;
    //   1004: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   1007: ldc 'Y'
    //   1009: invokevirtual compareTo : (Ljava/lang/String;)I
    //   1012: ifne -> 1223
    //   1015: new java/util/ArrayList
    //   1018: dup
    //   1019: aload #6
    //   1021: invokevirtual keySet : ()Ljava/util/Set;
    //   1024: invokespecial <init> : (Ljava/util/Collection;)V
    //   1027: astore_1
    //   1028: new java/util/ArrayList
    //   1031: dup
    //   1032: invokespecial <init> : ()V
    //   1035: astore #7
    //   1037: iconst_0
    //   1038: istore #9
    //   1040: goto -> 1091
    //   1043: aload_2
    //   1044: new java/lang/StringBuilder
    //   1047: dup
    //   1048: getstatic com/certification/ttv3/d/A.aG : Ljava/lang/String;
    //   1051: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1054: invokespecial <init> : (Ljava/lang/String;)V
    //   1057: iload #9
    //   1059: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1062: invokevirtual toString : ()Ljava/lang/String;
    //   1065: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   1068: invokevirtual trim : ()Ljava/lang/String;
    //   1071: dup
    //   1072: astore #5
    //   1074: invokevirtual length : ()I
    //   1077: ifle -> 1088
    //   1080: aload #7
    //   1082: aload #5
    //   1084: invokevirtual add : (Ljava/lang/Object;)Z
    //   1087: pop
    //   1088: iinc #9, 1
    //   1091: iload #9
    //   1093: bipush #6
    //   1095: if_icmplt -> 1043
    //   1098: aload_1
    //   1099: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1102: astore #11
    //   1104: goto -> 1213
    //   1107: aload #11
    //   1109: invokeinterface next : ()Ljava/lang/Object;
    //   1114: checkcast java/lang/Integer
    //   1117: astore #10
    //   1119: iconst_0
    //   1120: istore #9
    //   1122: aload #6
    //   1124: aload #10
    //   1126: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1129: checkcast com/certification/ttv3/e/u
    //   1132: invokevirtual toString : ()Ljava/lang/String;
    //   1135: astore_1
    //   1136: aload #7
    //   1138: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1141: astore #12
    //   1143: goto -> 1190
    //   1146: aload #12
    //   1148: invokeinterface next : ()Ljava/lang/Object;
    //   1153: checkcast java/lang/String
    //   1156: astore #5
    //   1158: aload_1
    //   1159: new java/lang/StringBuilder
    //   1162: dup
    //   1163: ldc '(?i:.*'
    //   1165: invokespecial <init> : (Ljava/lang/String;)V
    //   1168: aload #5
    //   1170: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1173: ldc '.*)'
    //   1175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1178: invokevirtual toString : ()Ljava/lang/String;
    //   1181: invokevirtual matches : (Ljava/lang/String;)Z
    //   1184: ifeq -> 1190
    //   1187: iconst_1
    //   1188: istore #9
    //   1190: aload #12
    //   1192: invokeinterface hasNext : ()Z
    //   1197: ifne -> 1146
    //   1200: iload #9
    //   1202: ifne -> 1213
    //   1205: aload #6
    //   1207: aload #10
    //   1209: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1212: pop
    //   1213: aload #11
    //   1215: invokeinterface hasNext : ()Z
    //   1220: ifne -> 1107
    //   1223: aload_2
    //   1224: getstatic com/certification/ttv3/d/A.aI : Ljava/lang/String;
    //   1227: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   1230: ldc 'Y'
    //   1232: invokevirtual compareTo : (Ljava/lang/String;)I
    //   1235: ifne -> 1682
    //   1238: aload_0
    //   1239: getfield a : Lcom/certification/ttv3/TrainingTool;
    //   1242: invokevirtual i : ()Lcom/certification/ttv3/b/c;
    //   1245: astore #7
    //   1247: new java/util/ArrayList
    //   1250: dup
    //   1251: aload #6
    //   1253: invokevirtual keySet : ()Ljava/util/Set;
    //   1256: invokespecial <init> : (Ljava/util/Collection;)V
    //   1259: astore_1
    //   1260: aload_2
    //   1261: getstatic com/certification/ttv3/d/A.aJ : Ljava/lang/String;
    //   1264: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   1267: dup
    //   1268: astore #5
    //   1270: ldc 'NotAnswered'
    //   1272: invokevirtual compareTo : (Ljava/lang/String;)I
    //   1275: ifne -> 1359
    //   1278: aload_1
    //   1279: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1282: astore_1
    //   1283: goto -> 1347
    //   1286: aload_1
    //   1287: invokeinterface next : ()Ljava/lang/Object;
    //   1292: checkcast java/lang/Integer
    //   1295: astore #9
    //   1297: aload #7
    //   1299: aload #6
    //   1301: aload #9
    //   1303: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1306: checkcast com/certification/ttv3/e/u
    //   1309: invokevirtual a : ()Ljava/util/UUID;
    //   1312: invokevirtual c : (Ljava/util/UUID;)I
    //   1315: ifne -> 1339
    //   1318: aload #7
    //   1320: aload #6
    //   1322: aload #9
    //   1324: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1327: checkcast com/certification/ttv3/e/u
    //   1330: invokevirtual a : ()Ljava/util/UUID;
    //   1333: invokevirtual d : (Ljava/util/UUID;)I
    //   1336: ifeq -> 1347
    //   1339: aload #6
    //   1341: aload #9
    //   1343: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1346: pop
    //   1347: aload_1
    //   1348: invokeinterface hasNext : ()Z
    //   1353: ifne -> 1286
    //   1356: goto -> 1682
    //   1359: aload #5
    //   1361: ldc 'IncorrectlyAnswered'
    //   1363: invokevirtual compareTo : (Ljava/lang/String;)I
    //   1366: ifne -> 1429
    //   1369: aload_1
    //   1370: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1373: astore_1
    //   1374: goto -> 1417
    //   1377: aload_1
    //   1378: invokeinterface next : ()Ljava/lang/Object;
    //   1383: checkcast java/lang/Integer
    //   1386: astore #9
    //   1388: aload #7
    //   1390: aload #6
    //   1392: aload #9
    //   1394: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1397: checkcast com/certification/ttv3/e/u
    //   1400: invokevirtual a : ()Ljava/util/UUID;
    //   1403: invokevirtual d : (Ljava/util/UUID;)I
    //   1406: ifne -> 1417
    //   1409: aload #6
    //   1411: aload #9
    //   1413: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1416: pop
    //   1417: aload_1
    //   1418: invokeinterface hasNext : ()Z
    //   1423: ifne -> 1377
    //   1426: goto -> 1682
    //   1429: aload #5
    //   1431: ldc 'IncorrectMoreOften'
    //   1433: invokevirtual compareTo : (Ljava/lang/String;)I
    //   1436: ifne -> 1517
    //   1439: aload_1
    //   1440: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1443: astore_1
    //   1444: goto -> 1505
    //   1447: aload_1
    //   1448: invokeinterface next : ()Ljava/lang/Object;
    //   1453: checkcast java/lang/Integer
    //   1456: astore #9
    //   1458: aload #7
    //   1460: aload #6
    //   1462: aload #9
    //   1464: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1467: checkcast com/certification/ttv3/e/u
    //   1470: invokevirtual a : ()Ljava/util/UUID;
    //   1473: invokevirtual d : (Ljava/util/UUID;)I
    //   1476: aload #7
    //   1478: aload #6
    //   1480: aload #9
    //   1482: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1485: checkcast com/certification/ttv3/e/u
    //   1488: invokevirtual a : ()Ljava/util/UUID;
    //   1491: invokevirtual c : (Ljava/util/UUID;)I
    //   1494: if_icmpgt -> 1505
    //   1497: aload #6
    //   1499: aload #9
    //   1501: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1504: pop
    //   1505: aload_1
    //   1506: invokeinterface hasNext : ()Z
    //   1511: ifne -> 1447
    //   1514: goto -> 1682
    //   1517: aload #5
    //   1519: ldc 'IncorrectMoreThan'
    //   1521: invokevirtual compareTo : (Ljava/lang/String;)I
    //   1524: ifne -> 1601
    //   1527: aload_2
    //   1528: getstatic com/certification/ttv3/d/A.aK : Ljava/lang/String;
    //   1531: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   1534: invokestatic parseInt : (Ljava/lang/String;)I
    //   1537: istore #9
    //   1539: aload_1
    //   1540: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1543: astore #10
    //   1545: goto -> 1588
    //   1548: aload #10
    //   1550: invokeinterface next : ()Ljava/lang/Object;
    //   1555: checkcast java/lang/Integer
    //   1558: astore_1
    //   1559: aload #7
    //   1561: aload #6
    //   1563: aload_1
    //   1564: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1567: checkcast com/certification/ttv3/e/u
    //   1570: invokevirtual a : ()Ljava/util/UUID;
    //   1573: invokevirtual d : (Ljava/util/UUID;)I
    //   1576: iload #9
    //   1578: if_icmpgt -> 1588
    //   1581: aload #6
    //   1583: aload_1
    //   1584: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1587: pop
    //   1588: aload #10
    //   1590: invokeinterface hasNext : ()Z
    //   1595: ifne -> 1548
    //   1598: goto -> 1682
    //   1601: aload #5
    //   1603: ldc 'CorrectLessThan'
    //   1605: invokevirtual compareTo : (Ljava/lang/String;)I
    //   1608: ifne -> 1682
    //   1611: aload_2
    //   1612: getstatic com/certification/ttv3/d/A.aL : Ljava/lang/String;
    //   1615: invokevirtual getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   1618: invokestatic parseInt : (Ljava/lang/String;)I
    //   1621: istore #9
    //   1623: aload_1
    //   1624: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1627: astore #10
    //   1629: goto -> 1672
    //   1632: aload #10
    //   1634: invokeinterface next : ()Ljava/lang/Object;
    //   1639: checkcast java/lang/Integer
    //   1642: astore_1
    //   1643: aload #7
    //   1645: aload #6
    //   1647: aload_1
    //   1648: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1651: checkcast com/certification/ttv3/e/u
    //   1654: invokevirtual a : ()Ljava/util/UUID;
    //   1657: invokevirtual c : (Ljava/util/UUID;)I
    //   1660: iload #9
    //   1662: if_icmplt -> 1672
    //   1665: aload #6
    //   1667: aload_1
    //   1668: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1671: pop
    //   1672: aload #10
    //   1674: invokeinterface hasNext : ()Z
    //   1679: ifne -> 1632
    //   1682: new java/util/ArrayList
    //   1685: dup
    //   1686: aload #6
    //   1688: invokevirtual keySet : ()Ljava/util/Set;
    //   1691: invokespecial <init> : (Ljava/util/Collection;)V
    //   1694: astore_1
    //   1695: new com/certification/ttv3/f/j
    //   1698: dup
    //   1699: aload_1
    //   1700: invokevirtual size : ()I
    //   1703: invokespecial <init> : (I)V
    //   1706: astore #7
    //   1708: iload #4
    //   1710: aload_1
    //   1711: invokevirtual size : ()I
    //   1714: if_icmple -> 1723
    //   1717: aload_1
    //   1718: invokevirtual size : ()I
    //   1721: istore #4
    //   1723: iconst_0
    //   1724: istore #5
    //   1726: goto -> 1755
    //   1729: aload_3
    //   1730: aload #6
    //   1732: aload_1
    //   1733: aload #7
    //   1735: invokevirtual a : ()I
    //   1738: invokevirtual get : (I)Ljava/lang/Object;
    //   1741: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1744: checkcast com/certification/ttv3/e/u
    //   1747: iload #8
    //   1749: invokevirtual a : (Lcom/certification/ttv3/e/u;Z)V
    //   1752: iinc #5, 1
    //   1755: iload #5
    //   1757: iload #4
    //   1759: if_icmplt -> 1729
    //   1762: goto -> 1822
    //   1765: iload #9
    //   1767: ifle -> 1822
    //   1770: iload #10
    //   1772: iload #9
    //   1774: if_icmple -> 1822
    //   1777: iload #9
    //   1779: iconst_1
    //   1780: isub
    //   1781: istore #7
    //   1783: goto -> 1805
    //   1786: aload_3
    //   1787: aload #5
    //   1789: iload #7
    //   1791: invokevirtual get : (I)Ljava/lang/Object;
    //   1794: checkcast com/certification/ttv3/e/u
    //   1797: iload #8
    //   1799: invokevirtual a : (Lcom/certification/ttv3/e/u;Z)V
    //   1802: iinc #7, 1
    //   1805: iload #7
    //   1807: aload #5
    //   1809: invokevirtual size : ()I
    //   1812: if_icmpge -> 1822
    //   1815: iload #7
    //   1817: iload #10
    //   1819: if_icmplt -> 1786
    //   1822: aload_3
    //   1823: areturn
    // Exception table:
    //   from	to	target	type
    //   112	136	139	java/lang/NumberFormatException
    //   179	203	206	java/lang/NumberFormatException
  }
}


/* Location:              /home/user/Downloads/pass4sure_assets/Testing Engine.jar!/com/certification/ttv3/b/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */