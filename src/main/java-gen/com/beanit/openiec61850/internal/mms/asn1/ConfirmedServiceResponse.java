/** This class file was automatically generated by jASN1 (http://www.beanit.com) */
package com.beanit.openiec61850.internal.mms.asn1;

import com.beanit.jasn1.ber.BerTag;
import com.beanit.jasn1.ber.ReverseByteArrayOutputStream;
import com.beanit.jasn1.ber.types.BerType;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class ConfirmedServiceResponse implements BerType, Serializable {

  private static final long serialVersionUID = 1L;

  public byte[] code = null;
  private GetNameListResponse getNameList = null;
  private ReadResponse read = null;
  private WriteResponse write = null;
  private GetVariableAccessAttributesResponse getVariableAccessAttributes = null;
  private DefineNamedVariableListResponse defineNamedVariableList = null;
  private GetNamedVariableListAttributesResponse getNamedVariableListAttributes = null;
  private DeleteNamedVariableListResponse deleteNamedVariableList = null;
  private FileOpenResponse fileOpen = null;
  private FileReadResponse fileRead = null;
  private FileCloseResponse fileClose = null;
  private FileDeleteResponse fileDelete = null;
  private FileDirectoryResponse fileDirectory = null;

  public ConfirmedServiceResponse() {}

  public ConfirmedServiceResponse(byte[] code) {
    this.code = code;
  }

  public GetNameListResponse getGetNameList() {
    return getNameList;
  }

  public void setGetNameList(GetNameListResponse getNameList) {
    this.getNameList = getNameList;
  }

  public ReadResponse getRead() {
    return read;
  }

  public void setRead(ReadResponse read) {
    this.read = read;
  }

  public WriteResponse getWrite() {
    return write;
  }

  public void setWrite(WriteResponse write) {
    this.write = write;
  }

  public GetVariableAccessAttributesResponse getGetVariableAccessAttributes() {
    return getVariableAccessAttributes;
  }

  public void setGetVariableAccessAttributes(
      GetVariableAccessAttributesResponse getVariableAccessAttributes) {
    this.getVariableAccessAttributes = getVariableAccessAttributes;
  }

  public DefineNamedVariableListResponse getDefineNamedVariableList() {
    return defineNamedVariableList;
  }

  public void setDefineNamedVariableList(DefineNamedVariableListResponse defineNamedVariableList) {
    this.defineNamedVariableList = defineNamedVariableList;
  }

  public GetNamedVariableListAttributesResponse getGetNamedVariableListAttributes() {
    return getNamedVariableListAttributes;
  }

  public void setGetNamedVariableListAttributes(
      GetNamedVariableListAttributesResponse getNamedVariableListAttributes) {
    this.getNamedVariableListAttributes = getNamedVariableListAttributes;
  }

  public DeleteNamedVariableListResponse getDeleteNamedVariableList() {
    return deleteNamedVariableList;
  }

  public void setDeleteNamedVariableList(DeleteNamedVariableListResponse deleteNamedVariableList) {
    this.deleteNamedVariableList = deleteNamedVariableList;
  }

  public FileOpenResponse getFileOpen() {
    return fileOpen;
  }

  public void setFileOpen(FileOpenResponse fileOpen) {
    this.fileOpen = fileOpen;
  }

  public FileReadResponse getFileRead() {
    return fileRead;
  }

  public void setFileRead(FileReadResponse fileRead) {
    this.fileRead = fileRead;
  }

  public FileCloseResponse getFileClose() {
    return fileClose;
  }

  public void setFileClose(FileCloseResponse fileClose) {
    this.fileClose = fileClose;
  }

  public FileDeleteResponse getFileDelete() {
    return fileDelete;
  }

  public void setFileDelete(FileDeleteResponse fileDelete) {
    this.fileDelete = fileDelete;
  }

  public FileDirectoryResponse getFileDirectory() {
    return fileDirectory;
  }

  public void setFileDirectory(FileDirectoryResponse fileDirectory) {
    this.fileDirectory = fileDirectory;
  }

  public int encode(OutputStream reverseOS) throws IOException {

    if (code != null) {
      for (int i = code.length - 1; i >= 0; i--) {
        reverseOS.write(code[i]);
      }
      return code.length;
    }

    int codeLength = 0;
    if (fileDirectory != null) {
      codeLength += fileDirectory.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 77
      reverseOS.write(0x4D);
      reverseOS.write(0xBF);
      codeLength += 2;
      return codeLength;
    }

    if (fileDelete != null) {
      codeLength += fileDelete.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, PRIMITIVE, 76
      reverseOS.write(0x4C);
      reverseOS.write(0x9F);
      codeLength += 2;
      return codeLength;
    }

    if (fileClose != null) {
      codeLength += fileClose.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, PRIMITIVE, 74
      reverseOS.write(0x4A);
      reverseOS.write(0x9F);
      codeLength += 2;
      return codeLength;
    }

    if (fileRead != null) {
      codeLength += fileRead.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 73
      reverseOS.write(0x49);
      reverseOS.write(0xBF);
      codeLength += 2;
      return codeLength;
    }

    if (fileOpen != null) {
      codeLength += fileOpen.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 72
      reverseOS.write(0x48);
      reverseOS.write(0xBF);
      codeLength += 2;
      return codeLength;
    }

    if (deleteNamedVariableList != null) {
      codeLength += deleteNamedVariableList.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 13
      reverseOS.write(0xAD);
      codeLength += 1;
      return codeLength;
    }

    if (getNamedVariableListAttributes != null) {
      codeLength += getNamedVariableListAttributes.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 12
      reverseOS.write(0xAC);
      codeLength += 1;
      return codeLength;
    }

    if (defineNamedVariableList != null) {
      codeLength += defineNamedVariableList.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, PRIMITIVE, 11
      reverseOS.write(0x8B);
      codeLength += 1;
      return codeLength;
    }

    if (getVariableAccessAttributes != null) {
      codeLength += getVariableAccessAttributes.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 6
      reverseOS.write(0xA6);
      codeLength += 1;
      return codeLength;
    }

    if (write != null) {
      codeLength += write.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 5
      reverseOS.write(0xA5);
      codeLength += 1;
      return codeLength;
    }

    if (read != null) {
      codeLength += read.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 4
      reverseOS.write(0xA4);
      codeLength += 1;
      return codeLength;
    }

    if (getNameList != null) {
      codeLength += getNameList.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 1
      reverseOS.write(0xA1);
      codeLength += 1;
      return codeLength;
    }

    throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
  }

  public int decode(InputStream is) throws IOException {
    return decode(is, null);
  }

  public int decode(InputStream is, BerTag berTag) throws IOException {

    int codeLength = 0;
    BerTag passedTag = berTag;

    if (berTag == null) {
      berTag = new BerTag();
      codeLength += berTag.decode(is);
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
      getNameList = new GetNameListResponse();
      codeLength += getNameList.decode(is, false);
      return codeLength;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 4)) {
      read = new ReadResponse();
      codeLength += read.decode(is, false);
      return codeLength;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 5)) {
      write = new WriteResponse();
      codeLength += write.decode(is, false);
      return codeLength;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 6)) {
      getVariableAccessAttributes = new GetVariableAccessAttributesResponse();
      codeLength += getVariableAccessAttributes.decode(is, false);
      return codeLength;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 11)) {
      defineNamedVariableList = new DefineNamedVariableListResponse();
      codeLength += defineNamedVariableList.decode(is, false);
      return codeLength;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 12)) {
      getNamedVariableListAttributes = new GetNamedVariableListAttributesResponse();
      codeLength += getNamedVariableListAttributes.decode(is, false);
      return codeLength;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 13)) {
      deleteNamedVariableList = new DeleteNamedVariableListResponse();
      codeLength += deleteNamedVariableList.decode(is, false);
      return codeLength;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 72)) {
      fileOpen = new FileOpenResponse();
      codeLength += fileOpen.decode(is, false);
      return codeLength;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 73)) {
      fileRead = new FileReadResponse();
      codeLength += fileRead.decode(is, false);
      return codeLength;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 74)) {
      fileClose = new FileCloseResponse();
      codeLength += fileClose.decode(is, false);
      return codeLength;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 76)) {
      fileDelete = new FileDeleteResponse();
      codeLength += fileDelete.decode(is, false);
      return codeLength;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 77)) {
      fileDirectory = new FileDirectoryResponse();
      codeLength += fileDirectory.decode(is, false);
      return codeLength;
    }

    if (passedTag != null) {
      return 0;
    }

    throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
  }

  public void encodeAndSave(int encodingSizeGuess) throws IOException {
    ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
    encode(reverseOS);
    code = reverseOS.getArray();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    appendAsString(sb, 0);
    return sb.toString();
  }

  public void appendAsString(StringBuilder sb, int indentLevel) {

    if (getNameList != null) {
      sb.append("getNameList: ");
      getNameList.appendAsString(sb, indentLevel + 1);
      return;
    }

    if (read != null) {
      sb.append("read: ");
      read.appendAsString(sb, indentLevel + 1);
      return;
    }

    if (write != null) {
      sb.append("write: ");
      write.appendAsString(sb, indentLevel + 1);
      return;
    }

    if (getVariableAccessAttributes != null) {
      sb.append("getVariableAccessAttributes: ");
      getVariableAccessAttributes.appendAsString(sb, indentLevel + 1);
      return;
    }

    if (defineNamedVariableList != null) {
      sb.append("defineNamedVariableList: ").append(defineNamedVariableList);
      return;
    }

    if (getNamedVariableListAttributes != null) {
      sb.append("getNamedVariableListAttributes: ");
      getNamedVariableListAttributes.appendAsString(sb, indentLevel + 1);
      return;
    }

    if (deleteNamedVariableList != null) {
      sb.append("deleteNamedVariableList: ");
      deleteNamedVariableList.appendAsString(sb, indentLevel + 1);
      return;
    }

    if (fileOpen != null) {
      sb.append("fileOpen: ");
      fileOpen.appendAsString(sb, indentLevel + 1);
      return;
    }

    if (fileRead != null) {
      sb.append("fileRead: ");
      fileRead.appendAsString(sb, indentLevel + 1);
      return;
    }

    if (fileClose != null) {
      sb.append("fileClose: ").append(fileClose);
      return;
    }

    if (fileDelete != null) {
      sb.append("fileDelete: ").append(fileDelete);
      return;
    }

    if (fileDirectory != null) {
      sb.append("fileDirectory: ");
      fileDirectory.appendAsString(sb, indentLevel + 1);
      return;
    }

    sb.append("<none>");
  }
}
