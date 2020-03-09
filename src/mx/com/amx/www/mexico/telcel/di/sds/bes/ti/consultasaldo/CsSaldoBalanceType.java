/*
 * XML Type:  CsSaldoBalanceType
 * Namespace: http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo
 * Java type: mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType
 *
 * Automatically generated - do not modify.
 */
package mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo;


/**
 * An XML CsSaldoBalanceType(@http://www.amx.com.mx/mexico/telcel/di/sds/bes/ti/consultasaldo).
 *
 * This is a complex type.
 */
public interface CsSaldoBalanceType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CsSaldoBalanceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2772174104CB9BFA6AABC3D289DBFB4F").resolveHandle("cssaldobalancetype5964type");
    
    /**
     * Gets the "saldoActual" element
     */
    java.math.BigDecimal getSaldoActual();
    
    /**
     * Gets (as xml) the "saldoActual" element
     */
    mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type xgetSaldoActual();
    
    /**
     * True if has "saldoActual" element
     */
    boolean isSetSaldoActual();
    
    /**
     * Sets the "saldoActual" element
     */
    void setSaldoActual(java.math.BigDecimal saldoActual);
    
    /**
     * Sets (as xml) the "saldoActual" element
     */
    void xsetSaldoActual(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type saldoActual);
    
    /**
     * Unsets the "saldoActual" element
     */
    void unsetSaldoActual();
    
    /**
     * Gets the "saldoEstimado" element
     */
    java.math.BigDecimal getSaldoEstimado();
    
    /**
     * Gets (as xml) the "saldoEstimado" element
     */
    mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type xgetSaldoEstimado();
    
    /**
     * True if has "saldoEstimado" element
     */
    boolean isSetSaldoEstimado();
    
    /**
     * Sets the "saldoEstimado" element
     */
    void setSaldoEstimado(java.math.BigDecimal saldoEstimado);
    
    /**
     * Sets (as xml) the "saldoEstimado" element
     */
    void xsetSaldoEstimado(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type saldoEstimado);
    
    /**
     * Unsets the "saldoEstimado" element
     */
    void unsetSaldoEstimado();
    
    /**
     * Gets the "saldoPenalizaciones" element
     */
    java.math.BigDecimal getSaldoPenalizaciones();
    
    /**
     * Gets (as xml) the "saldoPenalizaciones" element
     */
    mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type xgetSaldoPenalizaciones();
    
    /**
     * True if has "saldoPenalizaciones" element
     */
    boolean isSetSaldoPenalizaciones();
    
    /**
     * Sets the "saldoPenalizaciones" element
     */
    void setSaldoPenalizaciones(java.math.BigDecimal saldoPenalizaciones);
    
    /**
     * Sets (as xml) the "saldoPenalizaciones" element
     */
    void xsetSaldoPenalizaciones(mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.Decimal14C6Type saldoPenalizaciones);
    
    /**
     * Unsets the "saldoPenalizaciones" element
     */
    void unsetSaldoPenalizaciones();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType newInstance() {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mx.com.amx.www.mexico.telcel.di.sds.bes.ti.consultasaldo.CsSaldoBalanceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
