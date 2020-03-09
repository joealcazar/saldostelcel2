/*
 * XML Type:  ControlDataResponseHeaderType
 * Namespace: http://amx.com/mexico/telcel/esb/v1_2
 * Java type: com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType
 *
 * Automatically generated - do not modify.
 */
package com.amx.mexico.telcel.esb.v1_2;


/**
 * An XML ControlDataResponseHeaderType(@http://amx.com/mexico/telcel/esb/v1_2).
 *
 * This is a complex type.
 */
public interface ControlDataResponseHeaderType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ControlDataResponseHeaderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2772174104CB9BFA6AABC3D289DBFB4F").resolveHandle("controldataresponseheadertype1cb7type");
    
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
     * Gets the "resultCode" element
     */
    java.lang.String getResultCode();
    
    /**
     * Gets (as xml) the "resultCode" element
     */
    com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type xgetResultCode();
    
    /**
     * Sets the "resultCode" element
     */
    void setResultCode(java.lang.String resultCode);
    
    /**
     * Sets (as xml) the "resultCode" element
     */
    void xsetResultCode(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica20Type resultCode);
    
    /**
     * Gets the "resultDesc" element
     */
    java.lang.String getResultDesc();
    
    /**
     * Gets (as xml) the "resultDesc" element
     */
    com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1024Type xgetResultDesc();
    
    /**
     * Sets the "resultDesc" element
     */
    void setResultDesc(java.lang.String resultDesc);
    
    /**
     * Sets (as xml) the "resultDesc" element
     */
    void xsetResultDesc(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica1024Type resultDesc);
    
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
     * Gets the "msgLanguageCode" element
     */
    java.lang.String getMsgLanguageCode();
    
    /**
     * Gets (as xml) the "msgLanguageCode" element
     */
    com.amx.mexico.telcel.esb.v1_2.BesCbsLanguageCodeType xgetMsgLanguageCode();
    
    /**
     * True if has "msgLanguageCode" element
     */
    boolean isSetMsgLanguageCode();
    
    /**
     * Sets the "msgLanguageCode" element
     */
    void setMsgLanguageCode(java.lang.String msgLanguageCode);
    
    /**
     * Sets (as xml) the "msgLanguageCode" element
     */
    void xsetMsgLanguageCode(com.amx.mexico.telcel.esb.v1_2.BesCbsLanguageCodeType msgLanguageCode);
    
    /**
     * Unsets the "msgLanguageCode" element
     */
    void unsetMsgLanguageCode();
    
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
     * Gets the "responseDate" element
     */
    java.util.Calendar getResponseDate();
    
    /**
     * Gets (as xml) the "responseDate" element
     */
    com.amx.mexico.telcel.esb.v1_2.DateTimeType xgetResponseDate();
    
    /**
     * Sets the "responseDate" element
     */
    void setResponseDate(java.util.Calendar responseDate);
    
    /**
     * Sets (as xml) the "responseDate" element
     */
    void xsetResponseDate(com.amx.mexico.telcel.esb.v1_2.DateTimeType responseDate);
    
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
     * Gets the "latency" element
     */
    int getLatency();
    
    /**
     * Gets (as xml) the "latency" element
     */
    com.amx.mexico.telcel.esb.v1_2.LatencyType xgetLatency();
    
    /**
     * Sets the "latency" element
     */
    void setLatency(int latency);
    
    /**
     * Sets (as xml) the "latency" element
     */
    void xsetLatency(com.amx.mexico.telcel.esb.v1_2.LatencyType latency);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType newInstance() {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.amx.mexico.telcel.esb.v1_2.ControlDataResponseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
