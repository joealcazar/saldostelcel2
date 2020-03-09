/*
 * XML Type:  ControlDataRequestHeaderType
 * Namespace: http://amx.com/mexico/telcel/esb/v1_2
 * Java type: com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType
 *
 * Automatically generated - do not modify.
 */
package com.amx.mexico.telcel.esb.v1_2;


/**
 * An XML ControlDataRequestHeaderType(@http://amx.com/mexico/telcel/esb/v1_2).
 *
 * This is a complex type.
 */
public interface ControlDataRequestHeaderType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ControlDataRequestHeaderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2772174104CB9BFA6AABC3D289DBFB4F").resolveHandle("controldatarequestheadertype6e09type");
    
    /**
     * Gets the "version" element
     */
    java.lang.String getVersion();
    
    /**
     * Gets (as xml) the "version" element
     */
    com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type xgetVersion();
    
    /**
     * Sets the "version" element
     */
    void setVersion(java.lang.String version);
    
    /**
     * Sets (as xml) the "version" element
     */
    void xsetVersion(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type version);
    
    /**
     * Gets the "businessCode" element
     */
    java.lang.String getBusinessCode();
    
    /**
     * Gets (as xml) the "businessCode" element
     */
    com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica23Type xgetBusinessCode();
    
    /**
     * True if has "businessCode" element
     */
    boolean isSetBusinessCode();
    
    /**
     * Sets the "businessCode" element
     */
    void setBusinessCode(java.lang.String businessCode);
    
    /**
     * Sets (as xml) the "businessCode" element
     */
    void xsetBusinessCode(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica23Type businessCode);
    
    /**
     * Unsets the "businessCode" element
     */
    void unsetBusinessCode();
    
    /**
     * Gets the "messageUUID" element
     */
    java.lang.String getMessageUUID();
    
    /**
     * Gets (as xml) the "messageUUID" element
     */
    com.amx.mexico.telcel.esb.v1_2.MessageUUIDType xgetMessageUUID();
    
    /**
     * Sets the "messageUUID" element
     */
    void setMessageUUID(java.lang.String messageUUID);
    
    /**
     * Sets (as xml) the "messageUUID" element
     */
    void xsetMessageUUID(com.amx.mexico.telcel.esb.v1_2.MessageUUIDType messageUUID);
    
    /**
     * Gets array of all "additionalProperty" elements
     */
    com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType[] getAdditionalPropertyArray();
    
    /**
     * Gets ith "additionalProperty" element
     */
    com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType getAdditionalPropertyArray(int i);
    
    /**
     * Returns number of "additionalProperty" element
     */
    int sizeOfAdditionalPropertyArray();
    
    /**
     * Sets array of all "additionalProperty" element
     */
    void setAdditionalPropertyArray(com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType[] additionalPropertyArray);
    
    /**
     * Sets ith "additionalProperty" element
     */
    void setAdditionalPropertyArray(int i, com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType additionalProperty);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "additionalProperty" element
     */
    com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType insertNewAdditionalProperty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "additionalProperty" element
     */
    com.amx.mexico.telcel.esb.v1_2.BesAdditionalPropertyType addNewAdditionalProperty();
    
    /**
     * Removes the ith "additionalProperty" element
     */
    void removeAdditionalProperty(int i);
    
    /**
     * Gets the "requestDate" element
     */
    java.util.Calendar getRequestDate();
    
    /**
     * Gets (as xml) the "requestDate" element
     */
    com.amx.mexico.telcel.esb.v1_2.DateTimeType xgetRequestDate();
    
    /**
     * Sets the "requestDate" element
     */
    void setRequestDate(java.util.Calendar requestDate);
    
    /**
     * Sets (as xml) the "requestDate" element
     */
    void xsetRequestDate(com.amx.mexico.telcel.esb.v1_2.DateTimeType requestDate);
    
    /**
     * Gets the "sendBy" element
     */
    java.lang.String getSendBy();
    
    /**
     * Gets (as xml) the "sendBy" element
     */
    com.amx.mexico.telcel.esb.v1_2.SenderType xgetSendBy();
    
    /**
     * Sets the "sendBy" element
     */
    void setSendBy(java.lang.String sendBy);
    
    /**
     * Sets (as xml) the "sendBy" element
     */
    void xsetSendBy(com.amx.mexico.telcel.esb.v1_2.SenderType sendBy);
    
    /**
     * Gets the "ipClient" element
     */
    java.lang.String getIpClient();
    
    /**
     * Gets (as xml) the "ipClient" element
     */
    com.amx.mexico.telcel.esb.v1_2.IPv4AddressType xgetIpClient();
    
    /**
     * True if has "ipClient" element
     */
    boolean isSetIpClient();
    
    /**
     * Sets the "ipClient" element
     */
    void setIpClient(java.lang.String ipClient);
    
    /**
     * Sets (as xml) the "ipClient" element
     */
    void xsetIpClient(com.amx.mexico.telcel.esb.v1_2.IPv4AddressType ipClient);
    
    /**
     * Unsets the "ipClient" element
     */
    void unsetIpClient();
    
    /**
     * Gets the "ipServer" element
     */
    java.lang.String getIpServer();
    
    /**
     * Gets (as xml) the "ipServer" element
     */
    com.amx.mexico.telcel.esb.v1_2.IPv4AddressType xgetIpServer();
    
    /**
     * True if has "ipServer" element
     */
    boolean isSetIpServer();
    
    /**
     * Sets the "ipServer" element
     */
    void setIpServer(java.lang.String ipServer);
    
    /**
     * Sets (as xml) the "ipServer" element
     */
    void xsetIpServer(com.amx.mexico.telcel.esb.v1_2.IPv4AddressType ipServer);
    
    /**
     * Unsets the "ipServer" element
     */
    void unsetIpServer();
    
    /**
     * Gets the "user" element
     */
    java.lang.String getUser();
    
    /**
     * Gets (as xml) the "user" element
     */
    com.amx.mexico.telcel.esb.v1_2.UserType xgetUser();
    
    /**
     * True if has "user" element
     */
    boolean isSetUser();
    
    /**
     * Sets the "user" element
     */
    void setUser(java.lang.String user);
    
    /**
     * Sets (as xml) the "user" element
     */
    void xsetUser(com.amx.mexico.telcel.esb.v1_2.UserType user);
    
    /**
     * Unsets the "user" element
     */
    void unsetUser();
    
    /**
     * Gets the "besCbsRequestHeader" element
     */
    com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType getBesCbsRequestHeader();
    
    /**
     * True if has "besCbsRequestHeader" element
     */
    boolean isSetBesCbsRequestHeader();
    
    /**
     * Sets the "besCbsRequestHeader" element
     */
    void setBesCbsRequestHeader(com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType besCbsRequestHeader);
    
    /**
     * Appends and returns a new empty "besCbsRequestHeader" element
     */
    com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType addNewBesCbsRequestHeader();
    
    /**
     * Unsets the "besCbsRequestHeader" element
     */
    void unsetBesCbsRequestHeader();
    
    /**
     * Gets the "besCrmRequestHeader" element
     */
    com.amx.mexico.telcel.esb.v1_2.BesCrmRequestHeaderType getBesCrmRequestHeader();
    
    /**
     * True if has "besCrmRequestHeader" element
     */
    boolean isSetBesCrmRequestHeader();
    
    /**
     * Sets the "besCrmRequestHeader" element
     */
    void setBesCrmRequestHeader(com.amx.mexico.telcel.esb.v1_2.BesCrmRequestHeaderType besCrmRequestHeader);
    
    /**
     * Appends and returns a new empty "besCrmRequestHeader" element
     */
    com.amx.mexico.telcel.esb.v1_2.BesCrmRequestHeaderType addNewBesCrmRequestHeader();
    
    /**
     * Unsets the "besCrmRequestHeader" element
     */
    void unsetBesCrmRequestHeader();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType newInstance() {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
