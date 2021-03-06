/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial", "unchecked" })
public class NonCopyableUnion extends TUnion<NonCopyableUnion> implements Comparable<NonCopyableUnion> {
  private static final TStruct STRUCT_DESC = new TStruct("NonCopyableUnion");
  private static final TField S_FIELD_DESC = new TField("s", TType.STRUCT, (short)1);

  public static final int S = 1;

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(S, new FieldMetaData("s", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, NonCopyableStruct.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  public NonCopyableUnion() {
    super();
  }

  public NonCopyableUnion(int setField, Object __value) {
    super(setField, __value);
  }

  public NonCopyableUnion(NonCopyableUnion other) {
    super(other);
  }

  public NonCopyableUnion deepCopy() {
    return new NonCopyableUnion(this);
  }

  public static NonCopyableUnion s(NonCopyableStruct __value) {
    NonCopyableUnion x = new NonCopyableUnion();
    x.setS(__value);
    return x;
  }


  @Override
  protected void checkType(short setField, Object __value) throws ClassCastException {
    switch (setField) {
      case S:
        if (__value instanceof NonCopyableStruct) {
          break;
        }
        throw new ClassCastException("Was expecting value of type NonCopyableStruct for field 's', but got " + __value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  public void read(TProtocol iprot) throws TException {
    setField_ = 0;
    value_ = null;
    iprot.readStructBegin(metaDataMap);
    TField __field = iprot.readFieldBegin();
    if (__field.type != TType.STOP)
    {
      value_ = readValue(iprot, __field);
      if (value_ != null)
      {
        switch (__field.id) {
          case S:
            if (__field.type == S_FIELD_DESC.type) {
              setField_ = __field.id;
            }
            break;
        }
      }
      iprot.readFieldEnd();
      TField __stopField = iprot.readFieldBegin();
      if (__stopField.type != TType.STOP) {
        throw new TProtocolException(TProtocolException.INVALID_DATA, "Union 'NonCopyableUnion' is missing a STOP byte");
      }
    }
    iprot.readStructEnd();
  }

  @Override
  protected Object readValue(TProtocol iprot, TField __field) throws TException {
    switch (__field.id) {
      case S:
        if (__field.type == S_FIELD_DESC.type) {
          NonCopyableStruct s;
          s = new NonCopyableStruct();
          s.read(iprot);
          return s;
        }
        break;
    }
    TProtocolUtil.skip(iprot, __field.type);
    return null;
  }

  @Override
  protected void writeValue(TProtocol oprot, short setField, Object __value) throws TException {
    switch (setField) {
      case S:
        NonCopyableStruct s = (NonCopyableStruct)getFieldValue();
        s.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField);
    }
  }

  @Override
  protected TField getFieldDesc(int setField) {
    switch (setField) {
      case S:
        return S_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected Map<Integer, FieldMetaData> getMetaDataMap() { return metaDataMap; }

  private Object __getValue(int expectedFieldId) {
    if (getSetField() == expectedFieldId) {
      return getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field '" + getFieldDesc(expectedFieldId).name + "' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  private void __setValue(int fieldId, Object __value) {
    if (__value == null) throw new NullPointerException();
    setField_ = fieldId;
    value_ = __value;
  }

  public NonCopyableStruct getS() {
    return (NonCopyableStruct) __getValue(S);
  }

  public void setS(NonCopyableStruct __value) {
    __setValue(S, __value);
  }

  public boolean equals(Object other) {
    if (other instanceof NonCopyableUnion) {
      return equals((NonCopyableUnion)other);
    } else {
      return false;
    }
  }

  public boolean equals(NonCopyableUnion other) {
    return equalsNobinaryImpl(other);
  }

  @Override
  public int compareTo(NonCopyableUnion other) {
    return compareToImpl(other);
  }


  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {getSetField(), getFieldValue()});
  }

}
