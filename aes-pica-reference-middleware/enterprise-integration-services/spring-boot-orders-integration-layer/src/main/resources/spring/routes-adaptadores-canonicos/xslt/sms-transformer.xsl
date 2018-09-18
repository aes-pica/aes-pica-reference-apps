<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:ns1="http://aes-pica-javeriana/enterprise-model/framework/domain-events/1.0.0"
	xmlns:ns11="http://aes-pica-javeriana/enterprise-model/framework/common-artifacts/1.0.0"
	xmlns:ns12="http://aes-pica-javeriana/enterprise-model/framework/entities/1.0.0"
	exclude-result-prefixes="#default ns1 ns11 ns12">

	<xsl:template match="/">
		<!-- TODO: Auto-generated template -->
		<pub:publicar
			xmlns:pub="http://claro.com.co/publicaciones/publicador-sms/">
			<mensaje><xsl:value-of select="/ns1:notification/ns12:message"/></mensaje>
			<codigoPais><xsl:value-of select="/ns1:notification/ns12:countryCode"/></codigoPais>
			<numeroDestinatario><xsl:value-of select="/ns1:notification/ns12:targetNumber"/></numeroDestinatario>
		</pub:publicar>

	</xsl:template>
</xsl:stylesheet>