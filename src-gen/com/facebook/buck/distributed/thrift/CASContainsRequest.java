/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-03-29")
public class CASContainsRequest implements org.apache.thrift.TBase<CASContainsRequest, CASContainsRequest._Fields>, java.io.Serializable, Cloneable, Comparable<CASContainsRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CASContainsRequest");

  private static final org.apache.thrift.protocol.TField CONTENT_SHA1S_FIELD_DESC = new org.apache.thrift.protocol.TField("contentSha1s", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CASContainsRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CASContainsRequestTupleSchemeFactory());
  }

  public List<String> contentSha1s; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CONTENT_SHA1S((short)1, "contentSha1s");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CONTENT_SHA1S
          return CONTENT_SHA1S;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.CONTENT_SHA1S};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONTENT_SHA1S, new org.apache.thrift.meta_data.FieldMetaData("contentSha1s", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CASContainsRequest.class, metaDataMap);
  }

  public CASContainsRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CASContainsRequest(CASContainsRequest other) {
    if (other.isSetContentSha1s()) {
      List<String> __this__contentSha1s = new ArrayList<String>(other.contentSha1s);
      this.contentSha1s = __this__contentSha1s;
    }
  }

  public CASContainsRequest deepCopy() {
    return new CASContainsRequest(this);
  }

  @Override
  public void clear() {
    this.contentSha1s = null;
  }

  public int getContentSha1sSize() {
    return (this.contentSha1s == null) ? 0 : this.contentSha1s.size();
  }

  public java.util.Iterator<String> getContentSha1sIterator() {
    return (this.contentSha1s == null) ? null : this.contentSha1s.iterator();
  }

  public void addToContentSha1s(String elem) {
    if (this.contentSha1s == null) {
      this.contentSha1s = new ArrayList<String>();
    }
    this.contentSha1s.add(elem);
  }

  public List<String> getContentSha1s() {
    return this.contentSha1s;
  }

  public CASContainsRequest setContentSha1s(List<String> contentSha1s) {
    this.contentSha1s = contentSha1s;
    return this;
  }

  public void unsetContentSha1s() {
    this.contentSha1s = null;
  }

  /** Returns true if field contentSha1s is set (has been assigned a value) and false otherwise */
  public boolean isSetContentSha1s() {
    return this.contentSha1s != null;
  }

  public void setContentSha1sIsSet(boolean value) {
    if (!value) {
      this.contentSha1s = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CONTENT_SHA1S:
      if (value == null) {
        unsetContentSha1s();
      } else {
        setContentSha1s((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CONTENT_SHA1S:
      return getContentSha1s();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CONTENT_SHA1S:
      return isSetContentSha1s();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CASContainsRequest)
      return this.equals((CASContainsRequest)that);
    return false;
  }

  public boolean equals(CASContainsRequest that) {
    if (that == null)
      return false;

    boolean this_present_contentSha1s = true && this.isSetContentSha1s();
    boolean that_present_contentSha1s = true && that.isSetContentSha1s();
    if (this_present_contentSha1s || that_present_contentSha1s) {
      if (!(this_present_contentSha1s && that_present_contentSha1s))
        return false;
      if (!this.contentSha1s.equals(that.contentSha1s))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_contentSha1s = true && (isSetContentSha1s());
    list.add(present_contentSha1s);
    if (present_contentSha1s)
      list.add(contentSha1s);

    return list.hashCode();
  }

  @Override
  public int compareTo(CASContainsRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetContentSha1s()).compareTo(other.isSetContentSha1s());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContentSha1s()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contentSha1s, other.contentSha1s);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CASContainsRequest(");
    boolean first = true;

    if (isSetContentSha1s()) {
      sb.append("contentSha1s:");
      if (this.contentSha1s == null) {
        sb.append("null");
      } else {
        sb.append(this.contentSha1s);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CASContainsRequestStandardSchemeFactory implements SchemeFactory {
    public CASContainsRequestStandardScheme getScheme() {
      return new CASContainsRequestStandardScheme();
    }
  }

  private static class CASContainsRequestStandardScheme extends StandardScheme<CASContainsRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CASContainsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONTENT_SHA1S
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list58 = iprot.readListBegin();
                struct.contentSha1s = new ArrayList<String>(_list58.size);
                String _elem59;
                for (int _i60 = 0; _i60 < _list58.size; ++_i60)
                {
                  _elem59 = iprot.readString();
                  struct.contentSha1s.add(_elem59);
                }
                iprot.readListEnd();
              }
              struct.setContentSha1sIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CASContainsRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.contentSha1s != null) {
        if (struct.isSetContentSha1s()) {
          oprot.writeFieldBegin(CONTENT_SHA1S_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.contentSha1s.size()));
            for (String _iter61 : struct.contentSha1s)
            {
              oprot.writeString(_iter61);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CASContainsRequestTupleSchemeFactory implements SchemeFactory {
    public CASContainsRequestTupleScheme getScheme() {
      return new CASContainsRequestTupleScheme();
    }
  }

  private static class CASContainsRequestTupleScheme extends TupleScheme<CASContainsRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CASContainsRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetContentSha1s()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetContentSha1s()) {
        {
          oprot.writeI32(struct.contentSha1s.size());
          for (String _iter62 : struct.contentSha1s)
          {
            oprot.writeString(_iter62);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CASContainsRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list63 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.contentSha1s = new ArrayList<String>(_list63.size);
          String _elem64;
          for (int _i65 = 0; _i65 < _list63.size; ++_i65)
          {
            _elem64 = iprot.readString();
            struct.contentSha1s.add(_elem64);
          }
        }
        struct.setContentSha1sIsSet(true);
      }
    }
  }

}

