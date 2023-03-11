/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package my.example.hue;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class SoftwareUpdate extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3672388894233814098L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SoftwareUpdate\",\"namespace\":\"my.example.hue\",\"fields\":[{\"name\":\"state\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"lastinstall\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<SoftwareUpdate> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SoftwareUpdate> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<SoftwareUpdate> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<SoftwareUpdate> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<SoftwareUpdate> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this SoftwareUpdate to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a SoftwareUpdate from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a SoftwareUpdate instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static SoftwareUpdate fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  public java.lang.String state;
  public java.lang.String lastinstall;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SoftwareUpdate() {}

  /**
   * All-args constructor.
   * @param state The new value for state
   * @param lastinstall The new value for lastinstall
   */
  public SoftwareUpdate(java.lang.String state, java.lang.String lastinstall) {
    this.state = state;
    this.lastinstall = lastinstall;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return state;
    case 1: return lastinstall;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: state = value$ != null ? value$.toString() : null; break;
    case 1: lastinstall = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'state' field.
   * @return The value of the 'state' field.
   */
  public java.lang.String getState() {
    return state;
  }


  /**
   * Sets the value of the 'state' field.
   * @param value the value to set.
   */
  public void setState(java.lang.String value) {
    this.state = value;
  }

  /**
   * Gets the value of the 'lastinstall' field.
   * @return The value of the 'lastinstall' field.
   */
  public java.lang.String getLastinstall() {
    return lastinstall;
  }


  /**
   * Sets the value of the 'lastinstall' field.
   * @param value the value to set.
   */
  public void setLastinstall(java.lang.String value) {
    this.lastinstall = value;
  }

  /**
   * Creates a new SoftwareUpdate RecordBuilder.
   * @return A new SoftwareUpdate RecordBuilder
   */
  public static my.example.hue.SoftwareUpdate.Builder newBuilder() {
    return new my.example.hue.SoftwareUpdate.Builder();
  }

  /**
   * Creates a new SoftwareUpdate RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SoftwareUpdate RecordBuilder
   */
  public static my.example.hue.SoftwareUpdate.Builder newBuilder(my.example.hue.SoftwareUpdate.Builder other) {
    if (other == null) {
      return new my.example.hue.SoftwareUpdate.Builder();
    } else {
      return new my.example.hue.SoftwareUpdate.Builder(other);
    }
  }

  /**
   * Creates a new SoftwareUpdate RecordBuilder by copying an existing SoftwareUpdate instance.
   * @param other The existing instance to copy.
   * @return A new SoftwareUpdate RecordBuilder
   */
  public static my.example.hue.SoftwareUpdate.Builder newBuilder(my.example.hue.SoftwareUpdate other) {
    if (other == null) {
      return new my.example.hue.SoftwareUpdate.Builder();
    } else {
      return new my.example.hue.SoftwareUpdate.Builder(other);
    }
  }

  /**
   * RecordBuilder for SoftwareUpdate instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SoftwareUpdate>
    implements org.apache.avro.data.RecordBuilder<SoftwareUpdate> {

    private java.lang.String state;
    private java.lang.String lastinstall;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(my.example.hue.SoftwareUpdate.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.state)) {
        this.state = data().deepCopy(fields()[0].schema(), other.state);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.lastinstall)) {
        this.lastinstall = data().deepCopy(fields()[1].schema(), other.lastinstall);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing SoftwareUpdate instance
     * @param other The existing instance to copy.
     */
    private Builder(my.example.hue.SoftwareUpdate other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.state)) {
        this.state = data().deepCopy(fields()[0].schema(), other.state);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lastinstall)) {
        this.lastinstall = data().deepCopy(fields()[1].schema(), other.lastinstall);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'state' field.
      * @return The value.
      */
    public java.lang.String getState() {
      return state;
    }


    /**
      * Sets the value of the 'state' field.
      * @param value The value of 'state'.
      * @return This builder.
      */
    public my.example.hue.SoftwareUpdate.Builder setState(java.lang.String value) {
      validate(fields()[0], value);
      this.state = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'state' field has been set.
      * @return True if the 'state' field has been set, false otherwise.
      */
    public boolean hasState() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'state' field.
      * @return This builder.
      */
    public my.example.hue.SoftwareUpdate.Builder clearState() {
      state = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastinstall' field.
      * @return The value.
      */
    public java.lang.String getLastinstall() {
      return lastinstall;
    }


    /**
      * Sets the value of the 'lastinstall' field.
      * @param value The value of 'lastinstall'.
      * @return This builder.
      */
    public my.example.hue.SoftwareUpdate.Builder setLastinstall(java.lang.String value) {
      validate(fields()[1], value);
      this.lastinstall = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'lastinstall' field has been set.
      * @return True if the 'lastinstall' field has been set, false otherwise.
      */
    public boolean hasLastinstall() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'lastinstall' field.
      * @return This builder.
      */
    public my.example.hue.SoftwareUpdate.Builder clearLastinstall() {
      lastinstall = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SoftwareUpdate build() {
      try {
        SoftwareUpdate record = new SoftwareUpdate();
        record.state = fieldSetFlags()[0] ? this.state : (java.lang.String) defaultValue(fields()[0]);
        record.lastinstall = fieldSetFlags()[1] ? this.lastinstall : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SoftwareUpdate>
    WRITER$ = (org.apache.avro.io.DatumWriter<SoftwareUpdate>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SoftwareUpdate>
    READER$ = (org.apache.avro.io.DatumReader<SoftwareUpdate>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.state);

    out.writeString(this.lastinstall);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.state = in.readString();

      this.lastinstall = in.readString();

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.state = in.readString();
          break;

        case 1:
          this.lastinstall = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









