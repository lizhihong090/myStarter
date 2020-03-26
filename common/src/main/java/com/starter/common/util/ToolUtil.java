package com.starter.common.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToolUtil {
  public static final int SALT_LENGTH = 6;

  public ToolUtil() {
  }

  public static String getRandomString(int length) {
    String base = "abcdefghijklmnopqrstuvwxyz0123456789";
    Random random = new Random();
    StringBuffer sb = new StringBuffer();

    for(int i = 0; i < length; ++i) {
      int number = random.nextInt(base.length());
      sb.append(base.charAt(number));
    }

    return sb.toString();
  }

  public static String md5Hex(String password, String salt) {
    return md5Hex(password + salt);
  }

  public static String md5Hex(String str) {
    try {
      MessageDigest md5 = MessageDigest.getInstance("MD5");
      byte[] bs = md5.digest(str.getBytes());
      StringBuffer md5StrBuff = new StringBuffer();
      for(int i = 0; i < bs.length; ++i) {
        if (Integer.toHexString(255 & bs[i]).length() == 1) {
          md5StrBuff.append("0").append(Integer.toHexString(255 & bs[i]));
        } else {
          md5StrBuff.append(Integer.toHexString(255 & bs[i]));
        }
      }

      return md5StrBuff.toString();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }


}
