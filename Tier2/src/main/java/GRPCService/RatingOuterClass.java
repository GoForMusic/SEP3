// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rating.proto

package GRPCService;

public final class RatingOuterClass {
  private RatingOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RatingObjOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Rating.RatingObj)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.user.UserObj ratedUser = 1;</code>
     */
    boolean hasRatedUser();
    /**
     * <code>.user.UserObj ratedUser = 1;</code>
     */
    GRPCService.UserOuterClass.UserObj getRatedUser();
    /**
     * <code>.user.UserObj ratedUser = 1;</code>
     */
    GRPCService.UserOuterClass.UserObjOrBuilder getRatedUserOrBuilder();

    /**
     * <code>int32 score = 2;</code>
     */
    int getScore();

    /**
     * <code>.user.UserObj rateUser = 3;</code>
     */
    boolean hasRateUser();
    /**
     * <code>.user.UserObj rateUser = 3;</code>
     */
    GRPCService.UserOuterClass.UserObj getRateUser();
    /**
     * <code>.user.UserObj rateUser = 3;</code>
     */
    GRPCService.UserOuterClass.UserObjOrBuilder getRateUserOrBuilder();
  }
  /**
   * Protobuf type {@code Rating.RatingObj}
   */
  public  static final class RatingObj extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Rating.RatingObj)
      RatingObjOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RatingObj.newBuilder() to construct.
    private RatingObj(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RatingObj() {
      score_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RatingObj(
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
              GRPCService.UserOuterClass.UserObj.Builder subBuilder = null;
              if (ratedUser_ != null) {
                subBuilder = ratedUser_.toBuilder();
              }
              ratedUser_ = input.readMessage(GRPCService.UserOuterClass.UserObj.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(ratedUser_);
                ratedUser_ = subBuilder.buildPartial();
              }

              break;
            }
            case 16: {

              score_ = input.readInt32();
              break;
            }
            case 26: {
              GRPCService.UserOuterClass.UserObj.Builder subBuilder = null;
              if (rateUser_ != null) {
                subBuilder = rateUser_.toBuilder();
              }
              rateUser_ = input.readMessage(GRPCService.UserOuterClass.UserObj.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(rateUser_);
                rateUser_ = subBuilder.buildPartial();
              }

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
      return GRPCService.RatingOuterClass.internal_static_Rating_RatingObj_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GRPCService.RatingOuterClass.internal_static_Rating_RatingObj_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GRPCService.RatingOuterClass.RatingObj.class, GRPCService.RatingOuterClass.RatingObj.Builder.class);
    }

    public static final int RATEDUSER_FIELD_NUMBER = 1;
    private GRPCService.UserOuterClass.UserObj ratedUser_;
    /**
     * <code>.user.UserObj ratedUser = 1;</code>
     */
    public boolean hasRatedUser() {
      return ratedUser_ != null;
    }
    /**
     * <code>.user.UserObj ratedUser = 1;</code>
     */
    public GRPCService.UserOuterClass.UserObj getRatedUser() {
      return ratedUser_ == null ? GRPCService.UserOuterClass.UserObj.getDefaultInstance() : ratedUser_;
    }
    /**
     * <code>.user.UserObj ratedUser = 1;</code>
     */
    public GRPCService.UserOuterClass.UserObjOrBuilder getRatedUserOrBuilder() {
      return getRatedUser();
    }

    public static final int SCORE_FIELD_NUMBER = 2;
    private int score_;
    /**
     * <code>int32 score = 2;</code>
     */
    public int getScore() {
      return score_;
    }

    public static final int RATEUSER_FIELD_NUMBER = 3;
    private GRPCService.UserOuterClass.UserObj rateUser_;
    /**
     * <code>.user.UserObj rateUser = 3;</code>
     */
    public boolean hasRateUser() {
      return rateUser_ != null;
    }
    /**
     * <code>.user.UserObj rateUser = 3;</code>
     */
    public GRPCService.UserOuterClass.UserObj getRateUser() {
      return rateUser_ == null ? GRPCService.UserOuterClass.UserObj.getDefaultInstance() : rateUser_;
    }
    /**
     * <code>.user.UserObj rateUser = 3;</code>
     */
    public GRPCService.UserOuterClass.UserObjOrBuilder getRateUserOrBuilder() {
      return getRateUser();
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
      if (ratedUser_ != null) {
        output.writeMessage(1, getRatedUser());
      }
      if (score_ != 0) {
        output.writeInt32(2, score_);
      }
      if (rateUser_ != null) {
        output.writeMessage(3, getRateUser());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (ratedUser_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getRatedUser());
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, score_);
      }
      if (rateUser_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getRateUser());
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
      if (!(obj instanceof GRPCService.RatingOuterClass.RatingObj)) {
        return super.equals(obj);
      }
      GRPCService.RatingOuterClass.RatingObj other = (GRPCService.RatingOuterClass.RatingObj) obj;

      boolean result = true;
      result = result && (hasRatedUser() == other.hasRatedUser());
      if (hasRatedUser()) {
        result = result && getRatedUser()
            .equals(other.getRatedUser());
      }
      result = result && (getScore()
          == other.getScore());
      result = result && (hasRateUser() == other.hasRateUser());
      if (hasRateUser()) {
        result = result && getRateUser()
            .equals(other.getRateUser());
      }
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
      if (hasRatedUser()) {
        hash = (37 * hash) + RATEDUSER_FIELD_NUMBER;
        hash = (53 * hash) + getRatedUser().hashCode();
      }
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      if (hasRateUser()) {
        hash = (37 * hash) + RATEUSER_FIELD_NUMBER;
        hash = (53 * hash) + getRateUser().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static GRPCService.RatingOuterClass.RatingObj parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GRPCService.RatingOuterClass.RatingObj parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GRPCService.RatingOuterClass.RatingObj parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GRPCService.RatingOuterClass.RatingObj parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GRPCService.RatingOuterClass.RatingObj parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GRPCService.RatingOuterClass.RatingObj parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GRPCService.RatingOuterClass.RatingObj parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GRPCService.RatingOuterClass.RatingObj parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static GRPCService.RatingOuterClass.RatingObj parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static GRPCService.RatingOuterClass.RatingObj parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static GRPCService.RatingOuterClass.RatingObj parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GRPCService.RatingOuterClass.RatingObj parseFrom(
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
    public static Builder newBuilder(GRPCService.RatingOuterClass.RatingObj prototype) {
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
     * Protobuf type {@code Rating.RatingObj}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Rating.RatingObj)
        GRPCService.RatingOuterClass.RatingObjOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return GRPCService.RatingOuterClass.internal_static_Rating_RatingObj_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return GRPCService.RatingOuterClass.internal_static_Rating_RatingObj_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GRPCService.RatingOuterClass.RatingObj.class, GRPCService.RatingOuterClass.RatingObj.Builder.class);
      }

      // Construct using GRPCService.RatingOuterClass.RatingObj.newBuilder()
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
        if (ratedUserBuilder_ == null) {
          ratedUser_ = null;
        } else {
          ratedUser_ = null;
          ratedUserBuilder_ = null;
        }
        score_ = 0;

        if (rateUserBuilder_ == null) {
          rateUser_ = null;
        } else {
          rateUser_ = null;
          rateUserBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GRPCService.RatingOuterClass.internal_static_Rating_RatingObj_descriptor;
      }

      @java.lang.Override
      public GRPCService.RatingOuterClass.RatingObj getDefaultInstanceForType() {
        return GRPCService.RatingOuterClass.RatingObj.getDefaultInstance();
      }

      @java.lang.Override
      public GRPCService.RatingOuterClass.RatingObj build() {
        GRPCService.RatingOuterClass.RatingObj result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public GRPCService.RatingOuterClass.RatingObj buildPartial() {
        GRPCService.RatingOuterClass.RatingObj result = new GRPCService.RatingOuterClass.RatingObj(this);
        if (ratedUserBuilder_ == null) {
          result.ratedUser_ = ratedUser_;
        } else {
          result.ratedUser_ = ratedUserBuilder_.build();
        }
        result.score_ = score_;
        if (rateUserBuilder_ == null) {
          result.rateUser_ = rateUser_;
        } else {
          result.rateUser_ = rateUserBuilder_.build();
        }
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
        if (other instanceof GRPCService.RatingOuterClass.RatingObj) {
          return mergeFrom((GRPCService.RatingOuterClass.RatingObj)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(GRPCService.RatingOuterClass.RatingObj other) {
        if (other == GRPCService.RatingOuterClass.RatingObj.getDefaultInstance()) return this;
        if (other.hasRatedUser()) {
          mergeRatedUser(other.getRatedUser());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.hasRateUser()) {
          mergeRateUser(other.getRateUser());
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
        GRPCService.RatingOuterClass.RatingObj parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (GRPCService.RatingOuterClass.RatingObj) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private GRPCService.UserOuterClass.UserObj ratedUser_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          GRPCService.UserOuterClass.UserObj, GRPCService.UserOuterClass.UserObj.Builder, GRPCService.UserOuterClass.UserObjOrBuilder> ratedUserBuilder_;
      /**
       * <code>.user.UserObj ratedUser = 1;</code>
       */
      public boolean hasRatedUser() {
        return ratedUserBuilder_ != null || ratedUser_ != null;
      }
      /**
       * <code>.user.UserObj ratedUser = 1;</code>
       */
      public GRPCService.UserOuterClass.UserObj getRatedUser() {
        if (ratedUserBuilder_ == null) {
          return ratedUser_ == null ? GRPCService.UserOuterClass.UserObj.getDefaultInstance() : ratedUser_;
        } else {
          return ratedUserBuilder_.getMessage();
        }
      }
      /**
       * <code>.user.UserObj ratedUser = 1;</code>
       */
      public Builder setRatedUser(GRPCService.UserOuterClass.UserObj value) {
        if (ratedUserBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ratedUser_ = value;
          onChanged();
        } else {
          ratedUserBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.user.UserObj ratedUser = 1;</code>
       */
      public Builder setRatedUser(
          GRPCService.UserOuterClass.UserObj.Builder builderForValue) {
        if (ratedUserBuilder_ == null) {
          ratedUser_ = builderForValue.build();
          onChanged();
        } else {
          ratedUserBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.user.UserObj ratedUser = 1;</code>
       */
      public Builder mergeRatedUser(GRPCService.UserOuterClass.UserObj value) {
        if (ratedUserBuilder_ == null) {
          if (ratedUser_ != null) {
            ratedUser_ =
              GRPCService.UserOuterClass.UserObj.newBuilder(ratedUser_).mergeFrom(value).buildPartial();
          } else {
            ratedUser_ = value;
          }
          onChanged();
        } else {
          ratedUserBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.user.UserObj ratedUser = 1;</code>
       */
      public Builder clearRatedUser() {
        if (ratedUserBuilder_ == null) {
          ratedUser_ = null;
          onChanged();
        } else {
          ratedUser_ = null;
          ratedUserBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.user.UserObj ratedUser = 1;</code>
       */
      public GRPCService.UserOuterClass.UserObj.Builder getRatedUserBuilder() {
        
        onChanged();
        return getRatedUserFieldBuilder().getBuilder();
      }
      /**
       * <code>.user.UserObj ratedUser = 1;</code>
       */
      public GRPCService.UserOuterClass.UserObjOrBuilder getRatedUserOrBuilder() {
        if (ratedUserBuilder_ != null) {
          return ratedUserBuilder_.getMessageOrBuilder();
        } else {
          return ratedUser_ == null ?
              GRPCService.UserOuterClass.UserObj.getDefaultInstance() : ratedUser_;
        }
      }
      /**
       * <code>.user.UserObj ratedUser = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          GRPCService.UserOuterClass.UserObj, GRPCService.UserOuterClass.UserObj.Builder, GRPCService.UserOuterClass.UserObjOrBuilder> 
          getRatedUserFieldBuilder() {
        if (ratedUserBuilder_ == null) {
          ratedUserBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              GRPCService.UserOuterClass.UserObj, GRPCService.UserOuterClass.UserObj.Builder, GRPCService.UserOuterClass.UserObjOrBuilder>(
                  getRatedUser(),
                  getParentForChildren(),
                  isClean());
          ratedUser_ = null;
        }
        return ratedUserBuilder_;
      }

      private int score_ ;
      /**
       * <code>int32 score = 2;</code>
       */
      public int getScore() {
        return score_;
      }
      /**
       * <code>int32 score = 2;</code>
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 score = 2;</code>
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private GRPCService.UserOuterClass.UserObj rateUser_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          GRPCService.UserOuterClass.UserObj, GRPCService.UserOuterClass.UserObj.Builder, GRPCService.UserOuterClass.UserObjOrBuilder> rateUserBuilder_;
      /**
       * <code>.user.UserObj rateUser = 3;</code>
       */
      public boolean hasRateUser() {
        return rateUserBuilder_ != null || rateUser_ != null;
      }
      /**
       * <code>.user.UserObj rateUser = 3;</code>
       */
      public GRPCService.UserOuterClass.UserObj getRateUser() {
        if (rateUserBuilder_ == null) {
          return rateUser_ == null ? GRPCService.UserOuterClass.UserObj.getDefaultInstance() : rateUser_;
        } else {
          return rateUserBuilder_.getMessage();
        }
      }
      /**
       * <code>.user.UserObj rateUser = 3;</code>
       */
      public Builder setRateUser(GRPCService.UserOuterClass.UserObj value) {
        if (rateUserBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rateUser_ = value;
          onChanged();
        } else {
          rateUserBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.user.UserObj rateUser = 3;</code>
       */
      public Builder setRateUser(
          GRPCService.UserOuterClass.UserObj.Builder builderForValue) {
        if (rateUserBuilder_ == null) {
          rateUser_ = builderForValue.build();
          onChanged();
        } else {
          rateUserBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.user.UserObj rateUser = 3;</code>
       */
      public Builder mergeRateUser(GRPCService.UserOuterClass.UserObj value) {
        if (rateUserBuilder_ == null) {
          if (rateUser_ != null) {
            rateUser_ =
              GRPCService.UserOuterClass.UserObj.newBuilder(rateUser_).mergeFrom(value).buildPartial();
          } else {
            rateUser_ = value;
          }
          onChanged();
        } else {
          rateUserBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.user.UserObj rateUser = 3;</code>
       */
      public Builder clearRateUser() {
        if (rateUserBuilder_ == null) {
          rateUser_ = null;
          onChanged();
        } else {
          rateUser_ = null;
          rateUserBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.user.UserObj rateUser = 3;</code>
       */
      public GRPCService.UserOuterClass.UserObj.Builder getRateUserBuilder() {
        
        onChanged();
        return getRateUserFieldBuilder().getBuilder();
      }
      /**
       * <code>.user.UserObj rateUser = 3;</code>
       */
      public GRPCService.UserOuterClass.UserObjOrBuilder getRateUserOrBuilder() {
        if (rateUserBuilder_ != null) {
          return rateUserBuilder_.getMessageOrBuilder();
        } else {
          return rateUser_ == null ?
              GRPCService.UserOuterClass.UserObj.getDefaultInstance() : rateUser_;
        }
      }
      /**
       * <code>.user.UserObj rateUser = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          GRPCService.UserOuterClass.UserObj, GRPCService.UserOuterClass.UserObj.Builder, GRPCService.UserOuterClass.UserObjOrBuilder> 
          getRateUserFieldBuilder() {
        if (rateUserBuilder_ == null) {
          rateUserBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              GRPCService.UserOuterClass.UserObj, GRPCService.UserOuterClass.UserObj.Builder, GRPCService.UserOuterClass.UserObjOrBuilder>(
                  getRateUser(),
                  getParentForChildren(),
                  isClean());
          rateUser_ = null;
        }
        return rateUserBuilder_;
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


      // @@protoc_insertion_point(builder_scope:Rating.RatingObj)
    }

    // @@protoc_insertion_point(class_scope:Rating.RatingObj)
    private static final GRPCService.RatingOuterClass.RatingObj DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GRPCService.RatingOuterClass.RatingObj();
    }

    public static GRPCService.RatingOuterClass.RatingObj getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RatingObj>
        PARSER = new com.google.protobuf.AbstractParser<RatingObj>() {
      @java.lang.Override
      public RatingObj parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RatingObj(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RatingObj> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RatingObj> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public GRPCService.RatingOuterClass.RatingObj getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Rating_RatingObj_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Rating_RatingObj_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014rating.proto\022\006Rating\032\nuser.proto\"]\n\tRa" +
      "tingObj\022 \n\tratedUser\030\001 \001(\0132\r.user.UserOb" +
      "j\022\r\n\005score\030\002 \001(\005\022\037\n\010rateUser\030\003 \001(\0132\r.use" +
      "r.UserObj2;\n\006Rating\0221\n\tAddRating\022\021.Ratin" +
      "g.RatingObj\032\021.Rating.RatingObjB\r\n\013GRPCSe" +
      "rviceb\006proto3"
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
    internal_static_Rating_RatingObj_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Rating_RatingObj_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Rating_RatingObj_descriptor,
        new java.lang.String[] { "RatedUser", "Score", "RateUser", });
    GRPCService.UserOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
