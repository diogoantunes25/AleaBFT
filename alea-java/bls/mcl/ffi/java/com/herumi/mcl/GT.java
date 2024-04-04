/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.herumi.mcl;

public class GT {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GT(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GT obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MclJNI.delete_GT(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GT() {
    this(MclJNI.new_GT__SWIG_0(), true);
  }

  public GT(GT rhs) {
    this(MclJNI.new_GT__SWIG_1(GT.getCPtr(rhs), rhs), true);
  }

  public boolean equals(GT rhs) {
    return MclJNI.GT_equals(swigCPtr, this, GT.getCPtr(rhs), rhs);
  }

  public boolean isOne() {
    return MclJNI.GT_isOne(swigCPtr, this);
  }

  public void clear() {
    MclJNI.GT_clear(swigCPtr, this);
  }

  public void setStr(String str, int base) {
    MclJNI.GT_setStr__SWIG_0(swigCPtr, this, str, base);
  }

  public void setStr(String str) {
    MclJNI.GT_setStr__SWIG_1(swigCPtr, this, str);
  }

  public String toString(int base) {
    return MclJNI.GT_toString__SWIG_0(swigCPtr, this, base);
  }

  public String toString() {
    return MclJNI.GT_toString__SWIG_1(swigCPtr, this);
  }

  public void deserialize(byte[] cbuf) {
    MclJNI.GT_deserialize(swigCPtr, this, cbuf);
  }

  public byte[] serialize() { return MclJNI.GT_serialize(swigCPtr, this); }

}
