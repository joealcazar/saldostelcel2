/*
 * XML Type:  BesCbsRequestHeaderType
 * Namespace: http://amx.com/mexico/telcel/esb/v1_2
 * Java type: com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType
 *
 * Automatically generated - do not modify.
 */
package com.amx.mexico.telcel.esb.v1_2;


/**
 * An XML BesCbsRequestHeaderType(@http://amx.com/mexico/telcel/esb/v1_2).
 *
 * This is a complex type.
 */
public interface BesCbsRequestHeaderType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BesCbsRequestHeaderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2772174104CB9BFA6AABC3D289DBFB4F").resolveHandle("bescbsrequestheadertype789atype");
    
    /**
     * Gets the "ownershipInfo" element
     */
    com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType getOwnershipInfo();
    
    /**
     * True if has "ownershipInfo" element
     */
    boolean isSetOwnershipInfo();
    
    /**
     * Sets the "ownershipInfo" element
     */
    void setOwnershipInfo(com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType ownershipInfo);
    
    /**
     * Appends and returns a new empty "ownershipInfo" element
     */
    com.amx.mexico.telcel.esb.v1_2.BesCbsOwnershipInfoType addNewOwnershipInfo();
    
    /**
     * Unsets the "ownershipInfo" element
     */
    void unsetOwnershipInfo();
    
    /**
     * Gets the "operatorInfo" element
     */
    com.amx.mexico.telcel.esb.v1_2.BesCbsOperatorInfoType getOperatorInfo();
    
    /**
     * True if has "operatorInfo" element
     */
    boolean isSetOperatorInfo();
    
    /**
     * Sets the "operatorInfo" element
     */
    void setOperatorInfo(com.amx.mexico.telcel.esb.v1_2.BesCbsOperatorInfoType operatorInfo);
    
    /**
     * Appends and returns a new empty "operatorInfo" element
     */
    com.amx.mexico.telcel.esb.v1_2.BesCbsOperatorInfoType addNewOperatorInfo();
    
    /**
     * Unsets the "operatorInfo" element
     */
    void unsetOperatorInfo();
    
    /**
     * Gets the "accessMode" element
     */
    java.lang.String getAccessMode();
    
    /**
     * Gets (as xml) the "accessMode" element
     */
    com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type xgetAccessMode();
    
    /**
     * True if has "accessMode" element
     */
    boolean isSetAccessMode();
    
    /**
     * Sets the "accessMode" element
     */
    void setAccessMode(java.lang.String accessMode);
    
    /**
     * Sets (as xml) the "accessMode" element
     */
    void xsetAccessMode(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica24Type accessMode);
    
    /**
     * Unsets the "accessMode" element
     */
    void unsetAccessMode();
    
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
     * Gets the "timeFormat" element
     */
    com.amx.mexico.telcel.esb.v1_2.BesCbsTimeFormatType getTimeFormat();
    
    /**
     * True if has "timeFormat" element
     */
    boolean isSetTimeFormat();
    
    /**
     * Sets the "timeFormat" element
     */
    void setTimeFormat(com.amx.mexico.telcel.esb.v1_2.BesCbsTimeFormatType timeFormat);
    
    /**
     * Appends and returns a new empty "timeFormat" element
     */
    com.amx.mexico.telcel.esb.v1_2.BesCbsTimeFormatType addNewTimeFormat();
    
    /**
     * Unsets the "timeFormat" element
     */
    void unsetTimeFormat();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType newInstance() {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.amx.mexico.telcel.esb.v1_2.BesCbsRequestHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
