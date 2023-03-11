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
public class Startup extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2973594903597159735L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Startup\",\"namespace\":\"my.example.hue\",\"fields\":[{\"name\":\"mode\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"configured\",\"type\":\"boolean\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Startup> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Startup> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Startup> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Startup> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Startup> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Startup to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Startup from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Startup instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Startup fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  public java.lang.String mode;
  public boolean configured;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Startup() {}

  /**
   * All-args constructor.
   * @param mode The new value for mode
   * @param configured The new value for configured
   */
  public Startup(java.lang.String mode, java.lang.Boolean configured) {
    this.mode = mode;
    this.configured = configured;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return mode;
    case 1: return configured;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: mode = value$ != null ? value$.toString() : null; break;
    case 1: configured = (java.lang.Boolean)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'mode' field.
   * @return The value of the 'mode' field.
   */
  public java.lang.String getMode() {
    return mode;
  }


  /**
   * Sets the value of the 'mode' field.
   * @param value the value to set.
   */
  public void setMode(java.lang.String value) {
    this.mode = value;
  }

  /**
   * Gets the value of the 'configured' field.
   * @return The value of the 'configured' field.
   */
  public boolean getConfigured() {
    return configured;
  }


  /**
   * Sets the value of the 'configured' field.
   * @param value the value to set.
   */
  public void setConfigured(boolean value) {
    this.configured = value;
  }

  /**
   * Creates a new Startup RecordBuilder.
   * @return A new Startup RecordBuilder
   */
  public static my.example.hue.Startup.Builder newBuilder() {
    return new my.example.hue.Startup.Builder();
  }

  /**
   * Creates a new Startup RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Startup RecordBuilder
   */
  public static my.example.hue.Startup.Builder newBuilder(my.example.hue.Startup.Builder other) {
    if (other == null) {
      return new my.example.hue.Startup.Builder();
    } else {
      return new my.example.hue.Startup.Builder(other);
    }
  }

  /**
   * Creates a new Startup RecordBuilder by copying an existing Startup instance.
   * @param other The existing instance to copy.
   * @return A new Startup RecordBuilder
   */
  public static my.example.hue.Startup.Builder newBuilder(my.example.hue.Startup other) {
    if (other == null) {
      return new my.example.hue.Startup.Builder();
    } else {
      return new my.example.hue.Startup.Builder(other);
    }
  }

  /**
   * RecordBuilder for Startup instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Startup>
    implements org.apache.avro.data.RecordBuilder<Startup> {

    private java.lang.String mode;
    private boolean configured;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(my.example.hue.Startup.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.mode)) {
        this.mode = data().deepCopy(fields()[0].schema(), other.mode);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.configured)) {
        this.configured = data().deepCopy(fields()[1].schema(), other.configured);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing Startup instance
     * @param other The existing instance to copy.
     */
    private Builder(my.example.hue.Startup other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.mode)) {
        this.mode = data().deepCopy(fields()[0].schema(), other.mode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.configured)) {
        this.configured = data().deepCopy(fields()[1].schema(), other.configured);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'mode' field.
      * @return The value.
      */
    public java.lang.String getMode() {
      return mode;
    }


    /**
      * Sets the value of the 'mode' field.
      * @param value The value of 'mode'.
      * @return This builder.
      */
    public my.example.hue.Startup.Builder setMode(java.lang.String value) {
      validate(fields()[0], value);
      this.mode = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'mode' field has been set.
      * @return True if the 'mode' field has been set, false otherwise.
      */
    public boolean hasMode() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'mode' field.
      * @return This builder.
      */
    public my.example.hue.Startup.Builder clearMode() {
      mode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'configured' field.
      * @return The value.
      */
    public boolean getConfigured() {
      return configured;
    }


    /**
      * Sets the value of the 'configured' field.
      * @param value The value of 'configured'.
      * @return This builder.
      */
    public my.example.hue.Startup.Builder setConfigured(boolean value) {
      validate(fields()[1], value);
      this.configured = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'configured' field has been set.
      * @return True if the 'configured' field has been set, false otherwise.
      */
    public boolean hasConfigured() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'configured' field.
      * @return This builder.
      */
    public my.example.hue.Startup.Builder clearConfigured() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Startup build() {
      try {
        Startup record = new Startup();
        record.mode = fieldSetFlags()[0] ? this.mode : (java.lang.String) defaultValue(fields()[0]);
        record.configured = fieldSetFlags()[1] ? this.configured : (java.lang.Boolean) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Startup>
    WRITER$ = (org.apache.avro.io.DatumWriter<Startup>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Startup>
    READER$ = (org.apache.avro.io.DatumReader<Startup>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.mode);

    out.writeBoolean(this.configured);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.mode = in.readString();

      this.configured = in.readBoolean();

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.mode = in.readString();
          break;

        case 1:
          this.configured = in.readBoolean();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










