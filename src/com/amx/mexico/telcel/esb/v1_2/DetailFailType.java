/*
 * XML Type:  DetailFailType
 * Namespace: http://amx.com/mexico/telcel/esb/v1_2
 * Java type: com.amx.mexico.telcel.esb.v1_2.DetailFailType
 *
 * Automatically generated - do not modify.
 */
package com.amx.mexico.telcel.esb.v1_2;


/**
 * An XML DetailFailType(@http://amx.com/mexico/telcel/esb/v1_2).
 *
 * This is a complex type.
 */
public interface DetailFailType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DetailFailType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2772174104CB9BFA6AABC3D289DBFB4F").resolveHandle("detailfailtypecdc3type");
    
    /**
     * Gets the "operationName" element
     */
    java.lang.String getOperationName();
    
    /**
     * Gets (as xml) the "operationName" element
     */
    com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica128Type xgetOperationName();
    
    /**
     * True if has "operationName" element
     */
    boolean isSetOperationName();
    
    /**
     * Sets the "operationName" element
     */
    void setOperationName(java.lang.String operationName);
    
    /**
     * Sets (as xml) the "operationName" element
     */
    void xsetOperationName(com.amx.mexico.telcel.esb.v1_2.CadenaAlfanumerica128Type operationName);
    
    /**
     * Unsets the "operationName" element
     */
    void unsetOperationName();
    
    /**
     * Gets array of all "errors" elements
     */
    com.amx.mexico.telcel.esb.v1_2.ErrorType[] getErrorsArray();
    
    /**
     * Gets ith "errors" element
     */
    com.amx.mexico.telcel.esb.v1_2.ErrorType getErrorsArray(int i);
    
    /**
     * Returns number of "errors" element
     */
    int sizeOfErrorsArray();
    
    /**
     * Sets array of all "errors" element
     */
    void setErrorsArray(com.amx.mexico.telcel.esb.v1_2.ErrorType[] errorsArray);
    
    /**
     * Sets ith "errors" element
     */
    void setErrorsArray(int i, com.amx.mexico.telcel.esb.v1_2.ErrorType errors);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "errors" element
     */
    com.amx.mexico.telcel.esb.v1_2.ErrorType insertNewErrors(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "errors" element
     */
    com.amx.mexico.telcel.esb.v1_2.ErrorType addNewErrors();
    
    /**
     * Removes the ith "errors" element
     */
    void removeErrors(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.amx.mexico.telcel.esb.v1_2.DetailFailType newInstance() {
          return (com.amx.mexico.telcel.esb.v1_2.DetailFailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailFailType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.amx.mexico.telcel.esb.v1_2.DetailFailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.amx.mexico.telcel.esb.v1_2.DetailFailType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailFailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailFailType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailFailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.amx.mexico.telcel.esb.v1_2.DetailFailType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailFailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailFailType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailFailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailFailType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailFailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailFailType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailFailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailFailType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailFailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailFailType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailFailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailFailType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailFailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailFailType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailFailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailFailType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailFailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailFailType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailFailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailFailType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailFailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.amx.mexico.telcel.esb.v1_2.DetailFailType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailFailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.amx.mexico.telcel.esb.v1_2.DetailFailType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailFailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.amx.mexico.telcel.esb.v1_2.DetailFailType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.amx.mexico.telcel.esb.v1_2.DetailFailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
