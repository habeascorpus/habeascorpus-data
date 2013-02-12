package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
xsltc	TokenNameIdentifier
.	TokenNameDOT
compiler	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ListResourceBundle	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ErrorMessages_ca	TokenNameIdentifier
extends	TokenNameextends
ListResourceBundle	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getContents	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MULTIPLE_STYLESHEET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"S'ha definit més d'un full d'estils en el mateix fitxer."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TEMPLATE_REDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"La plantilla ''{0}'' ja està definida en aquest full d''estil. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TEMPLATE_UNDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"La plantilla ''{0}'' no està definida en aquest full d''estil. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
VARIABLE_REDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"La variable ''{0}'' s''ha definit més d''una vegada en el mateix àmbit. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
VARIABLE_UNDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"La variable o el paràmetre ''{0}'' no s''ha definit. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CLASS_NOT_FOUND_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"No es pot trobar la classe ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
METHOD_NOT_FOUND_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"No es pot trobar el mètode extern ''{0}'' (ha de ser públic)."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ARGUMENT_CONVERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"No es pot convertir el tipus d''argument/retorn en la crida al mètode ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FILE_NOT_FOUND_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"No s''ha trobat el fitxer o URI ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INVALID_URI_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L''URI ''{0}'' no és vàlid."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FILE_ACCESS_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"No es pot obrir el fitxer o URI ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MISSING_ROOT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"S'esperava l'element <xsl:stylesheet> o <xsl:transform>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NAMESPACE_UNDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"No s''ha declarat el prefix de l''espai de noms ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FUNCTION_RESOLVE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"No es pot resoldre la crida a la funció ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NEED_LITERAL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L''argument de ''{0}'' ha de ser una cadena de literals. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
XPATH_PARSER_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Error en analitzar l''expressió XPath ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
REQUIRED_ATTR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Falta l''atribut obligatori ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_CHAR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L''expressió XPath conté el caràcter no permès ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_PI_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"La instrucció de procés conté el nom no permès ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
STRAY_ATTRIBUTE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L''atribut ''{0}'' es troba fora de l''element. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_ATTRIBUTE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Atribut no permès ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CIRCULAR_INCLUDE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Import/include circular. El full d''estil ''{0}'' ja s''ha carregat. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
RESULT_TREE_SORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Els fragments de l'arbre de resultats no es poden classificar (es passen per alt els elements <xsl:sort>). Heu de classificar els nodes quan creeu l'arbre de resultats."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
SYMBOLS_REDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"El formatatge decimal ''{0}'' ja està definit."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
XSL_VERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"XSLTC no dóna suport a la versió XSL ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CIRCULAR_VARIABLE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Hi ha una referència de variable/paràmetre circular a ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_BINARY_OP_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L'operador de l'expressió binària és desconegut."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_ARG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"La crida de funció té arguments no permesos."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
DOCUMENT_ARG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"El segon argument de la funció document() ha de ser un conjunt de nodes."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MISSING_WHEN_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Es necessita com a mínim un element <xsl:when> a <xsl:choose>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MULTIPLE_OTHERWISE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Només es permet un element <xsl:otherwise> a <xsl:choose>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
STRAY_OTHERWISE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:otherwise> només es pot utilitzar dins de <xsl:choose>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
STRAY_WHEN_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:when> només es pot utilitzar dins de <xsl:choose>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
WHEN_ELEMENT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"A <xsl:choose> només es permeten els elements <xsl:when> i <xsl:otherwise>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNNAMED_ATTRIBSET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L'atribut 'name' falta a <xsl:attribute-set>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_CHILD_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L'element subordinat no és permès."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_ELEM_NAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"No podeu cridar un element ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_ATTR_NAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"No podeu cridar un atribut ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_TEXT_NODE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Hi ha dades fora de l'element de nivell superior <xsl:stylesheet>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
SAX_PARSER_CONFIG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L'analitzador JAXP no s'ha configurat correctament"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INTERNAL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"S''ha produït un error intern d''XSLTC irrecuperable: ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_XSL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L''element XSL ''{0}'' no té suport."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_EXT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"No es reconeix l''extensió XSLTC ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MISSING_XSLT_URI_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"El document d'entrada no és un full d'estils (l'espai de noms XSL no s'ha declarat en l'element arrel)."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MISSING_XSLT_TARGET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"No s''ha pogut trobar la destinació del full d''estil ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NOT_IMPLEMENTED_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"No s''ha implementat: ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NOT_STYLESHEET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"El document d'entrada no conté cap full d'estils XSL."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ELEMENT_PARSE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"No s''ha pogut analitzar l''element ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
KEY_USE_ATTR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L'atribut use de <key> ha de ser node, node-set, string o number."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
OUTPUT_VERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"La versió del document XML de sortida ha de ser 1.0"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_RELAT_OP_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L'operador de l'expressió relacional és desconegut."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ATTRIBSET_UNDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"S''ha intentat utilitzar el conjunt d''atributs ''{0}'' que no existeix."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ATTR_VAL_TEMPLATE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"No es pot analitzar la plantilla del valor d''atribut ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNKNOWN_SIG_TYPE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Es desconeix el tipus de dades de la signatura de la classe ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
DATA_CONVERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"No es pot convertir el tipus de dades ''{0}'' a ''{1}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NO_TRANSLET_CLASS_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Templates no conté cap definició de classe translet."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NO_MAIN_TRANSLET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Templates no conté cap classe amb el nom ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSLET_CLASS_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"No s''ha pogut carregar la classe translet ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSLET_OBJECT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"La classe translet s'ha carregat, però no s'ha pogut crear la instància translet."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ERROR_LISTENER_NULL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"S''ha intentat establir ErrorListener de ''{0}'' en nul"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_UNKNOWN_SOURCE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"XSLTC només dóna suport a StreamSource, SAXSource i DOMSource."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_NO_SOURCE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L''objecte source passat a ''{0}'' no té contingut. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_COMPILE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"No s'ha pogut compilar el full d'estils."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_INVALID_ATTR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"TransformerFactory no reconeix l''atribut ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_SET_RESULT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"setResult() s'ha de cridar abans de startDocument()."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_NO_TRANSLET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Transformer no conté cap objecte translet."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_NO_HANDLER_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"No s'ha definit cap manejador de sortida per al resultat de transformació."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_NO_RESULT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L''objecte result passat a ''{0}'' no és vàlid. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_UNKNOWN_PROP_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"S''ha intentat accedir a una propietat Transformer no vàlida ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
SAX2DOM_ADAPTER_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"No s''ha pogut crear l''adaptador SAX2DOMr: ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
XSLTC_SOURCE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"S'ha cridat XSLTCSource.build() sense que s'hagués establert la identificació del sistema."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ER_RESULT_NULL	TokenNameIdentifier
,	TokenNameCOMMA
"El resultat no ha de ser nul"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_INVALID_SET_PARAM_VALUE	TokenNameIdentifier
,	TokenNameCOMMA
"El valor del paràmetre {0} ha de ser un objecte Java vàlid "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COMPILE_STDIN_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L'opció -i s'ha d'utilitzar amb l'opció -o."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COMPILE_USAGE_STR	TokenNameIdentifier
,	TokenNameCOMMA
"RESUM    java org.apache.xalan.xsltc.cmdline.Compile [-o <sortida>]       [-d <directori>] [-j <fitxer_jar>] [-p <paquet>]       [-n] [-x] [-u] [-v] [-h] { <full_estil> | -i }  OPCIONS    -o <sortida>    assigna el nom <sortida> al translet                   generat. Per defecte, el nom del translet s'obté                   del nom de <full_estils>. Aquesta opció  no es té en compte si es compilen diversos fulls d'estils.    -d <directori> especifica un directori de destinació per al translet    -j <fitxer_jar>   empaqueta les classes translet en un fitxer jar del nom                   especificat com a <fitxer_jar>    -p <paquet> especifica un prefix de nom de paquet per a totes les classes                   translet generades.    -n habilita l'inlining (com a mitjana, el funcionament per defecte  és millor).    -x             habilita la sortida de missatges de depuració addicionals    -u             interpreta els arguments del <full_estil> com URL    -i             obliga el compilador a llegir el full d'estil des de l'entrada estàndardn    -v          imprimeix la versió del compilador    -h             imprimeix aquesta sentència d'ús "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSFORM_USAGE_STR	TokenNameIdentifier
,	TokenNameCOMMA
"RESUM     java org.apache.xalan.xsltc.cmdline.Transform [-j <fitxer_jar>]       [-x] [-n <iteracions>] {-u <url_document> | <document>}       <classe> [<param1>=<valor1> ...]     fa servir la <classe> translet per transformar un document XML     especificat com <document>. La <classe> translet es troba    o bé a la CLASSPATH de l'usuari o bé al <fitxer_jar> que es pot especificar opcionalment. OPCIONS    -j <fitxer_jar>    especifica un fitxer jar des del qual es carrega la classe translet    -x              habilita la sortida de missatges de depuració addicionals     -n <iteracions> executa la transformació el nombre de vegades <iteracions> i                    mostra la informació de perfil    -u <url_document> especifica el document d'entrada XML com una URL "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
STRAY_SORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:sort> només es pot utilitzar amb <xsl:for-each> o <xsl:apply-templates>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_ENCODING	TokenNameIdentifier
,	TokenNameCOMMA
"A aquesta JVM, no es dóna suport a la codificació de sortida ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
SYNTAX_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"S''ha produït un error de sintaxi a ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CONSTRUCTOR_NOT_FOUND	TokenNameIdentifier
,	TokenNameCOMMA
"No es pot trobar el constructor extern ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NO_JAVA_FUNCT_THIS_REF	TokenNameIdentifier
,	TokenNameCOMMA
"El primer argument de la funció Java no static ''{0}'' no és una referència d''objecte vàlida. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TYPE_CHECK_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"S''ha produït un error en comprovar el tipus de l''expressió ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TYPE_CHECK_UNK_LOC_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"S'ha produït un error en comprovar el tipus d'expressió en una ubicació desconeguda."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_CMDLINE_OPTION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L''opció de línia d''ordres ''{0}'' no és vàlida. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CMDLINE_OPT_MISSING_ARG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"A l''opció de línia d''ordres ''{0}'' falta un argument obligatori. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
WARNING_PLUS_WRAPPED_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"AVÍS:  ''{0}''        :{1}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
WARNING_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"AVÍS:  ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FATAL_ERR_PLUS_WRAPPED_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"ERROR MOLT GREU:  ''{0}''            :{1}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FATAL_ERR_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"ERROR MOLT GREU:  ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ERROR_PLUS_WRAPPED_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"ERROR:  ''{0}''      :{1}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ERROR_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"ERROR:  ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSFORM_WITH_TRANSLET_STR	TokenNameIdentifier
,	TokenNameCOMMA
"Transformació mitjançant la classe translet ''{0}'' "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSFORM_WITH_JAR_STR	TokenNameIdentifier
,	TokenNameCOMMA
"Transformació mitjançant la classe translet ''{0}'' des del fitxer jar ''{1}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COULD_NOT_CREATE_TRANS_FACT	TokenNameIdentifier
,	TokenNameCOMMA
"No s''ha pogut crear una instància de la classe TransformerFactory ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSLET_NAME_JAVA_CONFLICT	TokenNameIdentifier
,	TokenNameCOMMA
"El nom ''{0}'' no s''ha pogut fer servir com nom de la classe translet perquè conté caràcters que no estan permesos al nom de la classe Java. En lloc d''això, es va fer servir el nom ''{1}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COMPILER_ERROR_KEY	TokenNameIdentifier
,	TokenNameCOMMA
"Errors del compilador:"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COMPILER_WARNING_KEY	TokenNameIdentifier
,	TokenNameCOMMA
"Avisos del compilador:"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
RUNTIME_ERROR_KEY	TokenNameIdentifier
,	TokenNameCOMMA
"Errors del translet:"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INVALID_QNAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Un atribut que ha de tenir el valor QName o una llista separada per espais de QNames tenia el valor ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INVALID_NCNAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Un atribut, que ha de tenir el valor NCName, tenia el valor ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INVALID_METHOD_IN_OUTPUT	TokenNameIdentifier
,	TokenNameCOMMA
"L''atribut del mètode d''un element <xsl:sortida> tenia el valor ''{0}''. El valor ha de ser un de ''xml'', ''html'', ''text'', o ncname però no qname "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_GET_FEATURE_NULL_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"El nom de la característica no pot ser nul a TransformerFactory.getFeature(nom de cadena). "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_SET_FEATURE_NULL_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"El nom de la característica no pot ser nul a TransformerFactory.setFeature(nom de la cadena, valor booleà). "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_UNSUPPORTED_FEATURE	TokenNameIdentifier
,	TokenNameCOMMA
"No es pot establir la característica ''{0}'' en aquesta TransformerFactory."	TokenNameStringLiteral
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
