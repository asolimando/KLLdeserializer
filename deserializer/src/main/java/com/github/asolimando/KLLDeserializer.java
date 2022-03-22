package com.github.asolimando;

import org.apache.datasketches.kll.KllFloatsSketch;
import org.apache.datasketches.memory.Memory;

import javax.xml.bind.DatatypeConverter;

public class KLLDeserializer {

  public static String toHexString(byte[] array) {
    return DatatypeConverter.printHexBinary(array);
  }

  public static byte[] toByteArray(String s) {
    return DatatypeConverter.parseHexBinary(s);
  }

  public static void main(String[] args) {
    String s = "05010f00c80008000300000000000000c8000100c500000000004040000010410000c0400000404000001041";
    byte[] bytes = toByteArray(s.replace(" ", ""));
    System.out.println(KllFloatsSketch.heapify(Memory.wrap(bytes)));
  }
}
