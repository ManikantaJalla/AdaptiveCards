/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class TextBlock extends BaseCardElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected TextBlock(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.TextBlock_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TextBlock obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_TextBlock(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TextBlock() {
    this(AdaptiveCardObjectModelJNI.new_TextBlock__SWIG_0(), true);
  }

  public TextBlock(Spacing spacing, Separator separator, String speak, String text, TextSize textSize, TextWeight textWeight, Color color, boolean isSubtle, boolean wrap, int maxLines, HorizontalAlignment hAlignment) {
    this(AdaptiveCardObjectModelJNI.new_TextBlock__SWIG_1(spacing.swigValue(), Separator.getCPtr(separator), separator, speak, text, textSize.swigValue(), textWeight.swigValue(), color.swigValue(), isSubtle, wrap, maxLines, hAlignment.swigValue()), true);
  }

  public static TextBlock Deserialize(SWIGTYPE_p_Json__Value root) {
    long cPtr = AdaptiveCardObjectModelJNI.TextBlock_Deserialize(SWIGTYPE_p_Json__Value.getCPtr(root));
    return (cPtr == 0) ? null : new TextBlock(cPtr, true);
  }

  public static TextBlock DeserializeFromString(String jsonString) {
    long cPtr = AdaptiveCardObjectModelJNI.TextBlock_DeserializeFromString(jsonString);
    return (cPtr == 0) ? null : new TextBlock(cPtr, true);
  }

  public String Serialize() {
    return AdaptiveCardObjectModelJNI.TextBlock_Serialize(swigCPtr, this);
  }

  public SWIGTYPE_p_Json__Value SerializeToJsonValue() {
    return new SWIGTYPE_p_Json__Value(AdaptiveCardObjectModelJNI.TextBlock_SerializeToJsonValue(swigCPtr, this), true);
  }

  public String GetText() {
    return AdaptiveCardObjectModelJNI.TextBlock_GetText(swigCPtr, this);
  }

  public void SetText(String value) {
    AdaptiveCardObjectModelJNI.TextBlock_SetText(swigCPtr, this, value);
  }

  public TextSize GetTextSize() {
    return TextSize.swigToEnum(AdaptiveCardObjectModelJNI.TextBlock_GetTextSize(swigCPtr, this));
  }

  public void SetTextSize(TextSize value) {
    AdaptiveCardObjectModelJNI.TextBlock_SetTextSize(swigCPtr, this, value.swigValue());
  }

  public TextWeight GetTextWeight() {
    return TextWeight.swigToEnum(AdaptiveCardObjectModelJNI.TextBlock_GetTextWeight(swigCPtr, this));
  }

  public void SetTextWeight(TextWeight value) {
    AdaptiveCardObjectModelJNI.TextBlock_SetTextWeight(swigCPtr, this, value.swigValue());
  }

  public Color GetTextColor() {
    return Color.swigToEnum(AdaptiveCardObjectModelJNI.TextBlock_GetTextColor(swigCPtr, this));
  }

  public void SetTextColor(Color value) {
    AdaptiveCardObjectModelJNI.TextBlock_SetTextColor(swigCPtr, this, value.swigValue());
  }

  public boolean GetWrap() {
    return AdaptiveCardObjectModelJNI.TextBlock_GetWrap(swigCPtr, this);
  }

  public void SetWrap(boolean value) {
    AdaptiveCardObjectModelJNI.TextBlock_SetWrap(swigCPtr, this, value);
  }

  public boolean GetIsSubtle() {
    return AdaptiveCardObjectModelJNI.TextBlock_GetIsSubtle(swigCPtr, this);
  }

  public void SetIsSubtle(boolean value) {
    AdaptiveCardObjectModelJNI.TextBlock_SetIsSubtle(swigCPtr, this, value);
  }

  public long GetMaxLines() {
    return AdaptiveCardObjectModelJNI.TextBlock_GetMaxLines(swigCPtr, this);
  }

  public void SetMaxLines(long value) {
    AdaptiveCardObjectModelJNI.TextBlock_SetMaxLines(swigCPtr, this, value);
  }

  public HorizontalAlignment GetHorizontalAlignment() {
    return HorizontalAlignment.swigToEnum(AdaptiveCardObjectModelJNI.TextBlock_GetHorizontalAlignment(swigCPtr, this));
  }

  public void SetHorizontalAlignment(HorizontalAlignment value) {
    AdaptiveCardObjectModelJNI.TextBlock_SetHorizontalAlignment(swigCPtr, this, value.swigValue());
  }

  public static TextBlock dynamic_cast(BaseCardElement baseCardElement) {
    long cPtr = AdaptiveCardObjectModelJNI.TextBlock_dynamic_cast(BaseCardElement.getCPtr(baseCardElement), baseCardElement);
    return (cPtr == 0) ? null : new TextBlock(cPtr, true);
  }

}
