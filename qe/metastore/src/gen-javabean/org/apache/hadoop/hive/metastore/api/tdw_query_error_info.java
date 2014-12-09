/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
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

public class tdw_query_error_info implements org.apache.thrift.TBase<tdw_query_error_info, tdw_query_error_info._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("tdw_query_error_info");

  private static final org.apache.thrift.protocol.TField QUERY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("queryId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TASK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("taskId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ERROR_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("errorTime", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField IP_FIELD_DESC = new org.apache.thrift.protocol.TField("ip", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("port", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField CLIENT_IP_FIELD_DESC = new org.apache.thrift.protocol.TField("clientIp", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField ERROR_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("errorString", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField ERROR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("errorId", org.apache.thrift.protocol.TType.STRING, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new tdw_query_error_infoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new tdw_query_error_infoTupleSchemeFactory());
  }

  private String queryId; // required
  private String taskId; // required
  private String errorTime; // required
  private String ip; // required
  private String port; // required
  private String clientIp; // required
  private String errorString; // required
  private String errorId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    QUERY_ID((short)1, "queryId"),
    TASK_ID((short)2, "taskId"),
    ERROR_TIME((short)3, "errorTime"),
    IP((short)4, "ip"),
    PORT((short)5, "port"),
    CLIENT_IP((short)6, "clientIp"),
    ERROR_STRING((short)7, "errorString"),
    ERROR_ID((short)8, "errorId");

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
        case 1: // QUERY_ID
          return QUERY_ID;
        case 2: // TASK_ID
          return TASK_ID;
        case 3: // ERROR_TIME
          return ERROR_TIME;
        case 4: // IP
          return IP;
        case 5: // PORT
          return PORT;
        case 6: // CLIENT_IP
          return CLIENT_IP;
        case 7: // ERROR_STRING
          return ERROR_STRING;
        case 8: // ERROR_ID
          return ERROR_ID;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUERY_ID, new org.apache.thrift.meta_data.FieldMetaData("queryId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TASK_ID, new org.apache.thrift.meta_data.FieldMetaData("taskId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ERROR_TIME, new org.apache.thrift.meta_data.FieldMetaData("errorTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IP, new org.apache.thrift.meta_data.FieldMetaData("ip", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PORT, new org.apache.thrift.meta_data.FieldMetaData("port", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLIENT_IP, new org.apache.thrift.meta_data.FieldMetaData("clientIp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ERROR_STRING, new org.apache.thrift.meta_data.FieldMetaData("errorString", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ERROR_ID, new org.apache.thrift.meta_data.FieldMetaData("errorId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(tdw_query_error_info.class, metaDataMap);
  }

  public tdw_query_error_info() {
  }

  public tdw_query_error_info(
    String queryId,
    String taskId,
    String errorTime,
    String ip,
    String port,
    String clientIp,
    String errorString,
    String errorId)
  {
    this();
    this.queryId = queryId;
    this.taskId = taskId;
    this.errorTime = errorTime;
    this.ip = ip;
    this.port = port;
    this.clientIp = clientIp;
    this.errorString = errorString;
    this.errorId = errorId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public tdw_query_error_info(tdw_query_error_info other) {
    if (other.isSetQueryId()) {
      this.queryId = other.queryId;
    }
    if (other.isSetTaskId()) {
      this.taskId = other.taskId;
    }
    if (other.isSetErrorTime()) {
      this.errorTime = other.errorTime;
    }
    if (other.isSetIp()) {
      this.ip = other.ip;
    }
    if (other.isSetPort()) {
      this.port = other.port;
    }
    if (other.isSetClientIp()) {
      this.clientIp = other.clientIp;
    }
    if (other.isSetErrorString()) {
      this.errorString = other.errorString;
    }
    if (other.isSetErrorId()) {
      this.errorId = other.errorId;
    }
  }

  public tdw_query_error_info deepCopy() {
    return new tdw_query_error_info(this);
  }

  @Override
  public void clear() {
    this.queryId = null;
    this.taskId = null;
    this.errorTime = null;
    this.ip = null;
    this.port = null;
    this.clientIp = null;
    this.errorString = null;
    this.errorId = null;
  }

  public String getQueryId() {
    return this.queryId;
  }

  public void setQueryId(String queryId) {
    this.queryId = queryId;
  }

  public void unsetQueryId() {
    this.queryId = null;
  }

  /** Returns true if field queryId is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryId() {
    return this.queryId != null;
  }

  public void setQueryIdIsSet(boolean value) {
    if (!value) {
      this.queryId = null;
    }
  }

  public String getTaskId() {
    return this.taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public void unsetTaskId() {
    this.taskId = null;
  }

  /** Returns true if field taskId is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskId() {
    return this.taskId != null;
  }

  public void setTaskIdIsSet(boolean value) {
    if (!value) {
      this.taskId = null;
    }
  }

  public String getErrorTime() {
    return this.errorTime;
  }

  public void setErrorTime(String errorTime) {
    this.errorTime = errorTime;
  }

  public void unsetErrorTime() {
    this.errorTime = null;
  }

  /** Returns true if field errorTime is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorTime() {
    return this.errorTime != null;
  }

  public void setErrorTimeIsSet(boolean value) {
    if (!value) {
      this.errorTime = null;
    }
  }

  public String getIp() {
    return this.ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public void unsetIp() {
    this.ip = null;
  }

  /** Returns true if field ip is set (has been assigned a value) and false otherwise */
  public boolean isSetIp() {
    return this.ip != null;
  }

  public void setIpIsSet(boolean value) {
    if (!value) {
      this.ip = null;
    }
  }

  public String getPort() {
    return this.port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public void unsetPort() {
    this.port = null;
  }

  /** Returns true if field port is set (has been assigned a value) and false otherwise */
  public boolean isSetPort() {
    return this.port != null;
  }

  public void setPortIsSet(boolean value) {
    if (!value) {
      this.port = null;
    }
  }

  public String getClientIp() {
    return this.clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }

  public void unsetClientIp() {
    this.clientIp = null;
  }

  /** Returns true if field clientIp is set (has been assigned a value) and false otherwise */
  public boolean isSetClientIp() {
    return this.clientIp != null;
  }

  public void setClientIpIsSet(boolean value) {
    if (!value) {
      this.clientIp = null;
    }
  }

  public String getErrorString() {
    return this.errorString;
  }

  public void setErrorString(String errorString) {
    this.errorString = errorString;
  }

  public void unsetErrorString() {
    this.errorString = null;
  }

  /** Returns true if field errorString is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorString() {
    return this.errorString != null;
  }

  public void setErrorStringIsSet(boolean value) {
    if (!value) {
      this.errorString = null;
    }
  }

  public String getErrorId() {
    return this.errorId;
  }

  public void setErrorId(String errorId) {
    this.errorId = errorId;
  }

  public void unsetErrorId() {
    this.errorId = null;
  }

  /** Returns true if field errorId is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorId() {
    return this.errorId != null;
  }

  public void setErrorIdIsSet(boolean value) {
    if (!value) {
      this.errorId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUERY_ID:
      if (value == null) {
        unsetQueryId();
      } else {
        setQueryId((String)value);
      }
      break;

    case TASK_ID:
      if (value == null) {
        unsetTaskId();
      } else {
        setTaskId((String)value);
      }
      break;

    case ERROR_TIME:
      if (value == null) {
        unsetErrorTime();
      } else {
        setErrorTime((String)value);
      }
      break;

    case IP:
      if (value == null) {
        unsetIp();
      } else {
        setIp((String)value);
      }
      break;

    case PORT:
      if (value == null) {
        unsetPort();
      } else {
        setPort((String)value);
      }
      break;

    case CLIENT_IP:
      if (value == null) {
        unsetClientIp();
      } else {
        setClientIp((String)value);
      }
      break;

    case ERROR_STRING:
      if (value == null) {
        unsetErrorString();
      } else {
        setErrorString((String)value);
      }
      break;

    case ERROR_ID:
      if (value == null) {
        unsetErrorId();
      } else {
        setErrorId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUERY_ID:
      return getQueryId();

    case TASK_ID:
      return getTaskId();

    case ERROR_TIME:
      return getErrorTime();

    case IP:
      return getIp();

    case PORT:
      return getPort();

    case CLIENT_IP:
      return getClientIp();

    case ERROR_STRING:
      return getErrorString();

    case ERROR_ID:
      return getErrorId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUERY_ID:
      return isSetQueryId();
    case TASK_ID:
      return isSetTaskId();
    case ERROR_TIME:
      return isSetErrorTime();
    case IP:
      return isSetIp();
    case PORT:
      return isSetPort();
    case CLIENT_IP:
      return isSetClientIp();
    case ERROR_STRING:
      return isSetErrorString();
    case ERROR_ID:
      return isSetErrorId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof tdw_query_error_info)
      return this.equals((tdw_query_error_info)that);
    return false;
  }

  public boolean equals(tdw_query_error_info that) {
    if (that == null)
      return false;

    boolean this_present_queryId = true && this.isSetQueryId();
    boolean that_present_queryId = true && that.isSetQueryId();
    if (this_present_queryId || that_present_queryId) {
      if (!(this_present_queryId && that_present_queryId))
        return false;
      if (!this.queryId.equals(that.queryId))
        return false;
    }

    boolean this_present_taskId = true && this.isSetTaskId();
    boolean that_present_taskId = true && that.isSetTaskId();
    if (this_present_taskId || that_present_taskId) {
      if (!(this_present_taskId && that_present_taskId))
        return false;
      if (!this.taskId.equals(that.taskId))
        return false;
    }

    boolean this_present_errorTime = true && this.isSetErrorTime();
    boolean that_present_errorTime = true && that.isSetErrorTime();
    if (this_present_errorTime || that_present_errorTime) {
      if (!(this_present_errorTime && that_present_errorTime))
        return false;
      if (!this.errorTime.equals(that.errorTime))
        return false;
    }

    boolean this_present_ip = true && this.isSetIp();
    boolean that_present_ip = true && that.isSetIp();
    if (this_present_ip || that_present_ip) {
      if (!(this_present_ip && that_present_ip))
        return false;
      if (!this.ip.equals(that.ip))
        return false;
    }

    boolean this_present_port = true && this.isSetPort();
    boolean that_present_port = true && that.isSetPort();
    if (this_present_port || that_present_port) {
      if (!(this_present_port && that_present_port))
        return false;
      if (!this.port.equals(that.port))
        return false;
    }

    boolean this_present_clientIp = true && this.isSetClientIp();
    boolean that_present_clientIp = true && that.isSetClientIp();
    if (this_present_clientIp || that_present_clientIp) {
      if (!(this_present_clientIp && that_present_clientIp))
        return false;
      if (!this.clientIp.equals(that.clientIp))
        return false;
    }

    boolean this_present_errorString = true && this.isSetErrorString();
    boolean that_present_errorString = true && that.isSetErrorString();
    if (this_present_errorString || that_present_errorString) {
      if (!(this_present_errorString && that_present_errorString))
        return false;
      if (!this.errorString.equals(that.errorString))
        return false;
    }

    boolean this_present_errorId = true && this.isSetErrorId();
    boolean that_present_errorId = true && that.isSetErrorId();
    if (this_present_errorId || that_present_errorId) {
      if (!(this_present_errorId && that_present_errorId))
        return false;
      if (!this.errorId.equals(that.errorId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(tdw_query_error_info other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    tdw_query_error_info typedOther = (tdw_query_error_info)other;

    lastComparison = Boolean.valueOf(isSetQueryId()).compareTo(typedOther.isSetQueryId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queryId, typedOther.queryId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTaskId()).compareTo(typedOther.isSetTaskId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskId, typedOther.taskId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErrorTime()).compareTo(typedOther.isSetErrorTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorTime, typedOther.errorTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIp()).compareTo(typedOther.isSetIp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ip, typedOther.ip);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPort()).compareTo(typedOther.isSetPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.port, typedOther.port);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClientIp()).compareTo(typedOther.isSetClientIp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClientIp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clientIp, typedOther.clientIp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErrorString()).compareTo(typedOther.isSetErrorString());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorString()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorString, typedOther.errorString);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErrorId()).compareTo(typedOther.isSetErrorId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorId, typedOther.errorId);
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
    StringBuilder sb = new StringBuilder("tdw_query_error_info(");
    boolean first = true;

    sb.append("queryId:");
    if (this.queryId == null) {
      sb.append("null");
    } else {
      sb.append(this.queryId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("taskId:");
    if (this.taskId == null) {
      sb.append("null");
    } else {
      sb.append(this.taskId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("errorTime:");
    if (this.errorTime == null) {
      sb.append("null");
    } else {
      sb.append(this.errorTime);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ip:");
    if (this.ip == null) {
      sb.append("null");
    } else {
      sb.append(this.ip);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("port:");
    if (this.port == null) {
      sb.append("null");
    } else {
      sb.append(this.port);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("clientIp:");
    if (this.clientIp == null) {
      sb.append("null");
    } else {
      sb.append(this.clientIp);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("errorString:");
    if (this.errorString == null) {
      sb.append("null");
    } else {
      sb.append(this.errorString);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("errorId:");
    if (this.errorId == null) {
      sb.append("null");
    } else {
      sb.append(this.errorId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class tdw_query_error_infoStandardSchemeFactory implements SchemeFactory {
    public tdw_query_error_infoStandardScheme getScheme() {
      return new tdw_query_error_infoStandardScheme();
    }
  }

  private static class tdw_query_error_infoStandardScheme extends StandardScheme<tdw_query_error_info> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, tdw_query_error_info struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUERY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.queryId = iprot.readString();
              struct.setQueryIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TASK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.taskId = iprot.readString();
              struct.setTaskIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ERROR_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.errorTime = iprot.readString();
              struct.setErrorTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ip = iprot.readString();
              struct.setIpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.port = iprot.readString();
              struct.setPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CLIENT_IP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.clientIp = iprot.readString();
              struct.setClientIpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // ERROR_STRING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.errorString = iprot.readString();
              struct.setErrorStringIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // ERROR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.errorId = iprot.readString();
              struct.setErrorIdIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, tdw_query_error_info struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.queryId != null) {
        oprot.writeFieldBegin(QUERY_ID_FIELD_DESC);
        oprot.writeString(struct.queryId);
        oprot.writeFieldEnd();
      }
      if (struct.taskId != null) {
        oprot.writeFieldBegin(TASK_ID_FIELD_DESC);
        oprot.writeString(struct.taskId);
        oprot.writeFieldEnd();
      }
      if (struct.errorTime != null) {
        oprot.writeFieldBegin(ERROR_TIME_FIELD_DESC);
        oprot.writeString(struct.errorTime);
        oprot.writeFieldEnd();
      }
      if (struct.ip != null) {
        oprot.writeFieldBegin(IP_FIELD_DESC);
        oprot.writeString(struct.ip);
        oprot.writeFieldEnd();
      }
      if (struct.port != null) {
        oprot.writeFieldBegin(PORT_FIELD_DESC);
        oprot.writeString(struct.port);
        oprot.writeFieldEnd();
      }
      if (struct.clientIp != null) {
        oprot.writeFieldBegin(CLIENT_IP_FIELD_DESC);
        oprot.writeString(struct.clientIp);
        oprot.writeFieldEnd();
      }
      if (struct.errorString != null) {
        oprot.writeFieldBegin(ERROR_STRING_FIELD_DESC);
        oprot.writeString(struct.errorString);
        oprot.writeFieldEnd();
      }
      if (struct.errorId != null) {
        oprot.writeFieldBegin(ERROR_ID_FIELD_DESC);
        oprot.writeString(struct.errorId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class tdw_query_error_infoTupleSchemeFactory implements SchemeFactory {
    public tdw_query_error_infoTupleScheme getScheme() {
      return new tdw_query_error_infoTupleScheme();
    }
  }

  private static class tdw_query_error_infoTupleScheme extends TupleScheme<tdw_query_error_info> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, tdw_query_error_info struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetQueryId()) {
        optionals.set(0);
      }
      if (struct.isSetTaskId()) {
        optionals.set(1);
      }
      if (struct.isSetErrorTime()) {
        optionals.set(2);
      }
      if (struct.isSetIp()) {
        optionals.set(3);
      }
      if (struct.isSetPort()) {
        optionals.set(4);
      }
      if (struct.isSetClientIp()) {
        optionals.set(5);
      }
      if (struct.isSetErrorString()) {
        optionals.set(6);
      }
      if (struct.isSetErrorId()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetQueryId()) {
        oprot.writeString(struct.queryId);
      }
      if (struct.isSetTaskId()) {
        oprot.writeString(struct.taskId);
      }
      if (struct.isSetErrorTime()) {
        oprot.writeString(struct.errorTime);
      }
      if (struct.isSetIp()) {
        oprot.writeString(struct.ip);
      }
      if (struct.isSetPort()) {
        oprot.writeString(struct.port);
      }
      if (struct.isSetClientIp()) {
        oprot.writeString(struct.clientIp);
      }
      if (struct.isSetErrorString()) {
        oprot.writeString(struct.errorString);
      }
      if (struct.isSetErrorId()) {
        oprot.writeString(struct.errorId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, tdw_query_error_info struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.queryId = iprot.readString();
        struct.setQueryIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.taskId = iprot.readString();
        struct.setTaskIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.errorTime = iprot.readString();
        struct.setErrorTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.ip = iprot.readString();
        struct.setIpIsSet(true);
      }
      if (incoming.get(4)) {
        struct.port = iprot.readString();
        struct.setPortIsSet(true);
      }
      if (incoming.get(5)) {
        struct.clientIp = iprot.readString();
        struct.setClientIpIsSet(true);
      }
      if (incoming.get(6)) {
        struct.errorString = iprot.readString();
        struct.setErrorStringIsSet(true);
      }
      if (incoming.get(7)) {
        struct.errorId = iprot.readString();
        struct.setErrorIdIsSet(true);
      }
    }
  }

}
