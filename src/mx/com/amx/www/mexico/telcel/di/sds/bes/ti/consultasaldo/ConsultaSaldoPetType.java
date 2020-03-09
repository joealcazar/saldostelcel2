/*
 * XML Type:  ConsultaSaldoPetType
 * Namespace: http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo
 * Java type: mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType
 *
 * Automatically generated - do not modify.
 */
package mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo;


/**
 * An XML ConsultaSaldoPetType(@http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo).
 *
 * This is a complex type.
 */
public interface ConsultaSaldoPetType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConsultaSaldoPetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2772174104CB9BFA6AABC3D289DBFB4F").resolveHandle("consultasaldopettype756ctype");
    
    /**
     * Gets the "codigoCuenta" element
     */
    java.lang.String getCodigoCuenta();
    
    /**
     * Gets (as xml) the "codigoCuenta" element
     */
    mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CadenaAlfanumerica32Type xgetCodigoCuenta();
    
    /**
     * True if has "codigoCuenta" element
     */
    boolean isSetCodigoCuenta();
    
    /**
     * Sets the "codigoCuenta" element
     */
    void setCodigoCuenta(java.lang.String codigoCuenta);
    
    /**
     * Sets (as xml) the "codigoCuenta" element
     */
    void xsetCodigoCuenta(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CadenaAlfanumerica32Type codigoCuenta);
    
    /**
     * Unsets the "codigoCuenta" element
     */
    void unsetCodigoCuenta();
    
    /**
     * Gets the "msisdn" element
     */
    java.lang.String getMsisdn();
    
    /**
     * Gets (as xml) the "msisdn" element
     */
    mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.TelcoMSISDNType xgetMsisdn();
    
    /**
     * True if has "msisdn" element
     */
    boolean isSetMsisdn();
    
    /**
     * Sets the "msisdn" element
     */
    void setMsisdn(java.lang.String msisdn);
    
    /**
     * Sets (as xml) the "msisdn" element
     */
    void xsetMsisdn(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.TelcoMSISDNType msisdn);
    
    /**
     * Unsets the "msisdn" element
     */
    void unsetMsisdn();
    
    /**
     * Gets the "cSaldoActual" element
     */
    boolean getCSaldoActual();
    
    /**
     * Gets (as xml) the "cSaldoActual" element
     */
    mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType xgetCSaldoActual();
    
    /**
     * Sets the "cSaldoActual" element
     */
    void setCSaldoActual(boolean cSaldoActual);
    
    /**
     * Sets (as xml) the "cSaldoActual" element
     */
    void xsetCSaldoActual(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType cSaldoActual);
    
    /**
     * Gets the "cSaldoEstimado" element
     */
    boolean getCSaldoEstimado();
    
    /**
     * Gets (as xml) the "cSaldoEstimado" element
     */
    mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType xgetCSaldoEstimado();
    
    /**
     * Sets the "cSaldoEstimado" element
     */
    void setCSaldoEstimado(boolean cSaldoEstimado);
    
    /**
     * Sets (as xml) the "cSaldoEstimado" element
     */
    void xsetCSaldoEstimado(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType cSaldoEstimado);
    
    /**
     * Gets the "cSaldoPenalizaciones" element
     */
    boolean getCSaldoPenalizaciones();
    
    /**
     * Gets (as xml) the "cSaldoPenalizaciones" element
     */
    mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType xgetCSaldoPenalizaciones();
    
    /**
     * Sets the "cSaldoPenalizaciones" element
     */
    void setCSaldoPenalizaciones(boolean cSaldoPenalizaciones);
    
    /**
     * Sets (as xml) the "cSaldoPenalizaciones" element
     */
    void xsetCSaldoPenalizaciones(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType cSaldoPenalizaciones);
    
    /**
     * Gets the "cSaldoCapas" element
     */
    boolean getCSaldoCapas();
    
    /**
     * Gets (as xml) the "cSaldoCapas" element
     */
    mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType xgetCSaldoCapas();
    
    /**
     * Sets the "cSaldoCapas" element
     */
    void setCSaldoCapas(boolean cSaldoCapas);
    
    /**
     * Sets (as xml) the "cSaldoCapas" element
     */
    void xsetCSaldoCapas(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.BoleanoType cSaldoCapas);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType newInstance() {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.ConsultaSaldoPetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
