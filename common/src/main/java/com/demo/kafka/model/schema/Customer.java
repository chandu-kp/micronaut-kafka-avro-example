/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.demo.kafka.model.schema;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Customer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3648590003437386914L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Customer\",\"namespace\":\"com.demo.kafka.model.schema\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"phone_number\",\"type\":[\"string\",\"null\"]},{\"name\":\"city\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Customer> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Customer> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Customer> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Customer> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Customer> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Customer to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Customer from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Customer instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Customer fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence name;
  private java.lang.CharSequence phone_number;
  private java.lang.CharSequence city;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Customer() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param phone_number The new value for phone_number
   * @param city The new value for city
   */
  public Customer(java.lang.CharSequence name, java.lang.CharSequence phone_number, java.lang.CharSequence city) {
    this.name = name;
    this.phone_number = phone_number;
    this.city = city;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return phone_number;
    case 2: return city;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: phone_number = (java.lang.CharSequence)value$; break;
    case 2: city = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'phone_number' field.
   * @return The value of the 'phone_number' field.
   */
  public java.lang.CharSequence getPhoneNumber() {
    return phone_number;
  }


  /**
   * Sets the value of the 'phone_number' field.
   * @param value the value to set.
   */
  public void setPhoneNumber(java.lang.CharSequence value) {
    this.phone_number = value;
  }

  /**
   * Gets the value of the 'city' field.
   * @return The value of the 'city' field.
   */
  public java.lang.CharSequence getCity() {
    return city;
  }


  /**
   * Sets the value of the 'city' field.
   * @param value the value to set.
   */
  public void setCity(java.lang.CharSequence value) {
    this.city = value;
  }

  /**
   * Creates a new Customer RecordBuilder.
   * @return A new Customer RecordBuilder
   */
  public static com.demo.kafka.model.schema.Customer.Builder newBuilder() {
    return new com.demo.kafka.model.schema.Customer.Builder();
  }

  /**
   * Creates a new Customer RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Customer RecordBuilder
   */
  public static com.demo.kafka.model.schema.Customer.Builder newBuilder(com.demo.kafka.model.schema.Customer.Builder other) {
    if (other == null) {
      return new com.demo.kafka.model.schema.Customer.Builder();
    } else {
      return new com.demo.kafka.model.schema.Customer.Builder(other);
    }
  }

  /**
   * Creates a new Customer RecordBuilder by copying an existing Customer instance.
   * @param other The existing instance to copy.
   * @return A new Customer RecordBuilder
   */
  public static com.demo.kafka.model.schema.Customer.Builder newBuilder(com.demo.kafka.model.schema.Customer other) {
    if (other == null) {
      return new com.demo.kafka.model.schema.Customer.Builder();
    } else {
      return new com.demo.kafka.model.schema.Customer.Builder(other);
    }
  }

  /**
   * RecordBuilder for Customer instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Customer>
    implements org.apache.avro.data.RecordBuilder<Customer> {

    private java.lang.CharSequence name;
    private java.lang.CharSequence phone_number;
    private java.lang.CharSequence city;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.demo.kafka.model.schema.Customer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.phone_number)) {
        this.phone_number = data().deepCopy(fields()[1].schema(), other.phone_number);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.city)) {
        this.city = data().deepCopy(fields()[2].schema(), other.city);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing Customer instance
     * @param other The existing instance to copy.
     */
    private Builder(com.demo.kafka.model.schema.Customer other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.phone_number)) {
        this.phone_number = data().deepCopy(fields()[1].schema(), other.phone_number);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.city)) {
        this.city = data().deepCopy(fields()[2].schema(), other.city);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.demo.kafka.model.schema.Customer.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.demo.kafka.model.schema.Customer.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'phone_number' field.
      * @return The value.
      */
    public java.lang.CharSequence getPhoneNumber() {
      return phone_number;
    }


    /**
      * Sets the value of the 'phone_number' field.
      * @param value The value of 'phone_number'.
      * @return This builder.
      */
    public com.demo.kafka.model.schema.Customer.Builder setPhoneNumber(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.phone_number = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'phone_number' field has been set.
      * @return True if the 'phone_number' field has been set, false otherwise.
      */
    public boolean hasPhoneNumber() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'phone_number' field.
      * @return This builder.
      */
    public com.demo.kafka.model.schema.Customer.Builder clearPhoneNumber() {
      phone_number = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'city' field.
      * @return The value.
      */
    public java.lang.CharSequence getCity() {
      return city;
    }


    /**
      * Sets the value of the 'city' field.
      * @param value The value of 'city'.
      * @return This builder.
      */
    public com.demo.kafka.model.schema.Customer.Builder setCity(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.city = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'city' field has been set.
      * @return True if the 'city' field has been set, false otherwise.
      */
    public boolean hasCity() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'city' field.
      * @return This builder.
      */
    public com.demo.kafka.model.schema.Customer.Builder clearCity() {
      city = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Customer build() {
      try {
        Customer record = new Customer();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.phone_number = fieldSetFlags()[1] ? this.phone_number : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.city = fieldSetFlags()[2] ? this.city : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Customer>
    WRITER$ = (org.apache.avro.io.DatumWriter<Customer>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Customer>
    READER$ = (org.apache.avro.io.DatumReader<Customer>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.name);

    if (this.phone_number == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.phone_number);
    }

    if (this.city == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.city);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

      if (in.readIndex() != 0) {
        in.readNull();
        this.phone_number = null;
      } else {
        this.phone_number = in.readString(this.phone_number instanceof Utf8 ? (Utf8)this.phone_number : null);
      }

      if (in.readIndex() != 0) {
        in.readNull();
        this.city = null;
      } else {
        this.city = in.readString(this.city instanceof Utf8 ? (Utf8)this.city : null);
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          break;

        case 1:
          if (in.readIndex() != 0) {
            in.readNull();
            this.phone_number = null;
          } else {
            this.phone_number = in.readString(this.phone_number instanceof Utf8 ? (Utf8)this.phone_number : null);
          }
          break;

        case 2:
          if (in.readIndex() != 0) {
            in.readNull();
            this.city = null;
          } else {
            this.city = in.readString(this.city instanceof Utf8 ? (Utf8)this.city : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










