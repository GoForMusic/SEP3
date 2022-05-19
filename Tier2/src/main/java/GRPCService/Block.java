// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Block.proto

package GRPCService;

public final class Block {
  private Block() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BlockObjOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlockObj)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string username = 1;</code>
     */
    java.lang.String getUsername();
    /**
     * <code>string username = 1;</code>
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    /**
     * <code>string reason = 2;</code>
     */
    java.lang.String getReason();
    /**
     * <code>string reason = 2;</code>
     */
    com.google.protobuf.ByteString
        getReasonBytes();
  }
  /**
   * Protobuf type {@code BlockObj}
   */
  public  static final class BlockObj extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BlockObj)
      BlockObjOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlockObj.newBuilder() to construct.
    private BlockObj(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlockObj() {
      username_ = "";
      reason_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BlockObj(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              username_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              reason_ = s;
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GRPCService.Block.internal_static_BlockObj_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GRPCService.Block.internal_static_BlockObj_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GRPCService.Block.BlockObj.class, GRPCService.Block.BlockObj.Builder.class);
    }

    public static final int USERNAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object username_;
    /**
     * <code>string username = 1;</code>
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      }
    }
    /**
     * <code>string username = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REASON_FIELD_NUMBER = 2;
    private volatile java.lang.Object reason_;
    /**
     * <code>string reason = 2;</code>
     */
    public java.lang.String getReason() {
      java.lang.Object ref = reason_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reason_ = s;
        return s;
      }
    }
    /**
     * <code>string reason = 2;</code>
     */
    public com.google.protobuf.ByteString
        getReasonBytes() {
      java.lang.Object ref = reason_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getUsernameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, username_);
      }
      if (!getReasonBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, reason_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getUsernameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, username_);
      }
      if (!getReasonBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, reason_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof GRPCService.Block.BlockObj)) {
        return super.equals(obj);
      }
      GRPCService.Block.BlockObj other = (GRPCService.Block.BlockObj) obj;

      boolean result = true;
      result = result && getUsername()
          .equals(other.getUsername());
      result = result && getReason()
          .equals(other.getReason());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUsername().hashCode();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + getReason().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static GRPCService.Block.BlockObj parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GRPCService.Block.BlockObj parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GRPCService.Block.BlockObj parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GRPCService.Block.BlockObj parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GRPCService.Block.BlockObj parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GRPCService.Block.BlockObj parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GRPCService.Block.BlockObj parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GRPCService.Block.BlockObj parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static GRPCService.Block.BlockObj parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static GRPCService.Block.BlockObj parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static GRPCService.Block.BlockObj parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GRPCService.Block.BlockObj parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(GRPCService.Block.BlockObj prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code BlockObj}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlockObj)
        GRPCService.Block.BlockObjOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return GRPCService.Block.internal_static_BlockObj_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return GRPCService.Block.internal_static_BlockObj_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GRPCService.Block.BlockObj.class, GRPCService.Block.BlockObj.Builder.class);
      }

      // Construct using GRPCService.Block.BlockObj.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        username_ = "";

        reason_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GRPCService.Block.internal_static_BlockObj_descriptor;
      }

      @java.lang.Override
      public GRPCService.Block.BlockObj getDefaultInstanceForType() {
        return GRPCService.Block.BlockObj.getDefaultInstance();
      }

      @java.lang.Override
      public GRPCService.Block.BlockObj build() {
        GRPCService.Block.BlockObj result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public GRPCService.Block.BlockObj buildPartial() {
        GRPCService.Block.BlockObj result = new GRPCService.Block.BlockObj(this);
        result.username_ = username_;
        result.reason_ = reason_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof GRPCService.Block.BlockObj) {
          return mergeFrom((GRPCService.Block.BlockObj)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(GRPCService.Block.BlockObj other) {
        if (other == GRPCService.Block.BlockObj.getDefaultInstance()) return this;
        if (!other.getUsername().isEmpty()) {
          username_ = other.username_;
          onChanged();
        }
        if (!other.getReason().isEmpty()) {
          reason_ = other.reason_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        GRPCService.Block.BlockObj parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (GRPCService.Block.BlockObj) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object username_ = "";
      /**
       * <code>string username = 1;</code>
       */
      public java.lang.String getUsername() {
        java.lang.Object ref = username_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          username_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string username = 1;</code>
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        java.lang.Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string username = 1;</code>
       */
      public Builder setUsername(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        username_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string username = 1;</code>
       */
      public Builder clearUsername() {
        
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      /**
       * <code>string username = 1;</code>
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        username_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object reason_ = "";
      /**
       * <code>string reason = 2;</code>
       */
      public java.lang.String getReason() {
        java.lang.Object ref = reason_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          reason_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string reason = 2;</code>
       */
      public com.google.protobuf.ByteString
          getReasonBytes() {
        java.lang.Object ref = reason_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          reason_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string reason = 2;</code>
       */
      public Builder setReason(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string reason = 2;</code>
       */
      public Builder clearReason() {
        
        reason_ = getDefaultInstance().getReason();
        onChanged();
        return this;
      }
      /**
       * <code>string reason = 2;</code>
       */
      public Builder setReasonBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        reason_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:BlockObj)
    }

    // @@protoc_insertion_point(class_scope:BlockObj)
    private static final GRPCService.Block.BlockObj DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GRPCService.Block.BlockObj();
    }

    public static GRPCService.Block.BlockObj getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BlockObj>
        PARSER = new com.google.protobuf.AbstractParser<BlockObj>() {
      @java.lang.Override
      public BlockObj parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BlockObj(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BlockObj> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BlockObj> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public GRPCService.Block.BlockObj getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlockObj_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BlockObj_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Block.proto\032\nuser.proto\",\n\010BlockObj\022\020\n" +
      "\010username\030\001 \001(\t\022\016\n\006reason\030\002 \001(\t2a\n\nBlock" +
      "Proto\022%\n\tBlockUser\022\t.BlockObj\032\r.user.Use" +
      "rObj\022,\n\013UnBlockUser\022\016.user.Username\032\r.us" +
      "er.UserObjB\r\n\013GRPCServiceb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          GRPCService.UserOuterClass.getDescriptor(),
        }, assigner);
    internal_static_BlockObj_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BlockObj_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BlockObj_descriptor,
        new java.lang.String[] { "Username", "Reason", });
    GRPCService.UserOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
