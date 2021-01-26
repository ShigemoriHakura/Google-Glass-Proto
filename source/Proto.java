// 
// Decompiled by Procyon v0.5.36
// 

package com.google.glass.companion;

import java.util.Arrays;
import com.google.googlex.glass.common.proto.TimelineNano;
import com.google.protobuf.nano.UnknownFieldData;
import java.util.ArrayList;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;

public interface Proto
{
    public static final class AndroidDeviceInfo extends ExtendableMessageNano
    {
        public static final AndroidDeviceInfo[] EMPTY_ARRAY;
        private int bitField0_;
        private int sdkVersion_;
        
        static {
            EMPTY_ARRAY = new AndroidDeviceInfo[0];
        }
        
        public AndroidDeviceInfo() {
            this.sdkVersion_ = 0;
        }
        
        public static AndroidDeviceInfo parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new AndroidDeviceInfo().mergeFrom(codedInputByteBufferNano);
        }
        
        public static AndroidDeviceInfo parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new AndroidDeviceInfo(), array);
        }
        
        public AndroidDeviceInfo clearSdkVersion() {
            this.sdkVersion_ = 0;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof AndroidDeviceInfo)) {
                    b = false;
                }
                else {
                    final AndroidDeviceInfo androidDeviceInfo = (AndroidDeviceInfo)o;
                    if (this.sdkVersion_ == androidDeviceInfo.sdkVersion_) {
                        if (this.unknownFieldData == null) {
                            if (androidDeviceInfo.unknownFieldData == null) {
                                return b;
                            }
                        }
                        else if (this.unknownFieldData.equals(androidDeviceInfo.unknownFieldData)) {
                            return b;
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public int getSdkVersion() {
            return this.sdkVersion_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeInt32Size(1, this.sdkVersion_);
            }
            return this.cachedSize = n + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public boolean hasSdkVersion() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        @Override
        public int hashCode() {
            final int sdkVersion_ = this.sdkVersion_;
            int hashCode;
            if (this.unknownFieldData == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.unknownFieldData.hashCode();
            }
            return (sdkVersion_ + 527) * 31 + hashCode;
        }
        
        @Override
        public AndroidDeviceInfo mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0062:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0062;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0062;
                    }
                    case 8: {
                        this.sdkVersion_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public AndroidDeviceInfo setSdkVersion(final int sdkVersion_) {
            this.sdkVersion_ = sdkVersion_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeInt32(1, this.sdkVersion_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class ApiRequest extends ExtendableMessageNano
    {
        public static final ApiRequest[] EMPTY_ARRAY;
        public byte[][] attachmentContent;
        private int bitField0_;
        private String projectId_;
        private TimelineNano.TimelineItem timelineItem_;
        private String token_;
        private int type_;
        
        static {
            EMPTY_ARRAY = new ApiRequest[0];
        }
        
        public ApiRequest() {
            this.projectId_ = "";
            this.token_ = "";
            this.type_ = 0;
            this.attachmentContent = WireFormatNano.EMPTY_BYTES_ARRAY;
        }
        
        public static ApiRequest parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new ApiRequest().mergeFrom(codedInputByteBufferNano);
        }
        
        public static ApiRequest parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new ApiRequest(), array);
        }
        
        public ApiRequest clearProjectId() {
            this.projectId_ = "";
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        public ApiRequest clearTimelineItem() {
            this.timelineItem_ = null;
            return this;
        }
        
        public ApiRequest clearToken() {
            this.token_ = "";
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        public ApiRequest clearType() {
            this.type_ = 0;
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof ApiRequest)) {
                    b = false;
                }
                else {
                    final ApiRequest apiRequest = (ApiRequest)o;
                    Label_0107: {
                        if (this.projectId_ == null) {
                            if (apiRequest.projectId_ != null) {
                                break Label_0107;
                            }
                        }
                        else if (!this.projectId_.equals(apiRequest.projectId_)) {
                            break Label_0107;
                        }
                        if (this.token_ == null) {
                            if (apiRequest.token_ != null) {
                                break Label_0107;
                            }
                        }
                        else if (!this.token_.equals(apiRequest.token_)) {
                            break Label_0107;
                        }
                        if (this.type_ == apiRequest.type_) {
                            if (this.timelineItem_ == null) {
                                if (apiRequest.timelineItem_ != null) {
                                    break Label_0107;
                                }
                            }
                            else if (!this.timelineItem_.equals(apiRequest.timelineItem_)) {
                                break Label_0107;
                            }
                            if (Arrays.equals(this.attachmentContent, apiRequest.attachmentContent)) {
                                if (this.unknownFieldData == null) {
                                    if (apiRequest.unknownFieldData == null) {
                                        return b;
                                    }
                                }
                                else if (this.unknownFieldData.equals(apiRequest.unknownFieldData)) {
                                    return b;
                                }
                            }
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public String getProjectId() {
            return this.projectId_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeStringSize(1, this.projectId_);
            }
            int n2 = n;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n2 = n + CodedOutputByteBufferNano.computeStringSize(2, this.token_);
            }
            int n3 = n2;
            if ((this.bitField0_ & 0x4) != 0x0) {
                n3 = n2 + CodedOutputByteBufferNano.computeInt32Size(3, this.type_);
            }
            int n4 = n3;
            if (this.timelineItem_ != null) {
                n4 = n3 + CodedOutputByteBufferNano.computeMessageSize(4, this.timelineItem_);
            }
            int n5 = n4;
            if (this.attachmentContent != null) {
                n5 = n4;
                if (this.attachmentContent.length > 0) {
                    int n6 = 0;
                    final byte[][] attachmentContent = this.attachmentContent;
                    for (int length = attachmentContent.length, i = 0; i < length; ++i) {
                        n6 += CodedOutputByteBufferNano.computeBytesSizeNoTag(attachmentContent[i]);
                    }
                    n5 = n4 + n6 + this.attachmentContent.length * 1;
                }
            }
            return this.cachedSize = n5 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public TimelineNano.TimelineItem getTimelineItem() {
            return this.timelineItem_;
        }
        
        public String getToken() {
            return this.token_;
        }
        
        public int getType() {
            return this.type_;
        }
        
        public boolean hasProjectId() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        public boolean hasTimelineItem() {
            return this.timelineItem_ != null;
        }
        
        public boolean hasToken() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        public boolean hasType() {
            return (this.bitField0_ & 0x4) != 0x0;
        }
        
        @Override
        public int hashCode() {
            final int n = 0;
            int hashCode;
            if (this.projectId_ == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.projectId_.hashCode();
            }
            int hashCode2;
            if (this.token_ == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = this.token_.hashCode();
            }
            final int type_ = this.type_;
            int hashCode3;
            if (this.timelineItem_ == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = this.timelineItem_.hashCode();
            }
            int n2 = (((hashCode + 527) * 31 + hashCode2) * 31 + type_) * 31 + hashCode3;
            int n3;
            if (this.attachmentContent == null) {
                n3 = n2 * 31;
            }
            else {
                int n4 = 0;
                while (true) {
                    n3 = n2;
                    if (n4 >= this.attachmentContent.length) {
                        break;
                    }
                    for (int i = 0; i < this.attachmentContent[n4].length; ++i) {
                        n2 = n2 * 31 + this.attachmentContent[n4][i];
                    }
                    ++n4;
                }
            }
            int hashCode4;
            if (this.unknownFieldData == null) {
                hashCode4 = n;
            }
            else {
                hashCode4 = this.unknownFieldData.hashCode();
            }
            return n3 * 31 + hashCode4;
        }
        
        @Override
        public ApiRequest mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0094:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0094;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0094;
                    }
                    case 10: {
                        this.projectId_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 18: {
                        this.token_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x2;
                        continue;
                    }
                    case 24: {
                        final int int32 = codedInputByteBufferNano.readInt32();
                        if (int32 == 0 || int32 == 1) {
                            this.type_ = int32;
                            this.bitField0_ |= 0x4;
                            continue;
                        }
                        this.type_ = 0;
                        continue;
                    }
                    case 34: {
                        if (this.timelineItem_ == null) {
                            this.timelineItem_ = new TimelineNano.TimelineItem();
                        }
                        codedInputByteBufferNano.readMessage(this.timelineItem_);
                        continue;
                    }
                    case 42: {
                        final int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                        int i = this.attachmentContent.length;
                        final byte[][] attachmentContent = new byte[i + repeatedFieldArrayLength][];
                        System.arraycopy(this.attachmentContent, 0, attachmentContent, 0, i);
                        this.attachmentContent = attachmentContent;
                        while (i < this.attachmentContent.length - 1) {
                            this.attachmentContent[i] = codedInputByteBufferNano.readBytes();
                            codedInputByteBufferNano.readTag();
                            ++i;
                        }
                        this.attachmentContent[i] = codedInputByteBufferNano.readBytes();
                        continue;
                    }
                }
            }
            return this;
        }
        
        public ApiRequest setProjectId(final String projectId_) {
            if (projectId_ == null) {
                throw new NullPointerException();
            }
            this.projectId_ = projectId_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        public ApiRequest setTimelineItem(final TimelineNano.TimelineItem timelineItem_) {
            if (timelineItem_ == null) {
                throw new NullPointerException();
            }
            this.timelineItem_ = timelineItem_;
            return this;
        }
        
        public ApiRequest setToken(final String token_) {
            if (token_ == null) {
                throw new NullPointerException();
            }
            this.token_ = token_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        public ApiRequest setType(final int type_) {
            this.type_ = type_;
            this.bitField0_ |= 0x4;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeString(1, this.projectId_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeString(2, this.token_);
            }
            if ((this.bitField0_ & 0x4) != 0x0) {
                codedOutputByteBufferNano.writeInt32(3, this.type_);
            }
            if (this.timelineItem_ != null) {
                codedOutputByteBufferNano.writeMessage(4, this.timelineItem_);
            }
            if (this.attachmentContent != null) {
                final byte[][] attachmentContent = this.attachmentContent;
                for (int length = attachmentContent.length, i = 0; i < length; ++i) {
                    codedOutputByteBufferNano.writeBytes(5, attachmentContent[i]);
                }
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
        
        public interface RequestType
        {
            public static final int DELETE_TIMELINE_ITEM = 1;
            public static final int INSERT_OR_UPDATE_TIMELINE_ITEM = 0;
        }
    }
    
    public static final class ApiResponse extends ExtendableMessageNano
    {
        public static final ApiResponse[] EMPTY_ARRAY;
        private int bitField0_;
        private TimelineNano.TimelineItem timelineItem_;
        private int type_;
        private TimelineNano.UserAction userAction_;
        
        static {
            EMPTY_ARRAY = new ApiResponse[0];
        }
        
        public ApiResponse() {
            this.type_ = 0;
        }
        
        public static ApiResponse parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new ApiResponse().mergeFrom(codedInputByteBufferNano);
        }
        
        public static ApiResponse parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new ApiResponse(), array);
        }
        
        public ApiResponse clearTimelineItem() {
            this.timelineItem_ = null;
            return this;
        }
        
        public ApiResponse clearType() {
            this.type_ = 0;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        public ApiResponse clearUserAction() {
            this.userAction_ = null;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof ApiResponse)) {
                    b = false;
                }
                else {
                    final ApiResponse apiResponse = (ApiResponse)o;
                    Label_0079: {
                        if (this.type_ == apiResponse.type_) {
                            if (this.timelineItem_ == null) {
                                if (apiResponse.timelineItem_ != null) {
                                    break Label_0079;
                                }
                            }
                            else if (!this.timelineItem_.equals(apiResponse.timelineItem_)) {
                                break Label_0079;
                            }
                            if (this.userAction_ == null) {
                                if (apiResponse.userAction_ != null) {
                                    break Label_0079;
                                }
                            }
                            else if (!this.userAction_.equals(apiResponse.userAction_)) {
                                break Label_0079;
                            }
                            if (this.unknownFieldData == null) {
                                if (apiResponse.unknownFieldData == null) {
                                    return b;
                                }
                            }
                            else if (this.unknownFieldData.equals(apiResponse.unknownFieldData)) {
                                return b;
                            }
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeInt32Size(1, this.type_);
            }
            int n2 = n;
            if (this.timelineItem_ != null) {
                n2 = n + CodedOutputByteBufferNano.computeMessageSize(2, this.timelineItem_);
            }
            int n3 = n2;
            if (this.userAction_ != null) {
                n3 = n2 + CodedOutputByteBufferNano.computeMessageSize(3, this.userAction_);
            }
            return this.cachedSize = n3 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public TimelineNano.TimelineItem getTimelineItem() {
            return this.timelineItem_;
        }
        
        public int getType() {
            return this.type_;
        }
        
        public TimelineNano.UserAction getUserAction() {
            return this.userAction_;
        }
        
        public boolean hasTimelineItem() {
            return this.timelineItem_ != null;
        }
        
        public boolean hasType() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        public boolean hasUserAction() {
            return this.userAction_ != null;
        }
        
        @Override
        public int hashCode() {
            int hashCode = 0;
            final int type_ = this.type_;
            int hashCode2;
            if (this.timelineItem_ == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = this.timelineItem_.hashCode();
            }
            int hashCode3;
            if (this.userAction_ == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = this.userAction_.hashCode();
            }
            if (this.unknownFieldData != null) {
                hashCode = this.unknownFieldData.hashCode();
            }
            return (((type_ + 527) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode;
        }
        
        @Override
        public ApiResponse mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0078:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0078;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0078;
                    }
                    case 8: {
                        final int int32 = codedInputByteBufferNano.readInt32();
                        if (int32 == 0) {
                            this.type_ = int32;
                            this.bitField0_ |= 0x1;
                            continue;
                        }
                        this.type_ = 0;
                        continue;
                    }
                    case 18: {
                        if (this.timelineItem_ == null) {
                            this.timelineItem_ = new TimelineNano.TimelineItem();
                        }
                        codedInputByteBufferNano.readMessage(this.timelineItem_);
                        continue;
                    }
                    case 26: {
                        if (this.userAction_ == null) {
                            this.userAction_ = new TimelineNano.UserAction();
                        }
                        codedInputByteBufferNano.readMessage(this.userAction_);
                        continue;
                    }
                }
            }
            return this;
        }
        
        public ApiResponse setTimelineItem(final TimelineNano.TimelineItem timelineItem_) {
            if (timelineItem_ == null) {
                throw new NullPointerException();
            }
            this.timelineItem_ = timelineItem_;
            return this;
        }
        
        public ApiResponse setType(final int type_) {
            this.type_ = type_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        public ApiResponse setUserAction(final TimelineNano.UserAction userAction_) {
            if (userAction_ == null) {
                throw new NullPointerException();
            }
            this.userAction_ = userAction_;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeInt32(1, this.type_);
            }
            if (this.timelineItem_ != null) {
                codedOutputByteBufferNano.writeMessage(2, this.timelineItem_);
            }
            if (this.userAction_ != null) {
                codedOutputByteBufferNano.writeMessage(3, this.userAction_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
        
        public interface ResponseType
        {
            public static final int USER_ACTION = 0;
        }
    }
    
    public static final class Command extends ExtendableMessageNano
    {
        public static final Command[] EMPTY_ARRAY;
        public int command;
        
        static {
            EMPTY_ARRAY = new Command[0];
        }
        
        public Command() {
            this.command = 0;
        }
        
        public static Command parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new Command().mergeFrom(codedInputByteBufferNano);
        }
        
        public static Command parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new Command(), array);
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof Command)) {
                    b = false;
                }
                else {
                    final Command command = (Command)o;
                    if (this.command == command.command) {
                        if (this.unknownFieldData == null) {
                            if (command.unknownFieldData == null) {
                                return b;
                            }
                        }
                        else if (this.unknownFieldData.equals(command.unknownFieldData)) {
                            return b;
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        @Override
        public int getSerializedSize() {
            return this.cachedSize = 0 + CodedOutputByteBufferNano.computeInt32Size(1, this.command) + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        @Override
        public int hashCode() {
            final int command = this.command;
            int hashCode;
            if (this.unknownFieldData == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.unknownFieldData.hashCode();
            }
            return (command + 527) * 31 + hashCode;
        }
        
        @Override
        public Command mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0062:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0062;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0062;
                    }
                    case 8: {
                        final int int32 = codedInputByteBufferNano.readInt32();
                        if (int32 == 0 || int32 == 1 || int32 == 2) {
                            this.command = int32;
                            continue;
                        }
                        this.command = 0;
                        continue;
                    }
                }
            }
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt32(1, this.command);
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
        
        public interface CommandType
        {
            public static final int START_DEBUG = 1;
            public static final int STOP_DEBUG = 2;
            public static final int UNPAIR = 0;
        }
    }
    
    public static final class CompanionDeviceInfo extends ExtendableMessageNano
    {
        public static final CompanionDeviceInfo[] EMPTY_ARRAY;
        private int bitField0_;
        private boolean gpsEnabled_;
        private boolean isInteractiveState_;
        private boolean wifiConnected_;
        
        static {
            EMPTY_ARRAY = new CompanionDeviceInfo[0];
        }
        
        public CompanionDeviceInfo() {
            this.wifiConnected_ = false;
            this.isInteractiveState_ = false;
            this.gpsEnabled_ = true;
        }
        
        public static CompanionDeviceInfo parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new CompanionDeviceInfo().mergeFrom(codedInputByteBufferNano);
        }
        
        public static CompanionDeviceInfo parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new CompanionDeviceInfo(), array);
        }
        
        public CompanionDeviceInfo clearGpsEnabled() {
            this.gpsEnabled_ = true;
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }
        
        public CompanionDeviceInfo clearIsInteractiveState() {
            this.isInteractiveState_ = false;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        public CompanionDeviceInfo clearWifiConnected() {
            this.wifiConnected_ = false;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof CompanionDeviceInfo)) {
                    b = false;
                }
                else {
                    final CompanionDeviceInfo companionDeviceInfo = (CompanionDeviceInfo)o;
                    if (this.wifiConnected_ == companionDeviceInfo.wifiConnected_ && this.isInteractiveState_ == companionDeviceInfo.isInteractiveState_ && this.gpsEnabled_ == companionDeviceInfo.gpsEnabled_) {
                        if (this.unknownFieldData == null) {
                            if (companionDeviceInfo.unknownFieldData == null) {
                                return b;
                            }
                        }
                        else if (this.unknownFieldData.equals(companionDeviceInfo.unknownFieldData)) {
                            return b;
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public boolean getGpsEnabled() {
            return this.gpsEnabled_;
        }
        
        public boolean getIsInteractiveState() {
            return this.isInteractiveState_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeBoolSize(1, this.wifiConnected_);
            }
            int n2 = n;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n2 = n + CodedOutputByteBufferNano.computeBoolSize(2, this.isInteractiveState_);
            }
            int n3 = n2;
            if ((this.bitField0_ & 0x4) != 0x0) {
                n3 = n2 + CodedOutputByteBufferNano.computeBoolSize(3, this.gpsEnabled_);
            }
            return this.cachedSize = n3 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public boolean getWifiConnected() {
            return this.wifiConnected_;
        }
        
        public boolean hasGpsEnabled() {
            return (this.bitField0_ & 0x4) != 0x0;
        }
        
        public boolean hasIsInteractiveState() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        public boolean hasWifiConnected() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        @Override
        public int hashCode() {
            int n = 1;
            int n2;
            if (this.wifiConnected_) {
                n2 = 1;
            }
            else {
                n2 = 2;
            }
            int n3;
            if (this.isInteractiveState_) {
                n3 = 1;
            }
            else {
                n3 = 2;
            }
            if (!this.gpsEnabled_) {
                n = 2;
            }
            int hashCode;
            if (this.unknownFieldData == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.unknownFieldData.hashCode();
            }
            return (((n2 + 527) * 31 + n3) * 31 + n) * 31 + hashCode;
        }
        
        @Override
        public CompanionDeviceInfo mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0078:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0078;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0078;
                    }
                    case 8: {
                        this.wifiConnected_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 16: {
                        this.isInteractiveState_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x2;
                        continue;
                    }
                    case 24: {
                        this.gpsEnabled_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x4;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public CompanionDeviceInfo setGpsEnabled(final boolean gpsEnabled_) {
            this.gpsEnabled_ = gpsEnabled_;
            this.bitField0_ |= 0x4;
            return this;
        }
        
        public CompanionDeviceInfo setIsInteractiveState(final boolean isInteractiveState_) {
            this.isInteractiveState_ = isInteractiveState_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        public CompanionDeviceInfo setWifiConnected(final boolean wifiConnected_) {
            this.wifiConnected_ = wifiConnected_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeBool(1, this.wifiConnected_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeBool(2, this.isInteractiveState_);
            }
            if ((this.bitField0_ & 0x4) != 0x0) {
                codedOutputByteBufferNano.writeBool(3, this.gpsEnabled_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class CompanionFeatureInfo extends ExtendableMessageNano
    {
        public static final CompanionFeatureInfo[] EMPTY_ARRAY;
        private int bitField0_;
        private boolean isKeyboardTextEntrySupported_;
        private boolean isPhotoSyncEnabled_;
        
        static {
            EMPTY_ARRAY = new CompanionFeatureInfo[0];
        }
        
        public CompanionFeatureInfo() {
            this.isPhotoSyncEnabled_ = false;
            this.isKeyboardTextEntrySupported_ = false;
        }
        
        public static CompanionFeatureInfo parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new CompanionFeatureInfo().mergeFrom(codedInputByteBufferNano);
        }
        
        public static CompanionFeatureInfo parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new CompanionFeatureInfo(), array);
        }
        
        public CompanionFeatureInfo clearIsKeyboardTextEntrySupported() {
            this.isKeyboardTextEntrySupported_ = false;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        public CompanionFeatureInfo clearIsPhotoSyncEnabled() {
            this.isPhotoSyncEnabled_ = false;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof CompanionFeatureInfo)) {
                    b = false;
                }
                else {
                    final CompanionFeatureInfo companionFeatureInfo = (CompanionFeatureInfo)o;
                    if (this.isPhotoSyncEnabled_ == companionFeatureInfo.isPhotoSyncEnabled_ && this.isKeyboardTextEntrySupported_ == companionFeatureInfo.isKeyboardTextEntrySupported_) {
                        if (this.unknownFieldData == null) {
                            if (companionFeatureInfo.unknownFieldData == null) {
                                return b;
                            }
                        }
                        else if (this.unknownFieldData.equals(companionFeatureInfo.unknownFieldData)) {
                            return b;
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public boolean getIsKeyboardTextEntrySupported() {
            return this.isKeyboardTextEntrySupported_;
        }
        
        public boolean getIsPhotoSyncEnabled() {
            return this.isPhotoSyncEnabled_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeBoolSize(1, this.isPhotoSyncEnabled_);
            }
            int n2 = n;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n2 = n + CodedOutputByteBufferNano.computeBoolSize(2, this.isKeyboardTextEntrySupported_);
            }
            return this.cachedSize = n2 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public boolean hasIsKeyboardTextEntrySupported() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        public boolean hasIsPhotoSyncEnabled() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        @Override
        public int hashCode() {
            int n = 1;
            int n2;
            if (this.isPhotoSyncEnabled_) {
                n2 = 1;
            }
            else {
                n2 = 2;
            }
            if (!this.isKeyboardTextEntrySupported_) {
                n = 2;
            }
            int hashCode;
            if (this.unknownFieldData == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.unknownFieldData.hashCode();
            }
            return ((n2 + 527) * 31 + n) * 31 + hashCode;
        }
        
        @Override
        public CompanionFeatureInfo mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0070:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0070;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0070;
                    }
                    case 8: {
                        this.isPhotoSyncEnabled_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 16: {
                        this.isKeyboardTextEntrySupported_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x2;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public CompanionFeatureInfo setIsKeyboardTextEntrySupported(final boolean isKeyboardTextEntrySupported_) {
            this.isKeyboardTextEntrySupported_ = isKeyboardTextEntrySupported_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        public CompanionFeatureInfo setIsPhotoSyncEnabled(final boolean isPhotoSyncEnabled_) {
            this.isPhotoSyncEnabled_ = isPhotoSyncEnabled_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeBool(1, this.isPhotoSyncEnabled_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeBool(2, this.isKeyboardTextEntrySupported_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class CompanionInfo extends ExtendableMessageNano
    {
        public static final CompanionInfo[] EMPTY_ARRAY;
        private int bitField0_;
        public long id;
        private boolean requestLocaleInfo_;
        private boolean requestLog_;
        private boolean requestNetwork_;
        private int responseAndroidVersion_;
        private boolean responseIsNetworkOk_;
        private LocaleInfo responseLocaleInfo_;
        private String responseLog_;
        
        static {
            EMPTY_ARRAY = new CompanionInfo[0];
        }
        
        public CompanionInfo() {
            this.id = 0L;
            this.requestNetwork_ = false;
            this.responseIsNetworkOk_ = false;
            this.responseAndroidVersion_ = 0;
            this.requestLog_ = false;
            this.responseLog_ = "";
            this.requestLocaleInfo_ = false;
        }
        
        public static CompanionInfo parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new CompanionInfo().mergeFrom(codedInputByteBufferNano);
        }
        
        public static CompanionInfo parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new CompanionInfo(), array);
        }
        
        public CompanionInfo clearRequestLocaleInfo() {
            this.requestLocaleInfo_ = false;
            this.bitField0_ &= 0xFFFFFFDF;
            return this;
        }
        
        public CompanionInfo clearRequestLog() {
            this.requestLog_ = false;
            this.bitField0_ &= 0xFFFFFFF7;
            return this;
        }
        
        public CompanionInfo clearRequestNetwork() {
            this.requestNetwork_ = false;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        public CompanionInfo clearResponseAndroidVersion() {
            this.responseAndroidVersion_ = 0;
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }
        
        public CompanionInfo clearResponseIsNetworkOk() {
            this.responseIsNetworkOk_ = false;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        public CompanionInfo clearResponseLocaleInfo() {
            this.responseLocaleInfo_ = null;
            return this;
        }
        
        public CompanionInfo clearResponseLog() {
            this.responseLog_ = "";
            this.bitField0_ &= 0xFFFFFFEF;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof CompanionInfo)) {
                    b = false;
                }
                else {
                    final CompanionInfo companionInfo = (CompanionInfo)o;
                    Label_0135: {
                        if (this.id == companionInfo.id && this.requestNetwork_ == companionInfo.requestNetwork_ && this.responseIsNetworkOk_ == companionInfo.responseIsNetworkOk_ && this.responseAndroidVersion_ == companionInfo.responseAndroidVersion_ && this.requestLog_ == companionInfo.requestLog_) {
                            if (this.responseLog_ == null) {
                                if (companionInfo.responseLog_ != null) {
                                    break Label_0135;
                                }
                            }
                            else if (!this.responseLog_.equals(companionInfo.responseLog_)) {
                                break Label_0135;
                            }
                            if (this.requestLocaleInfo_ == companionInfo.requestLocaleInfo_) {
                                if (this.responseLocaleInfo_ == null) {
                                    if (companionInfo.responseLocaleInfo_ != null) {
                                        break Label_0135;
                                    }
                                }
                                else if (!this.responseLocaleInfo_.equals(companionInfo.responseLocaleInfo_)) {
                                    break Label_0135;
                                }
                                if (this.unknownFieldData == null) {
                                    if (companionInfo.unknownFieldData == null) {
                                        return b;
                                    }
                                }
                                else if (this.unknownFieldData.equals(companionInfo.unknownFieldData)) {
                                    return b;
                                }
                            }
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public boolean getRequestLocaleInfo() {
            return this.requestLocaleInfo_;
        }
        
        public boolean getRequestLog() {
            return this.requestLog_;
        }
        
        public boolean getRequestNetwork() {
            return this.requestNetwork_;
        }
        
        public int getResponseAndroidVersion() {
            return this.responseAndroidVersion_;
        }
        
        public boolean getResponseIsNetworkOk() {
            return this.responseIsNetworkOk_;
        }
        
        public LocaleInfo getResponseLocaleInfo() {
            return this.responseLocaleInfo_;
        }
        
        public String getResponseLog() {
            return this.responseLog_;
        }
        
        @Override
        public int getSerializedSize() {
            int n2;
            final int n = n2 = 0 + CodedOutputByteBufferNano.computeInt64Size(1, this.id);
            if ((this.bitField0_ & 0x1) != 0x0) {
                n2 = n + CodedOutputByteBufferNano.computeBoolSize(2, this.requestNetwork_);
            }
            int n3 = n2;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n3 = n2 + CodedOutputByteBufferNano.computeBoolSize(3, this.responseIsNetworkOk_);
            }
            int n4 = n3;
            if ((this.bitField0_ & 0x4) != 0x0) {
                n4 = n3 + CodedOutputByteBufferNano.computeInt32Size(4, this.responseAndroidVersion_);
            }
            int n5 = n4;
            if ((this.bitField0_ & 0x8) != 0x0) {
                n5 = n4 + CodedOutputByteBufferNano.computeBoolSize(5, this.requestLog_);
            }
            int n6 = n5;
            if ((this.bitField0_ & 0x10) != 0x0) {
                n6 = n5 + CodedOutputByteBufferNano.computeStringSize(6, this.responseLog_);
            }
            int n7 = n6;
            if ((this.bitField0_ & 0x20) != 0x0) {
                n7 = n6 + CodedOutputByteBufferNano.computeBoolSize(7, this.requestLocaleInfo_);
            }
            int n8 = n7;
            if (this.responseLocaleInfo_ != null) {
                n8 = n7 + CodedOutputByteBufferNano.computeMessageSize(8, this.responseLocaleInfo_);
            }
            return this.cachedSize = n8 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public boolean hasRequestLocaleInfo() {
            return (this.bitField0_ & 0x20) != 0x0;
        }
        
        public boolean hasRequestLog() {
            return (this.bitField0_ & 0x8) != 0x0;
        }
        
        public boolean hasRequestNetwork() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        public boolean hasResponseAndroidVersion() {
            return (this.bitField0_ & 0x4) != 0x0;
        }
        
        public boolean hasResponseIsNetworkOk() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        public boolean hasResponseLocaleInfo() {
            return this.responseLocaleInfo_ != null;
        }
        
        public boolean hasResponseLog() {
            return (this.bitField0_ & 0x10) != 0x0;
        }
        
        @Override
        public int hashCode() {
            int hashCode = 0;
            int n = 1;
            final int n2 = (int)(this.id ^ this.id >>> 32);
            int n3;
            if (this.requestNetwork_) {
                n3 = 1;
            }
            else {
                n3 = 2;
            }
            int n4;
            if (this.responseIsNetworkOk_) {
                n4 = 1;
            }
            else {
                n4 = 2;
            }
            final int responseAndroidVersion_ = this.responseAndroidVersion_;
            int n5;
            if (this.requestLog_) {
                n5 = 1;
            }
            else {
                n5 = 2;
            }
            int hashCode2;
            if (this.responseLog_ == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = this.responseLog_.hashCode();
            }
            if (!this.requestLocaleInfo_) {
                n = 2;
            }
            int hashCode3;
            if (this.responseLocaleInfo_ == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = this.responseLocaleInfo_.hashCode();
            }
            if (this.unknownFieldData != null) {
                hashCode = this.unknownFieldData.hashCode();
            }
            return ((((((((n2 + 527) * 31 + n3) * 31 + n4) * 31 + responseAndroidVersion_) * 31 + n5) * 31 + hashCode2) * 31 + n) * 31 + hashCode3) * 31 + hashCode;
        }
        
        @Override
        public CompanionInfo mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0118:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0118;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0118;
                    }
                    case 8: {
                        this.id = codedInputByteBufferNano.readInt64();
                        continue;
                    }
                    case 16: {
                        this.requestNetwork_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 24: {
                        this.responseIsNetworkOk_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x2;
                        continue;
                    }
                    case 32: {
                        this.responseAndroidVersion_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x4;
                        continue;
                    }
                    case 40: {
                        this.requestLog_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x8;
                        continue;
                    }
                    case 50: {
                        this.responseLog_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x10;
                        continue;
                    }
                    case 56: {
                        this.requestLocaleInfo_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x20;
                        continue;
                    }
                    case 66: {
                        if (this.responseLocaleInfo_ == null) {
                            this.responseLocaleInfo_ = new LocaleInfo();
                        }
                        codedInputByteBufferNano.readMessage(this.responseLocaleInfo_);
                        continue;
                    }
                }
            }
            return this;
        }
        
        public CompanionInfo setRequestLocaleInfo(final boolean requestLocaleInfo_) {
            this.requestLocaleInfo_ = requestLocaleInfo_;
            this.bitField0_ |= 0x20;
            return this;
        }
        
        public CompanionInfo setRequestLog(final boolean requestLog_) {
            this.requestLog_ = requestLog_;
            this.bitField0_ |= 0x8;
            return this;
        }
        
        public CompanionInfo setRequestNetwork(final boolean requestNetwork_) {
            this.requestNetwork_ = requestNetwork_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        public CompanionInfo setResponseAndroidVersion(final int responseAndroidVersion_) {
            this.responseAndroidVersion_ = responseAndroidVersion_;
            this.bitField0_ |= 0x4;
            return this;
        }
        
        public CompanionInfo setResponseIsNetworkOk(final boolean responseIsNetworkOk_) {
            this.responseIsNetworkOk_ = responseIsNetworkOk_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        public CompanionInfo setResponseLocaleInfo(final LocaleInfo responseLocaleInfo_) {
            if (responseLocaleInfo_ == null) {
                throw new NullPointerException();
            }
            this.responseLocaleInfo_ = responseLocaleInfo_;
            return this;
        }
        
        public CompanionInfo setResponseLog(final String responseLog_) {
            if (responseLog_ == null) {
                throw new NullPointerException();
            }
            this.responseLog_ = responseLog_;
            this.bitField0_ |= 0x10;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt64(1, this.id);
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeBool(2, this.requestNetwork_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeBool(3, this.responseIsNetworkOk_);
            }
            if ((this.bitField0_ & 0x4) != 0x0) {
                codedOutputByteBufferNano.writeInt32(4, this.responseAndroidVersion_);
            }
            if ((this.bitField0_ & 0x8) != 0x0) {
                codedOutputByteBufferNano.writeBool(5, this.requestLog_);
            }
            if ((this.bitField0_ & 0x10) != 0x0) {
                codedOutputByteBufferNano.writeString(6, this.responseLog_);
            }
            if ((this.bitField0_ & 0x20) != 0x0) {
                codedOutputByteBufferNano.writeBool(7, this.requestLocaleInfo_);
            }
            if (this.responseLocaleInfo_ != null) {
                codedOutputByteBufferNano.writeMessage(8, this.responseLocaleInfo_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class Envelope extends ExtendableMessageNano
    {
        public static final Envelope[] EMPTY_ARRAY;
        private AndroidDeviceInfo androidDeviceInfo_;
        private ApiRequest apiRequestC2G_;
        private ApiResponse apiResponseG2C_;
        private int bitField0_;
        private Command command_;
        private CompanionDeviceInfo companionDeviceInfoC2G_;
        private CompanionFeatureInfo companionFeatureInfoC2G_;
        private CompanionInfo companionInfo_;
        private Error error_;
        private GetWallpaperInfo getWallpaperInfoC2G_;
        private GlassFeatureInfo glassFeatureInfoG2C_;
        private GlassInfoRequest glassInfoRequestC2G_;
        private GlassInfoResponse glassInfoResponseG2C_;
        private GlassSetupRequest glassSetupRequestC2G_;
        private GlassSetupResponse glassSetupResponseG2C_;
        private InputBoxRequest inputBoxRequestG2C_;
        private InputBoxResponse inputBoxResponseC2G_;
        private LocationMessage locationMessageC2G_;
        private LocationRequest locationRequestG2C_;
        private String messageC2G_;
        private MotionEvent motionC2G_;
        private MultimediaMessage multimediaMessage_;
        private NavigationRequest navigationRequestC2G_;
        private OpenEndedInputRequest openEndedInputRequestG2C_;
        private OpenEndedInputResponse openEndedInputResponseC2G_;
        private Photo photoG2C_;
        private ScreenShot screenshot_;
        private int serialNumber_;
        private SetWallpaperRequest setWallpaperRequestC2G_;
        private SetWallpaperResponse setWallpaperResponseG2C_;
        private String setupWifiC2G_;
        private SetupWifiRequest setupWifiRequestG2C_;
        private long timeMillis_;
        public TimelineNano.TimelineItem[] timelineItem;
        public TimelineItemResponse[] timelineItemResponseC2G;
        private String timezoneC2G_;
        private UpdateCredentialRequest updateCredentialRequestG2C_;
        private long uptimeMillis_;
        private String urlG2C_;
        public int version;
        private Wallpaper wallpaperC2G_;
        private WallpaperInfo wallpaperInfoG2C_;
        
        static {
            EMPTY_ARRAY = new Envelope[0];
        }
        
        public Envelope() {
            this.version = 0;
            this.serialNumber_ = 0;
            this.timeMillis_ = 0L;
            this.uptimeMillis_ = 0L;
            this.timelineItem = TimelineNano.TimelineItem.EMPTY_ARRAY;
            this.timelineItemResponseC2G = TimelineItemResponse.EMPTY_ARRAY;
            this.messageC2G_ = "";
            this.timezoneC2G_ = "";
            this.urlG2C_ = "";
            this.setupWifiC2G_ = "";
        }
        
        public static Envelope parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new Envelope().mergeFrom(codedInputByteBufferNano);
        }
        
        public static Envelope parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new Envelope(), array);
        }
        
        public Envelope clearAndroidDeviceInfo() {
            this.androidDeviceInfo_ = null;
            return this;
        }
        
        public Envelope clearApiRequestC2G() {
            this.apiRequestC2G_ = null;
            return this;
        }
        
        public Envelope clearApiResponseG2C() {
            this.apiResponseG2C_ = null;
            return this;
        }
        
        public Envelope clearCommand() {
            this.command_ = null;
            return this;
        }
        
        public Envelope clearCompanionDeviceInfoC2G() {
            this.companionDeviceInfoC2G_ = null;
            return this;
        }
        
        public Envelope clearCompanionFeatureInfoC2G() {
            this.companionFeatureInfoC2G_ = null;
            return this;
        }
        
        public Envelope clearCompanionInfo() {
            this.companionInfo_ = null;
            return this;
        }
        
        public Envelope clearError() {
            this.error_ = null;
            return this;
        }
        
        public Envelope clearGetWallpaperInfoC2G() {
            this.getWallpaperInfoC2G_ = null;
            return this;
        }
        
        public Envelope clearGlassFeatureInfoG2C() {
            this.glassFeatureInfoG2C_ = null;
            return this;
        }
        
        public Envelope clearGlassInfoRequestC2G() {
            this.glassInfoRequestC2G_ = null;
            return this;
        }
        
        public Envelope clearGlassInfoResponseG2C() {
            this.glassInfoResponseG2C_ = null;
            return this;
        }
        
        public Envelope clearGlassSetupRequestC2G() {
            this.glassSetupRequestC2G_ = null;
            return this;
        }
        
        public Envelope clearGlassSetupResponseG2C() {
            this.glassSetupResponseG2C_ = null;
            return this;
        }
        
        public Envelope clearInputBoxRequestG2C() {
            this.inputBoxRequestG2C_ = null;
            return this;
        }
        
        public Envelope clearInputBoxResponseC2G() {
            this.inputBoxResponseC2G_ = null;
            return this;
        }
        
        public Envelope clearLocationMessageC2G() {
            this.locationMessageC2G_ = null;
            return this;
        }
        
        public Envelope clearLocationRequestG2C() {
            this.locationRequestG2C_ = null;
            return this;
        }
        
        public Envelope clearMessageC2G() {
            this.messageC2G_ = "";
            this.bitField0_ &= 0xFFFFFFF7;
            return this;
        }
        
        public Envelope clearMotionC2G() {
            this.motionC2G_ = null;
            return this;
        }
        
        public Envelope clearMultimediaMessage() {
            this.multimediaMessage_ = null;
            return this;
        }
        
        public Envelope clearNavigationRequestC2G() {
            this.navigationRequestC2G_ = null;
            return this;
        }
        
        public Envelope clearOpenEndedInputRequestG2C() {
            this.openEndedInputRequestG2C_ = null;
            return this;
        }
        
        public Envelope clearOpenEndedInputResponseC2G() {
            this.openEndedInputResponseC2G_ = null;
            return this;
        }
        
        public Envelope clearPhotoG2C() {
            this.photoG2C_ = null;
            return this;
        }
        
        public Envelope clearScreenshot() {
            this.screenshot_ = null;
            return this;
        }
        
        public Envelope clearSerialNumber() {
            this.serialNumber_ = 0;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        public Envelope clearSetWallpaperRequestC2G() {
            this.setWallpaperRequestC2G_ = null;
            return this;
        }
        
        public Envelope clearSetWallpaperResponseG2C() {
            this.setWallpaperResponseG2C_ = null;
            return this;
        }
        
        public Envelope clearSetupWifiC2G() {
            this.setupWifiC2G_ = "";
            this.bitField0_ &= 0xFFFFFFBF;
            return this;
        }
        
        public Envelope clearSetupWifiRequestG2C() {
            this.setupWifiRequestG2C_ = null;
            return this;
        }
        
        public Envelope clearTimeMillis() {
            this.timeMillis_ = 0L;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        public Envelope clearTimezoneC2G() {
            this.timezoneC2G_ = "";
            this.bitField0_ &= 0xFFFFFFEF;
            return this;
        }
        
        public Envelope clearUpdateCredentialRequestG2C() {
            this.updateCredentialRequestG2C_ = null;
            return this;
        }
        
        public Envelope clearUptimeMillis() {
            this.uptimeMillis_ = 0L;
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }
        
        public Envelope clearUrlG2C() {
            this.urlG2C_ = "";
            this.bitField0_ &= 0xFFFFFFDF;
            return this;
        }
        
        public Envelope clearWallpaperC2G() {
            this.wallpaperC2G_ = null;
            return this;
        }
        
        public Envelope clearWallpaperInfoG2C() {
            this.wallpaperInfoG2C_ = null;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof Envelope)) {
                    b = false;
                }
                else {
                    final Envelope envelope = (Envelope)o;
                    Label_0604: {
                        if (this.version == envelope.version && this.serialNumber_ == envelope.serialNumber_ && this.timeMillis_ == envelope.timeMillis_ && this.uptimeMillis_ == envelope.uptimeMillis_ && Arrays.equals(this.timelineItem, envelope.timelineItem) && Arrays.equals(this.timelineItemResponseC2G, envelope.timelineItemResponseC2G)) {
                            if (this.locationRequestG2C_ == null) {
                                if (envelope.locationRequestG2C_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.locationRequestG2C_.equals(envelope.locationRequestG2C_)) {
                                break Label_0604;
                            }
                            if (this.locationMessageC2G_ == null) {
                                if (envelope.locationMessageC2G_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.locationMessageC2G_.equals(envelope.locationMessageC2G_)) {
                                break Label_0604;
                            }
                            if (this.messageC2G_ == null) {
                                if (envelope.messageC2G_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.messageC2G_.equals(envelope.messageC2G_)) {
                                break Label_0604;
                            }
                            if (this.timezoneC2G_ == null) {
                                if (envelope.timezoneC2G_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.timezoneC2G_.equals(envelope.timezoneC2G_)) {
                                break Label_0604;
                            }
                            if (this.navigationRequestC2G_ == null) {
                                if (envelope.navigationRequestC2G_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.navigationRequestC2G_.equals(envelope.navigationRequestC2G_)) {
                                break Label_0604;
                            }
                            if (this.urlG2C_ == null) {
                                if (envelope.urlG2C_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.urlG2C_.equals(envelope.urlG2C_)) {
                                break Label_0604;
                            }
                            if (this.setupWifiC2G_ == null) {
                                if (envelope.setupWifiC2G_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.setupWifiC2G_.equals(envelope.setupWifiC2G_)) {
                                break Label_0604;
                            }
                            if (this.companionInfo_ == null) {
                                if (envelope.companionInfo_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.companionInfo_.equals(envelope.companionInfo_)) {
                                break Label_0604;
                            }
                            if (this.error_ == null) {
                                if (envelope.error_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.error_.equals(envelope.error_)) {
                                break Label_0604;
                            }
                            if (this.screenshot_ == null) {
                                if (envelope.screenshot_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.screenshot_.equals(envelope.screenshot_)) {
                                break Label_0604;
                            }
                            if (this.command_ == null) {
                                if (envelope.command_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.command_.equals(envelope.command_)) {
                                break Label_0604;
                            }
                            if (this.apiRequestC2G_ == null) {
                                if (envelope.apiRequestC2G_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.apiRequestC2G_.equals(envelope.apiRequestC2G_)) {
                                break Label_0604;
                            }
                            if (this.apiResponseG2C_ == null) {
                                if (envelope.apiResponseG2C_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.apiResponseG2C_.equals(envelope.apiResponseG2C_)) {
                                break Label_0604;
                            }
                            if (this.motionC2G_ == null) {
                                if (envelope.motionC2G_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.motionC2G_.equals(envelope.motionC2G_)) {
                                break Label_0604;
                            }
                            if (this.glassInfoRequestC2G_ == null) {
                                if (envelope.glassInfoRequestC2G_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.glassInfoRequestC2G_.equals(envelope.glassInfoRequestC2G_)) {
                                break Label_0604;
                            }
                            if (this.glassInfoResponseG2C_ == null) {
                                if (envelope.glassInfoResponseG2C_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.glassInfoResponseG2C_.equals(envelope.glassInfoResponseG2C_)) {
                                break Label_0604;
                            }
                            if (this.inputBoxRequestG2C_ == null) {
                                if (envelope.inputBoxRequestG2C_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.inputBoxRequestG2C_.equals(envelope.inputBoxRequestG2C_)) {
                                break Label_0604;
                            }
                            if (this.inputBoxResponseC2G_ == null) {
                                if (envelope.inputBoxResponseC2G_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.inputBoxResponseC2G_.equals(envelope.inputBoxResponseC2G_)) {
                                break Label_0604;
                            }
                            if (this.glassSetupRequestC2G_ == null) {
                                if (envelope.glassSetupRequestC2G_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.glassSetupRequestC2G_.equals(envelope.glassSetupRequestC2G_)) {
                                break Label_0604;
                            }
                            if (this.glassSetupResponseG2C_ == null) {
                                if (envelope.glassSetupResponseG2C_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.glassSetupResponseG2C_.equals(envelope.glassSetupResponseG2C_)) {
                                break Label_0604;
                            }
                            if (this.setupWifiRequestG2C_ == null) {
                                if (envelope.setupWifiRequestG2C_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.setupWifiRequestG2C_.equals(envelope.setupWifiRequestG2C_)) {
                                break Label_0604;
                            }
                            if (this.photoG2C_ == null) {
                                if (envelope.photoG2C_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.photoG2C_.equals(envelope.photoG2C_)) {
                                break Label_0604;
                            }
                            if (this.updateCredentialRequestG2C_ == null) {
                                if (envelope.updateCredentialRequestG2C_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.updateCredentialRequestG2C_.equals(envelope.updateCredentialRequestG2C_)) {
                                break Label_0604;
                            }
                            if (this.androidDeviceInfo_ == null) {
                                if (envelope.androidDeviceInfo_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.androidDeviceInfo_.equals(envelope.androidDeviceInfo_)) {
                                break Label_0604;
                            }
                            if (this.companionDeviceInfoC2G_ == null) {
                                if (envelope.companionDeviceInfoC2G_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.companionDeviceInfoC2G_.equals(envelope.companionDeviceInfoC2G_)) {
                                break Label_0604;
                            }
                            if (this.companionFeatureInfoC2G_ == null) {
                                if (envelope.companionFeatureInfoC2G_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.companionFeatureInfoC2G_.equals(envelope.companionFeatureInfoC2G_)) {
                                break Label_0604;
                            }
                            if (this.glassFeatureInfoG2C_ == null) {
                                if (envelope.glassFeatureInfoG2C_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.glassFeatureInfoG2C_.equals(envelope.glassFeatureInfoG2C_)) {
                                break Label_0604;
                            }
                            if (this.wallpaperC2G_ == null) {
                                if (envelope.wallpaperC2G_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.wallpaperC2G_.equals(envelope.wallpaperC2G_)) {
                                break Label_0604;
                            }
                            if (this.openEndedInputRequestG2C_ == null) {
                                if (envelope.openEndedInputRequestG2C_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.openEndedInputRequestG2C_.equals(envelope.openEndedInputRequestG2C_)) {
                                break Label_0604;
                            }
                            if (this.openEndedInputResponseC2G_ == null) {
                                if (envelope.openEndedInputResponseC2G_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.openEndedInputResponseC2G_.equals(envelope.openEndedInputResponseC2G_)) {
                                break Label_0604;
                            }
                            if (this.multimediaMessage_ == null) {
                                if (envelope.multimediaMessage_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.multimediaMessage_.equals(envelope.multimediaMessage_)) {
                                break Label_0604;
                            }
                            if (this.setWallpaperRequestC2G_ == null) {
                                if (envelope.setWallpaperRequestC2G_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.setWallpaperRequestC2G_.equals(envelope.setWallpaperRequestC2G_)) {
                                break Label_0604;
                            }
                            if (this.setWallpaperResponseG2C_ == null) {
                                if (envelope.setWallpaperResponseG2C_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.setWallpaperResponseG2C_.equals(envelope.setWallpaperResponseG2C_)) {
                                break Label_0604;
                            }
                            if (this.getWallpaperInfoC2G_ == null) {
                                if (envelope.getWallpaperInfoC2G_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.getWallpaperInfoC2G_.equals(envelope.getWallpaperInfoC2G_)) {
                                break Label_0604;
                            }
                            if (this.wallpaperInfoG2C_ == null) {
                                if (envelope.wallpaperInfoG2C_ != null) {
                                    break Label_0604;
                                }
                            }
                            else if (!this.wallpaperInfoG2C_.equals(envelope.wallpaperInfoG2C_)) {
                                break Label_0604;
                            }
                            if (this.unknownFieldData == null) {
                                if (envelope.unknownFieldData == null) {
                                    return b;
                                }
                            }
                            else if (this.unknownFieldData.equals(envelope.unknownFieldData)) {
                                return b;
                            }
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public AndroidDeviceInfo getAndroidDeviceInfo() {
            return this.androidDeviceInfo_;
        }
        
        public ApiRequest getApiRequestC2G() {
            return this.apiRequestC2G_;
        }
        
        public ApiResponse getApiResponseG2C() {
            return this.apiResponseG2C_;
        }
        
        public Command getCommand() {
            return this.command_;
        }
        
        public CompanionDeviceInfo getCompanionDeviceInfoC2G() {
            return this.companionDeviceInfoC2G_;
        }
        
        public CompanionFeatureInfo getCompanionFeatureInfoC2G() {
            return this.companionFeatureInfoC2G_;
        }
        
        public CompanionInfo getCompanionInfo() {
            return this.companionInfo_;
        }
        
        public Error getError() {
            return this.error_;
        }
        
        public GetWallpaperInfo getGetWallpaperInfoC2G() {
            return this.getWallpaperInfoC2G_;
        }
        
        public GlassFeatureInfo getGlassFeatureInfoG2C() {
            return this.glassFeatureInfoG2C_;
        }
        
        public GlassInfoRequest getGlassInfoRequestC2G() {
            return this.glassInfoRequestC2G_;
        }
        
        public GlassInfoResponse getGlassInfoResponseG2C() {
            return this.glassInfoResponseG2C_;
        }
        
        public GlassSetupRequest getGlassSetupRequestC2G() {
            return this.glassSetupRequestC2G_;
        }
        
        public GlassSetupResponse getGlassSetupResponseG2C() {
            return this.glassSetupResponseG2C_;
        }
        
        public InputBoxRequest getInputBoxRequestG2C() {
            return this.inputBoxRequestG2C_;
        }
        
        public InputBoxResponse getInputBoxResponseC2G() {
            return this.inputBoxResponseC2G_;
        }
        
        public LocationMessage getLocationMessageC2G() {
            return this.locationMessageC2G_;
        }
        
        public LocationRequest getLocationRequestG2C() {
            return this.locationRequestG2C_;
        }
        
        public String getMessageC2G() {
            return this.messageC2G_;
        }
        
        public MotionEvent getMotionC2G() {
            return this.motionC2G_;
        }
        
        public MultimediaMessage getMultimediaMessage() {
            return this.multimediaMessage_;
        }
        
        public NavigationRequest getNavigationRequestC2G() {
            return this.navigationRequestC2G_;
        }
        
        public OpenEndedInputRequest getOpenEndedInputRequestG2C() {
            return this.openEndedInputRequestG2C_;
        }
        
        public OpenEndedInputResponse getOpenEndedInputResponseC2G() {
            return this.openEndedInputResponseC2G_;
        }
        
        public Photo getPhotoG2C() {
            return this.photoG2C_;
        }
        
        public ScreenShot getScreenshot() {
            return this.screenshot_;
        }
        
        public int getSerialNumber() {
            return this.serialNumber_;
        }
        
        @Override
        public int getSerializedSize() {
            final int n = 0;
            int n3;
            final int n2 = n3 = 0 + CodedOutputByteBufferNano.computeUInt32Size(1, this.version);
            if ((this.bitField0_ & 0x1) != 0x0) {
                n3 = n2 + CodedOutputByteBufferNano.computeUInt32Size(2, this.serialNumber_);
            }
            int n4 = n3;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n4 = n3 + CodedOutputByteBufferNano.computeUInt64Size(3, this.timeMillis_);
            }
            int n5 = n4;
            if ((this.bitField0_ & 0x4) != 0x0) {
                n5 = n4 + CodedOutputByteBufferNano.computeUInt64Size(4, this.uptimeMillis_);
            }
            int n6 = n5;
            if (this.timelineItem != null) {
                final TimelineNano.TimelineItem[] timelineItem = this.timelineItem;
                final int length = timelineItem.length;
                int n7 = 0;
                while (true) {
                    n6 = n5;
                    if (n7 >= length) {
                        break;
                    }
                    final TimelineNano.TimelineItem timelineItem2 = timelineItem[n7];
                    int n8 = n5;
                    if (timelineItem2 != null) {
                        n8 = n5 + CodedOutputByteBufferNano.computeMessageSize(5, timelineItem2);
                    }
                    ++n7;
                    n5 = n8;
                }
            }
            int n9 = n6;
            if (this.locationRequestG2C_ != null) {
                n9 = n6 + CodedOutputByteBufferNano.computeMessageSize(6, this.locationRequestG2C_);
            }
            int n10 = n9;
            if (this.locationMessageC2G_ != null) {
                n10 = n9 + CodedOutputByteBufferNano.computeMessageSize(7, this.locationMessageC2G_);
            }
            int n11 = n10;
            if ((this.bitField0_ & 0x8) != 0x0) {
                n11 = n10 + CodedOutputByteBufferNano.computeStringSize(8, this.messageC2G_);
            }
            int n12 = n11;
            if ((this.bitField0_ & 0x10) != 0x0) {
                n12 = n11 + CodedOutputByteBufferNano.computeStringSize(9, this.timezoneC2G_);
            }
            int n13 = n12;
            if (this.navigationRequestC2G_ != null) {
                n13 = n12 + CodedOutputByteBufferNano.computeMessageSize(10, this.navigationRequestC2G_);
            }
            int n14 = n13;
            if ((this.bitField0_ & 0x20) != 0x0) {
                n14 = n13 + CodedOutputByteBufferNano.computeStringSize(11, this.urlG2C_);
            }
            int n15 = n14;
            if ((this.bitField0_ & 0x40) != 0x0) {
                n15 = n14 + CodedOutputByteBufferNano.computeStringSize(12, this.setupWifiC2G_);
            }
            int n16 = n15;
            if (this.companionInfo_ != null) {
                n16 = n15 + CodedOutputByteBufferNano.computeMessageSize(13, this.companionInfo_);
            }
            int n17 = n16;
            if (this.error_ != null) {
                n17 = n16 + CodedOutputByteBufferNano.computeMessageSize(14, this.error_);
            }
            int n18 = n17;
            if (this.screenshot_ != null) {
                n18 = n17 + CodedOutputByteBufferNano.computeMessageSize(15, this.screenshot_);
            }
            int n19 = n18;
            if (this.command_ != null) {
                n19 = n18 + CodedOutputByteBufferNano.computeMessageSize(16, this.command_);
            }
            int n20 = n19;
            if (this.timelineItemResponseC2G != null) {
                final TimelineItemResponse[] timelineItemResponseC2G = this.timelineItemResponseC2G;
                final int length2 = timelineItemResponseC2G.length;
                int n21 = n;
                while (true) {
                    n20 = n19;
                    if (n21 >= length2) {
                        break;
                    }
                    final TimelineItemResponse timelineItemResponse = timelineItemResponseC2G[n21];
                    int n22 = n19;
                    if (timelineItemResponse != null) {
                        n22 = n19 + CodedOutputByteBufferNano.computeMessageSize(17, timelineItemResponse);
                    }
                    ++n21;
                    n19 = n22;
                }
            }
            int n23 = n20;
            if (this.apiRequestC2G_ != null) {
                n23 = n20 + CodedOutputByteBufferNano.computeMessageSize(18, this.apiRequestC2G_);
            }
            int n24 = n23;
            if (this.apiResponseG2C_ != null) {
                n24 = n23 + CodedOutputByteBufferNano.computeMessageSize(19, this.apiResponseG2C_);
            }
            int n25 = n24;
            if (this.motionC2G_ != null) {
                n25 = n24 + CodedOutputByteBufferNano.computeMessageSize(20, this.motionC2G_);
            }
            int n26 = n25;
            if (this.glassInfoRequestC2G_ != null) {
                n26 = n25 + CodedOutputByteBufferNano.computeMessageSize(21, this.glassInfoRequestC2G_);
            }
            int n27 = n26;
            if (this.glassInfoResponseG2C_ != null) {
                n27 = n26 + CodedOutputByteBufferNano.computeMessageSize(22, this.glassInfoResponseG2C_);
            }
            int n28 = n27;
            if (this.inputBoxRequestG2C_ != null) {
                n28 = n27 + CodedOutputByteBufferNano.computeMessageSize(23, this.inputBoxRequestG2C_);
            }
            int n29 = n28;
            if (this.inputBoxResponseC2G_ != null) {
                n29 = n28 + CodedOutputByteBufferNano.computeMessageSize(24, this.inputBoxResponseC2G_);
            }
            int n30 = n29;
            if (this.glassSetupRequestC2G_ != null) {
                n30 = n29 + CodedOutputByteBufferNano.computeMessageSize(25, this.glassSetupRequestC2G_);
            }
            int n31 = n30;
            if (this.glassSetupResponseG2C_ != null) {
                n31 = n30 + CodedOutputByteBufferNano.computeMessageSize(26, this.glassSetupResponseG2C_);
            }
            int n32 = n31;
            if (this.setupWifiRequestG2C_ != null) {
                n32 = n31 + CodedOutputByteBufferNano.computeMessageSize(27, this.setupWifiRequestG2C_);
            }
            int n33 = n32;
            if (this.photoG2C_ != null) {
                n33 = n32 + CodedOutputByteBufferNano.computeMessageSize(28, this.photoG2C_);
            }
            int n34 = n33;
            if (this.updateCredentialRequestG2C_ != null) {
                n34 = n33 + CodedOutputByteBufferNano.computeMessageSize(29, this.updateCredentialRequestG2C_);
            }
            int n35 = n34;
            if (this.androidDeviceInfo_ != null) {
                n35 = n34 + CodedOutputByteBufferNano.computeMessageSize(30, this.androidDeviceInfo_);
            }
            int n36 = n35;
            if (this.companionDeviceInfoC2G_ != null) {
                n36 = n35 + CodedOutputByteBufferNano.computeMessageSize(31, this.companionDeviceInfoC2G_);
            }
            int n37 = n36;
            if (this.companionFeatureInfoC2G_ != null) {
                n37 = n36 + CodedOutputByteBufferNano.computeMessageSize(32, this.companionFeatureInfoC2G_);
            }
            int n38 = n37;
            if (this.glassFeatureInfoG2C_ != null) {
                n38 = n37 + CodedOutputByteBufferNano.computeMessageSize(33, this.glassFeatureInfoG2C_);
            }
            int n39 = n38;
            if (this.wallpaperC2G_ != null) {
                n39 = n38 + CodedOutputByteBufferNano.computeMessageSize(34, this.wallpaperC2G_);
            }
            int n40 = n39;
            if (this.openEndedInputRequestG2C_ != null) {
                n40 = n39 + CodedOutputByteBufferNano.computeMessageSize(35, this.openEndedInputRequestG2C_);
            }
            int n41 = n40;
            if (this.openEndedInputResponseC2G_ != null) {
                n41 = n40 + CodedOutputByteBufferNano.computeMessageSize(36, this.openEndedInputResponseC2G_);
            }
            int n42 = n41;
            if (this.multimediaMessage_ != null) {
                n42 = n41 + CodedOutputByteBufferNano.computeMessageSize(37, this.multimediaMessage_);
            }
            int n43 = n42;
            if (this.setWallpaperRequestC2G_ != null) {
                n43 = n42 + CodedOutputByteBufferNano.computeMessageSize(38, this.setWallpaperRequestC2G_);
            }
            int n44 = n43;
            if (this.setWallpaperResponseG2C_ != null) {
                n44 = n43 + CodedOutputByteBufferNano.computeMessageSize(39, this.setWallpaperResponseG2C_);
            }
            int n45 = n44;
            if (this.getWallpaperInfoC2G_ != null) {
                n45 = n44 + CodedOutputByteBufferNano.computeMessageSize(40, this.getWallpaperInfoC2G_);
            }
            int n46 = n45;
            if (this.wallpaperInfoG2C_ != null) {
                n46 = n45 + CodedOutputByteBufferNano.computeMessageSize(41, this.wallpaperInfoG2C_);
            }
            return this.cachedSize = n46 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public SetWallpaperRequest getSetWallpaperRequestC2G() {
            return this.setWallpaperRequestC2G_;
        }
        
        public SetWallpaperResponse getSetWallpaperResponseG2C() {
            return this.setWallpaperResponseG2C_;
        }
        
        public String getSetupWifiC2G() {
            return this.setupWifiC2G_;
        }
        
        public SetupWifiRequest getSetupWifiRequestG2C() {
            return this.setupWifiRequestG2C_;
        }
        
        public long getTimeMillis() {
            return this.timeMillis_;
        }
        
        public String getTimezoneC2G() {
            return this.timezoneC2G_;
        }
        
        public UpdateCredentialRequest getUpdateCredentialRequestG2C() {
            return this.updateCredentialRequestG2C_;
        }
        
        public long getUptimeMillis() {
            return this.uptimeMillis_;
        }
        
        public String getUrlG2C() {
            return this.urlG2C_;
        }
        
        public Wallpaper getWallpaperC2G() {
            return this.wallpaperC2G_;
        }
        
        public WallpaperInfo getWallpaperInfoG2C() {
            return this.wallpaperInfoG2C_;
        }
        
        public boolean hasAndroidDeviceInfo() {
            return this.androidDeviceInfo_ != null;
        }
        
        public boolean hasApiRequestC2G() {
            return this.apiRequestC2G_ != null;
        }
        
        public boolean hasApiResponseG2C() {
            return this.apiResponseG2C_ != null;
        }
        
        public boolean hasCommand() {
            return this.command_ != null;
        }
        
        public boolean hasCompanionDeviceInfoC2G() {
            return this.companionDeviceInfoC2G_ != null;
        }
        
        public boolean hasCompanionFeatureInfoC2G() {
            return this.companionFeatureInfoC2G_ != null;
        }
        
        public boolean hasCompanionInfo() {
            return this.companionInfo_ != null;
        }
        
        public boolean hasError() {
            return this.error_ != null;
        }
        
        public boolean hasGetWallpaperInfoC2G() {
            return this.getWallpaperInfoC2G_ != null;
        }
        
        public boolean hasGlassFeatureInfoG2C() {
            return this.glassFeatureInfoG2C_ != null;
        }
        
        public boolean hasGlassInfoRequestC2G() {
            return this.glassInfoRequestC2G_ != null;
        }
        
        public boolean hasGlassInfoResponseG2C() {
            return this.glassInfoResponseG2C_ != null;
        }
        
        public boolean hasGlassSetupRequestC2G() {
            return this.glassSetupRequestC2G_ != null;
        }
        
        public boolean hasGlassSetupResponseG2C() {
            return this.glassSetupResponseG2C_ != null;
        }
        
        public boolean hasInputBoxRequestG2C() {
            return this.inputBoxRequestG2C_ != null;
        }
        
        public boolean hasInputBoxResponseC2G() {
            return this.inputBoxResponseC2G_ != null;
        }
        
        public boolean hasLocationMessageC2G() {
            return this.locationMessageC2G_ != null;
        }
        
        public boolean hasLocationRequestG2C() {
            return this.locationRequestG2C_ != null;
        }
        
        public boolean hasMessageC2G() {
            return (this.bitField0_ & 0x8) != 0x0;
        }
        
        public boolean hasMotionC2G() {
            return this.motionC2G_ != null;
        }
        
        public boolean hasMultimediaMessage() {
            return this.multimediaMessage_ != null;
        }
        
        public boolean hasNavigationRequestC2G() {
            return this.navigationRequestC2G_ != null;
        }
        
        public boolean hasOpenEndedInputRequestG2C() {
            return this.openEndedInputRequestG2C_ != null;
        }
        
        public boolean hasOpenEndedInputResponseC2G() {
            return this.openEndedInputResponseC2G_ != null;
        }
        
        public boolean hasPhotoG2C() {
            return this.photoG2C_ != null;
        }
        
        public boolean hasScreenshot() {
            return this.screenshot_ != null;
        }
        
        public boolean hasSerialNumber() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        public boolean hasSetWallpaperRequestC2G() {
            return this.setWallpaperRequestC2G_ != null;
        }
        
        public boolean hasSetWallpaperResponseG2C() {
            return this.setWallpaperResponseG2C_ != null;
        }
        
        public boolean hasSetupWifiC2G() {
            return (this.bitField0_ & 0x40) != 0x0;
        }
        
        public boolean hasSetupWifiRequestG2C() {
            return this.setupWifiRequestG2C_ != null;
        }
        
        public boolean hasTimeMillis() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        public boolean hasTimezoneC2G() {
            return (this.bitField0_ & 0x10) != 0x0;
        }
        
        public boolean hasUpdateCredentialRequestG2C() {
            return this.updateCredentialRequestG2C_ != null;
        }
        
        public boolean hasUptimeMillis() {
            return (this.bitField0_ & 0x4) != 0x0;
        }
        
        public boolean hasUrlG2C() {
            return (this.bitField0_ & 0x20) != 0x0;
        }
        
        public boolean hasWallpaperC2G() {
            return this.wallpaperC2G_ != null;
        }
        
        public boolean hasWallpaperInfoG2C() {
            return this.wallpaperInfoG2C_ != null;
        }
        
        @Override
        public int hashCode() {
            int hashCode = 0;
            int n = (((this.version + 527) * 31 + this.serialNumber_) * 31 + (int)(this.timeMillis_ ^ this.timeMillis_ >>> 32)) * 31 + (int)(this.uptimeMillis_ ^ this.uptimeMillis_ >>> 32);
            int n2;
            if (this.timelineItem == null) {
                n2 = n * 31;
            }
            else {
                int n3 = 0;
                while (true) {
                    n2 = n;
                    if (n3 >= this.timelineItem.length) {
                        break;
                    }
                    int hashCode2;
                    if (this.timelineItem[n3] == null) {
                        hashCode2 = 0;
                    }
                    else {
                        hashCode2 = this.timelineItem[n3].hashCode();
                    }
                    n = n * 31 + hashCode2;
                    ++n3;
                }
            }
            int n4;
            if (this.timelineItemResponseC2G == null) {
                n4 = n2 * 31;
            }
            else {
                int n5 = 0;
                int n6 = n2;
                while (true) {
                    n4 = n6;
                    if (n5 >= this.timelineItemResponseC2G.length) {
                        break;
                    }
                    int hashCode3;
                    if (this.timelineItemResponseC2G[n5] == null) {
                        hashCode3 = 0;
                    }
                    else {
                        hashCode3 = this.timelineItemResponseC2G[n5].hashCode();
                    }
                    n6 = n6 * 31 + hashCode3;
                    ++n5;
                }
            }
            int hashCode4;
            if (this.locationRequestG2C_ == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = this.locationRequestG2C_.hashCode();
            }
            int hashCode5;
            if (this.locationMessageC2G_ == null) {
                hashCode5 = 0;
            }
            else {
                hashCode5 = this.locationMessageC2G_.hashCode();
            }
            int hashCode6;
            if (this.messageC2G_ == null) {
                hashCode6 = 0;
            }
            else {
                hashCode6 = this.messageC2G_.hashCode();
            }
            int hashCode7;
            if (this.timezoneC2G_ == null) {
                hashCode7 = 0;
            }
            else {
                hashCode7 = this.timezoneC2G_.hashCode();
            }
            int hashCode8;
            if (this.navigationRequestC2G_ == null) {
                hashCode8 = 0;
            }
            else {
                hashCode8 = this.navigationRequestC2G_.hashCode();
            }
            int hashCode9;
            if (this.urlG2C_ == null) {
                hashCode9 = 0;
            }
            else {
                hashCode9 = this.urlG2C_.hashCode();
            }
            int hashCode10;
            if (this.setupWifiC2G_ == null) {
                hashCode10 = 0;
            }
            else {
                hashCode10 = this.setupWifiC2G_.hashCode();
            }
            int hashCode11;
            if (this.companionInfo_ == null) {
                hashCode11 = 0;
            }
            else {
                hashCode11 = this.companionInfo_.hashCode();
            }
            int hashCode12;
            if (this.error_ == null) {
                hashCode12 = 0;
            }
            else {
                hashCode12 = this.error_.hashCode();
            }
            int hashCode13;
            if (this.screenshot_ == null) {
                hashCode13 = 0;
            }
            else {
                hashCode13 = this.screenshot_.hashCode();
            }
            int hashCode14;
            if (this.command_ == null) {
                hashCode14 = 0;
            }
            else {
                hashCode14 = this.command_.hashCode();
            }
            int hashCode15;
            if (this.apiRequestC2G_ == null) {
                hashCode15 = 0;
            }
            else {
                hashCode15 = this.apiRequestC2G_.hashCode();
            }
            int hashCode16;
            if (this.apiResponseG2C_ == null) {
                hashCode16 = 0;
            }
            else {
                hashCode16 = this.apiResponseG2C_.hashCode();
            }
            int hashCode17;
            if (this.motionC2G_ == null) {
                hashCode17 = 0;
            }
            else {
                hashCode17 = this.motionC2G_.hashCode();
            }
            int hashCode18;
            if (this.glassInfoRequestC2G_ == null) {
                hashCode18 = 0;
            }
            else {
                hashCode18 = this.glassInfoRequestC2G_.hashCode();
            }
            int hashCode19;
            if (this.glassInfoResponseG2C_ == null) {
                hashCode19 = 0;
            }
            else {
                hashCode19 = this.glassInfoResponseG2C_.hashCode();
            }
            int hashCode20;
            if (this.inputBoxRequestG2C_ == null) {
                hashCode20 = 0;
            }
            else {
                hashCode20 = this.inputBoxRequestG2C_.hashCode();
            }
            int hashCode21;
            if (this.inputBoxResponseC2G_ == null) {
                hashCode21 = 0;
            }
            else {
                hashCode21 = this.inputBoxResponseC2G_.hashCode();
            }
            int hashCode22;
            if (this.glassSetupRequestC2G_ == null) {
                hashCode22 = 0;
            }
            else {
                hashCode22 = this.glassSetupRequestC2G_.hashCode();
            }
            int hashCode23;
            if (this.glassSetupResponseG2C_ == null) {
                hashCode23 = 0;
            }
            else {
                hashCode23 = this.glassSetupResponseG2C_.hashCode();
            }
            int hashCode24;
            if (this.setupWifiRequestG2C_ == null) {
                hashCode24 = 0;
            }
            else {
                hashCode24 = this.setupWifiRequestG2C_.hashCode();
            }
            int hashCode25;
            if (this.photoG2C_ == null) {
                hashCode25 = 0;
            }
            else {
                hashCode25 = this.photoG2C_.hashCode();
            }
            int hashCode26;
            if (this.updateCredentialRequestG2C_ == null) {
                hashCode26 = 0;
            }
            else {
                hashCode26 = this.updateCredentialRequestG2C_.hashCode();
            }
            int hashCode27;
            if (this.androidDeviceInfo_ == null) {
                hashCode27 = 0;
            }
            else {
                hashCode27 = this.androidDeviceInfo_.hashCode();
            }
            int hashCode28;
            if (this.companionDeviceInfoC2G_ == null) {
                hashCode28 = 0;
            }
            else {
                hashCode28 = this.companionDeviceInfoC2G_.hashCode();
            }
            int hashCode29;
            if (this.companionFeatureInfoC2G_ == null) {
                hashCode29 = 0;
            }
            else {
                hashCode29 = this.companionFeatureInfoC2G_.hashCode();
            }
            int hashCode30;
            if (this.glassFeatureInfoG2C_ == null) {
                hashCode30 = 0;
            }
            else {
                hashCode30 = this.glassFeatureInfoG2C_.hashCode();
            }
            int hashCode31;
            if (this.wallpaperC2G_ == null) {
                hashCode31 = 0;
            }
            else {
                hashCode31 = this.wallpaperC2G_.hashCode();
            }
            int hashCode32;
            if (this.openEndedInputRequestG2C_ == null) {
                hashCode32 = 0;
            }
            else {
                hashCode32 = this.openEndedInputRequestG2C_.hashCode();
            }
            int hashCode33;
            if (this.openEndedInputResponseC2G_ == null) {
                hashCode33 = 0;
            }
            else {
                hashCode33 = this.openEndedInputResponseC2G_.hashCode();
            }
            int hashCode34;
            if (this.multimediaMessage_ == null) {
                hashCode34 = 0;
            }
            else {
                hashCode34 = this.multimediaMessage_.hashCode();
            }
            int hashCode35;
            if (this.setWallpaperRequestC2G_ == null) {
                hashCode35 = 0;
            }
            else {
                hashCode35 = this.setWallpaperRequestC2G_.hashCode();
            }
            int hashCode36;
            if (this.setWallpaperResponseG2C_ == null) {
                hashCode36 = 0;
            }
            else {
                hashCode36 = this.setWallpaperResponseG2C_.hashCode();
            }
            int hashCode37;
            if (this.getWallpaperInfoC2G_ == null) {
                hashCode37 = 0;
            }
            else {
                hashCode37 = this.getWallpaperInfoC2G_.hashCode();
            }
            int hashCode38;
            if (this.wallpaperInfoG2C_ == null) {
                hashCode38 = 0;
            }
            else {
                hashCode38 = this.wallpaperInfoG2C_.hashCode();
            }
            if (this.unknownFieldData != null) {
                hashCode = this.unknownFieldData.hashCode();
            }
            return (((((((((((((((((((((((((((((((((((n4 * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode17) * 31 + hashCode18) * 31 + hashCode19) * 31 + hashCode20) * 31 + hashCode21) * 31 + hashCode22) * 31 + hashCode23) * 31 + hashCode24) * 31 + hashCode25) * 31 + hashCode26) * 31 + hashCode27) * 31 + hashCode28) * 31 + hashCode29) * 31 + hashCode30) * 31 + hashCode31) * 31 + hashCode32) * 31 + hashCode33) * 31 + hashCode34) * 31 + hashCode35) * 31 + hashCode36) * 31 + hashCode37) * 31 + hashCode38) * 31 + hashCode;
        }
        
        @Override
        public Envelope mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0382:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0382;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0382;
                    }
                    case 8: {
                        this.version = codedInputByteBufferNano.readUInt32();
                        continue;
                    }
                    case 16: {
                        this.serialNumber_ = codedInputByteBufferNano.readUInt32();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 24: {
                        this.timeMillis_ = codedInputByteBufferNano.readUInt64();
                        this.bitField0_ |= 0x2;
                        continue;
                    }
                    case 32: {
                        this.uptimeMillis_ = codedInputByteBufferNano.readUInt64();
                        this.bitField0_ |= 0x4;
                        continue;
                    }
                    case 42: {
                        final int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                        int i;
                        if (this.timelineItem == null) {
                            i = 0;
                        }
                        else {
                            i = this.timelineItem.length;
                        }
                        final TimelineNano.TimelineItem[] timelineItem = new TimelineNano.TimelineItem[i + repeatedFieldArrayLength];
                        if (this.timelineItem != null) {
                            System.arraycopy(this.timelineItem, 0, timelineItem, 0, i);
                        }
                        this.timelineItem = timelineItem;
                        while (i < this.timelineItem.length - 1) {
                            codedInputByteBufferNano.readMessage(this.timelineItem[i] = new TimelineNano.TimelineItem());
                            codedInputByteBufferNano.readTag();
                            ++i;
                        }
                        codedInputByteBufferNano.readMessage(this.timelineItem[i] = new TimelineNano.TimelineItem());
                        continue;
                    }
                    case 50: {
                        if (this.locationRequestG2C_ == null) {
                            this.locationRequestG2C_ = new LocationRequest();
                        }
                        codedInputByteBufferNano.readMessage(this.locationRequestG2C_);
                        continue;
                    }
                    case 58: {
                        if (this.locationMessageC2G_ == null) {
                            this.locationMessageC2G_ = new LocationMessage();
                        }
                        codedInputByteBufferNano.readMessage(this.locationMessageC2G_);
                        continue;
                    }
                    case 66: {
                        this.messageC2G_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x8;
                        continue;
                    }
                    case 74: {
                        this.timezoneC2G_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x10;
                        continue;
                    }
                    case 82: {
                        if (this.navigationRequestC2G_ == null) {
                            this.navigationRequestC2G_ = new NavigationRequest();
                        }
                        codedInputByteBufferNano.readMessage(this.navigationRequestC2G_);
                        continue;
                    }
                    case 90: {
                        this.urlG2C_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x20;
                        continue;
                    }
                    case 98: {
                        this.setupWifiC2G_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x40;
                        continue;
                    }
                    case 106: {
                        if (this.companionInfo_ == null) {
                            this.companionInfo_ = new CompanionInfo();
                        }
                        codedInputByteBufferNano.readMessage(this.companionInfo_);
                        continue;
                    }
                    case 114: {
                        if (this.error_ == null) {
                            this.error_ = new Error();
                        }
                        codedInputByteBufferNano.readMessage(this.error_);
                        continue;
                    }
                    case 122: {
                        if (this.screenshot_ == null) {
                            this.screenshot_ = new ScreenShot();
                        }
                        codedInputByteBufferNano.readMessage(this.screenshot_);
                        continue;
                    }
                    case 130: {
                        if (this.command_ == null) {
                            this.command_ = new Command();
                        }
                        codedInputByteBufferNano.readMessage(this.command_);
                        continue;
                    }
                    case 138: {
                        final int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 138);
                        int j;
                        if (this.timelineItemResponseC2G == null) {
                            j = 0;
                        }
                        else {
                            j = this.timelineItemResponseC2G.length;
                        }
                        final TimelineItemResponse[] timelineItemResponseC2G = new TimelineItemResponse[j + repeatedFieldArrayLength2];
                        if (this.timelineItemResponseC2G != null) {
                            System.arraycopy(this.timelineItemResponseC2G, 0, timelineItemResponseC2G, 0, j);
                        }
                        this.timelineItemResponseC2G = timelineItemResponseC2G;
                        while (j < this.timelineItemResponseC2G.length - 1) {
                            codedInputByteBufferNano.readMessage(this.timelineItemResponseC2G[j] = new TimelineItemResponse());
                            codedInputByteBufferNano.readTag();
                            ++j;
                        }
                        codedInputByteBufferNano.readMessage(this.timelineItemResponseC2G[j] = new TimelineItemResponse());
                        continue;
                    }
                    case 146: {
                        if (this.apiRequestC2G_ == null) {
                            this.apiRequestC2G_ = new ApiRequest();
                        }
                        codedInputByteBufferNano.readMessage(this.apiRequestC2G_);
                        continue;
                    }
                    case 154: {
                        if (this.apiResponseG2C_ == null) {
                            this.apiResponseG2C_ = new ApiResponse();
                        }
                        codedInputByteBufferNano.readMessage(this.apiResponseG2C_);
                        continue;
                    }
                    case 162: {
                        if (this.motionC2G_ == null) {
                            this.motionC2G_ = new MotionEvent();
                        }
                        codedInputByteBufferNano.readMessage(this.motionC2G_);
                        continue;
                    }
                    case 170: {
                        if (this.glassInfoRequestC2G_ == null) {
                            this.glassInfoRequestC2G_ = new GlassInfoRequest();
                        }
                        codedInputByteBufferNano.readMessage(this.glassInfoRequestC2G_);
                        continue;
                    }
                    case 178: {
                        if (this.glassInfoResponseG2C_ == null) {
                            this.glassInfoResponseG2C_ = new GlassInfoResponse();
                        }
                        codedInputByteBufferNano.readMessage(this.glassInfoResponseG2C_);
                        continue;
                    }
                    case 186: {
                        if (this.inputBoxRequestG2C_ == null) {
                            this.inputBoxRequestG2C_ = new InputBoxRequest();
                        }
                        codedInputByteBufferNano.readMessage(this.inputBoxRequestG2C_);
                        continue;
                    }
                    case 194: {
                        if (this.inputBoxResponseC2G_ == null) {
                            this.inputBoxResponseC2G_ = new InputBoxResponse();
                        }
                        codedInputByteBufferNano.readMessage(this.inputBoxResponseC2G_);
                        continue;
                    }
                    case 202: {
                        if (this.glassSetupRequestC2G_ == null) {
                            this.glassSetupRequestC2G_ = new GlassSetupRequest();
                        }
                        codedInputByteBufferNano.readMessage(this.glassSetupRequestC2G_);
                        continue;
                    }
                    case 210: {
                        if (this.glassSetupResponseG2C_ == null) {
                            this.glassSetupResponseG2C_ = new GlassSetupResponse();
                        }
                        codedInputByteBufferNano.readMessage(this.glassSetupResponseG2C_);
                        continue;
                    }
                    case 218: {
                        if (this.setupWifiRequestG2C_ == null) {
                            this.setupWifiRequestG2C_ = new SetupWifiRequest();
                        }
                        codedInputByteBufferNano.readMessage(this.setupWifiRequestG2C_);
                        continue;
                    }
                    case 226: {
                        if (this.photoG2C_ == null) {
                            this.photoG2C_ = new Photo();
                        }
                        codedInputByteBufferNano.readMessage(this.photoG2C_);
                        continue;
                    }
                    case 234: {
                        if (this.updateCredentialRequestG2C_ == null) {
                            this.updateCredentialRequestG2C_ = new UpdateCredentialRequest();
                        }
                        codedInputByteBufferNano.readMessage(this.updateCredentialRequestG2C_);
                        continue;
                    }
                    case 242: {
                        if (this.androidDeviceInfo_ == null) {
                            this.androidDeviceInfo_ = new AndroidDeviceInfo();
                        }
                        codedInputByteBufferNano.readMessage(this.androidDeviceInfo_);
                        continue;
                    }
                    case 250: {
                        if (this.companionDeviceInfoC2G_ == null) {
                            this.companionDeviceInfoC2G_ = new CompanionDeviceInfo();
                        }
                        codedInputByteBufferNano.readMessage(this.companionDeviceInfoC2G_);
                        continue;
                    }
                    case 258: {
                        if (this.companionFeatureInfoC2G_ == null) {
                            this.companionFeatureInfoC2G_ = new CompanionFeatureInfo();
                        }
                        codedInputByteBufferNano.readMessage(this.companionFeatureInfoC2G_);
                        continue;
                    }
                    case 266: {
                        if (this.glassFeatureInfoG2C_ == null) {
                            this.glassFeatureInfoG2C_ = new GlassFeatureInfo();
                        }
                        codedInputByteBufferNano.readMessage(this.glassFeatureInfoG2C_);
                        continue;
                    }
                    case 274: {
                        if (this.wallpaperC2G_ == null) {
                            this.wallpaperC2G_ = new Wallpaper();
                        }
                        codedInputByteBufferNano.readMessage(this.wallpaperC2G_);
                        continue;
                    }
                    case 282: {
                        if (this.openEndedInputRequestG2C_ == null) {
                            this.openEndedInputRequestG2C_ = new OpenEndedInputRequest();
                        }
                        codedInputByteBufferNano.readMessage(this.openEndedInputRequestG2C_);
                        continue;
                    }
                    case 290: {
                        if (this.openEndedInputResponseC2G_ == null) {
                            this.openEndedInputResponseC2G_ = new OpenEndedInputResponse();
                        }
                        codedInputByteBufferNano.readMessage(this.openEndedInputResponseC2G_);
                        continue;
                    }
                    case 298: {
                        if (this.multimediaMessage_ == null) {
                            this.multimediaMessage_ = new MultimediaMessage();
                        }
                        codedInputByteBufferNano.readMessage(this.multimediaMessage_);
                        continue;
                    }
                    case 306: {
                        if (this.setWallpaperRequestC2G_ == null) {
                            this.setWallpaperRequestC2G_ = new SetWallpaperRequest();
                        }
                        codedInputByteBufferNano.readMessage(this.setWallpaperRequestC2G_);
                        continue;
                    }
                    case 314: {
                        if (this.setWallpaperResponseG2C_ == null) {
                            this.setWallpaperResponseG2C_ = new SetWallpaperResponse();
                        }
                        codedInputByteBufferNano.readMessage(this.setWallpaperResponseG2C_);
                        continue;
                    }
                    case 322: {
                        if (this.getWallpaperInfoC2G_ == null) {
                            this.getWallpaperInfoC2G_ = new GetWallpaperInfo();
                        }
                        codedInputByteBufferNano.readMessage(this.getWallpaperInfoC2G_);
                        continue;
                    }
                    case 330: {
                        if (this.wallpaperInfoG2C_ == null) {
                            this.wallpaperInfoG2C_ = new WallpaperInfo();
                        }
                        codedInputByteBufferNano.readMessage(this.wallpaperInfoG2C_);
                        continue;
                    }
                }
            }
            return this;
        }
        
        public Envelope setAndroidDeviceInfo(final AndroidDeviceInfo androidDeviceInfo_) {
            if (androidDeviceInfo_ == null) {
                throw new NullPointerException();
            }
            this.androidDeviceInfo_ = androidDeviceInfo_;
            return this;
        }
        
        public Envelope setApiRequestC2G(final ApiRequest apiRequestC2G_) {
            if (apiRequestC2G_ == null) {
                throw new NullPointerException();
            }
            this.apiRequestC2G_ = apiRequestC2G_;
            return this;
        }
        
        public Envelope setApiResponseG2C(final ApiResponse apiResponseG2C_) {
            if (apiResponseG2C_ == null) {
                throw new NullPointerException();
            }
            this.apiResponseG2C_ = apiResponseG2C_;
            return this;
        }
        
        public Envelope setCommand(final Command command_) {
            if (command_ == null) {
                throw new NullPointerException();
            }
            this.command_ = command_;
            return this;
        }
        
        public Envelope setCompanionDeviceInfoC2G(final CompanionDeviceInfo companionDeviceInfoC2G_) {
            if (companionDeviceInfoC2G_ == null) {
                throw new NullPointerException();
            }
            this.companionDeviceInfoC2G_ = companionDeviceInfoC2G_;
            return this;
        }
        
        public Envelope setCompanionFeatureInfoC2G(final CompanionFeatureInfo companionFeatureInfoC2G_) {
            if (companionFeatureInfoC2G_ == null) {
                throw new NullPointerException();
            }
            this.companionFeatureInfoC2G_ = companionFeatureInfoC2G_;
            return this;
        }
        
        public Envelope setCompanionInfo(final CompanionInfo companionInfo_) {
            if (companionInfo_ == null) {
                throw new NullPointerException();
            }
            this.companionInfo_ = companionInfo_;
            return this;
        }
        
        public Envelope setError(final Error error_) {
            if (error_ == null) {
                throw new NullPointerException();
            }
            this.error_ = error_;
            return this;
        }
        
        public Envelope setGetWallpaperInfoC2G(final GetWallpaperInfo getWallpaperInfoC2G_) {
            if (getWallpaperInfoC2G_ == null) {
                throw new NullPointerException();
            }
            this.getWallpaperInfoC2G_ = getWallpaperInfoC2G_;
            return this;
        }
        
        public Envelope setGlassFeatureInfoG2C(final GlassFeatureInfo glassFeatureInfoG2C_) {
            if (glassFeatureInfoG2C_ == null) {
                throw new NullPointerException();
            }
            this.glassFeatureInfoG2C_ = glassFeatureInfoG2C_;
            return this;
        }
        
        public Envelope setGlassInfoRequestC2G(final GlassInfoRequest glassInfoRequestC2G_) {
            if (glassInfoRequestC2G_ == null) {
                throw new NullPointerException();
            }
            this.glassInfoRequestC2G_ = glassInfoRequestC2G_;
            return this;
        }
        
        public Envelope setGlassInfoResponseG2C(final GlassInfoResponse glassInfoResponseG2C_) {
            if (glassInfoResponseG2C_ == null) {
                throw new NullPointerException();
            }
            this.glassInfoResponseG2C_ = glassInfoResponseG2C_;
            return this;
        }
        
        public Envelope setGlassSetupRequestC2G(final GlassSetupRequest glassSetupRequestC2G_) {
            if (glassSetupRequestC2G_ == null) {
                throw new NullPointerException();
            }
            this.glassSetupRequestC2G_ = glassSetupRequestC2G_;
            return this;
        }
        
        public Envelope setGlassSetupResponseG2C(final GlassSetupResponse glassSetupResponseG2C_) {
            if (glassSetupResponseG2C_ == null) {
                throw new NullPointerException();
            }
            this.glassSetupResponseG2C_ = glassSetupResponseG2C_;
            return this;
        }
        
        public Envelope setInputBoxRequestG2C(final InputBoxRequest inputBoxRequestG2C_) {
            if (inputBoxRequestG2C_ == null) {
                throw new NullPointerException();
            }
            this.inputBoxRequestG2C_ = inputBoxRequestG2C_;
            return this;
        }
        
        public Envelope setInputBoxResponseC2G(final InputBoxResponse inputBoxResponseC2G_) {
            if (inputBoxResponseC2G_ == null) {
                throw new NullPointerException();
            }
            this.inputBoxResponseC2G_ = inputBoxResponseC2G_;
            return this;
        }
        
        public Envelope setLocationMessageC2G(final LocationMessage locationMessageC2G_) {
            if (locationMessageC2G_ == null) {
                throw new NullPointerException();
            }
            this.locationMessageC2G_ = locationMessageC2G_;
            return this;
        }
        
        public Envelope setLocationRequestG2C(final LocationRequest locationRequestG2C_) {
            if (locationRequestG2C_ == null) {
                throw new NullPointerException();
            }
            this.locationRequestG2C_ = locationRequestG2C_;
            return this;
        }
        
        public Envelope setMessageC2G(final String messageC2G_) {
            if (messageC2G_ == null) {
                throw new NullPointerException();
            }
            this.messageC2G_ = messageC2G_;
            this.bitField0_ |= 0x8;
            return this;
        }
        
        public Envelope setMotionC2G(final MotionEvent motionC2G_) {
            if (motionC2G_ == null) {
                throw new NullPointerException();
            }
            this.motionC2G_ = motionC2G_;
            return this;
        }
        
        public Envelope setMultimediaMessage(final MultimediaMessage multimediaMessage_) {
            if (multimediaMessage_ == null) {
                throw new NullPointerException();
            }
            this.multimediaMessage_ = multimediaMessage_;
            return this;
        }
        
        public Envelope setNavigationRequestC2G(final NavigationRequest navigationRequestC2G_) {
            if (navigationRequestC2G_ == null) {
                throw new NullPointerException();
            }
            this.navigationRequestC2G_ = navigationRequestC2G_;
            return this;
        }
        
        public Envelope setOpenEndedInputRequestG2C(final OpenEndedInputRequest openEndedInputRequestG2C_) {
            if (openEndedInputRequestG2C_ == null) {
                throw new NullPointerException();
            }
            this.openEndedInputRequestG2C_ = openEndedInputRequestG2C_;
            return this;
        }
        
        public Envelope setOpenEndedInputResponseC2G(final OpenEndedInputResponse openEndedInputResponseC2G_) {
            if (openEndedInputResponseC2G_ == null) {
                throw new NullPointerException();
            }
            this.openEndedInputResponseC2G_ = openEndedInputResponseC2G_;
            return this;
        }
        
        public Envelope setPhotoG2C(final Photo photoG2C_) {
            if (photoG2C_ == null) {
                throw new NullPointerException();
            }
            this.photoG2C_ = photoG2C_;
            return this;
        }
        
        public Envelope setScreenshot(final ScreenShot screenshot_) {
            if (screenshot_ == null) {
                throw new NullPointerException();
            }
            this.screenshot_ = screenshot_;
            return this;
        }
        
        public Envelope setSerialNumber(final int serialNumber_) {
            this.serialNumber_ = serialNumber_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        public Envelope setSetWallpaperRequestC2G(final SetWallpaperRequest setWallpaperRequestC2G_) {
            if (setWallpaperRequestC2G_ == null) {
                throw new NullPointerException();
            }
            this.setWallpaperRequestC2G_ = setWallpaperRequestC2G_;
            return this;
        }
        
        public Envelope setSetWallpaperResponseG2C(final SetWallpaperResponse setWallpaperResponseG2C_) {
            if (setWallpaperResponseG2C_ == null) {
                throw new NullPointerException();
            }
            this.setWallpaperResponseG2C_ = setWallpaperResponseG2C_;
            return this;
        }
        
        public Envelope setSetupWifiC2G(final String setupWifiC2G_) {
            if (setupWifiC2G_ == null) {
                throw new NullPointerException();
            }
            this.setupWifiC2G_ = setupWifiC2G_;
            this.bitField0_ |= 0x40;
            return this;
        }
        
        public Envelope setSetupWifiRequestG2C(final SetupWifiRequest setupWifiRequestG2C_) {
            if (setupWifiRequestG2C_ == null) {
                throw new NullPointerException();
            }
            this.setupWifiRequestG2C_ = setupWifiRequestG2C_;
            return this;
        }
        
        public Envelope setTimeMillis(final long timeMillis_) {
            this.timeMillis_ = timeMillis_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        public Envelope setTimezoneC2G(final String timezoneC2G_) {
            if (timezoneC2G_ == null) {
                throw new NullPointerException();
            }
            this.timezoneC2G_ = timezoneC2G_;
            this.bitField0_ |= 0x10;
            return this;
        }
        
        public Envelope setUpdateCredentialRequestG2C(final UpdateCredentialRequest updateCredentialRequestG2C_) {
            if (updateCredentialRequestG2C_ == null) {
                throw new NullPointerException();
            }
            this.updateCredentialRequestG2C_ = updateCredentialRequestG2C_;
            return this;
        }
        
        public Envelope setUptimeMillis(final long uptimeMillis_) {
            this.uptimeMillis_ = uptimeMillis_;
            this.bitField0_ |= 0x4;
            return this;
        }
        
        public Envelope setUrlG2C(final String urlG2C_) {
            if (urlG2C_ == null) {
                throw new NullPointerException();
            }
            this.urlG2C_ = urlG2C_;
            this.bitField0_ |= 0x20;
            return this;
        }
        
        public Envelope setWallpaperC2G(final Wallpaper wallpaperC2G_) {
            if (wallpaperC2G_ == null) {
                throw new NullPointerException();
            }
            this.wallpaperC2G_ = wallpaperC2G_;
            return this;
        }
        
        public Envelope setWallpaperInfoG2C(final WallpaperInfo wallpaperInfoG2C_) {
            if (wallpaperInfoG2C_ == null) {
                throw new NullPointerException();
            }
            this.wallpaperInfoG2C_ = wallpaperInfoG2C_;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            final int n = 0;
            codedOutputByteBufferNano.writeUInt32(1, this.version);
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeUInt32(2, this.serialNumber_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeUInt64(3, this.timeMillis_);
            }
            if ((this.bitField0_ & 0x4) != 0x0) {
                codedOutputByteBufferNano.writeUInt64(4, this.uptimeMillis_);
            }
            if (this.timelineItem != null) {
                for (final TimelineNano.TimelineItem timelineItem2 : this.timelineItem) {
                    if (timelineItem2 != null) {
                        codedOutputByteBufferNano.writeMessage(5, timelineItem2);
                    }
                }
            }
            if (this.locationRequestG2C_ != null) {
                codedOutputByteBufferNano.writeMessage(6, this.locationRequestG2C_);
            }
            if (this.locationMessageC2G_ != null) {
                codedOutputByteBufferNano.writeMessage(7, this.locationMessageC2G_);
            }
            if ((this.bitField0_ & 0x8) != 0x0) {
                codedOutputByteBufferNano.writeString(8, this.messageC2G_);
            }
            if ((this.bitField0_ & 0x10) != 0x0) {
                codedOutputByteBufferNano.writeString(9, this.timezoneC2G_);
            }
            if (this.navigationRequestC2G_ != null) {
                codedOutputByteBufferNano.writeMessage(10, this.navigationRequestC2G_);
            }
            if ((this.bitField0_ & 0x20) != 0x0) {
                codedOutputByteBufferNano.writeString(11, this.urlG2C_);
            }
            if ((this.bitField0_ & 0x40) != 0x0) {
                codedOutputByteBufferNano.writeString(12, this.setupWifiC2G_);
            }
            if (this.companionInfo_ != null) {
                codedOutputByteBufferNano.writeMessage(13, this.companionInfo_);
            }
            if (this.error_ != null) {
                codedOutputByteBufferNano.writeMessage(14, this.error_);
            }
            if (this.screenshot_ != null) {
                codedOutputByteBufferNano.writeMessage(15, this.screenshot_);
            }
            if (this.command_ != null) {
                codedOutputByteBufferNano.writeMessage(16, this.command_);
            }
            if (this.timelineItemResponseC2G != null) {
                final TimelineItemResponse[] timelineItemResponseC2G = this.timelineItemResponseC2G;
                for (int length2 = timelineItemResponseC2G.length, j = n; j < length2; ++j) {
                    final TimelineItemResponse timelineItemResponse = timelineItemResponseC2G[j];
                    if (timelineItemResponse != null) {
                        codedOutputByteBufferNano.writeMessage(17, timelineItemResponse);
                    }
                }
            }
            if (this.apiRequestC2G_ != null) {
                codedOutputByteBufferNano.writeMessage(18, this.apiRequestC2G_);
            }
            if (this.apiResponseG2C_ != null) {
                codedOutputByteBufferNano.writeMessage(19, this.apiResponseG2C_);
            }
            if (this.motionC2G_ != null) {
                codedOutputByteBufferNano.writeMessage(20, this.motionC2G_);
            }
            if (this.glassInfoRequestC2G_ != null) {
                codedOutputByteBufferNano.writeMessage(21, this.glassInfoRequestC2G_);
            }
            if (this.glassInfoResponseG2C_ != null) {
                codedOutputByteBufferNano.writeMessage(22, this.glassInfoResponseG2C_);
            }
            if (this.inputBoxRequestG2C_ != null) {
                codedOutputByteBufferNano.writeMessage(23, this.inputBoxRequestG2C_);
            }
            if (this.inputBoxResponseC2G_ != null) {
                codedOutputByteBufferNano.writeMessage(24, this.inputBoxResponseC2G_);
            }
            if (this.glassSetupRequestC2G_ != null) {
                codedOutputByteBufferNano.writeMessage(25, this.glassSetupRequestC2G_);
            }
            if (this.glassSetupResponseG2C_ != null) {
                codedOutputByteBufferNano.writeMessage(26, this.glassSetupResponseG2C_);
            }
            if (this.setupWifiRequestG2C_ != null) {
                codedOutputByteBufferNano.writeMessage(27, this.setupWifiRequestG2C_);
            }
            if (this.photoG2C_ != null) {
                codedOutputByteBufferNano.writeMessage(28, this.photoG2C_);
            }
            if (this.updateCredentialRequestG2C_ != null) {
                codedOutputByteBufferNano.writeMessage(29, this.updateCredentialRequestG2C_);
            }
            if (this.androidDeviceInfo_ != null) {
                codedOutputByteBufferNano.writeMessage(30, this.androidDeviceInfo_);
            }
            if (this.companionDeviceInfoC2G_ != null) {
                codedOutputByteBufferNano.writeMessage(31, this.companionDeviceInfoC2G_);
            }
            if (this.companionFeatureInfoC2G_ != null) {
                codedOutputByteBufferNano.writeMessage(32, this.companionFeatureInfoC2G_);
            }
            if (this.glassFeatureInfoG2C_ != null) {
                codedOutputByteBufferNano.writeMessage(33, this.glassFeatureInfoG2C_);
            }
            if (this.wallpaperC2G_ != null) {
                codedOutputByteBufferNano.writeMessage(34, this.wallpaperC2G_);
            }
            if (this.openEndedInputRequestG2C_ != null) {
                codedOutputByteBufferNano.writeMessage(35, this.openEndedInputRequestG2C_);
            }
            if (this.openEndedInputResponseC2G_ != null) {
                codedOutputByteBufferNano.writeMessage(36, this.openEndedInputResponseC2G_);
            }
            if (this.multimediaMessage_ != null) {
                codedOutputByteBufferNano.writeMessage(37, this.multimediaMessage_);
            }
            if (this.setWallpaperRequestC2G_ != null) {
                codedOutputByteBufferNano.writeMessage(38, this.setWallpaperRequestC2G_);
            }
            if (this.setWallpaperResponseG2C_ != null) {
                codedOutputByteBufferNano.writeMessage(39, this.setWallpaperResponseG2C_);
            }
            if (this.getWallpaperInfoC2G_ != null) {
                codedOutputByteBufferNano.writeMessage(40, this.getWallpaperInfoC2G_);
            }
            if (this.wallpaperInfoG2C_ != null) {
                codedOutputByteBufferNano.writeMessage(41, this.wallpaperInfoG2C_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class Error extends ExtendableMessageNano
    {
        public static final Error[] EMPTY_ARRAY;
        public int type;
        
        static {
            EMPTY_ARRAY = new Error[0];
        }
        
        public Error() {
            this.type = 0;
        }
        
        public static Error parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new Error().mergeFrom(codedInputByteBufferNano);
        }
        
        public static Error parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new Error(), array);
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof Error)) {
                    b = false;
                }
                else {
                    final Error error = (Error)o;
                    if (this.type == error.type) {
                        if (this.unknownFieldData == null) {
                            if (error.unknownFieldData == null) {
                                return b;
                            }
                        }
                        else if (this.unknownFieldData.equals(error.unknownFieldData)) {
                            return b;
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        @Override
        public int getSerializedSize() {
            return this.cachedSize = 0 + CodedOutputByteBufferNano.computeInt32Size(1, this.type) + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        @Override
        public int hashCode() {
            final int type = this.type;
            int hashCode;
            if (this.unknownFieldData == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.unknownFieldData.hashCode();
            }
            return (type + 527) * 31 + hashCode;
        }
        
        @Override
        public Error mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0062:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0062;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0062;
                    }
                    case 8: {
                        final int int32 = codedInputByteBufferNano.readInt32();
                        if (int32 == 0 || int32 == 1 || int32 == 2) {
                            this.type = int32;
                            continue;
                        }
                        this.type = 0;
                        continue;
                    }
                }
            }
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt32(1, this.type);
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
        
        public interface ErrorType
        {
            public static final int SMS_GOOGLE_VOICE_NEEDS_UPDATE = 2;
            public static final int SMS_GOOGLE_VOICE_NOT_INSTALLED = 1;
            public static final int TETHERING_ERROR_ON_GLASS = 0;
        }
    }
    
    public static final class GetWallpaperInfo extends ExtendableMessageNano
    {
        public static final GetWallpaperInfo[] EMPTY_ARRAY;
        private int bitField0_;
        private byte[] sha1HashCode_;
        
        static {
            EMPTY_ARRAY = new GetWallpaperInfo[0];
        }
        
        public GetWallpaperInfo() {
            this.sha1HashCode_ = WireFormatNano.EMPTY_BYTES;
        }
        
        public static GetWallpaperInfo parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new GetWallpaperInfo().mergeFrom(codedInputByteBufferNano);
        }
        
        public static GetWallpaperInfo parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new GetWallpaperInfo(), array);
        }
        
        public GetWallpaperInfo clearSha1HashCode() {
            this.sha1HashCode_ = WireFormatNano.EMPTY_BYTES;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof GetWallpaperInfo)) {
                    b = false;
                }
                else {
                    final GetWallpaperInfo getWallpaperInfo = (GetWallpaperInfo)o;
                    if (Arrays.equals(this.sha1HashCode_, getWallpaperInfo.sha1HashCode_)) {
                        if (this.unknownFieldData == null) {
                            if (getWallpaperInfo.unknownFieldData == null) {
                                return b;
                            }
                        }
                        else if (this.unknownFieldData.equals(getWallpaperInfo.unknownFieldData)) {
                            return b;
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeBytesSize(1, this.sha1HashCode_);
            }
            return this.cachedSize = n + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public byte[] getSha1HashCode() {
            return this.sha1HashCode_;
        }
        
        public boolean hasSha1HashCode() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        @Override
        public int hashCode() {
            int n = 17;
            int n2;
            if (this.sha1HashCode_ == null) {
                n2 = 17 * 31;
            }
            else {
                int n3 = 0;
                while (true) {
                    n2 = n;
                    if (n3 >= this.sha1HashCode_.length) {
                        break;
                    }
                    n = n * 31 + this.sha1HashCode_[n3];
                    ++n3;
                }
            }
            int hashCode;
            if (this.unknownFieldData == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.unknownFieldData.hashCode();
            }
            return n2 * 31 + hashCode;
        }
        
        @Override
        public GetWallpaperInfo mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0062:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0062;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0062;
                    }
                    case 10: {
                        this.sha1HashCode_ = codedInputByteBufferNano.readBytes();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public GetWallpaperInfo setSha1HashCode(final byte[] sha1HashCode_) {
            if (sha1HashCode_ == null) {
                throw new NullPointerException();
            }
            this.sha1HashCode_ = sha1HashCode_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeBytes(1, this.sha1HashCode_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class GlassFeatureInfo extends ExtendableMessageNano
    {
        public static final GlassFeatureInfo[] EMPTY_ARRAY;
        private int bitField0_;
        private boolean isWallpaperFeatureEnabled_;
        
        static {
            EMPTY_ARRAY = new GlassFeatureInfo[0];
        }
        
        public GlassFeatureInfo() {
            this.isWallpaperFeatureEnabled_ = false;
        }
        
        public static GlassFeatureInfo parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new GlassFeatureInfo().mergeFrom(codedInputByteBufferNano);
        }
        
        public static GlassFeatureInfo parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new GlassFeatureInfo(), array);
        }
        
        public GlassFeatureInfo clearIsWallpaperFeatureEnabled() {
            this.isWallpaperFeatureEnabled_ = false;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof GlassFeatureInfo)) {
                    b = false;
                }
                else {
                    final GlassFeatureInfo glassFeatureInfo = (GlassFeatureInfo)o;
                    if (this.isWallpaperFeatureEnabled_ == glassFeatureInfo.isWallpaperFeatureEnabled_) {
                        if (this.unknownFieldData == null) {
                            if (glassFeatureInfo.unknownFieldData == null) {
                                return b;
                            }
                        }
                        else if (this.unknownFieldData.equals(glassFeatureInfo.unknownFieldData)) {
                            return b;
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public boolean getIsWallpaperFeatureEnabled() {
            return this.isWallpaperFeatureEnabled_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeBoolSize(1, this.isWallpaperFeatureEnabled_);
            }
            return this.cachedSize = n + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public boolean hasIsWallpaperFeatureEnabled() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        @Override
        public int hashCode() {
            int n;
            if (this.isWallpaperFeatureEnabled_) {
                n = 1;
            }
            else {
                n = 2;
            }
            int hashCode;
            if (this.unknownFieldData == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.unknownFieldData.hashCode();
            }
            return (n + 527) * 31 + hashCode;
        }
        
        @Override
        public GlassFeatureInfo mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0062:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0062;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0062;
                    }
                    case 8: {
                        this.isWallpaperFeatureEnabled_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public GlassFeatureInfo setIsWallpaperFeatureEnabled(final boolean isWallpaperFeatureEnabled_) {
            this.isWallpaperFeatureEnabled_ = isWallpaperFeatureEnabled_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeBool(1, this.isWallpaperFeatureEnabled_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class GlassInfoRequest extends ExtendableMessageNano
    {
        public static final GlassInfoRequest[] EMPTY_ARRAY;
        private int bitField0_;
        private boolean requestBatteryLevel_;
        private boolean requestDeviceName_;
        private boolean requestNeedSetup_;
        private boolean requestScreenDimensions_;
        private boolean requestSoftwareVersion_;
        private boolean requestStorageInfo_;
        
        static {
            EMPTY_ARRAY = new GlassInfoRequest[0];
        }
        
        public GlassInfoRequest() {
            this.requestBatteryLevel_ = false;
            this.requestStorageInfo_ = false;
            this.requestDeviceName_ = false;
            this.requestSoftwareVersion_ = false;
            this.requestNeedSetup_ = false;
            this.requestScreenDimensions_ = false;
        }
        
        public static GlassInfoRequest parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new GlassInfoRequest().mergeFrom(codedInputByteBufferNano);
        }
        
        public static GlassInfoRequest parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new GlassInfoRequest(), array);
        }
        
        public GlassInfoRequest clearRequestBatteryLevel() {
            this.requestBatteryLevel_ = false;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        public GlassInfoRequest clearRequestDeviceName() {
            this.requestDeviceName_ = false;
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }
        
        public GlassInfoRequest clearRequestNeedSetup() {
            this.requestNeedSetup_ = false;
            this.bitField0_ &= 0xFFFFFFEF;
            return this;
        }
        
        public GlassInfoRequest clearRequestScreenDimensions() {
            this.requestScreenDimensions_ = false;
            this.bitField0_ &= 0xFFFFFFDF;
            return this;
        }
        
        public GlassInfoRequest clearRequestSoftwareVersion() {
            this.requestSoftwareVersion_ = false;
            this.bitField0_ &= 0xFFFFFFF7;
            return this;
        }
        
        public GlassInfoRequest clearRequestStorageInfo() {
            this.requestStorageInfo_ = false;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof GlassInfoRequest)) {
                    b = false;
                }
                else {
                    final GlassInfoRequest glassInfoRequest = (GlassInfoRequest)o;
                    if (this.requestBatteryLevel_ == glassInfoRequest.requestBatteryLevel_ && this.requestStorageInfo_ == glassInfoRequest.requestStorageInfo_ && this.requestDeviceName_ == glassInfoRequest.requestDeviceName_ && this.requestSoftwareVersion_ == glassInfoRequest.requestSoftwareVersion_ && this.requestNeedSetup_ == glassInfoRequest.requestNeedSetup_ && this.requestScreenDimensions_ == glassInfoRequest.requestScreenDimensions_) {
                        if (this.unknownFieldData == null) {
                            if (glassInfoRequest.unknownFieldData == null) {
                                return b;
                            }
                        }
                        else if (this.unknownFieldData.equals(glassInfoRequest.unknownFieldData)) {
                            return b;
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public boolean getRequestBatteryLevel() {
            return this.requestBatteryLevel_;
        }
        
        public boolean getRequestDeviceName() {
            return this.requestDeviceName_;
        }
        
        public boolean getRequestNeedSetup() {
            return this.requestNeedSetup_;
        }
        
        public boolean getRequestScreenDimensions() {
            return this.requestScreenDimensions_;
        }
        
        public boolean getRequestSoftwareVersion() {
            return this.requestSoftwareVersion_;
        }
        
        public boolean getRequestStorageInfo() {
            return this.requestStorageInfo_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeBoolSize(1, this.requestBatteryLevel_);
            }
            int n2 = n;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n2 = n + CodedOutputByteBufferNano.computeBoolSize(2, this.requestStorageInfo_);
            }
            int n3 = n2;
            if ((this.bitField0_ & 0x4) != 0x0) {
                n3 = n2 + CodedOutputByteBufferNano.computeBoolSize(3, this.requestDeviceName_);
            }
            int n4 = n3;
            if ((this.bitField0_ & 0x8) != 0x0) {
                n4 = n3 + CodedOutputByteBufferNano.computeBoolSize(4, this.requestSoftwareVersion_);
            }
            int n5 = n4;
            if ((this.bitField0_ & 0x10) != 0x0) {
                n5 = n4 + CodedOutputByteBufferNano.computeBoolSize(5, this.requestNeedSetup_);
            }
            int n6 = n5;
            if ((this.bitField0_ & 0x20) != 0x0) {
                n6 = n5 + CodedOutputByteBufferNano.computeBoolSize(6, this.requestScreenDimensions_);
            }
            return this.cachedSize = n6 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public boolean hasRequestBatteryLevel() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        public boolean hasRequestDeviceName() {
            return (this.bitField0_ & 0x4) != 0x0;
        }
        
        public boolean hasRequestNeedSetup() {
            return (this.bitField0_ & 0x10) != 0x0;
        }
        
        public boolean hasRequestScreenDimensions() {
            return (this.bitField0_ & 0x20) != 0x0;
        }
        
        public boolean hasRequestSoftwareVersion() {
            return (this.bitField0_ & 0x8) != 0x0;
        }
        
        public boolean hasRequestStorageInfo() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        @Override
        public int hashCode() {
            int n = 1;
            int n2;
            if (this.requestBatteryLevel_) {
                n2 = 1;
            }
            else {
                n2 = 2;
            }
            int n3;
            if (this.requestStorageInfo_) {
                n3 = 1;
            }
            else {
                n3 = 2;
            }
            int n4;
            if (this.requestDeviceName_) {
                n4 = 1;
            }
            else {
                n4 = 2;
            }
            int n5;
            if (this.requestSoftwareVersion_) {
                n5 = 1;
            }
            else {
                n5 = 2;
            }
            int n6;
            if (this.requestNeedSetup_) {
                n6 = 1;
            }
            else {
                n6 = 2;
            }
            if (!this.requestScreenDimensions_) {
                n = 2;
            }
            int hashCode;
            if (this.unknownFieldData == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.unknownFieldData.hashCode();
            }
            return ((((((n2 + 527) * 31 + n3) * 31 + n4) * 31 + n5) * 31 + n6) * 31 + n) * 31 + hashCode;
        }
        
        @Override
        public GlassInfoRequest mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0102:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0102;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0102;
                    }
                    case 8: {
                        this.requestBatteryLevel_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 16: {
                        this.requestStorageInfo_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x2;
                        continue;
                    }
                    case 24: {
                        this.requestDeviceName_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x4;
                        continue;
                    }
                    case 32: {
                        this.requestSoftwareVersion_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x8;
                        continue;
                    }
                    case 40: {
                        this.requestNeedSetup_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x10;
                        continue;
                    }
                    case 48: {
                        this.requestScreenDimensions_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x20;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public GlassInfoRequest setRequestBatteryLevel(final boolean requestBatteryLevel_) {
            this.requestBatteryLevel_ = requestBatteryLevel_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        public GlassInfoRequest setRequestDeviceName(final boolean requestDeviceName_) {
            this.requestDeviceName_ = requestDeviceName_;
            this.bitField0_ |= 0x4;
            return this;
        }
        
        public GlassInfoRequest setRequestNeedSetup(final boolean requestNeedSetup_) {
            this.requestNeedSetup_ = requestNeedSetup_;
            this.bitField0_ |= 0x10;
            return this;
        }
        
        public GlassInfoRequest setRequestScreenDimensions(final boolean requestScreenDimensions_) {
            this.requestScreenDimensions_ = requestScreenDimensions_;
            this.bitField0_ |= 0x20;
            return this;
        }
        
        public GlassInfoRequest setRequestSoftwareVersion(final boolean requestSoftwareVersion_) {
            this.requestSoftwareVersion_ = requestSoftwareVersion_;
            this.bitField0_ |= 0x8;
            return this;
        }
        
        public GlassInfoRequest setRequestStorageInfo(final boolean requestStorageInfo_) {
            this.requestStorageInfo_ = requestStorageInfo_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeBool(1, this.requestBatteryLevel_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeBool(2, this.requestStorageInfo_);
            }
            if ((this.bitField0_ & 0x4) != 0x0) {
                codedOutputByteBufferNano.writeBool(3, this.requestDeviceName_);
            }
            if ((this.bitField0_ & 0x8) != 0x0) {
                codedOutputByteBufferNano.writeBool(4, this.requestSoftwareVersion_);
            }
            if ((this.bitField0_ & 0x10) != 0x0) {
                codedOutputByteBufferNano.writeBool(5, this.requestNeedSetup_);
            }
            if ((this.bitField0_ & 0x20) != 0x0) {
                codedOutputByteBufferNano.writeBool(6, this.requestScreenDimensions_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class GlassInfoResponse extends ExtendableMessageNano
    {
        public static final GlassInfoResponse[] EMPTY_ARRAY;
        private int batteryLevel_;
        private int bitField0_;
        private String deviceName_;
        private long externalStorageAvailableBytes_;
        private long externalStorageTotalBytes_;
        private int glassScreenHeightPixels_;
        private int glassScreenWidthPixels_;
        private boolean needSetup_;
        private String softwareVersion_;
        
        static {
            EMPTY_ARRAY = new GlassInfoResponse[0];
        }
        
        public GlassInfoResponse() {
            this.batteryLevel_ = 0;
            this.externalStorageTotalBytes_ = 0L;
            this.externalStorageAvailableBytes_ = 0L;
            this.deviceName_ = "";
            this.softwareVersion_ = "";
            this.needSetup_ = false;
            this.glassScreenWidthPixels_ = 0;
            this.glassScreenHeightPixels_ = 0;
        }
        
        public static GlassInfoResponse parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new GlassInfoResponse().mergeFrom(codedInputByteBufferNano);
        }
        
        public static GlassInfoResponse parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new GlassInfoResponse(), array);
        }
        
        public GlassInfoResponse clearBatteryLevel() {
            this.batteryLevel_ = 0;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        public GlassInfoResponse clearDeviceName() {
            this.deviceName_ = "";
            this.bitField0_ &= 0xFFFFFFF7;
            return this;
        }
        
        public GlassInfoResponse clearExternalStorageAvailableBytes() {
            this.externalStorageAvailableBytes_ = 0L;
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }
        
        public GlassInfoResponse clearExternalStorageTotalBytes() {
            this.externalStorageTotalBytes_ = 0L;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        public GlassInfoResponse clearGlassScreenHeightPixels() {
            this.glassScreenHeightPixels_ = 0;
            this.bitField0_ &= 0xFFFFFF7F;
            return this;
        }
        
        public GlassInfoResponse clearGlassScreenWidthPixels() {
            this.glassScreenWidthPixels_ = 0;
            this.bitField0_ &= 0xFFFFFFBF;
            return this;
        }
        
        public GlassInfoResponse clearNeedSetup() {
            this.needSetup_ = false;
            this.bitField0_ &= 0xFFFFFFDF;
            return this;
        }
        
        public GlassInfoResponse clearSoftwareVersion() {
            this.softwareVersion_ = "";
            this.bitField0_ &= 0xFFFFFFEF;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof GlassInfoResponse)) {
                    b = false;
                }
                else {
                    final GlassInfoResponse glassInfoResponse = (GlassInfoResponse)o;
                    Label_0136: {
                        if (this.batteryLevel_ == glassInfoResponse.batteryLevel_ && this.externalStorageTotalBytes_ == glassInfoResponse.externalStorageTotalBytes_ && this.externalStorageAvailableBytes_ == glassInfoResponse.externalStorageAvailableBytes_) {
                            if (this.deviceName_ == null) {
                                if (glassInfoResponse.deviceName_ != null) {
                                    break Label_0136;
                                }
                            }
                            else if (!this.deviceName_.equals(glassInfoResponse.deviceName_)) {
                                break Label_0136;
                            }
                            if (this.softwareVersion_ == null) {
                                if (glassInfoResponse.softwareVersion_ != null) {
                                    break Label_0136;
                                }
                            }
                            else if (!this.softwareVersion_.equals(glassInfoResponse.softwareVersion_)) {
                                break Label_0136;
                            }
                            if (this.needSetup_ == glassInfoResponse.needSetup_ && this.glassScreenWidthPixels_ == glassInfoResponse.glassScreenWidthPixels_ && this.glassScreenHeightPixels_ == glassInfoResponse.glassScreenHeightPixels_) {
                                if (this.unknownFieldData == null) {
                                    if (glassInfoResponse.unknownFieldData == null) {
                                        return b;
                                    }
                                }
                                else if (this.unknownFieldData.equals(glassInfoResponse.unknownFieldData)) {
                                    return b;
                                }
                            }
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public int getBatteryLevel() {
            return this.batteryLevel_;
        }
        
        public String getDeviceName() {
            return this.deviceName_;
        }
        
        public long getExternalStorageAvailableBytes() {
            return this.externalStorageAvailableBytes_;
        }
        
        public long getExternalStorageTotalBytes() {
            return this.externalStorageTotalBytes_;
        }
        
        public int getGlassScreenHeightPixels() {
            return this.glassScreenHeightPixels_;
        }
        
        public int getGlassScreenWidthPixels() {
            return this.glassScreenWidthPixels_;
        }
        
        public boolean getNeedSetup() {
            return this.needSetup_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeInt32Size(1, this.batteryLevel_);
            }
            int n2 = n;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n2 = n + CodedOutputByteBufferNano.computeInt64Size(2, this.externalStorageTotalBytes_);
            }
            int n3 = n2;
            if ((this.bitField0_ & 0x4) != 0x0) {
                n3 = n2 + CodedOutputByteBufferNano.computeInt64Size(3, this.externalStorageAvailableBytes_);
            }
            int n4 = n3;
            if ((this.bitField0_ & 0x8) != 0x0) {
                n4 = n3 + CodedOutputByteBufferNano.computeStringSize(4, this.deviceName_);
            }
            int n5 = n4;
            if ((this.bitField0_ & 0x10) != 0x0) {
                n5 = n4 + CodedOutputByteBufferNano.computeStringSize(5, this.softwareVersion_);
            }
            int n6 = n5;
            if ((this.bitField0_ & 0x20) != 0x0) {
                n6 = n5 + CodedOutputByteBufferNano.computeBoolSize(6, this.needSetup_);
            }
            int n7 = n6;
            if ((this.bitField0_ & 0x40) != 0x0) {
                n7 = n6 + CodedOutputByteBufferNano.computeInt32Size(7, this.glassScreenWidthPixels_);
            }
            int n8 = n7;
            if ((this.bitField0_ & 0x80) != 0x0) {
                n8 = n7 + CodedOutputByteBufferNano.computeInt32Size(8, this.glassScreenHeightPixels_);
            }
            return this.cachedSize = n8 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public String getSoftwareVersion() {
            return this.softwareVersion_;
        }
        
        public boolean hasBatteryLevel() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        public boolean hasDeviceName() {
            return (this.bitField0_ & 0x8) != 0x0;
        }
        
        public boolean hasExternalStorageAvailableBytes() {
            return (this.bitField0_ & 0x4) != 0x0;
        }
        
        public boolean hasExternalStorageTotalBytes() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        public boolean hasGlassScreenHeightPixels() {
            return (this.bitField0_ & 0x80) != 0x0;
        }
        
        public boolean hasGlassScreenWidthPixels() {
            return (this.bitField0_ & 0x40) != 0x0;
        }
        
        public boolean hasNeedSetup() {
            return (this.bitField0_ & 0x20) != 0x0;
        }
        
        public boolean hasSoftwareVersion() {
            return (this.bitField0_ & 0x10) != 0x0;
        }
        
        @Override
        public int hashCode() {
            int hashCode = 0;
            final int batteryLevel_ = this.batteryLevel_;
            final int n = (int)(this.externalStorageTotalBytes_ ^ this.externalStorageTotalBytes_ >>> 32);
            final int n2 = (int)(this.externalStorageAvailableBytes_ ^ this.externalStorageAvailableBytes_ >>> 32);
            int hashCode2;
            if (this.deviceName_ == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = this.deviceName_.hashCode();
            }
            int hashCode3;
            if (this.softwareVersion_ == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = this.softwareVersion_.hashCode();
            }
            int n3;
            if (this.needSetup_) {
                n3 = 1;
            }
            else {
                n3 = 2;
            }
            final int glassScreenWidthPixels_ = this.glassScreenWidthPixels_;
            final int glassScreenHeightPixels_ = this.glassScreenHeightPixels_;
            if (this.unknownFieldData != null) {
                hashCode = this.unknownFieldData.hashCode();
            }
            return ((((((((batteryLevel_ + 527) * 31 + n) * 31 + n2) * 31 + hashCode2) * 31 + hashCode3) * 31 + n3) * 31 + glassScreenWidthPixels_) * 31 + glassScreenHeightPixels_) * 31 + hashCode;
        }
        
        @Override
        public GlassInfoResponse mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0118:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0118;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0118;
                    }
                    case 8: {
                        this.batteryLevel_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 16: {
                        this.externalStorageTotalBytes_ = codedInputByteBufferNano.readInt64();
                        this.bitField0_ |= 0x2;
                        continue;
                    }
                    case 24: {
                        this.externalStorageAvailableBytes_ = codedInputByteBufferNano.readInt64();
                        this.bitField0_ |= 0x4;
                        continue;
                    }
                    case 34: {
                        this.deviceName_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x8;
                        continue;
                    }
                    case 42: {
                        this.softwareVersion_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x10;
                        continue;
                    }
                    case 48: {
                        this.needSetup_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x20;
                        continue;
                    }
                    case 56: {
                        this.glassScreenWidthPixels_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x40;
                        continue;
                    }
                    case 64: {
                        this.glassScreenHeightPixels_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x80;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public GlassInfoResponse setBatteryLevel(final int batteryLevel_) {
            this.batteryLevel_ = batteryLevel_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        public GlassInfoResponse setDeviceName(final String deviceName_) {
            if (deviceName_ == null) {
                throw new NullPointerException();
            }
            this.deviceName_ = deviceName_;
            this.bitField0_ |= 0x8;
            return this;
        }
        
        public GlassInfoResponse setExternalStorageAvailableBytes(final long externalStorageAvailableBytes_) {
            this.externalStorageAvailableBytes_ = externalStorageAvailableBytes_;
            this.bitField0_ |= 0x4;
            return this;
        }
        
        public GlassInfoResponse setExternalStorageTotalBytes(final long externalStorageTotalBytes_) {
            this.externalStorageTotalBytes_ = externalStorageTotalBytes_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        public GlassInfoResponse setGlassScreenHeightPixels(final int glassScreenHeightPixels_) {
            this.glassScreenHeightPixels_ = glassScreenHeightPixels_;
            this.bitField0_ |= 0x80;
            return this;
        }
        
        public GlassInfoResponse setGlassScreenWidthPixels(final int glassScreenWidthPixels_) {
            this.glassScreenWidthPixels_ = glassScreenWidthPixels_;
            this.bitField0_ |= 0x40;
            return this;
        }
        
        public GlassInfoResponse setNeedSetup(final boolean needSetup_) {
            this.needSetup_ = needSetup_;
            this.bitField0_ |= 0x20;
            return this;
        }
        
        public GlassInfoResponse setSoftwareVersion(final String softwareVersion_) {
            if (softwareVersion_ == null) {
                throw new NullPointerException();
            }
            this.softwareVersion_ = softwareVersion_;
            this.bitField0_ |= 0x10;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeInt32(1, this.batteryLevel_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeInt64(2, this.externalStorageTotalBytes_);
            }
            if ((this.bitField0_ & 0x4) != 0x0) {
                codedOutputByteBufferNano.writeInt64(3, this.externalStorageAvailableBytes_);
            }
            if ((this.bitField0_ & 0x8) != 0x0) {
                codedOutputByteBufferNano.writeString(4, this.deviceName_);
            }
            if ((this.bitField0_ & 0x10) != 0x0) {
                codedOutputByteBufferNano.writeString(5, this.softwareVersion_);
            }
            if ((this.bitField0_ & 0x20) != 0x0) {
                codedOutputByteBufferNano.writeBool(6, this.needSetup_);
            }
            if ((this.bitField0_ & 0x40) != 0x0) {
                codedOutputByteBufferNano.writeInt32(7, this.glassScreenWidthPixels_);
            }
            if ((this.bitField0_ & 0x80) != 0x0) {
                codedOutputByteBufferNano.writeInt32(8, this.glassScreenHeightPixels_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class GlassSetupRequest extends ExtendableMessageNano
    {
        public static final GlassSetupRequest[] EMPTY_ARRAY;
        private int bitField0_;
        private String setupString_;
        
        static {
            EMPTY_ARRAY = new GlassSetupRequest[0];
        }
        
        public GlassSetupRequest() {
            this.setupString_ = "";
        }
        
        public static GlassSetupRequest parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new GlassSetupRequest().mergeFrom(codedInputByteBufferNano);
        }
        
        public static GlassSetupRequest parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new GlassSetupRequest(), array);
        }
        
        public GlassSetupRequest clearSetupString() {
            this.setupString_ = "";
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof GlassSetupRequest)) {
                    b = false;
                }
                else {
                    final GlassSetupRequest glassSetupRequest = (GlassSetupRequest)o;
                    Label_0054: {
                        if (this.setupString_ == null) {
                            if (glassSetupRequest.setupString_ != null) {
                                break Label_0054;
                            }
                        }
                        else if (!this.setupString_.equals(glassSetupRequest.setupString_)) {
                            break Label_0054;
                        }
                        if (this.unknownFieldData == null) {
                            if (glassSetupRequest.unknownFieldData == null) {
                                return b;
                            }
                        }
                        else if (this.unknownFieldData.equals(glassSetupRequest.unknownFieldData)) {
                            return b;
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeStringSize(1, this.setupString_);
            }
            return this.cachedSize = n + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public String getSetupString() {
            return this.setupString_;
        }
        
        public boolean hasSetupString() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        @Override
        public int hashCode() {
            int hashCode = 0;
            int hashCode2;
            if (this.setupString_ == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = this.setupString_.hashCode();
            }
            if (this.unknownFieldData != null) {
                hashCode = this.unknownFieldData.hashCode();
            }
            return (hashCode2 + 527) * 31 + hashCode;
        }
        
        @Override
        public GlassSetupRequest mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0062:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0062;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0062;
                    }
                    case 10: {
                        this.setupString_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public GlassSetupRequest setSetupString(final String setupString_) {
            if (setupString_ == null) {
                throw new NullPointerException();
            }
            this.setupString_ = setupString_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeString(1, this.setupString_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class GlassSetupResponse extends ExtendableMessageNano
    {
        public static final GlassSetupResponse[] EMPTY_ARRAY;
        private int bitField0_;
        private int setupStatus_;
        
        static {
            EMPTY_ARRAY = new GlassSetupResponse[0];
        }
        
        public GlassSetupResponse() {
            this.setupStatus_ = 1;
        }
        
        public static GlassSetupResponse parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new GlassSetupResponse().mergeFrom(codedInputByteBufferNano);
        }
        
        public static GlassSetupResponse parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new GlassSetupResponse(), array);
        }
        
        public GlassSetupResponse clearSetupStatus() {
            this.setupStatus_ = 1;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof GlassSetupResponse)) {
                    b = false;
                }
                else {
                    final GlassSetupResponse glassSetupResponse = (GlassSetupResponse)o;
                    if (this.setupStatus_ == glassSetupResponse.setupStatus_) {
                        if (this.unknownFieldData == null) {
                            if (glassSetupResponse.unknownFieldData == null) {
                                return b;
                            }
                        }
                        else if (this.unknownFieldData.equals(glassSetupResponse.unknownFieldData)) {
                            return b;
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeInt32Size(1, this.setupStatus_);
            }
            return this.cachedSize = n + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public int getSetupStatus() {
            return this.setupStatus_;
        }
        
        public boolean hasSetupStatus() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        @Override
        public int hashCode() {
            final int setupStatus_ = this.setupStatus_;
            int hashCode;
            if (this.unknownFieldData == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.unknownFieldData.hashCode();
            }
            return (setupStatus_ + 527) * 31 + hashCode;
        }
        
        @Override
        public GlassSetupResponse mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0062:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0062;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0062;
                    }
                    case 8: {
                        final int int32 = codedInputByteBufferNano.readInt32();
                        if (int32 == 1 || int32 == 2) {
                            this.setupStatus_ = int32;
                            this.bitField0_ |= 0x1;
                            continue;
                        }
                        this.setupStatus_ = 1;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public GlassSetupResponse setSetupStatus(final int setupStatus_) {
            this.setupStatus_ = setupStatus_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeInt32(1, this.setupStatus_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
        
        public interface SetupStatus
        {
            public static final int FAILED = 2;
            public static final int OK = 1;
        }
    }
    
    public static final class InputBoxRequest extends ExtendableMessageNano
    {
        public static final InputBoxRequest[] EMPTY_ARRAY;
        private int bitField0_;
        private boolean dismissInputBox_;
        private byte[] handlerObject_;
        private String hintText_;
        private int inputType_;
        private String summaryText_;
        
        static {
            EMPTY_ARRAY = new InputBoxRequest[0];
        }
        
        public InputBoxRequest() {
            this.dismissInputBox_ = false;
            this.inputType_ = 0;
            this.summaryText_ = "";
            this.hintText_ = "";
            this.handlerObject_ = WireFormatNano.EMPTY_BYTES;
        }
        
        public static InputBoxRequest parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new InputBoxRequest().mergeFrom(codedInputByteBufferNano);
        }
        
        public static InputBoxRequest parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new InputBoxRequest(), array);
        }
        
        public InputBoxRequest clearDismissInputBox() {
            this.dismissInputBox_ = false;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        public InputBoxRequest clearHandlerObject() {
            this.handlerObject_ = WireFormatNano.EMPTY_BYTES;
            this.bitField0_ &= 0xFFFFFFEF;
            return this;
        }
        
        public InputBoxRequest clearHintText() {
            this.hintText_ = "";
            this.bitField0_ &= 0xFFFFFFF7;
            return this;
        }
        
        public InputBoxRequest clearInputType() {
            this.inputType_ = 0;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        public InputBoxRequest clearSummaryText() {
            this.summaryText_ = "";
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof InputBoxRequest)) {
                    b = false;
                }
                else {
                    final InputBoxRequest inputBoxRequest = (InputBoxRequest)o;
                    Label_0104: {
                        if (this.dismissInputBox_ == inputBoxRequest.dismissInputBox_ && this.inputType_ == inputBoxRequest.inputType_) {
                            if (this.summaryText_ == null) {
                                if (inputBoxRequest.summaryText_ != null) {
                                    break Label_0104;
                                }
                            }
                            else if (!this.summaryText_.equals(inputBoxRequest.summaryText_)) {
                                break Label_0104;
                            }
                            if (this.hintText_ == null) {
                                if (inputBoxRequest.hintText_ != null) {
                                    break Label_0104;
                                }
                            }
                            else if (!this.hintText_.equals(inputBoxRequest.hintText_)) {
                                break Label_0104;
                            }
                            if (Arrays.equals(this.handlerObject_, inputBoxRequest.handlerObject_)) {
                                if (this.unknownFieldData == null) {
                                    if (inputBoxRequest.unknownFieldData == null) {
                                        return b;
                                    }
                                }
                                else if (this.unknownFieldData.equals(inputBoxRequest.unknownFieldData)) {
                                    return b;
                                }
                            }
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public boolean getDismissInputBox() {
            return this.dismissInputBox_;
        }
        
        public byte[] getHandlerObject() {
            return this.handlerObject_;
        }
        
        public String getHintText() {
            return this.hintText_;
        }
        
        public int getInputType() {
            return this.inputType_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeBoolSize(1, this.dismissInputBox_);
            }
            int n2 = n;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n2 = n + CodedOutputByteBufferNano.computeInt32Size(2, this.inputType_);
            }
            int n3 = n2;
            if ((this.bitField0_ & 0x4) != 0x0) {
                n3 = n2 + CodedOutputByteBufferNano.computeStringSize(3, this.summaryText_);
            }
            int n4 = n3;
            if ((this.bitField0_ & 0x8) != 0x0) {
                n4 = n3 + CodedOutputByteBufferNano.computeStringSize(4, this.hintText_);
            }
            int n5 = n4;
            if ((this.bitField0_ & 0x10) != 0x0) {
                n5 = n4 + CodedOutputByteBufferNano.computeBytesSize(5, this.handlerObject_);
            }
            return this.cachedSize = n5 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public String getSummaryText() {
            return this.summaryText_;
        }
        
        public boolean hasDismissInputBox() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        public boolean hasHandlerObject() {
            return (this.bitField0_ & 0x10) != 0x0;
        }
        
        public boolean hasHintText() {
            return (this.bitField0_ & 0x8) != 0x0;
        }
        
        public boolean hasInputType() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        public boolean hasSummaryText() {
            return (this.bitField0_ & 0x4) != 0x0;
        }
        
        @Override
        public int hashCode() {
            final int n = 0;
            int n2;
            if (this.dismissInputBox_) {
                n2 = 1;
            }
            else {
                n2 = 2;
            }
            final int inputType_ = this.inputType_;
            int hashCode;
            if (this.summaryText_ == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.summaryText_.hashCode();
            }
            int hashCode2;
            if (this.hintText_ == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = this.hintText_.hashCode();
            }
            int n3 = (((n2 + 527) * 31 + inputType_) * 31 + hashCode) * 31 + hashCode2;
            int n4;
            if (this.handlerObject_ == null) {
                n4 = n3 * 31;
            }
            else {
                int n5 = 0;
                while (true) {
                    n4 = n3;
                    if (n5 >= this.handlerObject_.length) {
                        break;
                    }
                    n3 = n3 * 31 + this.handlerObject_[n5];
                    ++n5;
                }
            }
            int hashCode3;
            if (this.unknownFieldData == null) {
                hashCode3 = n;
            }
            else {
                hashCode3 = this.unknownFieldData.hashCode();
            }
            return n4 * 31 + hashCode3;
        }
        
        @Override
        public InputBoxRequest mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0094:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0094;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0094;
                    }
                    case 8: {
                        this.dismissInputBox_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 16: {
                        this.inputType_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x2;
                        continue;
                    }
                    case 26: {
                        this.summaryText_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x4;
                        continue;
                    }
                    case 34: {
                        this.hintText_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x8;
                        continue;
                    }
                    case 42: {
                        this.handlerObject_ = codedInputByteBufferNano.readBytes();
                        this.bitField0_ |= 0x10;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public InputBoxRequest setDismissInputBox(final boolean dismissInputBox_) {
            this.dismissInputBox_ = dismissInputBox_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        public InputBoxRequest setHandlerObject(final byte[] handlerObject_) {
            if (handlerObject_ == null) {
                throw new NullPointerException();
            }
            this.handlerObject_ = handlerObject_;
            this.bitField0_ |= 0x10;
            return this;
        }
        
        public InputBoxRequest setHintText(final String hintText_) {
            if (hintText_ == null) {
                throw new NullPointerException();
            }
            this.hintText_ = hintText_;
            this.bitField0_ |= 0x8;
            return this;
        }
        
        public InputBoxRequest setInputType(final int inputType_) {
            this.inputType_ = inputType_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        public InputBoxRequest setSummaryText(final String summaryText_) {
            if (summaryText_ == null) {
                throw new NullPointerException();
            }
            this.summaryText_ = summaryText_;
            this.bitField0_ |= 0x4;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeBool(1, this.dismissInputBox_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeInt32(2, this.inputType_);
            }
            if ((this.bitField0_ & 0x4) != 0x0) {
                codedOutputByteBufferNano.writeString(3, this.summaryText_);
            }
            if ((this.bitField0_ & 0x8) != 0x0) {
                codedOutputByteBufferNano.writeString(4, this.hintText_);
            }
            if ((this.bitField0_ & 0x10) != 0x0) {
                codedOutputByteBufferNano.writeBytes(5, this.handlerObject_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class InputBoxResponse extends ExtendableMessageNano
    {
        public static final InputBoxResponse[] EMPTY_ARRAY;
        private int bitField0_;
        private byte[] handlerObject_;
        private String response_;
        
        static {
            EMPTY_ARRAY = new InputBoxResponse[0];
        }
        
        public InputBoxResponse() {
            this.response_ = "";
            this.handlerObject_ = WireFormatNano.EMPTY_BYTES;
        }
        
        public static InputBoxResponse parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new InputBoxResponse().mergeFrom(codedInputByteBufferNano);
        }
        
        public static InputBoxResponse parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new InputBoxResponse(), array);
        }
        
        public InputBoxResponse clearHandlerObject() {
            this.handlerObject_ = WireFormatNano.EMPTY_BYTES;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        public InputBoxResponse clearResponse() {
            this.response_ = "";
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof InputBoxResponse)) {
                    b = false;
                }
                else {
                    final InputBoxResponse inputBoxResponse = (InputBoxResponse)o;
                    Label_0068: {
                        if (this.response_ == null) {
                            if (inputBoxResponse.response_ != null) {
                                break Label_0068;
                            }
                        }
                        else if (!this.response_.equals(inputBoxResponse.response_)) {
                            break Label_0068;
                        }
                        if (Arrays.equals(this.handlerObject_, inputBoxResponse.handlerObject_)) {
                            if (this.unknownFieldData == null) {
                                if (inputBoxResponse.unknownFieldData == null) {
                                    return b;
                                }
                            }
                            else if (this.unknownFieldData.equals(inputBoxResponse.unknownFieldData)) {
                                return b;
                            }
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public byte[] getHandlerObject() {
            return this.handlerObject_;
        }
        
        public String getResponse() {
            return this.response_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeStringSize(1, this.response_);
            }
            int n2 = n;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n2 = n + CodedOutputByteBufferNano.computeBytesSize(2, this.handlerObject_);
            }
            return this.cachedSize = n2 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public boolean hasHandlerObject() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        public boolean hasResponse() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        @Override
        public int hashCode() {
            final int n = 0;
            int hashCode;
            if (this.response_ == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.response_.hashCode();
            }
            hashCode += 527;
            int n2;
            if (this.handlerObject_ == null) {
                n2 = hashCode * 31;
            }
            else {
                int n3 = 0;
                while (true) {
                    n2 = hashCode;
                    if (n3 >= this.handlerObject_.length) {
                        break;
                    }
                    hashCode = hashCode * 31 + this.handlerObject_[n3];
                    ++n3;
                }
            }
            int hashCode2;
            if (this.unknownFieldData == null) {
                hashCode2 = n;
            }
            else {
                hashCode2 = this.unknownFieldData.hashCode();
            }
            return n2 * 31 + hashCode2;
        }
        
        @Override
        public InputBoxResponse mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0070:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0070;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0070;
                    }
                    case 10: {
                        this.response_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 18: {
                        this.handlerObject_ = codedInputByteBufferNano.readBytes();
                        this.bitField0_ |= 0x2;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public InputBoxResponse setHandlerObject(final byte[] handlerObject_) {
            if (handlerObject_ == null) {
                throw new NullPointerException();
            }
            this.handlerObject_ = handlerObject_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        public InputBoxResponse setResponse(final String response_) {
            if (response_ == null) {
                throw new NullPointerException();
            }
            this.response_ = response_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeString(1, this.response_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeBytes(2, this.handlerObject_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class LocaleInfo extends ExtendableMessageNano
    {
        public static final LocaleInfo[] EMPTY_ARRAY;
        private int bitField0_;
        private String networkBasedCountryIso_;
        private String simBasedCountryIso_;
        
        static {
            EMPTY_ARRAY = new LocaleInfo[0];
        }
        
        public LocaleInfo() {
            this.networkBasedCountryIso_ = "";
            this.simBasedCountryIso_ = "";
        }
        
        public static LocaleInfo parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new LocaleInfo().mergeFrom(codedInputByteBufferNano);
        }
        
        public static LocaleInfo parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new LocaleInfo(), array);
        }
        
        public LocaleInfo clearNetworkBasedCountryIso() {
            this.networkBasedCountryIso_ = "";
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        public LocaleInfo clearSimBasedCountryIso() {
            this.simBasedCountryIso_ = "";
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof LocaleInfo)) {
                    b = false;
                }
                else {
                    final LocaleInfo localeInfo = (LocaleInfo)o;
                    Label_0068: {
                        if (this.networkBasedCountryIso_ == null) {
                            if (localeInfo.networkBasedCountryIso_ != null) {
                                break Label_0068;
                            }
                        }
                        else if (!this.networkBasedCountryIso_.equals(localeInfo.networkBasedCountryIso_)) {
                            break Label_0068;
                        }
                        if (this.simBasedCountryIso_ == null) {
                            if (localeInfo.simBasedCountryIso_ != null) {
                                break Label_0068;
                            }
                        }
                        else if (!this.simBasedCountryIso_.equals(localeInfo.simBasedCountryIso_)) {
                            break Label_0068;
                        }
                        if (this.unknownFieldData == null) {
                            if (localeInfo.unknownFieldData == null) {
                                return b;
                            }
                        }
                        else if (this.unknownFieldData.equals(localeInfo.unknownFieldData)) {
                            return b;
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public String getNetworkBasedCountryIso() {
            return this.networkBasedCountryIso_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeStringSize(1, this.networkBasedCountryIso_);
            }
            int n2 = n;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n2 = n + CodedOutputByteBufferNano.computeStringSize(2, this.simBasedCountryIso_);
            }
            return this.cachedSize = n2 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public String getSimBasedCountryIso() {
            return this.simBasedCountryIso_;
        }
        
        public boolean hasNetworkBasedCountryIso() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        public boolean hasSimBasedCountryIso() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        @Override
        public int hashCode() {
            int hashCode = 0;
            int hashCode2;
            if (this.networkBasedCountryIso_ == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = this.networkBasedCountryIso_.hashCode();
            }
            int hashCode3;
            if (this.simBasedCountryIso_ == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = this.simBasedCountryIso_.hashCode();
            }
            if (this.unknownFieldData != null) {
                hashCode = this.unknownFieldData.hashCode();
            }
            return ((hashCode2 + 527) * 31 + hashCode3) * 31 + hashCode;
        }
        
        @Override
        public LocaleInfo mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0070:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0070;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0070;
                    }
                    case 10: {
                        this.networkBasedCountryIso_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 18: {
                        this.simBasedCountryIso_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x2;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public LocaleInfo setNetworkBasedCountryIso(final String networkBasedCountryIso_) {
            if (networkBasedCountryIso_ == null) {
                throw new NullPointerException();
            }
            this.networkBasedCountryIso_ = networkBasedCountryIso_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        public LocaleInfo setSimBasedCountryIso(final String simBasedCountryIso_) {
            if (simBasedCountryIso_ == null) {
                throw new NullPointerException();
            }
            this.simBasedCountryIso_ = simBasedCountryIso_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeString(1, this.networkBasedCountryIso_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeString(2, this.simBasedCountryIso_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class Location extends ExtendableMessageNano
    {
        public static final Location[] EMPTY_ARRAY;
        private float accuracy_;
        private double altitude_;
        private float bearing_;
        private int bitField0_;
        private double latitude_;
        private String levelId_;
        private int levelNumberE3_;
        private double longitude_;
        private int satellitesUsedInFix_;
        private float speed_;
        private long time_;
        private int visibleSatellites_;
        
        static {
            EMPTY_ARRAY = new Location[0];
        }
        
        public Location() {
            this.latitude_ = 0.0;
            this.longitude_ = 0.0;
            this.accuracy_ = 0.0f;
            this.altitude_ = 0.0;
            this.bearing_ = 0.0f;
            this.speed_ = 0.0f;
            this.time_ = 0L;
            this.satellitesUsedInFix_ = 0;
            this.visibleSatellites_ = 0;
            this.levelId_ = "";
            this.levelNumberE3_ = 0;
        }
        
        public static Location parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new Location().mergeFrom(codedInputByteBufferNano);
        }
        
        public static Location parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new Location(), array);
        }
        
        public Location clearAccuracy() {
            this.accuracy_ = 0.0f;
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }
        
        public Location clearAltitude() {
            this.altitude_ = 0.0;
            this.bitField0_ &= 0xFFFFFFF7;
            return this;
        }
        
        public Location clearBearing() {
            this.bearing_ = 0.0f;
            this.bitField0_ &= 0xFFFFFFEF;
            return this;
        }
        
        public Location clearLatitude() {
            this.latitude_ = 0.0;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        public Location clearLevelId() {
            this.levelId_ = "";
            this.bitField0_ &= 0xFFFFFDFF;
            return this;
        }
        
        public Location clearLevelNumberE3() {
            this.levelNumberE3_ = 0;
            this.bitField0_ &= 0xFFFFFBFF;
            return this;
        }
        
        public Location clearLongitude() {
            this.longitude_ = 0.0;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        public Location clearSatellitesUsedInFix() {
            this.satellitesUsedInFix_ = 0;
            this.bitField0_ &= 0xFFFFFF7F;
            return this;
        }
        
        public Location clearSpeed() {
            this.speed_ = 0.0f;
            this.bitField0_ &= 0xFFFFFFDF;
            return this;
        }
        
        public Location clearTime() {
            this.time_ = 0L;
            this.bitField0_ &= 0xFFFFFFBF;
            return this;
        }
        
        public Location clearVisibleSatellites() {
            this.visibleSatellites_ = 0;
            this.bitField0_ &= 0xFFFFFEFF;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof Location)) {
                    b = false;
                }
                else {
                    final Location location = (Location)o;
                    Label_0171: {
                        if (this.latitude_ == location.latitude_ && this.longitude_ == location.longitude_ && this.accuracy_ == location.accuracy_ && this.altitude_ == location.altitude_ && this.bearing_ == location.bearing_ && this.speed_ == location.speed_ && this.time_ == location.time_ && this.satellitesUsedInFix_ == location.satellitesUsedInFix_ && this.visibleSatellites_ == location.visibleSatellites_) {
                            if (this.levelId_ == null) {
                                if (location.levelId_ != null) {
                                    break Label_0171;
                                }
                            }
                            else if (!this.levelId_.equals(location.levelId_)) {
                                break Label_0171;
                            }
                            if (this.levelNumberE3_ == location.levelNumberE3_) {
                                if (this.unknownFieldData == null) {
                                    if (location.unknownFieldData == null) {
                                        return b;
                                    }
                                }
                                else if (this.unknownFieldData.equals(location.unknownFieldData)) {
                                    return b;
                                }
                            }
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public float getAccuracy() {
            return this.accuracy_;
        }
        
        public double getAltitude() {
            return this.altitude_;
        }
        
        public float getBearing() {
            return this.bearing_;
        }
        
        public double getLatitude() {
            return this.latitude_;
        }
        
        public String getLevelId() {
            return this.levelId_;
        }
        
        public int getLevelNumberE3() {
            return this.levelNumberE3_;
        }
        
        public double getLongitude() {
            return this.longitude_;
        }
        
        public int getSatellitesUsedInFix() {
            return this.satellitesUsedInFix_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeDoubleSize(1, this.latitude_);
            }
            int n2 = n;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n2 = n + CodedOutputByteBufferNano.computeDoubleSize(2, this.longitude_);
            }
            int n3 = n2;
            if ((this.bitField0_ & 0x4) != 0x0) {
                n3 = n2 + CodedOutputByteBufferNano.computeFloatSize(3, this.accuracy_);
            }
            int n4 = n3;
            if ((this.bitField0_ & 0x8) != 0x0) {
                n4 = n3 + CodedOutputByteBufferNano.computeDoubleSize(4, this.altitude_);
            }
            int n5 = n4;
            if ((this.bitField0_ & 0x10) != 0x0) {
                n5 = n4 + CodedOutputByteBufferNano.computeFloatSize(5, this.bearing_);
            }
            int n6 = n5;
            if ((this.bitField0_ & 0x20) != 0x0) {
                n6 = n5 + CodedOutputByteBufferNano.computeFloatSize(6, this.speed_);
            }
            int n7 = n6;
            if ((this.bitField0_ & 0x40) != 0x0) {
                n7 = n6 + CodedOutputByteBufferNano.computeUInt64Size(7, this.time_);
            }
            int n8 = n7;
            if ((this.bitField0_ & 0x80) != 0x0) {
                n8 = n7 + CodedOutputByteBufferNano.computeInt32Size(8, this.satellitesUsedInFix_);
            }
            int n9 = n8;
            if ((this.bitField0_ & 0x100) != 0x0) {
                n9 = n8 + CodedOutputByteBufferNano.computeInt32Size(9, this.visibleSatellites_);
            }
            int n10 = n9;
            if ((this.bitField0_ & 0x200) != 0x0) {
                n10 = n9 + CodedOutputByteBufferNano.computeStringSize(10, this.levelId_);
            }
            int n11 = n10;
            if ((this.bitField0_ & 0x400) != 0x0) {
                n11 = n10 + CodedOutputByteBufferNano.computeInt32Size(11, this.levelNumberE3_);
            }
            return this.cachedSize = n11 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public float getSpeed() {
            return this.speed_;
        }
        
        public long getTime() {
            return this.time_;
        }
        
        public int getVisibleSatellites() {
            return this.visibleSatellites_;
        }
        
        public boolean hasAccuracy() {
            return (this.bitField0_ & 0x4) != 0x0;
        }
        
        public boolean hasAltitude() {
            return (this.bitField0_ & 0x8) != 0x0;
        }
        
        public boolean hasBearing() {
            return (this.bitField0_ & 0x10) != 0x0;
        }
        
        public boolean hasLatitude() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        public boolean hasLevelId() {
            return (this.bitField0_ & 0x200) != 0x0;
        }
        
        public boolean hasLevelNumberE3() {
            return (this.bitField0_ & 0x400) != 0x0;
        }
        
        public boolean hasLongitude() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        public boolean hasSatellitesUsedInFix() {
            return (this.bitField0_ & 0x80) != 0x0;
        }
        
        public boolean hasSpeed() {
            return (this.bitField0_ & 0x20) != 0x0;
        }
        
        public boolean hasTime() {
            return (this.bitField0_ & 0x40) != 0x0;
        }
        
        public boolean hasVisibleSatellites() {
            return (this.bitField0_ & 0x100) != 0x0;
        }
        
        @Override
        public int hashCode() {
            int hashCode = 0;
            final int n = (int)(Double.doubleToLongBits(this.latitude_) ^ Double.doubleToLongBits(this.latitude_) >>> 32);
            final int n2 = (int)(Double.doubleToLongBits(this.longitude_) ^ Double.doubleToLongBits(this.longitude_) >>> 32);
            final int floatToIntBits = Float.floatToIntBits(this.accuracy_);
            final int n3 = (int)(Double.doubleToLongBits(this.altitude_) ^ Double.doubleToLongBits(this.altitude_) >>> 32);
            final int floatToIntBits2 = Float.floatToIntBits(this.bearing_);
            final int floatToIntBits3 = Float.floatToIntBits(this.speed_);
            final int n4 = (int)(this.time_ ^ this.time_ >>> 32);
            final int satellitesUsedInFix_ = this.satellitesUsedInFix_;
            final int visibleSatellites_ = this.visibleSatellites_;
            int hashCode2;
            if (this.levelId_ == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = this.levelId_.hashCode();
            }
            final int levelNumberE3_ = this.levelNumberE3_;
            if (this.unknownFieldData != null) {
                hashCode = this.unknownFieldData.hashCode();
            }
            return (((((((((((n + 527) * 31 + n2) * 31 + floatToIntBits) * 31 + n3) * 31 + floatToIntBits2) * 31 + floatToIntBits3) * 31 + n4) * 31 + satellitesUsedInFix_) * 31 + visibleSatellites_) * 31 + hashCode2) * 31 + levelNumberE3_) * 31 + hashCode;
        }
        
        @Override
        public Location mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0142:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0142;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0142;
                    }
                    case 9: {
                        this.latitude_ = codedInputByteBufferNano.readDouble();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 17: {
                        this.longitude_ = codedInputByteBufferNano.readDouble();
                        this.bitField0_ |= 0x2;
                        continue;
                    }
                    case 29: {
                        this.accuracy_ = codedInputByteBufferNano.readFloat();
                        this.bitField0_ |= 0x4;
                        continue;
                    }
                    case 33: {
                        this.altitude_ = codedInputByteBufferNano.readDouble();
                        this.bitField0_ |= 0x8;
                        continue;
                    }
                    case 45: {
                        this.bearing_ = codedInputByteBufferNano.readFloat();
                        this.bitField0_ |= 0x10;
                        continue;
                    }
                    case 53: {
                        this.speed_ = codedInputByteBufferNano.readFloat();
                        this.bitField0_ |= 0x20;
                        continue;
                    }
                    case 56: {
                        this.time_ = codedInputByteBufferNano.readUInt64();
                        this.bitField0_ |= 0x40;
                        continue;
                    }
                    case 64: {
                        this.satellitesUsedInFix_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x80;
                        continue;
                    }
                    case 72: {
                        this.visibleSatellites_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x100;
                        continue;
                    }
                    case 82: {
                        this.levelId_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x200;
                        continue;
                    }
                    case 88: {
                        this.levelNumberE3_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x400;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public Location setAccuracy(final float accuracy_) {
            this.accuracy_ = accuracy_;
            this.bitField0_ |= 0x4;
            return this;
        }
        
        public Location setAltitude(final double altitude_) {
            this.altitude_ = altitude_;
            this.bitField0_ |= 0x8;
            return this;
        }
        
        public Location setBearing(final float bearing_) {
            this.bearing_ = bearing_;
            this.bitField0_ |= 0x10;
            return this;
        }
        
        public Location setLatitude(final double latitude_) {
            this.latitude_ = latitude_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        public Location setLevelId(final String levelId_) {
            if (levelId_ == null) {
                throw new NullPointerException();
            }
            this.levelId_ = levelId_;
            this.bitField0_ |= 0x200;
            return this;
        }
        
        public Location setLevelNumberE3(final int levelNumberE3_) {
            this.levelNumberE3_ = levelNumberE3_;
            this.bitField0_ |= 0x400;
            return this;
        }
        
        public Location setLongitude(final double longitude_) {
            this.longitude_ = longitude_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        public Location setSatellitesUsedInFix(final int satellitesUsedInFix_) {
            this.satellitesUsedInFix_ = satellitesUsedInFix_;
            this.bitField0_ |= 0x80;
            return this;
        }
        
        public Location setSpeed(final float speed_) {
            this.speed_ = speed_;
            this.bitField0_ |= 0x20;
            return this;
        }
        
        public Location setTime(final long time_) {
            this.time_ = time_;
            this.bitField0_ |= 0x40;
            return this;
        }
        
        public Location setVisibleSatellites(final int visibleSatellites_) {
            this.visibleSatellites_ = visibleSatellites_;
            this.bitField0_ |= 0x100;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeDouble(1, this.latitude_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeDouble(2, this.longitude_);
            }
            if ((this.bitField0_ & 0x4) != 0x0) {
                codedOutputByteBufferNano.writeFloat(3, this.accuracy_);
            }
            if ((this.bitField0_ & 0x8) != 0x0) {
                codedOutputByteBufferNano.writeDouble(4, this.altitude_);
            }
            if ((this.bitField0_ & 0x10) != 0x0) {
                codedOutputByteBufferNano.writeFloat(5, this.bearing_);
            }
            if ((this.bitField0_ & 0x20) != 0x0) {
                codedOutputByteBufferNano.writeFloat(6, this.speed_);
            }
            if ((this.bitField0_ & 0x40) != 0x0) {
                codedOutputByteBufferNano.writeUInt64(7, this.time_);
            }
            if ((this.bitField0_ & 0x80) != 0x0) {
                codedOutputByteBufferNano.writeInt32(8, this.satellitesUsedInFix_);
            }
            if ((this.bitField0_ & 0x100) != 0x0) {
                codedOutputByteBufferNano.writeInt32(9, this.visibleSatellites_);
            }
            if ((this.bitField0_ & 0x200) != 0x0) {
                codedOutputByteBufferNano.writeString(10, this.levelId_);
            }
            if ((this.bitField0_ & 0x400) != 0x0) {
                codedOutputByteBufferNano.writeInt32(11, this.levelNumberE3_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class LocationMessage extends ExtendableMessageNano
    {
        public static final LocationMessage[] EMPTY_ARRAY;
        private int bitField0_;
        private Location location_;
        public String provider;
        private String receiver_;
        private int status_;
        public int type;
        
        static {
            EMPTY_ARRAY = new LocationMessage[0];
        }
        
        public LocationMessage() {
            this.type = 0;
            this.provider = "";
            this.status_ = 0;
            this.receiver_ = "";
        }
        
        public static LocationMessage parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new LocationMessage().mergeFrom(codedInputByteBufferNano);
        }
        
        public static LocationMessage parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new LocationMessage(), array);
        }
        
        public LocationMessage clearLocation() {
            this.location_ = null;
            return this;
        }
        
        public LocationMessage clearReceiver() {
            this.receiver_ = "";
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        public LocationMessage clearStatus() {
            this.status_ = 0;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof LocationMessage)) {
                    b = false;
                }
                else {
                    final LocationMessage locationMessage = (LocationMessage)o;
                    Label_0104: {
                        if (this.type == locationMessage.type) {
                            if (this.provider == null) {
                                if (locationMessage.provider != null) {
                                    break Label_0104;
                                }
                            }
                            else if (!this.provider.equals(locationMessage.provider)) {
                                break Label_0104;
                            }
                            if (this.location_ == null) {
                                if (locationMessage.location_ != null) {
                                    break Label_0104;
                                }
                            }
                            else if (!this.location_.equals(locationMessage.location_)) {
                                break Label_0104;
                            }
                            if (this.status_ == locationMessage.status_) {
                                if (this.receiver_ == null) {
                                    if (locationMessage.receiver_ != null) {
                                        break Label_0104;
                                    }
                                }
                                else if (!this.receiver_.equals(locationMessage.receiver_)) {
                                    break Label_0104;
                                }
                                if (this.unknownFieldData == null) {
                                    if (locationMessage.unknownFieldData == null) {
                                        return b;
                                    }
                                }
                                else if (this.unknownFieldData.equals(locationMessage.unknownFieldData)) {
                                    return b;
                                }
                            }
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public Location getLocation() {
            return this.location_;
        }
        
        public String getReceiver() {
            return this.receiver_;
        }
        
        @Override
        public int getSerializedSize() {
            int n2;
            final int n = n2 = 0 + CodedOutputByteBufferNano.computeInt32Size(1, this.type) + CodedOutputByteBufferNano.computeStringSize(2, this.provider);
            if (this.location_ != null) {
                n2 = n + CodedOutputByteBufferNano.computeMessageSize(3, this.location_);
            }
            int n3 = n2;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n3 = n2 + CodedOutputByteBufferNano.computeInt32Size(4, this.status_);
            }
            int n4 = n3;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n4 = n3 + CodedOutputByteBufferNano.computeStringSize(5, this.receiver_);
            }
            return this.cachedSize = n4 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public int getStatus() {
            return this.status_;
        }
        
        public boolean hasLocation() {
            return this.location_ != null;
        }
        
        public boolean hasReceiver() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        public boolean hasStatus() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        @Override
        public int hashCode() {
            int hashCode = 0;
            final int type = this.type;
            int hashCode2;
            if (this.provider == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = this.provider.hashCode();
            }
            int hashCode3;
            if (this.location_ == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = this.location_.hashCode();
            }
            final int status_ = this.status_;
            int hashCode4;
            if (this.receiver_ == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = this.receiver_.hashCode();
            }
            if (this.unknownFieldData != null) {
                hashCode = this.unknownFieldData.hashCode();
            }
            return (((((type + 527) * 31 + hashCode2) * 31 + hashCode3) * 31 + status_) * 31 + hashCode4) * 31 + hashCode;
        }
        
        @Override
        public LocationMessage mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0094:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0094;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0094;
                    }
                    case 8: {
                        final int int32 = codedInputByteBufferNano.readInt32();
                        if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                            this.type = int32;
                            continue;
                        }
                        this.type = 0;
                        continue;
                    }
                    case 18: {
                        this.provider = codedInputByteBufferNano.readString();
                        continue;
                    }
                    case 26: {
                        if (this.location_ == null) {
                            this.location_ = new Location();
                        }
                        codedInputByteBufferNano.readMessage(this.location_);
                        continue;
                    }
                    case 32: {
                        this.status_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 42: {
                        this.receiver_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x2;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public LocationMessage setLocation(final Location location_) {
            if (location_ == null) {
                throw new NullPointerException();
            }
            this.location_ = location_;
            return this;
        }
        
        public LocationMessage setReceiver(final String receiver_) {
            if (receiver_ == null) {
                throw new NullPointerException();
            }
            this.receiver_ = receiver_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        public LocationMessage setStatus(final int status_) {
            this.status_ = status_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt32(1, this.type);
            codedOutputByteBufferNano.writeString(2, this.provider);
            if (this.location_ != null) {
                codedOutputByteBufferNano.writeMessage(3, this.location_);
            }
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeInt32(4, this.status_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeString(5, this.receiver_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
        
        public interface MessageType
        {
            public static final int LOCATION_CHANGED = 0;
            public static final int PROVIDER_DISABLED = 1;
            public static final int PROVIDER_ENABLED = 2;
            public static final int STATUS_CHANGED = 3;
        }
    }
    
    public static final class LocationRequest extends ExtendableMessageNano
    {
        public static final LocationRequest[] EMPTY_ARRAY;
        private int bitField0_;
        private long fastestInterval_;
        private float minDistance_;
        private long minTime_;
        private int priority_;
        public String provider;
        private boolean sendLastKnownLocation_;
        public int type;
        
        static {
            EMPTY_ARRAY = new LocationRequest[0];
        }
        
        public LocationRequest() {
            this.type = 0;
            this.provider = "";
            this.minTime_ = 0L;
            this.minDistance_ = 0.0f;
            this.sendLastKnownLocation_ = false;
            this.priority_ = 0;
            this.fastestInterval_ = 0L;
        }
        
        public static LocationRequest parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new LocationRequest().mergeFrom(codedInputByteBufferNano);
        }
        
        public static LocationRequest parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new LocationRequest(), array);
        }
        
        public LocationRequest clearFastestInterval() {
            this.fastestInterval_ = 0L;
            this.bitField0_ &= 0xFFFFFFEF;
            return this;
        }
        
        public LocationRequest clearMinDistance() {
            this.minDistance_ = 0.0f;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        public LocationRequest clearMinTime() {
            this.minTime_ = 0L;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        public LocationRequest clearPriority() {
            this.priority_ = 0;
            this.bitField0_ &= 0xFFFFFFF7;
            return this;
        }
        
        public LocationRequest clearSendLastKnownLocation() {
            this.sendLastKnownLocation_ = false;
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof LocationRequest)) {
                    b = false;
                }
                else {
                    final LocationRequest locationRequest = (LocationRequest)o;
                    Label_0123: {
                        if (this.type == locationRequest.type) {
                            if (this.provider == null) {
                                if (locationRequest.provider != null) {
                                    break Label_0123;
                                }
                            }
                            else if (!this.provider.equals(locationRequest.provider)) {
                                break Label_0123;
                            }
                            if (this.minTime_ == locationRequest.minTime_ && this.minDistance_ == locationRequest.minDistance_ && this.sendLastKnownLocation_ == locationRequest.sendLastKnownLocation_ && this.priority_ == locationRequest.priority_ && this.fastestInterval_ == locationRequest.fastestInterval_) {
                                if (this.unknownFieldData == null) {
                                    if (locationRequest.unknownFieldData == null) {
                                        return b;
                                    }
                                }
                                else if (this.unknownFieldData.equals(locationRequest.unknownFieldData)) {
                                    return b;
                                }
                            }
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public long getFastestInterval() {
            return this.fastestInterval_;
        }
        
        public float getMinDistance() {
            return this.minDistance_;
        }
        
        public long getMinTime() {
            return this.minTime_;
        }
        
        public int getPriority() {
            return this.priority_;
        }
        
        public boolean getSendLastKnownLocation() {
            return this.sendLastKnownLocation_;
        }
        
        @Override
        public int getSerializedSize() {
            int n2;
            final int n = n2 = 0 + CodedOutputByteBufferNano.computeInt32Size(1, this.type) + CodedOutputByteBufferNano.computeStringSize(2, this.provider);
            if ((this.bitField0_ & 0x1) != 0x0) {
                n2 = n + CodedOutputByteBufferNano.computeInt64Size(3, this.minTime_);
            }
            int n3 = n2;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n3 = n2 + CodedOutputByteBufferNano.computeFloatSize(4, this.minDistance_);
            }
            int n4 = n3;
            if ((this.bitField0_ & 0x4) != 0x0) {
                n4 = n3 + CodedOutputByteBufferNano.computeBoolSize(5, this.sendLastKnownLocation_);
            }
            int n5 = n4;
            if ((this.bitField0_ & 0x8) != 0x0) {
                n5 = n4 + CodedOutputByteBufferNano.computeInt32Size(6, this.priority_);
            }
            int n6 = n5;
            if ((this.bitField0_ & 0x10) != 0x0) {
                n6 = n5 + CodedOutputByteBufferNano.computeInt64Size(7, this.fastestInterval_);
            }
            return this.cachedSize = n6 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public boolean hasFastestInterval() {
            return (this.bitField0_ & 0x10) != 0x0;
        }
        
        public boolean hasMinDistance() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        public boolean hasMinTime() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        public boolean hasPriority() {
            return (this.bitField0_ & 0x8) != 0x0;
        }
        
        public boolean hasSendLastKnownLocation() {
            return (this.bitField0_ & 0x4) != 0x0;
        }
        
        @Override
        public int hashCode() {
            int hashCode = 0;
            final int type = this.type;
            int hashCode2;
            if (this.provider == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = this.provider.hashCode();
            }
            final int n = (int)(this.minTime_ ^ this.minTime_ >>> 32);
            final int floatToIntBits = Float.floatToIntBits(this.minDistance_);
            int n2;
            if (this.sendLastKnownLocation_) {
                n2 = 1;
            }
            else {
                n2 = 2;
            }
            final int priority_ = this.priority_;
            final int n3 = (int)(this.fastestInterval_ ^ this.fastestInterval_ >>> 32);
            if (this.unknownFieldData != null) {
                hashCode = this.unknownFieldData.hashCode();
            }
            return (((((((type + 527) * 31 + hashCode2) * 31 + n) * 31 + floatToIntBits) * 31 + n2) * 31 + priority_) * 31 + n3) * 31 + hashCode;
        }
        
        @Override
        public LocationRequest mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0110:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0110;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0110;
                    }
                    case 8: {
                        final int int32 = codedInputByteBufferNano.readInt32();
                        if (int32 == 0 || int32 == 1) {
                            this.type = int32;
                            continue;
                        }
                        this.type = 0;
                        continue;
                    }
                    case 18: {
                        this.provider = codedInputByteBufferNano.readString();
                        continue;
                    }
                    case 24: {
                        this.minTime_ = codedInputByteBufferNano.readInt64();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 37: {
                        this.minDistance_ = codedInputByteBufferNano.readFloat();
                        this.bitField0_ |= 0x2;
                        continue;
                    }
                    case 40: {
                        this.sendLastKnownLocation_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x4;
                        continue;
                    }
                    case 48: {
                        final int int33 = codedInputByteBufferNano.readInt32();
                        if (int33 == 0 || int33 == 1 || int33 == 2) {
                            this.priority_ = int33;
                            this.bitField0_ |= 0x8;
                            continue;
                        }
                        this.priority_ = 0;
                        continue;
                    }
                    case 56: {
                        this.fastestInterval_ = codedInputByteBufferNano.readInt64();
                        this.bitField0_ |= 0x10;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public LocationRequest setFastestInterval(final long fastestInterval_) {
            this.fastestInterval_ = fastestInterval_;
            this.bitField0_ |= 0x10;
            return this;
        }
        
        public LocationRequest setMinDistance(final float minDistance_) {
            this.minDistance_ = minDistance_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        public LocationRequest setMinTime(final long minTime_) {
            this.minTime_ = minTime_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        public LocationRequest setPriority(final int priority_) {
            this.priority_ = priority_;
            this.bitField0_ |= 0x8;
            return this;
        }
        
        public LocationRequest setSendLastKnownLocation(final boolean sendLastKnownLocation_) {
            this.sendLastKnownLocation_ = sendLastKnownLocation_;
            this.bitField0_ |= 0x4;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt32(1, this.type);
            codedOutputByteBufferNano.writeString(2, this.provider);
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeInt64(3, this.minTime_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeFloat(4, this.minDistance_);
            }
            if ((this.bitField0_ & 0x4) != 0x0) {
                codedOutputByteBufferNano.writeBool(5, this.sendLastKnownLocation_);
            }
            if ((this.bitField0_ & 0x8) != 0x0) {
                codedOutputByteBufferNano.writeInt32(6, this.priority_);
            }
            if ((this.bitField0_ & 0x10) != 0x0) {
                codedOutputByteBufferNano.writeInt64(7, this.fastestInterval_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
        
        public interface Priority
        {
            public static final int PRIORITY_BALANCED_POWER_ACCURACY = 2;
            public static final int PRIORITY_HIGH_ACCURACY = 1;
            public static final int PRIORITY_UNKNOWN = 0;
        }
        
        public interface RequestType
        {
            public static final int START_LISTENING = 0;
            public static final int STOP_LISTENING = 1;
        }
    }
    
    public static final class Media extends ExtendableMessageNano
    {
        public static final Media[] EMPTY_ARRAY;
        private int bitField0_;
        private byte[] bytes_;
        private String mimeType_;
        private byte[] sha1HashCode_;
        
        static {
            EMPTY_ARRAY = new Media[0];
        }
        
        public Media() {
            this.bytes_ = WireFormatNano.EMPTY_BYTES;
            this.sha1HashCode_ = WireFormatNano.EMPTY_BYTES;
            this.mimeType_ = "";
        }
        
        public static Media parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new Media().mergeFrom(codedInputByteBufferNano);
        }
        
        public static Media parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new Media(), array);
        }
        
        public Media clearBytes() {
            this.bytes_ = WireFormatNano.EMPTY_BYTES;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        public Media clearMimeType() {
            this.mimeType_ = "";
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }
        
        public Media clearSha1HashCode() {
            this.sha1HashCode_ = WireFormatNano.EMPTY_BYTES;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof Media)) {
                    b = false;
                }
                else {
                    final Media media = (Media)o;
                    Label_0082: {
                        if (Arrays.equals(this.bytes_, media.bytes_) && Arrays.equals(this.sha1HashCode_, media.sha1HashCode_)) {
                            if (this.mimeType_ == null) {
                                if (media.mimeType_ != null) {
                                    break Label_0082;
                                }
                            }
                            else if (!this.mimeType_.equals(media.mimeType_)) {
                                break Label_0082;
                            }
                            if (this.unknownFieldData == null) {
                                if (media.unknownFieldData == null) {
                                    return b;
                                }
                            }
                            else if (this.unknownFieldData.equals(media.unknownFieldData)) {
                                return b;
                            }
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public byte[] getBytes() {
            return this.bytes_;
        }
        
        public String getMimeType() {
            return this.mimeType_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeBytesSize(1, this.bytes_);
            }
            int n2 = n;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n2 = n + CodedOutputByteBufferNano.computeBytesSize(2, this.sha1HashCode_);
            }
            int n3 = n2;
            if ((this.bitField0_ & 0x4) != 0x0) {
                n3 = n2 + CodedOutputByteBufferNano.computeStringSize(3, this.mimeType_);
            }
            return this.cachedSize = n3 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public byte[] getSha1HashCode() {
            return this.sha1HashCode_;
        }
        
        public boolean hasBytes() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        public boolean hasMimeType() {
            return (this.bitField0_ & 0x4) != 0x0;
        }
        
        public boolean hasSha1HashCode() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        @Override
        public int hashCode() {
            final int n = 0;
            int n2 = 17;
            int n3;
            if (this.bytes_ == null) {
                n3 = 17 * 31;
            }
            else {
                int n4 = 0;
                while (true) {
                    n3 = n2;
                    if (n4 >= this.bytes_.length) {
                        break;
                    }
                    n2 = n2 * 31 + this.bytes_[n4];
                    ++n4;
                }
            }
            int n5;
            if (this.sha1HashCode_ == null) {
                n5 = n3 * 31;
            }
            else {
                int n6 = 0;
                while (true) {
                    n5 = n3;
                    if (n6 >= this.sha1HashCode_.length) {
                        break;
                    }
                    n3 = n3 * 31 + this.sha1HashCode_[n6];
                    ++n6;
                }
            }
            int hashCode;
            if (this.mimeType_ == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.mimeType_.hashCode();
            }
            int hashCode2;
            if (this.unknownFieldData == null) {
                hashCode2 = n;
            }
            else {
                hashCode2 = this.unknownFieldData.hashCode();
            }
            return (n5 * 31 + hashCode) * 31 + hashCode2;
        }
        
        @Override
        public Media mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0078:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0078;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0078;
                    }
                    case 10: {
                        this.bytes_ = codedInputByteBufferNano.readBytes();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 18: {
                        this.sha1HashCode_ = codedInputByteBufferNano.readBytes();
                        this.bitField0_ |= 0x2;
                        continue;
                    }
                    case 26: {
                        this.mimeType_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x4;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public Media setBytes(final byte[] bytes_) {
            if (bytes_ == null) {
                throw new NullPointerException();
            }
            this.bytes_ = bytes_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        public Media setMimeType(final String mimeType_) {
            if (mimeType_ == null) {
                throw new NullPointerException();
            }
            this.mimeType_ = mimeType_;
            this.bitField0_ |= 0x4;
            return this;
        }
        
        public Media setSha1HashCode(final byte[] sha1HashCode_) {
            if (sha1HashCode_ == null) {
                throw new NullPointerException();
            }
            this.sha1HashCode_ = sha1HashCode_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeBytes(1, this.bytes_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeBytes(2, this.sha1HashCode_);
            }
            if ((this.bitField0_ & 0x4) != 0x0) {
                codedOutputByteBufferNano.writeString(3, this.mimeType_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class MotionEvent extends ExtendableMessageNano
    {
        public static final MotionEvent[] EMPTY_ARRAY;
        private int action_;
        private int bitField0_;
        private int buttonState_;
        private int deviceId_;
        private long downTime_;
        private int edgeFlags_;
        private long eventTime_;
        private int flags_;
        private int metaState_;
        public PointerCoords[] pointerCoords;
        private int pointerCount_;
        public PointerProperties[] pointerProperties;
        private int source_;
        private float xPrecision_;
        private float yPrecision_;
        
        static {
            EMPTY_ARRAY = new MotionEvent[0];
        }
        
        public MotionEvent() {
            this.downTime_ = 0L;
            this.eventTime_ = 0L;
            this.action_ = 0;
            this.pointerCount_ = 0;
            this.pointerProperties = PointerProperties.EMPTY_ARRAY;
            this.pointerCoords = PointerCoords.EMPTY_ARRAY;
            this.metaState_ = 0;
            this.buttonState_ = 0;
            this.xPrecision_ = 0.0f;
            this.yPrecision_ = 0.0f;
            this.deviceId_ = 0;
            this.edgeFlags_ = 0;
            this.source_ = 0;
            this.flags_ = 0;
        }
        
        public static MotionEvent parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new MotionEvent().mergeFrom(codedInputByteBufferNano);
        }
        
        public static MotionEvent parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new MotionEvent(), array);
        }
        
        public MotionEvent clearAction() {
            this.action_ = 0;
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }
        
        public MotionEvent clearButtonState() {
            this.buttonState_ = 0;
            this.bitField0_ &= 0xFFFFFFDF;
            return this;
        }
        
        public MotionEvent clearDeviceId() {
            this.deviceId_ = 0;
            this.bitField0_ &= 0xFFFFFEFF;
            return this;
        }
        
        public MotionEvent clearDownTime() {
            this.downTime_ = 0L;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        public MotionEvent clearEdgeFlags() {
            this.edgeFlags_ = 0;
            this.bitField0_ &= 0xFFFFFDFF;
            return this;
        }
        
        public MotionEvent clearEventTime() {
            this.eventTime_ = 0L;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        public MotionEvent clearFlags() {
            this.flags_ = 0;
            this.bitField0_ &= 0xFFFFF7FF;
            return this;
        }
        
        public MotionEvent clearMetaState() {
            this.metaState_ = 0;
            this.bitField0_ &= 0xFFFFFFEF;
            return this;
        }
        
        public MotionEvent clearPointerCount() {
            this.pointerCount_ = 0;
            this.bitField0_ &= 0xFFFFFFF7;
            return this;
        }
        
        public MotionEvent clearSource() {
            this.source_ = 0;
            this.bitField0_ &= 0xFFFFFBFF;
            return this;
        }
        
        public MotionEvent clearXPrecision() {
            this.xPrecision_ = 0.0f;
            this.bitField0_ &= 0xFFFFFFBF;
            return this;
        }
        
        public MotionEvent clearYPrecision() {
            this.yPrecision_ = 0.0f;
            this.bitField0_ &= 0xFFFFFF7F;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof MotionEvent)) {
                    b = false;
                }
                else {
                    final MotionEvent motionEvent = (MotionEvent)o;
                    if (this.downTime_ == motionEvent.downTime_ && this.eventTime_ == motionEvent.eventTime_ && this.action_ == motionEvent.action_ && this.pointerCount_ == motionEvent.pointerCount_ && Arrays.equals(this.pointerProperties, motionEvent.pointerProperties) && Arrays.equals(this.pointerCoords, motionEvent.pointerCoords) && this.metaState_ == motionEvent.metaState_ && this.buttonState_ == motionEvent.buttonState_ && this.xPrecision_ == motionEvent.xPrecision_ && this.yPrecision_ == motionEvent.yPrecision_ && this.deviceId_ == motionEvent.deviceId_ && this.edgeFlags_ == motionEvent.edgeFlags_ && this.source_ == motionEvent.source_ && this.flags_ == motionEvent.flags_) {
                        if (this.unknownFieldData == null) {
                            if (motionEvent.unknownFieldData == null) {
                                return b;
                            }
                        }
                        else if (this.unknownFieldData.equals(motionEvent.unknownFieldData)) {
                            return b;
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public int getAction() {
            return this.action_;
        }
        
        public int getButtonState() {
            return this.buttonState_;
        }
        
        public int getDeviceId() {
            return this.deviceId_;
        }
        
        public long getDownTime() {
            return this.downTime_;
        }
        
        public int getEdgeFlags() {
            return this.edgeFlags_;
        }
        
        public long getEventTime() {
            return this.eventTime_;
        }
        
        public int getFlags() {
            return this.flags_;
        }
        
        public int getMetaState() {
            return this.metaState_;
        }
        
        public int getPointerCount() {
            return this.pointerCount_;
        }
        
        @Override
        public int getSerializedSize() {
            final int n = 0;
            int n2 = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n2 = 0 + CodedOutputByteBufferNano.computeUInt64Size(1, this.downTime_);
            }
            int n3 = n2;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n3 = n2 + CodedOutputByteBufferNano.computeUInt64Size(2, this.eventTime_);
            }
            int n4 = n3;
            if ((this.bitField0_ & 0x4) != 0x0) {
                n4 = n3 + CodedOutputByteBufferNano.computeInt32Size(3, this.action_);
            }
            int n5 = n4;
            if ((this.bitField0_ & 0x8) != 0x0) {
                n5 = n4 + CodedOutputByteBufferNano.computeInt32Size(4, this.pointerCount_);
            }
            int n6 = n5;
            if (this.pointerProperties != null) {
                final PointerProperties[] pointerProperties = this.pointerProperties;
                final int length = pointerProperties.length;
                int n7 = 0;
                while (true) {
                    n6 = n5;
                    if (n7 >= length) {
                        break;
                    }
                    final PointerProperties pointerProperties2 = pointerProperties[n7];
                    int n8 = n5;
                    if (pointerProperties2 != null) {
                        n8 = n5 + CodedOutputByteBufferNano.computeMessageSize(5, pointerProperties2);
                    }
                    ++n7;
                    n5 = n8;
                }
            }
            int n9 = n6;
            if (this.pointerCoords != null) {
                final PointerCoords[] pointerCoords = this.pointerCoords;
                final int length2 = pointerCoords.length;
                int n10 = n;
                while (true) {
                    n9 = n6;
                    if (n10 >= length2) {
                        break;
                    }
                    final PointerCoords pointerCoords2 = pointerCoords[n10];
                    int n11 = n6;
                    if (pointerCoords2 != null) {
                        n11 = n6 + CodedOutputByteBufferNano.computeMessageSize(6, pointerCoords2);
                    }
                    ++n10;
                    n6 = n11;
                }
            }
            int n12 = n9;
            if ((this.bitField0_ & 0x10) != 0x0) {
                n12 = n9 + CodedOutputByteBufferNano.computeInt32Size(7, this.metaState_);
            }
            int n13 = n12;
            if ((this.bitField0_ & 0x20) != 0x0) {
                n13 = n12 + CodedOutputByteBufferNano.computeInt32Size(8, this.buttonState_);
            }
            int n14 = n13;
            if ((this.bitField0_ & 0x40) != 0x0) {
                n14 = n13 + CodedOutputByteBufferNano.computeFloatSize(9, this.xPrecision_);
            }
            int n15 = n14;
            if ((this.bitField0_ & 0x80) != 0x0) {
                n15 = n14 + CodedOutputByteBufferNano.computeFloatSize(10, this.yPrecision_);
            }
            int n16 = n15;
            if ((this.bitField0_ & 0x100) != 0x0) {
                n16 = n15 + CodedOutputByteBufferNano.computeInt32Size(11, this.deviceId_);
            }
            int n17 = n16;
            if ((this.bitField0_ & 0x200) != 0x0) {
                n17 = n16 + CodedOutputByteBufferNano.computeInt32Size(12, this.edgeFlags_);
            }
            int n18 = n17;
            if ((this.bitField0_ & 0x400) != 0x0) {
                n18 = n17 + CodedOutputByteBufferNano.computeInt32Size(13, this.source_);
            }
            int n19 = n18;
            if ((this.bitField0_ & 0x800) != 0x0) {
                n19 = n18 + CodedOutputByteBufferNano.computeInt32Size(14, this.flags_);
            }
            return this.cachedSize = n19 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public int getSource() {
            return this.source_;
        }
        
        public float getXPrecision() {
            return this.xPrecision_;
        }
        
        public float getYPrecision() {
            return this.yPrecision_;
        }
        
        public boolean hasAction() {
            return (this.bitField0_ & 0x4) != 0x0;
        }
        
        public boolean hasButtonState() {
            return (this.bitField0_ & 0x20) != 0x0;
        }
        
        public boolean hasDeviceId() {
            return (this.bitField0_ & 0x100) != 0x0;
        }
        
        public boolean hasDownTime() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        public boolean hasEdgeFlags() {
            return (this.bitField0_ & 0x200) != 0x0;
        }
        
        public boolean hasEventTime() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        public boolean hasFlags() {
            return (this.bitField0_ & 0x800) != 0x0;
        }
        
        public boolean hasMetaState() {
            return (this.bitField0_ & 0x10) != 0x0;
        }
        
        public boolean hasPointerCount() {
            return (this.bitField0_ & 0x8) != 0x0;
        }
        
        public boolean hasSource() {
            return (this.bitField0_ & 0x400) != 0x0;
        }
        
        public boolean hasXPrecision() {
            return (this.bitField0_ & 0x40) != 0x0;
        }
        
        public boolean hasYPrecision() {
            return (this.bitField0_ & 0x80) != 0x0;
        }
        
        @Override
        public int hashCode() {
            final int n = 0;
            int n2 = ((((int)(this.downTime_ ^ this.downTime_ >>> 32) + 527) * 31 + (int)(this.eventTime_ ^ this.eventTime_ >>> 32)) * 31 + this.action_) * 31 + this.pointerCount_;
            int n3;
            if (this.pointerProperties == null) {
                n3 = n2 * 31;
            }
            else {
                int n4 = 0;
                while (true) {
                    n3 = n2;
                    if (n4 >= this.pointerProperties.length) {
                        break;
                    }
                    int hashCode;
                    if (this.pointerProperties[n4] == null) {
                        hashCode = 0;
                    }
                    else {
                        hashCode = this.pointerProperties[n4].hashCode();
                    }
                    n2 = n2 * 31 + hashCode;
                    ++n4;
                }
            }
            int n5;
            if (this.pointerCoords == null) {
                n5 = n3 * 31;
            }
            else {
                int n6 = 0;
                int n7 = n3;
                while (true) {
                    n5 = n7;
                    if (n6 >= this.pointerCoords.length) {
                        break;
                    }
                    int hashCode2;
                    if (this.pointerCoords[n6] == null) {
                        hashCode2 = 0;
                    }
                    else {
                        hashCode2 = this.pointerCoords[n6].hashCode();
                    }
                    n7 = n7 * 31 + hashCode2;
                    ++n6;
                }
            }
            final int metaState_ = this.metaState_;
            final int buttonState_ = this.buttonState_;
            final int floatToIntBits = Float.floatToIntBits(this.xPrecision_);
            final int floatToIntBits2 = Float.floatToIntBits(this.yPrecision_);
            final int deviceId_ = this.deviceId_;
            final int edgeFlags_ = this.edgeFlags_;
            final int source_ = this.source_;
            final int flags_ = this.flags_;
            int hashCode3;
            if (this.unknownFieldData == null) {
                hashCode3 = n;
            }
            else {
                hashCode3 = this.unknownFieldData.hashCode();
            }
            return ((((((((n5 * 31 + metaState_) * 31 + buttonState_) * 31 + floatToIntBits) * 31 + floatToIntBits2) * 31 + deviceId_) * 31 + edgeFlags_) * 31 + source_) * 31 + flags_) * 31 + hashCode3;
        }
        
        @Override
        public MotionEvent mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0166:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0166;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0166;
                    }
                    case 8: {
                        this.downTime_ = codedInputByteBufferNano.readUInt64();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 16: {
                        this.eventTime_ = codedInputByteBufferNano.readUInt64();
                        this.bitField0_ |= 0x2;
                        continue;
                    }
                    case 24: {
                        this.action_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x4;
                        continue;
                    }
                    case 32: {
                        this.pointerCount_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x8;
                        continue;
                    }
                    case 42: {
                        final int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                        int i;
                        if (this.pointerProperties == null) {
                            i = 0;
                        }
                        else {
                            i = this.pointerProperties.length;
                        }
                        final PointerProperties[] pointerProperties = new PointerProperties[i + repeatedFieldArrayLength];
                        if (this.pointerProperties != null) {
                            System.arraycopy(this.pointerProperties, 0, pointerProperties, 0, i);
                        }
                        this.pointerProperties = pointerProperties;
                        while (i < this.pointerProperties.length - 1) {
                            codedInputByteBufferNano.readMessage(this.pointerProperties[i] = new PointerProperties());
                            codedInputByteBufferNano.readTag();
                            ++i;
                        }
                        codedInputByteBufferNano.readMessage(this.pointerProperties[i] = new PointerProperties());
                        continue;
                    }
                    case 50: {
                        final int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                        int j;
                        if (this.pointerCoords == null) {
                            j = 0;
                        }
                        else {
                            j = this.pointerCoords.length;
                        }
                        final PointerCoords[] pointerCoords = new PointerCoords[j + repeatedFieldArrayLength2];
                        if (this.pointerCoords != null) {
                            System.arraycopy(this.pointerCoords, 0, pointerCoords, 0, j);
                        }
                        this.pointerCoords = pointerCoords;
                        while (j < this.pointerCoords.length - 1) {
                            codedInputByteBufferNano.readMessage(this.pointerCoords[j] = new PointerCoords());
                            codedInputByteBufferNano.readTag();
                            ++j;
                        }
                        codedInputByteBufferNano.readMessage(this.pointerCoords[j] = new PointerCoords());
                        continue;
                    }
                    case 56: {
                        this.metaState_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x10;
                        continue;
                    }
                    case 64: {
                        this.buttonState_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x20;
                        continue;
                    }
                    case 77: {
                        this.xPrecision_ = codedInputByteBufferNano.readFloat();
                        this.bitField0_ |= 0x40;
                        continue;
                    }
                    case 85: {
                        this.yPrecision_ = codedInputByteBufferNano.readFloat();
                        this.bitField0_ |= 0x80;
                        continue;
                    }
                    case 88: {
                        this.deviceId_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x100;
                        continue;
                    }
                    case 96: {
                        this.edgeFlags_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x200;
                        continue;
                    }
                    case 104: {
                        this.source_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x400;
                        continue;
                    }
                    case 112: {
                        this.flags_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x800;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public MotionEvent setAction(final int action_) {
            this.action_ = action_;
            this.bitField0_ |= 0x4;
            return this;
        }
        
        public MotionEvent setButtonState(final int buttonState_) {
            this.buttonState_ = buttonState_;
            this.bitField0_ |= 0x20;
            return this;
        }
        
        public MotionEvent setDeviceId(final int deviceId_) {
            this.deviceId_ = deviceId_;
            this.bitField0_ |= 0x100;
            return this;
        }
        
        public MotionEvent setDownTime(final long downTime_) {
            this.downTime_ = downTime_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        public MotionEvent setEdgeFlags(final int edgeFlags_) {
            this.edgeFlags_ = edgeFlags_;
            this.bitField0_ |= 0x200;
            return this;
        }
        
        public MotionEvent setEventTime(final long eventTime_) {
            this.eventTime_ = eventTime_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        public MotionEvent setFlags(final int flags_) {
            this.flags_ = flags_;
            this.bitField0_ |= 0x800;
            return this;
        }
        
        public MotionEvent setMetaState(final int metaState_) {
            this.metaState_ = metaState_;
            this.bitField0_ |= 0x10;
            return this;
        }
        
        public MotionEvent setPointerCount(final int pointerCount_) {
            this.pointerCount_ = pointerCount_;
            this.bitField0_ |= 0x8;
            return this;
        }
        
        public MotionEvent setSource(final int source_) {
            this.source_ = source_;
            this.bitField0_ |= 0x400;
            return this;
        }
        
        public MotionEvent setXPrecision(final float xPrecision_) {
            this.xPrecision_ = xPrecision_;
            this.bitField0_ |= 0x40;
            return this;
        }
        
        public MotionEvent setYPrecision(final float yPrecision_) {
            this.yPrecision_ = yPrecision_;
            this.bitField0_ |= 0x80;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            final int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeUInt64(1, this.downTime_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeUInt64(2, this.eventTime_);
            }
            if ((this.bitField0_ & 0x4) != 0x0) {
                codedOutputByteBufferNano.writeInt32(3, this.action_);
            }
            if ((this.bitField0_ & 0x8) != 0x0) {
                codedOutputByteBufferNano.writeInt32(4, this.pointerCount_);
            }
            if (this.pointerProperties != null) {
                for (final PointerProperties pointerProperties2 : this.pointerProperties) {
                    if (pointerProperties2 != null) {
                        codedOutputByteBufferNano.writeMessage(5, pointerProperties2);
                    }
                }
            }
            if (this.pointerCoords != null) {
                final PointerCoords[] pointerCoords = this.pointerCoords;
                for (int length2 = pointerCoords.length, j = n; j < length2; ++j) {
                    final PointerCoords pointerCoords2 = pointerCoords[j];
                    if (pointerCoords2 != null) {
                        codedOutputByteBufferNano.writeMessage(6, pointerCoords2);
                    }
                }
            }
            if ((this.bitField0_ & 0x10) != 0x0) {
                codedOutputByteBufferNano.writeInt32(7, this.metaState_);
            }
            if ((this.bitField0_ & 0x20) != 0x0) {
                codedOutputByteBufferNano.writeInt32(8, this.buttonState_);
            }
            if ((this.bitField0_ & 0x40) != 0x0) {
                codedOutputByteBufferNano.writeFloat(9, this.xPrecision_);
            }
            if ((this.bitField0_ & 0x80) != 0x0) {
                codedOutputByteBufferNano.writeFloat(10, this.yPrecision_);
            }
            if ((this.bitField0_ & 0x100) != 0x0) {
                codedOutputByteBufferNano.writeInt32(11, this.deviceId_);
            }
            if ((this.bitField0_ & 0x200) != 0x0) {
                codedOutputByteBufferNano.writeInt32(12, this.edgeFlags_);
            }
            if ((this.bitField0_ & 0x400) != 0x0) {
                codedOutputByteBufferNano.writeInt32(13, this.source_);
            }
            if ((this.bitField0_ & 0x800) != 0x0) {
                codedOutputByteBufferNano.writeInt32(14, this.flags_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
        
        public static final class PointerCoords extends ExtendableMessageNano
        {
            public static final PointerCoords[] EMPTY_ARRAY;
            private int bitField0_;
            private float orientation_;
            private float pressure_;
            private float size_;
            private float toolMajor_;
            private float toolMinor_;
            private float touchMajor_;
            private float touchMinor_;
            private float x_;
            private float y_;
            
            static {
                EMPTY_ARRAY = new PointerCoords[0];
            }
            
            public PointerCoords() {
                this.orientation_ = 0.0f;
                this.pressure_ = 0.0f;
                this.size_ = 0.0f;
                this.toolMajor_ = 0.0f;
                this.toolMinor_ = 0.0f;
                this.touchMajor_ = 0.0f;
                this.touchMinor_ = 0.0f;
                this.x_ = 0.0f;
                this.y_ = 0.0f;
            }
            
            public PointerCoords clearOrientation() {
                this.orientation_ = 0.0f;
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            public PointerCoords clearPressure() {
                this.pressure_ = 0.0f;
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }
            
            public PointerCoords clearSize() {
                this.size_ = 0.0f;
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }
            
            public PointerCoords clearToolMajor() {
                this.toolMajor_ = 0.0f;
                this.bitField0_ &= 0xFFFFFFF7;
                return this;
            }
            
            public PointerCoords clearToolMinor() {
                this.toolMinor_ = 0.0f;
                this.bitField0_ &= 0xFFFFFFEF;
                return this;
            }
            
            public PointerCoords clearTouchMajor() {
                this.touchMajor_ = 0.0f;
                this.bitField0_ &= 0xFFFFFFDF;
                return this;
            }
            
            public PointerCoords clearTouchMinor() {
                this.touchMinor_ = 0.0f;
                this.bitField0_ &= 0xFFFFFFBF;
                return this;
            }
            
            public PointerCoords clearX() {
                this.x_ = 0.0f;
                this.bitField0_ &= 0xFFFFFF7F;
                return this;
            }
            
            public PointerCoords clearY() {
                this.y_ = 0.0f;
                this.bitField0_ &= 0xFFFFFEFF;
                return this;
            }
            
            @Override
            public final boolean equals(final Object o) {
                boolean b = true;
                if (o != this) {
                    if (!(o instanceof PointerCoords)) {
                        b = false;
                    }
                    else {
                        final PointerCoords pointerCoords = (PointerCoords)o;
                        if (this.orientation_ == pointerCoords.orientation_ && this.pressure_ == pointerCoords.pressure_ && this.size_ == pointerCoords.size_ && this.toolMajor_ == pointerCoords.toolMajor_ && this.toolMinor_ == pointerCoords.toolMinor_ && this.touchMajor_ == pointerCoords.touchMajor_ && this.touchMinor_ == pointerCoords.touchMinor_ && this.x_ == pointerCoords.x_ && this.y_ == pointerCoords.y_) {
                            if (this.unknownFieldData == null) {
                                if (pointerCoords.unknownFieldData == null) {
                                    return b;
                                }
                            }
                            else if (this.unknownFieldData.equals(pointerCoords.unknownFieldData)) {
                                return b;
                            }
                        }
                        b = false;
                    }
                }
                return b;
            }
            
            public float getOrientation() {
                return this.orientation_;
            }
            
            public float getPressure() {
                return this.pressure_;
            }
            
            @Override
            public int getSerializedSize() {
                int n = 0;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    n = 0 + CodedOutputByteBufferNano.computeFloatSize(1, this.orientation_);
                }
                int n2 = n;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    n2 = n + CodedOutputByteBufferNano.computeFloatSize(2, this.pressure_);
                }
                int n3 = n2;
                if ((this.bitField0_ & 0x4) != 0x0) {
                    n3 = n2 + CodedOutputByteBufferNano.computeFloatSize(3, this.size_);
                }
                int n4 = n3;
                if ((this.bitField0_ & 0x8) != 0x0) {
                    n4 = n3 + CodedOutputByteBufferNano.computeFloatSize(4, this.toolMajor_);
                }
                int n5 = n4;
                if ((this.bitField0_ & 0x10) != 0x0) {
                    n5 = n4 + CodedOutputByteBufferNano.computeFloatSize(5, this.toolMinor_);
                }
                int n6 = n5;
                if ((this.bitField0_ & 0x20) != 0x0) {
                    n6 = n5 + CodedOutputByteBufferNano.computeFloatSize(6, this.touchMajor_);
                }
                int n7 = n6;
                if ((this.bitField0_ & 0x40) != 0x0) {
                    n7 = n6 + CodedOutputByteBufferNano.computeFloatSize(7, this.touchMinor_);
                }
                int n8 = n7;
                if ((this.bitField0_ & 0x80) != 0x0) {
                    n8 = n7 + CodedOutputByteBufferNano.computeFloatSize(8, this.x_);
                }
                int n9 = n8;
                if ((this.bitField0_ & 0x100) != 0x0) {
                    n9 = n8 + CodedOutputByteBufferNano.computeFloatSize(9, this.y_);
                }
                return this.cachedSize = n9 + WireFormatNano.computeWireSize(this.unknownFieldData);
            }
            
            public float getSize() {
                return this.size_;
            }
            
            public float getToolMajor() {
                return this.toolMajor_;
            }
            
            public float getToolMinor() {
                return this.toolMinor_;
            }
            
            public float getTouchMajor() {
                return this.touchMajor_;
            }
            
            public float getTouchMinor() {
                return this.touchMinor_;
            }
            
            public float getX() {
                return this.x_;
            }
            
            public float getY() {
                return this.y_;
            }
            
            public boolean hasOrientation() {
                return (this.bitField0_ & 0x1) != 0x0;
            }
            
            public boolean hasPressure() {
                return (this.bitField0_ & 0x2) != 0x0;
            }
            
            public boolean hasSize() {
                return (this.bitField0_ & 0x4) != 0x0;
            }
            
            public boolean hasToolMajor() {
                return (this.bitField0_ & 0x8) != 0x0;
            }
            
            public boolean hasToolMinor() {
                return (this.bitField0_ & 0x10) != 0x0;
            }
            
            public boolean hasTouchMajor() {
                return (this.bitField0_ & 0x20) != 0x0;
            }
            
            public boolean hasTouchMinor() {
                return (this.bitField0_ & 0x40) != 0x0;
            }
            
            public boolean hasX() {
                return (this.bitField0_ & 0x80) != 0x0;
            }
            
            public boolean hasY() {
                return (this.bitField0_ & 0x100) != 0x0;
            }
            
            @Override
            public int hashCode() {
                final int floatToIntBits = Float.floatToIntBits(this.orientation_);
                final int floatToIntBits2 = Float.floatToIntBits(this.pressure_);
                final int floatToIntBits3 = Float.floatToIntBits(this.size_);
                final int floatToIntBits4 = Float.floatToIntBits(this.toolMajor_);
                final int floatToIntBits5 = Float.floatToIntBits(this.toolMinor_);
                final int floatToIntBits6 = Float.floatToIntBits(this.touchMajor_);
                final int floatToIntBits7 = Float.floatToIntBits(this.touchMinor_);
                final int floatToIntBits8 = Float.floatToIntBits(this.x_);
                final int floatToIntBits9 = Float.floatToIntBits(this.y_);
                int hashCode;
                if (this.unknownFieldData == null) {
                    hashCode = 0;
                }
                else {
                    hashCode = this.unknownFieldData.hashCode();
                }
                return (((((((((floatToIntBits + 527) * 31 + floatToIntBits2) * 31 + floatToIntBits3) * 31 + floatToIntBits4) * 31 + floatToIntBits5) * 31 + floatToIntBits6) * 31 + floatToIntBits7) * 31 + floatToIntBits8) * 31 + floatToIntBits9) * 31 + hashCode;
            }
            
            @Override
            public PointerCoords mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            Label_0126:
                while (true) {
                    final int tag = codedInputByteBufferNano.readTag();
                    switch (tag) {
                        default: {
                            if (this.unknownFieldData == null) {
                                this.unknownFieldData = new ArrayList<UnknownFieldData>();
                            }
                            if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                                break Label_0126;
                            }
                            continue;
                        }
                        case 0: {
                            break Label_0126;
                        }
                        case 13: {
                            this.orientation_ = codedInputByteBufferNano.readFloat();
                            this.bitField0_ |= 0x1;
                            continue;
                        }
                        case 21: {
                            this.pressure_ = codedInputByteBufferNano.readFloat();
                            this.bitField0_ |= 0x2;
                            continue;
                        }
                        case 29: {
                            this.size_ = codedInputByteBufferNano.readFloat();
                            this.bitField0_ |= 0x4;
                            continue;
                        }
                        case 37: {
                            this.toolMajor_ = codedInputByteBufferNano.readFloat();
                            this.bitField0_ |= 0x8;
                            continue;
                        }
                        case 45: {
                            this.toolMinor_ = codedInputByteBufferNano.readFloat();
                            this.bitField0_ |= 0x10;
                            continue;
                        }
                        case 53: {
                            this.touchMajor_ = codedInputByteBufferNano.readFloat();
                            this.bitField0_ |= 0x20;
                            continue;
                        }
                        case 61: {
                            this.touchMinor_ = codedInputByteBufferNano.readFloat();
                            this.bitField0_ |= 0x40;
                            continue;
                        }
                        case 69: {
                            this.x_ = codedInputByteBufferNano.readFloat();
                            this.bitField0_ |= 0x80;
                            continue;
                        }
                        case 77: {
                            this.y_ = codedInputByteBufferNano.readFloat();
                            this.bitField0_ |= 0x100;
                            continue;
                        }
                    }
                }
                return this;
            }
            
            public PointerCoords parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                return new PointerCoords().mergeFrom(codedInputByteBufferNano);
            }
            
            public PointerCoords parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
                return MessageNano.mergeFrom(new PointerCoords(), array);
            }
            
            public PointerCoords setOrientation(final float orientation_) {
                this.orientation_ = orientation_;
                this.bitField0_ |= 0x1;
                return this;
            }
            
            public PointerCoords setPressure(final float pressure_) {
                this.pressure_ = pressure_;
                this.bitField0_ |= 0x2;
                return this;
            }
            
            public PointerCoords setSize(final float size_) {
                this.size_ = size_;
                this.bitField0_ |= 0x4;
                return this;
            }
            
            public PointerCoords setToolMajor(final float toolMajor_) {
                this.toolMajor_ = toolMajor_;
                this.bitField0_ |= 0x8;
                return this;
            }
            
            public PointerCoords setToolMinor(final float toolMinor_) {
                this.toolMinor_ = toolMinor_;
                this.bitField0_ |= 0x10;
                return this;
            }
            
            public PointerCoords setTouchMajor(final float touchMajor_) {
                this.touchMajor_ = touchMajor_;
                this.bitField0_ |= 0x20;
                return this;
            }
            
            public PointerCoords setTouchMinor(final float touchMinor_) {
                this.touchMinor_ = touchMinor_;
                this.bitField0_ |= 0x40;
                return this;
            }
            
            public PointerCoords setX(final float x_) {
                this.x_ = x_;
                this.bitField0_ |= 0x80;
                return this;
            }
            
            public PointerCoords setY(final float y_) {
                this.y_ = y_;
                this.bitField0_ |= 0x100;
                return this;
            }
            
            @Override
            public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                if ((this.bitField0_ & 0x1) != 0x0) {
                    codedOutputByteBufferNano.writeFloat(1, this.orientation_);
                }
                if ((this.bitField0_ & 0x2) != 0x0) {
                    codedOutputByteBufferNano.writeFloat(2, this.pressure_);
                }
                if ((this.bitField0_ & 0x4) != 0x0) {
                    codedOutputByteBufferNano.writeFloat(3, this.size_);
                }
                if ((this.bitField0_ & 0x8) != 0x0) {
                    codedOutputByteBufferNano.writeFloat(4, this.toolMajor_);
                }
                if ((this.bitField0_ & 0x10) != 0x0) {
                    codedOutputByteBufferNano.writeFloat(5, this.toolMinor_);
                }
                if ((this.bitField0_ & 0x20) != 0x0) {
                    codedOutputByteBufferNano.writeFloat(6, this.touchMajor_);
                }
                if ((this.bitField0_ & 0x40) != 0x0) {
                    codedOutputByteBufferNano.writeFloat(7, this.touchMinor_);
                }
                if ((this.bitField0_ & 0x80) != 0x0) {
                    codedOutputByteBufferNano.writeFloat(8, this.x_);
                }
                if ((this.bitField0_ & 0x100) != 0x0) {
                    codedOutputByteBufferNano.writeFloat(9, this.y_);
                }
                WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
            }
        }
        
        public static final class PointerProperties extends ExtendableMessageNano
        {
            public static final PointerProperties[] EMPTY_ARRAY;
            private int bitField0_;
            private int id_;
            private int toolType_;
            
            static {
                EMPTY_ARRAY = new PointerProperties[0];
            }
            
            public PointerProperties() {
                this.id_ = 0;
                this.toolType_ = 0;
            }
            
            public PointerProperties clearId() {
                this.id_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            public PointerProperties clearToolType() {
                this.toolType_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }
            
            @Override
            public final boolean equals(final Object o) {
                boolean b = true;
                if (o != this) {
                    if (!(o instanceof PointerProperties)) {
                        b = false;
                    }
                    else {
                        final PointerProperties pointerProperties = (PointerProperties)o;
                        if (this.id_ == pointerProperties.id_ && this.toolType_ == pointerProperties.toolType_) {
                            if (this.unknownFieldData == null) {
                                if (pointerProperties.unknownFieldData == null) {
                                    return b;
                                }
                            }
                            else if (this.unknownFieldData.equals(pointerProperties.unknownFieldData)) {
                                return b;
                            }
                        }
                        b = false;
                    }
                }
                return b;
            }
            
            public int getId() {
                return this.id_;
            }
            
            @Override
            public int getSerializedSize() {
                int n = 0;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    n = 0 + CodedOutputByteBufferNano.computeInt32Size(1, this.id_);
                }
                int n2 = n;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    n2 = n + CodedOutputByteBufferNano.computeInt32Size(2, this.toolType_);
                }
                return this.cachedSize = n2 + WireFormatNano.computeWireSize(this.unknownFieldData);
            }
            
            public int getToolType() {
                return this.toolType_;
            }
            
            public boolean hasId() {
                return (this.bitField0_ & 0x1) != 0x0;
            }
            
            public boolean hasToolType() {
                return (this.bitField0_ & 0x2) != 0x0;
            }
            
            @Override
            public int hashCode() {
                final int id_ = this.id_;
                final int toolType_ = this.toolType_;
                int hashCode;
                if (this.unknownFieldData == null) {
                    hashCode = 0;
                }
                else {
                    hashCode = this.unknownFieldData.hashCode();
                }
                return ((id_ + 527) * 31 + toolType_) * 31 + hashCode;
            }
            
            @Override
            public PointerProperties mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            Label_0070:
                while (true) {
                    final int tag = codedInputByteBufferNano.readTag();
                    switch (tag) {
                        default: {
                            if (this.unknownFieldData == null) {
                                this.unknownFieldData = new ArrayList<UnknownFieldData>();
                            }
                            if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                                break Label_0070;
                            }
                            continue;
                        }
                        case 0: {
                            break Label_0070;
                        }
                        case 8: {
                            this.id_ = codedInputByteBufferNano.readInt32();
                            this.bitField0_ |= 0x1;
                            continue;
                        }
                        case 16: {
                            this.toolType_ = codedInputByteBufferNano.readInt32();
                            this.bitField0_ |= 0x2;
                            continue;
                        }
                    }
                }
                return this;
            }
            
            public PointerProperties parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                return new PointerProperties().mergeFrom(codedInputByteBufferNano);
            }
            
            public PointerProperties parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
                return MessageNano.mergeFrom(new PointerProperties(), array);
            }
            
            public PointerProperties setId(final int id_) {
                this.id_ = id_;
                this.bitField0_ |= 0x1;
                return this;
            }
            
            public PointerProperties setToolType(final int toolType_) {
                this.toolType_ = toolType_;
                this.bitField0_ |= 0x2;
                return this;
            }
            
            @Override
            public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                if ((this.bitField0_ & 0x1) != 0x0) {
                    codedOutputByteBufferNano.writeInt32(1, this.id_);
                }
                if ((this.bitField0_ & 0x2) != 0x0) {
                    codedOutputByteBufferNano.writeInt32(2, this.toolType_);
                }
                WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
            }
        }
    }
    
    public static final class MultimediaMessage extends ExtendableMessageNano
    {
        public static final MultimediaMessage[] EMPTY_ARRAY;
        public byte[][] attachmentContent;
        private TimelineNano.TimelineItem timelineItem_;
        
        static {
            EMPTY_ARRAY = new MultimediaMessage[0];
        }
        
        public MultimediaMessage() {
            this.attachmentContent = WireFormatNano.EMPTY_BYTES_ARRAY;
        }
        
        public static MultimediaMessage parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new MultimediaMessage().mergeFrom(codedInputByteBufferNano);
        }
        
        public static MultimediaMessage parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new MultimediaMessage(), array);
        }
        
        public MultimediaMessage clearTimelineItem() {
            this.timelineItem_ = null;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof MultimediaMessage)) {
                    b = false;
                }
                else {
                    final MultimediaMessage multimediaMessage = (MultimediaMessage)o;
                    Label_0068: {
                        if (this.timelineItem_ == null) {
                            if (multimediaMessage.timelineItem_ != null) {
                                break Label_0068;
                            }
                        }
                        else if (!this.timelineItem_.equals(multimediaMessage.timelineItem_)) {
                            break Label_0068;
                        }
                        if (Arrays.equals(this.attachmentContent, multimediaMessage.attachmentContent)) {
                            if (this.unknownFieldData == null) {
                                if (multimediaMessage.unknownFieldData == null) {
                                    return b;
                                }
                            }
                            else if (this.unknownFieldData.equals(multimediaMessage.unknownFieldData)) {
                                return b;
                            }
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if (this.timelineItem_ != null) {
                n = 0 + CodedOutputByteBufferNano.computeMessageSize(1, this.timelineItem_);
            }
            int n2 = n;
            if (this.attachmentContent != null) {
                n2 = n;
                if (this.attachmentContent.length > 0) {
                    int n3 = 0;
                    final byte[][] attachmentContent = this.attachmentContent;
                    for (int length = attachmentContent.length, i = 0; i < length; ++i) {
                        n3 += CodedOutputByteBufferNano.computeBytesSizeNoTag(attachmentContent[i]);
                    }
                    n2 = n + n3 + this.attachmentContent.length * 1;
                }
            }
            return this.cachedSize = n2 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public TimelineNano.TimelineItem getTimelineItem() {
            return this.timelineItem_;
        }
        
        public boolean hasTimelineItem() {
            return this.timelineItem_ != null;
        }
        
        @Override
        public int hashCode() {
            final int n = 0;
            int hashCode;
            if (this.timelineItem_ == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.timelineItem_.hashCode();
            }
            hashCode += 527;
            int n2;
            if (this.attachmentContent == null) {
                n2 = hashCode * 31;
            }
            else {
                int n3 = 0;
                while (true) {
                    n2 = hashCode;
                    if (n3 >= this.attachmentContent.length) {
                        break;
                    }
                    for (int i = 0; i < this.attachmentContent[n3].length; ++i) {
                        hashCode = hashCode * 31 + this.attachmentContent[n3][i];
                    }
                    ++n3;
                }
            }
            int hashCode2;
            if (this.unknownFieldData == null) {
                hashCode2 = n;
            }
            else {
                hashCode2 = this.unknownFieldData.hashCode();
            }
            return n2 * 31 + hashCode2;
        }
        
        @Override
        public MultimediaMessage mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0070:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0070;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0070;
                    }
                    case 10: {
                        if (this.timelineItem_ == null) {
                            this.timelineItem_ = new TimelineNano.TimelineItem();
                        }
                        codedInputByteBufferNano.readMessage(this.timelineItem_);
                        continue;
                    }
                    case 18: {
                        final int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                        int i = this.attachmentContent.length;
                        final byte[][] attachmentContent = new byte[i + repeatedFieldArrayLength][];
                        System.arraycopy(this.attachmentContent, 0, attachmentContent, 0, i);
                        this.attachmentContent = attachmentContent;
                        while (i < this.attachmentContent.length - 1) {
                            this.attachmentContent[i] = codedInputByteBufferNano.readBytes();
                            codedInputByteBufferNano.readTag();
                            ++i;
                        }
                        this.attachmentContent[i] = codedInputByteBufferNano.readBytes();
                        continue;
                    }
                }
            }
            return this;
        }
        
        public MultimediaMessage setTimelineItem(final TimelineNano.TimelineItem timelineItem_) {
            if (timelineItem_ == null) {
                throw new NullPointerException();
            }
            this.timelineItem_ = timelineItem_;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (this.timelineItem_ != null) {
                codedOutputByteBufferNano.writeMessage(1, this.timelineItem_);
            }
            if (this.attachmentContent != null) {
                final byte[][] attachmentContent = this.attachmentContent;
                for (int length = attachmentContent.length, i = 0; i < length; ++i) {
                    codedOutputByteBufferNano.writeBytes(2, attachmentContent[i]);
                }
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class NavigationRequest extends ExtendableMessageNano
    {
        public static final NavigationRequest[] EMPTY_ARRAY;
        private int bitField0_;
        private String uri_;
        
        static {
            EMPTY_ARRAY = new NavigationRequest[0];
        }
        
        public NavigationRequest() {
            this.uri_ = "";
        }
        
        public static NavigationRequest parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new NavigationRequest().mergeFrom(codedInputByteBufferNano);
        }
        
        public static NavigationRequest parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new NavigationRequest(), array);
        }
        
        public NavigationRequest clearUri() {
            this.uri_ = "";
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof NavigationRequest)) {
                    b = false;
                }
                else {
                    final NavigationRequest navigationRequest = (NavigationRequest)o;
                    Label_0054: {
                        if (this.uri_ == null) {
                            if (navigationRequest.uri_ != null) {
                                break Label_0054;
                            }
                        }
                        else if (!this.uri_.equals(navigationRequest.uri_)) {
                            break Label_0054;
                        }
                        if (this.unknownFieldData == null) {
                            if (navigationRequest.unknownFieldData == null) {
                                return b;
                            }
                        }
                        else if (this.unknownFieldData.equals(navigationRequest.unknownFieldData)) {
                            return b;
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeStringSize(1, this.uri_);
            }
            return this.cachedSize = n + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public String getUri() {
            return this.uri_;
        }
        
        public boolean hasUri() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        @Override
        public int hashCode() {
            int hashCode = 0;
            int hashCode2;
            if (this.uri_ == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = this.uri_.hashCode();
            }
            if (this.unknownFieldData != null) {
                hashCode = this.unknownFieldData.hashCode();
            }
            return (hashCode2 + 527) * 31 + hashCode;
        }
        
        @Override
        public NavigationRequest mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0062:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0062;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0062;
                    }
                    case 10: {
                        this.uri_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public NavigationRequest setUri(final String uri_) {
            if (uri_ == null) {
                throw new NullPointerException();
            }
            this.uri_ = uri_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeString(1, this.uri_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public interface OpenEndedInputControl
    {
        public static final int CANCEL = 2;
        public static final int SEND = 1;
    }
    
    public static final class OpenEndedInputRequest extends ExtendableMessageNano
    {
        public static final OpenEndedInputRequest[] EMPTY_ARRAY;
        private int bitField0_;
        private int control_;
        private String currentInput_;
        private String prompt_;
        
        static {
            EMPTY_ARRAY = new OpenEndedInputRequest[0];
        }
        
        public OpenEndedInputRequest() {
            this.control_ = 1;
            this.prompt_ = "";
            this.currentInput_ = "";
        }
        
        public static OpenEndedInputRequest parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new OpenEndedInputRequest().mergeFrom(codedInputByteBufferNano);
        }
        
        public static OpenEndedInputRequest parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new OpenEndedInputRequest(), array);
        }
        
        public OpenEndedInputRequest clearControl() {
            this.control_ = 1;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        public OpenEndedInputRequest clearCurrentInput() {
            this.currentInput_ = "";
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }
        
        public OpenEndedInputRequest clearPrompt() {
            this.prompt_ = "";
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof OpenEndedInputRequest)) {
                    b = false;
                }
                else {
                    final OpenEndedInputRequest openEndedInputRequest = (OpenEndedInputRequest)o;
                    Label_0079: {
                        if (this.control_ == openEndedInputRequest.control_) {
                            if (this.prompt_ == null) {
                                if (openEndedInputRequest.prompt_ != null) {
                                    break Label_0079;
                                }
                            }
                            else if (!this.prompt_.equals(openEndedInputRequest.prompt_)) {
                                break Label_0079;
                            }
                            if (this.currentInput_ == null) {
                                if (openEndedInputRequest.currentInput_ != null) {
                                    break Label_0079;
                                }
                            }
                            else if (!this.currentInput_.equals(openEndedInputRequest.currentInput_)) {
                                break Label_0079;
                            }
                            if (this.unknownFieldData == null) {
                                if (openEndedInputRequest.unknownFieldData == null) {
                                    return b;
                                }
                            }
                            else if (this.unknownFieldData.equals(openEndedInputRequest.unknownFieldData)) {
                                return b;
                            }
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public int getControl() {
            return this.control_;
        }
        
        public String getCurrentInput() {
            return this.currentInput_;
        }
        
        public String getPrompt() {
            return this.prompt_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeInt32Size(1, this.control_);
            }
            int n2 = n;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n2 = n + CodedOutputByteBufferNano.computeStringSize(2, this.prompt_);
            }
            int n3 = n2;
            if ((this.bitField0_ & 0x4) != 0x0) {
                n3 = n2 + CodedOutputByteBufferNano.computeStringSize(3, this.currentInput_);
            }
            return this.cachedSize = n3 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public boolean hasControl() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        public boolean hasCurrentInput() {
            return (this.bitField0_ & 0x4) != 0x0;
        }
        
        public boolean hasPrompt() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        @Override
        public int hashCode() {
            int hashCode = 0;
            final int control_ = this.control_;
            int hashCode2;
            if (this.prompt_ == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = this.prompt_.hashCode();
            }
            int hashCode3;
            if (this.currentInput_ == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = this.currentInput_.hashCode();
            }
            if (this.unknownFieldData != null) {
                hashCode = this.unknownFieldData.hashCode();
            }
            return (((control_ + 527) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode;
        }
        
        @Override
        public OpenEndedInputRequest mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0078:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0078;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0078;
                    }
                    case 8: {
                        final int int32 = codedInputByteBufferNano.readInt32();
                        if (int32 == 1 || int32 == 2) {
                            this.control_ = int32;
                            this.bitField0_ |= 0x1;
                            continue;
                        }
                        this.control_ = 1;
                        continue;
                    }
                    case 18: {
                        this.prompt_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x2;
                        continue;
                    }
                    case 26: {
                        this.currentInput_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x4;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public OpenEndedInputRequest setControl(final int control_) {
            this.control_ = control_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        public OpenEndedInputRequest setCurrentInput(final String currentInput_) {
            if (currentInput_ == null) {
                throw new NullPointerException();
            }
            this.currentInput_ = currentInput_;
            this.bitField0_ |= 0x4;
            return this;
        }
        
        public OpenEndedInputRequest setPrompt(final String prompt_) {
            if (prompt_ == null) {
                throw new NullPointerException();
            }
            this.prompt_ = prompt_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeInt32(1, this.control_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeString(2, this.prompt_);
            }
            if ((this.bitField0_ & 0x4) != 0x0) {
                codedOutputByteBufferNano.writeString(3, this.currentInput_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class OpenEndedInputResponse extends ExtendableMessageNano
    {
        public static final OpenEndedInputResponse[] EMPTY_ARRAY;
        private int bitField0_;
        private int control_;
        private int diffStartIndex_;
        private String updatedInput_;
        
        static {
            EMPTY_ARRAY = new OpenEndedInputResponse[0];
        }
        
        public OpenEndedInputResponse() {
            this.control_ = 1;
            this.updatedInput_ = "";
            this.diffStartIndex_ = 0;
        }
        
        public static OpenEndedInputResponse parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new OpenEndedInputResponse().mergeFrom(codedInputByteBufferNano);
        }
        
        public static OpenEndedInputResponse parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new OpenEndedInputResponse(), array);
        }
        
        public OpenEndedInputResponse clearControl() {
            this.control_ = 1;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        public OpenEndedInputResponse clearDiffStartIndex() {
            this.diffStartIndex_ = 0;
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }
        
        public OpenEndedInputResponse clearUpdatedInput() {
            this.updatedInput_ = "";
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof OpenEndedInputResponse)) {
                    b = false;
                }
                else {
                    final OpenEndedInputResponse openEndedInputResponse = (OpenEndedInputResponse)o;
                    Label_0076: {
                        if (this.control_ == openEndedInputResponse.control_) {
                            if (this.updatedInput_ == null) {
                                if (openEndedInputResponse.updatedInput_ != null) {
                                    break Label_0076;
                                }
                            }
                            else if (!this.updatedInput_.equals(openEndedInputResponse.updatedInput_)) {
                                break Label_0076;
                            }
                            if (this.diffStartIndex_ == openEndedInputResponse.diffStartIndex_) {
                                if (this.unknownFieldData == null) {
                                    if (openEndedInputResponse.unknownFieldData == null) {
                                        return b;
                                    }
                                }
                                else if (this.unknownFieldData.equals(openEndedInputResponse.unknownFieldData)) {
                                    return b;
                                }
                            }
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public int getControl() {
            return this.control_;
        }
        
        public int getDiffStartIndex() {
            return this.diffStartIndex_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeInt32Size(1, this.control_);
            }
            int n2 = n;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n2 = n + CodedOutputByteBufferNano.computeStringSize(2, this.updatedInput_);
            }
            int n3 = n2;
            if ((this.bitField0_ & 0x4) != 0x0) {
                n3 = n2 + CodedOutputByteBufferNano.computeInt32Size(3, this.diffStartIndex_);
            }
            return this.cachedSize = n3 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public String getUpdatedInput() {
            return this.updatedInput_;
        }
        
        public boolean hasControl() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        public boolean hasDiffStartIndex() {
            return (this.bitField0_ & 0x4) != 0x0;
        }
        
        public boolean hasUpdatedInput() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        @Override
        public int hashCode() {
            int hashCode = 0;
            final int control_ = this.control_;
            int hashCode2;
            if (this.updatedInput_ == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = this.updatedInput_.hashCode();
            }
            final int diffStartIndex_ = this.diffStartIndex_;
            if (this.unknownFieldData != null) {
                hashCode = this.unknownFieldData.hashCode();
            }
            return (((control_ + 527) * 31 + hashCode2) * 31 + diffStartIndex_) * 31 + hashCode;
        }
        
        @Override
        public OpenEndedInputResponse mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0078:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0078;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0078;
                    }
                    case 8: {
                        final int int32 = codedInputByteBufferNano.readInt32();
                        if (int32 == 1 || int32 == 2) {
                            this.control_ = int32;
                            this.bitField0_ |= 0x1;
                            continue;
                        }
                        this.control_ = 1;
                        continue;
                    }
                    case 18: {
                        this.updatedInput_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x2;
                        continue;
                    }
                    case 24: {
                        this.diffStartIndex_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x4;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public OpenEndedInputResponse setControl(final int control_) {
            this.control_ = control_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        public OpenEndedInputResponse setDiffStartIndex(final int diffStartIndex_) {
            this.diffStartIndex_ = diffStartIndex_;
            this.bitField0_ |= 0x4;
            return this;
        }
        
        public OpenEndedInputResponse setUpdatedInput(final String updatedInput_) {
            if (updatedInput_ == null) {
                throw new NullPointerException();
            }
            this.updatedInput_ = updatedInput_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeInt32(1, this.control_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeString(2, this.updatedInput_);
            }
            if ((this.bitField0_ & 0x4) != 0x0) {
                codedOutputByteBufferNano.writeInt32(3, this.diffStartIndex_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class Photo extends ExtendableMessageNano
    {
        public static final Photo[] EMPTY_ARRAY;
        private int bitField0_;
        private int numOfPhotosToSync_;
        private int op_;
        private String photoId_;
        private byte[] thumbnailBytes_;
        private long timestamp_;
        
        static {
            EMPTY_ARRAY = new Photo[0];
        }
        
        public Photo() {
            this.thumbnailBytes_ = WireFormatNano.EMPTY_BYTES;
            this.timestamp_ = 0L;
            this.photoId_ = "";
            this.op_ = 1;
            this.numOfPhotosToSync_ = 0;
        }
        
        public static Photo parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new Photo().mergeFrom(codedInputByteBufferNano);
        }
        
        public static Photo parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new Photo(), array);
        }
        
        public Photo clearNumOfPhotosToSync() {
            this.numOfPhotosToSync_ = 0;
            this.bitField0_ &= 0xFFFFFFEF;
            return this;
        }
        
        public Photo clearOp() {
            this.op_ = 1;
            this.bitField0_ &= 0xFFFFFFF7;
            return this;
        }
        
        public Photo clearPhotoId() {
            this.photoId_ = "";
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }
        
        public Photo clearThumbnailBytes() {
            this.thumbnailBytes_ = WireFormatNano.EMPTY_BYTES;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        public Photo clearTimestamp() {
            this.timestamp_ = 0L;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof Photo)) {
                    b = false;
                }
                else {
                    final Photo photo = (Photo)o;
                    Label_0102: {
                        if (Arrays.equals(this.thumbnailBytes_, photo.thumbnailBytes_) && this.timestamp_ == photo.timestamp_) {
                            if (this.photoId_ == null) {
                                if (photo.photoId_ != null) {
                                    break Label_0102;
                                }
                            }
                            else if (!this.photoId_.equals(photo.photoId_)) {
                                break Label_0102;
                            }
                            if (this.op_ == photo.op_ && this.numOfPhotosToSync_ == photo.numOfPhotosToSync_) {
                                if (this.unknownFieldData == null) {
                                    if (photo.unknownFieldData == null) {
                                        return b;
                                    }
                                }
                                else if (this.unknownFieldData.equals(photo.unknownFieldData)) {
                                    return b;
                                }
                            }
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public int getNumOfPhotosToSync() {
            return this.numOfPhotosToSync_;
        }
        
        public int getOp() {
            return this.op_;
        }
        
        public String getPhotoId() {
            return this.photoId_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeBytesSize(1, this.thumbnailBytes_);
            }
            int n2 = n;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n2 = n + CodedOutputByteBufferNano.computeUInt64Size(2, this.timestamp_);
            }
            int n3 = n2;
            if ((this.bitField0_ & 0x4) != 0x0) {
                n3 = n2 + CodedOutputByteBufferNano.computeStringSize(3, this.photoId_);
            }
            int n4 = n3;
            if ((this.bitField0_ & 0x8) != 0x0) {
                n4 = n3 + CodedOutputByteBufferNano.computeInt32Size(4, this.op_);
            }
            int n5 = n4;
            if ((this.bitField0_ & 0x10) != 0x0) {
                n5 = n4 + CodedOutputByteBufferNano.computeInt32Size(5, this.numOfPhotosToSync_);
            }
            return this.cachedSize = n5 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public byte[] getThumbnailBytes() {
            return this.thumbnailBytes_;
        }
        
        public long getTimestamp() {
            return this.timestamp_;
        }
        
        public boolean hasNumOfPhotosToSync() {
            return (this.bitField0_ & 0x10) != 0x0;
        }
        
        public boolean hasOp() {
            return (this.bitField0_ & 0x8) != 0x0;
        }
        
        public boolean hasPhotoId() {
            return (this.bitField0_ & 0x4) != 0x0;
        }
        
        public boolean hasThumbnailBytes() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        public boolean hasTimestamp() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        @Override
        public int hashCode() {
            final int n = 0;
            int n2 = 17;
            int n3;
            if (this.thumbnailBytes_ == null) {
                n3 = 17 * 31;
            }
            else {
                int n4 = 0;
                while (true) {
                    n3 = n2;
                    if (n4 >= this.thumbnailBytes_.length) {
                        break;
                    }
                    n2 = n2 * 31 + this.thumbnailBytes_[n4];
                    ++n4;
                }
            }
            final int n5 = (int)(this.timestamp_ ^ this.timestamp_ >>> 32);
            int hashCode;
            if (this.photoId_ == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.photoId_.hashCode();
            }
            final int op_ = this.op_;
            final int numOfPhotosToSync_ = this.numOfPhotosToSync_;
            int hashCode2;
            if (this.unknownFieldData == null) {
                hashCode2 = n;
            }
            else {
                hashCode2 = this.unknownFieldData.hashCode();
            }
            return ((((n3 * 31 + n5) * 31 + hashCode) * 31 + op_) * 31 + numOfPhotosToSync_) * 31 + hashCode2;
        }
        
        @Override
        public Photo mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0094:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0094;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0094;
                    }
                    case 10: {
                        this.thumbnailBytes_ = codedInputByteBufferNano.readBytes();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 16: {
                        this.timestamp_ = codedInputByteBufferNano.readUInt64();
                        this.bitField0_ |= 0x2;
                        continue;
                    }
                    case 26: {
                        this.photoId_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x4;
                        continue;
                    }
                    case 32: {
                        final int int32 = codedInputByteBufferNano.readInt32();
                        if (int32 == 1 || int32 == 2 || int32 == 3) {
                            this.op_ = int32;
                            this.bitField0_ |= 0x8;
                            continue;
                        }
                        this.op_ = 1;
                        continue;
                    }
                    case 40: {
                        this.numOfPhotosToSync_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x10;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public Photo setNumOfPhotosToSync(final int numOfPhotosToSync_) {
            this.numOfPhotosToSync_ = numOfPhotosToSync_;
            this.bitField0_ |= 0x10;
            return this;
        }
        
        public Photo setOp(final int op_) {
            this.op_ = op_;
            this.bitField0_ |= 0x8;
            return this;
        }
        
        public Photo setPhotoId(final String photoId_) {
            if (photoId_ == null) {
                throw new NullPointerException();
            }
            this.photoId_ = photoId_;
            this.bitField0_ |= 0x4;
            return this;
        }
        
        public Photo setThumbnailBytes(final byte[] thumbnailBytes_) {
            if (thumbnailBytes_ == null) {
                throw new NullPointerException();
            }
            this.thumbnailBytes_ = thumbnailBytes_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        public Photo setTimestamp(final long timestamp_) {
            this.timestamp_ = timestamp_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeBytes(1, this.thumbnailBytes_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeUInt64(2, this.timestamp_);
            }
            if ((this.bitField0_ & 0x4) != 0x0) {
                codedOutputByteBufferNano.writeString(3, this.photoId_);
            }
            if ((this.bitField0_ & 0x8) != 0x0) {
                codedOutputByteBufferNano.writeInt32(4, this.op_);
            }
            if ((this.bitField0_ & 0x10) != 0x0) {
                codedOutputByteBufferNano.writeInt32(5, this.numOfPhotosToSync_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
        
        public interface Operation
        {
            public static final int DELETE = 2;
            public static final int NOTICE = 3;
            public static final int SYNC = 1;
        }
    }
    
    public static final class ScreenShot extends ExtendableMessageNano
    {
        public static final ScreenShot[] EMPTY_ARRAY;
        private int bitField0_;
        private boolean isScreenOnG2C_;
        private byte[] screenshotBytesG2C_;
        private boolean startScreenshotRequestC2G_;
        private boolean stopScreenshotRequestC2G_;
        
        static {
            EMPTY_ARRAY = new ScreenShot[0];
        }
        
        public ScreenShot() {
            this.startScreenshotRequestC2G_ = false;
            this.stopScreenshotRequestC2G_ = false;
            this.screenshotBytesG2C_ = WireFormatNano.EMPTY_BYTES;
            this.isScreenOnG2C_ = false;
        }
        
        public static ScreenShot parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new ScreenShot().mergeFrom(codedInputByteBufferNano);
        }
        
        public static ScreenShot parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new ScreenShot(), array);
        }
        
        public ScreenShot clearIsScreenOnG2C() {
            this.isScreenOnG2C_ = false;
            this.bitField0_ &= 0xFFFFFFF7;
            return this;
        }
        
        public ScreenShot clearScreenshotBytesG2C() {
            this.screenshotBytesG2C_ = WireFormatNano.EMPTY_BYTES;
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }
        
        public ScreenShot clearStartScreenshotRequestC2G() {
            this.startScreenshotRequestC2G_ = false;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        public ScreenShot clearStopScreenshotRequestC2G() {
            this.stopScreenshotRequestC2G_ = false;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof ScreenShot)) {
                    b = false;
                }
                else {
                    final ScreenShot screenShot = (ScreenShot)o;
                    if (this.startScreenshotRequestC2G_ == screenShot.startScreenshotRequestC2G_ && this.stopScreenshotRequestC2G_ == screenShot.stopScreenshotRequestC2G_ && Arrays.equals(this.screenshotBytesG2C_, screenShot.screenshotBytesG2C_) && this.isScreenOnG2C_ == screenShot.isScreenOnG2C_) {
                        if (this.unknownFieldData == null) {
                            if (screenShot.unknownFieldData == null) {
                                return b;
                            }
                        }
                        else if (this.unknownFieldData.equals(screenShot.unknownFieldData)) {
                            return b;
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public boolean getIsScreenOnG2C() {
            return this.isScreenOnG2C_;
        }
        
        public byte[] getScreenshotBytesG2C() {
            return this.screenshotBytesG2C_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeBoolSize(1, this.startScreenshotRequestC2G_);
            }
            int n2 = n;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n2 = n + CodedOutputByteBufferNano.computeBoolSize(2, this.stopScreenshotRequestC2G_);
            }
            int n3 = n2;
            if ((this.bitField0_ & 0x4) != 0x0) {
                n3 = n2 + CodedOutputByteBufferNano.computeBytesSize(3, this.screenshotBytesG2C_);
            }
            int n4 = n3;
            if ((this.bitField0_ & 0x8) != 0x0) {
                n4 = n3 + CodedOutputByteBufferNano.computeBoolSize(4, this.isScreenOnG2C_);
            }
            return this.cachedSize = n4 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public boolean getStartScreenshotRequestC2G() {
            return this.startScreenshotRequestC2G_;
        }
        
        public boolean getStopScreenshotRequestC2G() {
            return this.stopScreenshotRequestC2G_;
        }
        
        public boolean hasIsScreenOnG2C() {
            return (this.bitField0_ & 0x8) != 0x0;
        }
        
        public boolean hasScreenshotBytesG2C() {
            return (this.bitField0_ & 0x4) != 0x0;
        }
        
        public boolean hasStartScreenshotRequestC2G() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        public boolean hasStopScreenshotRequestC2G() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        @Override
        public int hashCode() {
            final int n = 1;
            int n2;
            if (this.startScreenshotRequestC2G_) {
                n2 = 1;
            }
            else {
                n2 = 2;
            }
            int n3;
            if (this.stopScreenshotRequestC2G_) {
                n3 = 1;
            }
            else {
                n3 = 2;
            }
            int n4 = (n2 + 527) * 31 + n3;
            int n5;
            if (this.screenshotBytesG2C_ == null) {
                n5 = n4 * 31;
            }
            else {
                int n6 = 0;
                while (true) {
                    n5 = n4;
                    if (n6 >= this.screenshotBytesG2C_.length) {
                        break;
                    }
                    n4 = n4 * 31 + this.screenshotBytesG2C_[n6];
                    ++n6;
                }
            }
            int n7;
            if (this.isScreenOnG2C_) {
                n7 = n;
            }
            else {
                n7 = 2;
            }
            int hashCode;
            if (this.unknownFieldData == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.unknownFieldData.hashCode();
            }
            return (n5 * 31 + n7) * 31 + hashCode;
        }
        
        @Override
        public ScreenShot mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0086:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0086;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0086;
                    }
                    case 8: {
                        this.startScreenshotRequestC2G_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 16: {
                        this.stopScreenshotRequestC2G_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x2;
                        continue;
                    }
                    case 26: {
                        this.screenshotBytesG2C_ = codedInputByteBufferNano.readBytes();
                        this.bitField0_ |= 0x4;
                        continue;
                    }
                    case 32: {
                        this.isScreenOnG2C_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x8;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public ScreenShot setIsScreenOnG2C(final boolean isScreenOnG2C_) {
            this.isScreenOnG2C_ = isScreenOnG2C_;
            this.bitField0_ |= 0x8;
            return this;
        }
        
        public ScreenShot setScreenshotBytesG2C(final byte[] screenshotBytesG2C_) {
            if (screenshotBytesG2C_ == null) {
                throw new NullPointerException();
            }
            this.screenshotBytesG2C_ = screenshotBytesG2C_;
            this.bitField0_ |= 0x4;
            return this;
        }
        
        public ScreenShot setStartScreenshotRequestC2G(final boolean startScreenshotRequestC2G_) {
            this.startScreenshotRequestC2G_ = startScreenshotRequestC2G_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        public ScreenShot setStopScreenshotRequestC2G(final boolean stopScreenshotRequestC2G_) {
            this.stopScreenshotRequestC2G_ = stopScreenshotRequestC2G_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeBool(1, this.startScreenshotRequestC2G_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeBool(2, this.stopScreenshotRequestC2G_);
            }
            if ((this.bitField0_ & 0x4) != 0x0) {
                codedOutputByteBufferNano.writeBytes(3, this.screenshotBytesG2C_);
            }
            if ((this.bitField0_ & 0x8) != 0x0) {
                codedOutputByteBufferNano.writeBool(4, this.isScreenOnG2C_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class SetWallpaperRequest extends ExtendableMessageNano
    {
        public static final SetWallpaperRequest[] EMPTY_ARRAY;
        private int bitField0_;
        private int id_;
        private Media wallpaper_;
        
        static {
            EMPTY_ARRAY = new SetWallpaperRequest[0];
        }
        
        public SetWallpaperRequest() {
            this.id_ = 0;
        }
        
        public static SetWallpaperRequest parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SetWallpaperRequest().mergeFrom(codedInputByteBufferNano);
        }
        
        public static SetWallpaperRequest parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new SetWallpaperRequest(), array);
        }
        
        public SetWallpaperRequest clearId() {
            this.id_ = 0;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        public SetWallpaperRequest clearWallpaper() {
            this.wallpaper_ = null;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof SetWallpaperRequest)) {
                    b = false;
                }
                else {
                    final SetWallpaperRequest setWallpaperRequest = (SetWallpaperRequest)o;
                    Label_0065: {
                        if (this.id_ == setWallpaperRequest.id_) {
                            if (this.wallpaper_ == null) {
                                if (setWallpaperRequest.wallpaper_ != null) {
                                    break Label_0065;
                                }
                            }
                            else if (!this.wallpaper_.equals(setWallpaperRequest.wallpaper_)) {
                                break Label_0065;
                            }
                            if (this.unknownFieldData == null) {
                                if (setWallpaperRequest.unknownFieldData == null) {
                                    return b;
                                }
                            }
                            else if (this.unknownFieldData.equals(setWallpaperRequest.unknownFieldData)) {
                                return b;
                            }
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public int getId() {
            return this.id_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeInt32Size(1, this.id_);
            }
            int n2 = n;
            if (this.wallpaper_ != null) {
                n2 = n + CodedOutputByteBufferNano.computeMessageSize(2, this.wallpaper_);
            }
            return this.cachedSize = n2 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public Media getWallpaper() {
            return this.wallpaper_;
        }
        
        public boolean hasId() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        public boolean hasWallpaper() {
            return this.wallpaper_ != null;
        }
        
        @Override
        public int hashCode() {
            int hashCode = 0;
            final int id_ = this.id_;
            int hashCode2;
            if (this.wallpaper_ == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = this.wallpaper_.hashCode();
            }
            if (this.unknownFieldData != null) {
                hashCode = this.unknownFieldData.hashCode();
            }
            return ((id_ + 527) * 31 + hashCode2) * 31 + hashCode;
        }
        
        @Override
        public SetWallpaperRequest mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0070:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0070;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0070;
                    }
                    case 8: {
                        this.id_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 18: {
                        if (this.wallpaper_ == null) {
                            this.wallpaper_ = new Media();
                        }
                        codedInputByteBufferNano.readMessage(this.wallpaper_);
                        continue;
                    }
                }
            }
            return this;
        }
        
        public SetWallpaperRequest setId(final int id_) {
            this.id_ = id_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        public SetWallpaperRequest setWallpaper(final Media wallpaper_) {
            if (wallpaper_ == null) {
                throw new NullPointerException();
            }
            this.wallpaper_ = wallpaper_;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeInt32(1, this.id_);
            }
            if (this.wallpaper_ != null) {
                codedOutputByteBufferNano.writeMessage(2, this.wallpaper_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class SetWallpaperResponse extends ExtendableMessageNano
    {
        public static final SetWallpaperResponse[] EMPTY_ARRAY;
        private int bitField0_;
        private int id_;
        private int update_;
        
        static {
            EMPTY_ARRAY = new SetWallpaperResponse[0];
        }
        
        public SetWallpaperResponse() {
            this.id_ = 0;
            this.update_ = 0;
        }
        
        public static SetWallpaperResponse parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SetWallpaperResponse().mergeFrom(codedInputByteBufferNano);
        }
        
        public static SetWallpaperResponse parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new SetWallpaperResponse(), array);
        }
        
        public SetWallpaperResponse clearId() {
            this.id_ = 0;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        public SetWallpaperResponse clearUpdate() {
            this.update_ = 0;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof SetWallpaperResponse)) {
                    b = false;
                }
                else {
                    final SetWallpaperResponse setWallpaperResponse = (SetWallpaperResponse)o;
                    if (this.id_ == setWallpaperResponse.id_ && this.update_ == setWallpaperResponse.update_) {
                        if (this.unknownFieldData == null) {
                            if (setWallpaperResponse.unknownFieldData == null) {
                                return b;
                            }
                        }
                        else if (this.unknownFieldData.equals(setWallpaperResponse.unknownFieldData)) {
                            return b;
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public int getId() {
            return this.id_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeInt32Size(1, this.id_);
            }
            int n2 = n;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n2 = n + CodedOutputByteBufferNano.computeInt32Size(2, this.update_);
            }
            return this.cachedSize = n2 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public int getUpdate() {
            return this.update_;
        }
        
        public boolean hasId() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        public boolean hasUpdate() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        @Override
        public int hashCode() {
            final int id_ = this.id_;
            final int update_ = this.update_;
            int hashCode;
            if (this.unknownFieldData == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.unknownFieldData.hashCode();
            }
            return ((id_ + 527) * 31 + update_) * 31 + hashCode;
        }
        
        @Override
        public SetWallpaperResponse mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0070:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0070;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0070;
                    }
                    case 8: {
                        this.id_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 16: {
                        final int int32 = codedInputByteBufferNano.readInt32();
                        if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                            this.update_ = int32;
                            this.bitField0_ |= 0x2;
                            continue;
                        }
                        this.update_ = 0;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public SetWallpaperResponse setId(final int id_) {
            this.id_ = id_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        public SetWallpaperResponse setUpdate(final int update_) {
            this.update_ = update_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeInt32(1, this.id_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeInt32(2, this.update_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
        
        public interface Update
        {
            public static final int DISPLAYED = 1;
            public static final int FAILED = 2;
            public static final int IN_PROGRESS = 3;
            public static final int UNKNOWN = 0;
        }
    }
    
    public static final class SetupWifiRequest extends ExtendableMessageNano
    {
        public static final SetupWifiRequest[] EMPTY_ARRAY;
        private int bitField0_;
        private boolean cancelWifiRequest_;
        private int encryption_;
        private int signalLevel_;
        private String ssid_;
        
        static {
            EMPTY_ARRAY = new SetupWifiRequest[0];
        }
        
        public SetupWifiRequest() {
            this.ssid_ = "";
            this.encryption_ = 1;
            this.signalLevel_ = 0;
            this.cancelWifiRequest_ = false;
        }
        
        public static SetupWifiRequest parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new SetupWifiRequest().mergeFrom(codedInputByteBufferNano);
        }
        
        public static SetupWifiRequest parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new SetupWifiRequest(), array);
        }
        
        public SetupWifiRequest clearCancelWifiRequest() {
            this.cancelWifiRequest_ = false;
            this.bitField0_ &= 0xFFFFFFF7;
            return this;
        }
        
        public SetupWifiRequest clearEncryption() {
            this.encryption_ = 1;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        public SetupWifiRequest clearSignalLevel() {
            this.signalLevel_ = 0;
            this.bitField0_ &= 0xFFFFFFFB;
            return this;
        }
        
        public SetupWifiRequest clearSsid() {
            this.ssid_ = "";
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof SetupWifiRequest)) {
                    b = false;
                }
                else {
                    final SetupWifiRequest setupWifiRequest = (SetupWifiRequest)o;
                    Label_0087: {
                        if (this.ssid_ == null) {
                            if (setupWifiRequest.ssid_ != null) {
                                break Label_0087;
                            }
                        }
                        else if (!this.ssid_.equals(setupWifiRequest.ssid_)) {
                            break Label_0087;
                        }
                        if (this.encryption_ == setupWifiRequest.encryption_ && this.signalLevel_ == setupWifiRequest.signalLevel_ && this.cancelWifiRequest_ == setupWifiRequest.cancelWifiRequest_) {
                            if (this.unknownFieldData == null) {
                                if (setupWifiRequest.unknownFieldData == null) {
                                    return b;
                                }
                            }
                            else if (this.unknownFieldData.equals(setupWifiRequest.unknownFieldData)) {
                                return b;
                            }
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public boolean getCancelWifiRequest() {
            return this.cancelWifiRequest_;
        }
        
        public int getEncryption() {
            return this.encryption_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeStringSize(1, this.ssid_);
            }
            int n2 = n;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n2 = n + CodedOutputByteBufferNano.computeInt32Size(2, this.encryption_);
            }
            int n3 = n2;
            if ((this.bitField0_ & 0x4) != 0x0) {
                n3 = n2 + CodedOutputByteBufferNano.computeInt32Size(3, this.signalLevel_);
            }
            int n4 = n3;
            if ((this.bitField0_ & 0x8) != 0x0) {
                n4 = n3 + CodedOutputByteBufferNano.computeBoolSize(4, this.cancelWifiRequest_);
            }
            return this.cachedSize = n4 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public int getSignalLevel() {
            return this.signalLevel_;
        }
        
        public String getSsid() {
            return this.ssid_;
        }
        
        public boolean hasCancelWifiRequest() {
            return (this.bitField0_ & 0x8) != 0x0;
        }
        
        public boolean hasEncryption() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        public boolean hasSignalLevel() {
            return (this.bitField0_ & 0x4) != 0x0;
        }
        
        public boolean hasSsid() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        @Override
        public int hashCode() {
            int hashCode = 0;
            int hashCode2;
            if (this.ssid_ == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = this.ssid_.hashCode();
            }
            final int encryption_ = this.encryption_;
            final int signalLevel_ = this.signalLevel_;
            int n;
            if (this.cancelWifiRequest_) {
                n = 1;
            }
            else {
                n = 2;
            }
            if (this.unknownFieldData != null) {
                hashCode = this.unknownFieldData.hashCode();
            }
            return ((((hashCode2 + 527) * 31 + encryption_) * 31 + signalLevel_) * 31 + n) * 31 + hashCode;
        }
        
        @Override
        public SetupWifiRequest mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0086:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0086;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0086;
                    }
                    case 10: {
                        this.ssid_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 16: {
                        final int int32 = codedInputByteBufferNano.readInt32();
                        if (int32 == 1 || int32 == 2 || int32 == 3 || int32 == 4) {
                            this.encryption_ = int32;
                            this.bitField0_ |= 0x2;
                            continue;
                        }
                        this.encryption_ = 1;
                        continue;
                    }
                    case 24: {
                        this.signalLevel_ = codedInputByteBufferNano.readInt32();
                        this.bitField0_ |= 0x4;
                        continue;
                    }
                    case 32: {
                        this.cancelWifiRequest_ = codedInputByteBufferNano.readBool();
                        this.bitField0_ |= 0x8;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public SetupWifiRequest setCancelWifiRequest(final boolean cancelWifiRequest_) {
            this.cancelWifiRequest_ = cancelWifiRequest_;
            this.bitField0_ |= 0x8;
            return this;
        }
        
        public SetupWifiRequest setEncryption(final int encryption_) {
            this.encryption_ = encryption_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        public SetupWifiRequest setSignalLevel(final int signalLevel_) {
            this.signalLevel_ = signalLevel_;
            this.bitField0_ |= 0x4;
            return this;
        }
        
        public SetupWifiRequest setSsid(final String ssid_) {
            if (ssid_ == null) {
                throw new NullPointerException();
            }
            this.ssid_ = ssid_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeString(1, this.ssid_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeInt32(2, this.encryption_);
            }
            if ((this.bitField0_ & 0x4) != 0x0) {
                codedOutputByteBufferNano.writeInt32(3, this.signalLevel_);
            }
            if ((this.bitField0_ & 0x8) != 0x0) {
                codedOutputByteBufferNano.writeBool(4, this.cancelWifiRequest_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
        
        public interface Encryption
        {
            public static final int NONE = 1;
            public static final int WEP = 3;
            public static final int WPA = 2;
            public static final int WPA_EAP = 4;
        }
    }
    
    public static final class TimelineItemResponse extends ExtendableMessageNano
    {
        public static final TimelineItemResponse[] EMPTY_ARRAY;
        private int bitField0_;
        private String id_;
        private int syncStatus_;
        
        static {
            EMPTY_ARRAY = new TimelineItemResponse[0];
        }
        
        public TimelineItemResponse() {
            this.id_ = "";
            this.syncStatus_ = 0;
        }
        
        public static TimelineItemResponse parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new TimelineItemResponse().mergeFrom(codedInputByteBufferNano);
        }
        
        public static TimelineItemResponse parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new TimelineItemResponse(), array);
        }
        
        public TimelineItemResponse clearId() {
            this.id_ = "";
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        public TimelineItemResponse clearSyncStatus() {
            this.syncStatus_ = 0;
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof TimelineItemResponse)) {
                    b = false;
                }
                else {
                    final TimelineItemResponse timelineItemResponse = (TimelineItemResponse)o;
                    Label_0065: {
                        if (this.id_ == null) {
                            if (timelineItemResponse.id_ != null) {
                                break Label_0065;
                            }
                        }
                        else if (!this.id_.equals(timelineItemResponse.id_)) {
                            break Label_0065;
                        }
                        if (this.syncStatus_ == timelineItemResponse.syncStatus_) {
                            if (this.unknownFieldData == null) {
                                if (timelineItemResponse.unknownFieldData == null) {
                                    return b;
                                }
                            }
                            else if (this.unknownFieldData.equals(timelineItemResponse.unknownFieldData)) {
                                return b;
                            }
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public String getId() {
            return this.id_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeStringSize(1, this.id_);
            }
            int n2 = n;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n2 = n + CodedOutputByteBufferNano.computeInt32Size(2, this.syncStatus_);
            }
            return this.cachedSize = n2 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public int getSyncStatus() {
            return this.syncStatus_;
        }
        
        public boolean hasId() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        public boolean hasSyncStatus() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        @Override
        public int hashCode() {
            int hashCode = 0;
            int hashCode2;
            if (this.id_ == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = this.id_.hashCode();
            }
            final int syncStatus_ = this.syncStatus_;
            if (this.unknownFieldData != null) {
                hashCode = this.unknownFieldData.hashCode();
            }
            return ((hashCode2 + 527) * 31 + syncStatus_) * 31 + hashCode;
        }
        
        @Override
        public TimelineItemResponse mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0070:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0070;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0070;
                    }
                    case 10: {
                        this.id_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 16: {
                        final int int32 = codedInputByteBufferNano.readInt32();
                        if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                            this.syncStatus_ = int32;
                            this.bitField0_ |= 0x2;
                            continue;
                        }
                        this.syncStatus_ = 0;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public TimelineItemResponse setId(final String id_) {
            if (id_ == null) {
                throw new NullPointerException();
            }
            this.id_ = id_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        public TimelineItemResponse setSyncStatus(final int syncStatus_) {
            this.syncStatus_ = syncStatus_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeString(1, this.id_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeInt32(2, this.syncStatus_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class UpdateCredentialRequest extends ExtendableMessageNano
    {
        public static final UpdateCredentialRequest[] EMPTY_ARRAY;
        private String accountName_;
        private String accountType_;
        private int bitField0_;
        
        static {
            EMPTY_ARRAY = new UpdateCredentialRequest[0];
        }
        
        public UpdateCredentialRequest() {
            this.accountName_ = "";
            this.accountType_ = "";
        }
        
        public static UpdateCredentialRequest parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new UpdateCredentialRequest().mergeFrom(codedInputByteBufferNano);
        }
        
        public static UpdateCredentialRequest parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new UpdateCredentialRequest(), array);
        }
        
        public UpdateCredentialRequest clearAccountName() {
            this.accountName_ = "";
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        public UpdateCredentialRequest clearAccountType() {
            this.accountType_ = "";
            this.bitField0_ &= 0xFFFFFFFD;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof UpdateCredentialRequest)) {
                    b = false;
                }
                else {
                    final UpdateCredentialRequest updateCredentialRequest = (UpdateCredentialRequest)o;
                    Label_0068: {
                        if (this.accountName_ == null) {
                            if (updateCredentialRequest.accountName_ != null) {
                                break Label_0068;
                            }
                        }
                        else if (!this.accountName_.equals(updateCredentialRequest.accountName_)) {
                            break Label_0068;
                        }
                        if (this.accountType_ == null) {
                            if (updateCredentialRequest.accountType_ != null) {
                                break Label_0068;
                            }
                        }
                        else if (!this.accountType_.equals(updateCredentialRequest.accountType_)) {
                            break Label_0068;
                        }
                        if (this.unknownFieldData == null) {
                            if (updateCredentialRequest.unknownFieldData == null) {
                                return b;
                            }
                        }
                        else if (this.unknownFieldData.equals(updateCredentialRequest.unknownFieldData)) {
                            return b;
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        public String getAccountName() {
            return this.accountName_;
        }
        
        public String getAccountType() {
            return this.accountType_;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeStringSize(1, this.accountName_);
            }
            int n2 = n;
            if ((this.bitField0_ & 0x2) != 0x0) {
                n2 = n + CodedOutputByteBufferNano.computeStringSize(2, this.accountType_);
            }
            return this.cachedSize = n2 + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public boolean hasAccountName() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        public boolean hasAccountType() {
            return (this.bitField0_ & 0x2) != 0x0;
        }
        
        @Override
        public int hashCode() {
            int hashCode = 0;
            int hashCode2;
            if (this.accountName_ == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = this.accountName_.hashCode();
            }
            int hashCode3;
            if (this.accountType_ == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = this.accountType_.hashCode();
            }
            if (this.unknownFieldData != null) {
                hashCode = this.unknownFieldData.hashCode();
            }
            return ((hashCode2 + 527) * 31 + hashCode3) * 31 + hashCode;
        }
        
        @Override
        public UpdateCredentialRequest mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0070:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0070;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0070;
                    }
                    case 10: {
                        this.accountName_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                    case 18: {
                        this.accountType_ = codedInputByteBufferNano.readString();
                        this.bitField0_ |= 0x2;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public UpdateCredentialRequest setAccountName(final String accountName_) {
            if (accountName_ == null) {
                throw new NullPointerException();
            }
            this.accountName_ = accountName_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        public UpdateCredentialRequest setAccountType(final String accountType_) {
            if (accountType_ == null) {
                throw new NullPointerException();
            }
            this.accountType_ = accountType_;
            this.bitField0_ |= 0x2;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeString(1, this.accountName_);
            }
            if ((this.bitField0_ & 0x2) != 0x0) {
                codedOutputByteBufferNano.writeString(2, this.accountType_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class Wallpaper extends ExtendableMessageNano
    {
        public static final Wallpaper[] EMPTY_ARRAY;
        private int bitField0_;
        private byte[] wallpaperBytes_;
        
        static {
            EMPTY_ARRAY = new Wallpaper[0];
        }
        
        public Wallpaper() {
            this.wallpaperBytes_ = WireFormatNano.EMPTY_BYTES;
        }
        
        public static Wallpaper parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new Wallpaper().mergeFrom(codedInputByteBufferNano);
        }
        
        public static Wallpaper parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new Wallpaper(), array);
        }
        
        public Wallpaper clearWallpaperBytes() {
            this.wallpaperBytes_ = WireFormatNano.EMPTY_BYTES;
            this.bitField0_ &= 0xFFFFFFFE;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof Wallpaper)) {
                    b = false;
                }
                else {
                    final Wallpaper wallpaper = (Wallpaper)o;
                    if (Arrays.equals(this.wallpaperBytes_, wallpaper.wallpaperBytes_)) {
                        if (this.unknownFieldData == null) {
                            if (wallpaper.unknownFieldData == null) {
                                return b;
                            }
                        }
                        else if (this.unknownFieldData.equals(wallpaper.unknownFieldData)) {
                            return b;
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 0x1) != 0x0) {
                n = 0 + CodedOutputByteBufferNano.computeBytesSize(1, this.wallpaperBytes_);
            }
            return this.cachedSize = n + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public byte[] getWallpaperBytes() {
            return this.wallpaperBytes_;
        }
        
        public boolean hasWallpaperBytes() {
            return (this.bitField0_ & 0x1) != 0x0;
        }
        
        @Override
        public int hashCode() {
            int n = 17;
            int n2;
            if (this.wallpaperBytes_ == null) {
                n2 = 17 * 31;
            }
            else {
                int n3 = 0;
                while (true) {
                    n2 = n;
                    if (n3 >= this.wallpaperBytes_.length) {
                        break;
                    }
                    n = n * 31 + this.wallpaperBytes_[n3];
                    ++n3;
                }
            }
            int hashCode;
            if (this.unknownFieldData == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.unknownFieldData.hashCode();
            }
            return n2 * 31 + hashCode;
        }
        
        @Override
        public Wallpaper mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0062:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0062;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0062;
                    }
                    case 10: {
                        this.wallpaperBytes_ = codedInputByteBufferNano.readBytes();
                        this.bitField0_ |= 0x1;
                        continue;
                    }
                }
            }
            return this;
        }
        
        public Wallpaper setWallpaperBytes(final byte[] wallpaperBytes_) {
            if (wallpaperBytes_ == null) {
                throw new NullPointerException();
            }
            this.wallpaperBytes_ = wallpaperBytes_;
            this.bitField0_ |= 0x1;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if ((this.bitField0_ & 0x1) != 0x0) {
                codedOutputByteBufferNano.writeBytes(1, this.wallpaperBytes_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
    
    public static final class WallpaperInfo extends ExtendableMessageNano
    {
        public static final WallpaperInfo[] EMPTY_ARRAY;
        private Media wallpaper_;
        
        static {
            EMPTY_ARRAY = new WallpaperInfo[0];
        }
        
        public static WallpaperInfo parseFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new WallpaperInfo().mergeFrom(codedInputByteBufferNano);
        }
        
        public static WallpaperInfo parseFrom(final byte[] array) throws InvalidProtocolBufferNanoException {
            return MessageNano.mergeFrom(new WallpaperInfo(), array);
        }
        
        public WallpaperInfo clearWallpaper() {
            this.wallpaper_ = null;
            return this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o != this) {
                if (!(o instanceof WallpaperInfo)) {
                    b = false;
                }
                else {
                    final WallpaperInfo wallpaperInfo = (WallpaperInfo)o;
                    Label_0054: {
                        if (this.wallpaper_ == null) {
                            if (wallpaperInfo.wallpaper_ != null) {
                                break Label_0054;
                            }
                        }
                        else if (!this.wallpaper_.equals(wallpaperInfo.wallpaper_)) {
                            break Label_0054;
                        }
                        if (this.unknownFieldData == null) {
                            if (wallpaperInfo.unknownFieldData == null) {
                                return b;
                            }
                        }
                        else if (this.unknownFieldData.equals(wallpaperInfo.unknownFieldData)) {
                            return b;
                        }
                    }
                    b = false;
                }
            }
            return b;
        }
        
        @Override
        public int getSerializedSize() {
            int n = 0;
            if (this.wallpaper_ != null) {
                n = 0 + CodedOutputByteBufferNano.computeMessageSize(1, this.wallpaper_);
            }
            return this.cachedSize = n + WireFormatNano.computeWireSize(this.unknownFieldData);
        }
        
        public Media getWallpaper() {
            return this.wallpaper_;
        }
        
        public boolean hasWallpaper() {
            return this.wallpaper_ != null;
        }
        
        @Override
        public int hashCode() {
            int hashCode = 0;
            int hashCode2;
            if (this.wallpaper_ == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = this.wallpaper_.hashCode();
            }
            if (this.unknownFieldData != null) {
                hashCode = this.unknownFieldData.hashCode();
            }
            return (hashCode2 + 527) * 31 + hashCode;
        }
        
        @Override
        public WallpaperInfo mergeFrom(final CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        Label_0062:
            while (true) {
                final int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    default: {
                        if (this.unknownFieldData == null) {
                            this.unknownFieldData = new ArrayList<UnknownFieldData>();
                        }
                        if (!WireFormatNano.storeUnknownField(this.unknownFieldData, codedInputByteBufferNano, tag)) {
                            break Label_0062;
                        }
                        continue;
                    }
                    case 0: {
                        break Label_0062;
                    }
                    case 10: {
                        if (this.wallpaper_ == null) {
                            this.wallpaper_ = new Media();
                        }
                        codedInputByteBufferNano.readMessage(this.wallpaper_);
                        continue;
                    }
                }
            }
            return this;
        }
        
        public WallpaperInfo setWallpaper(final Media wallpaper_) {
            if (wallpaper_ == null) {
                throw new NullPointerException();
            }
            this.wallpaper_ = wallpaper_;
            return this;
        }
        
        @Override
        public void writeTo(final CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (this.wallpaper_ != null) {
                codedOutputByteBufferNano.writeMessage(1, this.wallpaper_);
            }
            WireFormatNano.writeUnknownFields(this.unknownFieldData, codedOutputByteBufferNano);
        }
    }
}
