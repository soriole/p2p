package com.soriole.kademlia.core;

class DataMessage extends MessageWithKnownRecipient {
  private static final long serialVersionUID = 1L;

  private final Key mKey;
  private final byte[] mValue;

  public DataMessage(NodeInfo srcNodeInfo, NodeInfo destNodeInfo, Key searchedKey, byte[] value) {
    super(srcNodeInfo, destNodeInfo);
    mKey = searchedKey;
    mValue = value;
  }

  public Key getKey() {
    return mKey;
  }

  public byte[] getValue(){
    return mValue;
  }

}
