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
ErrorMessages_sl	TokenNameIdentifier
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
"V isti datoteki je določenih več slogovnih datotek."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TEMPLATE_REDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Predloga ''{0}'' je že določena v tej slogovni datoteki."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TEMPLATE_UNDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Predloga ''{0}'' ni določena v tej slogovni datoteki."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
VARIABLE_REDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Spremenljivka ''{0}'' je večkrat določena znotraj istega obsega."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
VARIABLE_UNDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Spremenljivka ali parameter ''{0}'' je nedoločen."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CLASS_NOT_FOUND_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Ni mogoče najti razreda ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
METHOD_NOT_FOUND_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Zunanje metode ''{0}'' ni mogoče najti (mora biti javna)."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ARGUMENT_CONVERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Ni mogoče pretvoriti argumenta / tipa vrnitve v klicu metode ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FILE_NOT_FOUND_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Datoteke ali URI-ja ''{0}'' ni mogoče najti."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INVALID_URI_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Neveljaven URI ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FILE_ACCESS_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Datoteke ali URI-ja ''{0}'' ni mogoče odpreti."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MISSING_ROOT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Pričakovan element <xsl:stylesheet> ali <xsl:transform>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NAMESPACE_UNDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Predpona imenskega prostora ''{0}'' ni določena."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FUNCTION_RESOLVE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Klica funkcije ''{0}'' ni mogoče razrešiti."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NEED_LITERAL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Argument za ''{0}'' mora biti dobesedni niz."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
XPATH_PARSER_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Napaka pri razčlenjevanju izraza XPath ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
REQUIRED_ATTR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Manjka zahtevani atribut ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_CHAR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Neveljavni znak ''{0}'' v izrazu XPath."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_PI_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Neveljavno ime ''{0}'' za navodila za obdelavo."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
STRAY_ATTRIBUTE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Atribut ''{0}'' zunaj elementa."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_ATTRIBUTE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Neveljaven atribut ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CIRCULAR_INCLUDE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Krožni uvoz/vključitev. Slogovna datoteka ''{0}'' je že naložena."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
RESULT_TREE_SORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Ne morem razvrstiti fragmentov drevesa rezultatov (elementi <xsl:sort> so prezrti). Pri pripravi drevesa rezultatov morate razvrstiti vozlišča."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
SYMBOLS_REDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Decimalno oblikovanje ''{0}'' je že določeno."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
XSL_VERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"XSL različice ''{0}'' XSLTC ne podpira."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CIRCULAR_VARIABLE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Sklic na krožno spremenljivko/parameter v ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_BINARY_OP_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Neznan operator za binarni izraz."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_ARG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Neveljavni argument(i) za klic funkcije."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
DOCUMENT_ARG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Drugi argument funkcije document() mora biti skupina vozlišč."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MISSING_WHEN_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Zahtevan vsaj en element <xsl:when> v <xsl:choose>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MULTIPLE_OTHERWISE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Dovoljen samo en element <xsl:otherwise> v <xsl:choose>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
STRAY_OTHERWISE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:otherwise> lahko uporabljamo samo znotraj <xsl:choose>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
STRAY_WHEN_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:when> lahko uporabljamo samo znotraj <xsl:choose>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
WHEN_ELEMENT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"V <xsl:choose> sta dovoljena samo elementa <xsl:when> in <xsl:otherwise>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNNAMED_ATTRIBSET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"V <xsl:attribute-set> manjka atribut 'name'."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_CHILD_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Neveljavni podrejeni element."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_ELEM_NAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Elementa ''{0}'' ni mogoče poklicati"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_ATTR_NAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Atributa ''{0}'' ni mogoče poklicati"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_TEXT_NODE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Tekstovni podatki zunaj elementa na najvišji ravni <xsl:stylesheet>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
SAX_PARSER_CONFIG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Razčlenjevalnik JAXP ni pravilno konfiguriran"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INTERNAL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Nepopravljiva XSLTC-notranja napaka: ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_XSL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Nepodprt XSL element ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_EXT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Neprepoznana pripona XSLTC ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MISSING_XSLT_URI_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Vhodni dokument ni slogovna datoteka (v korenskem elementu ni naveden imenski prostor XSL)."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MISSING_XSLT_TARGET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Cilja slogovne datoteke ''{0}'' ni mogoče najti."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NOT_IMPLEMENTED_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Ni izvedeno: ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NOT_STYLESHEET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Vhodni dokument ne vsebuje slogovne datoteke XSL."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ELEMENT_PARSE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Elementa ''{0}'' ni mogoče razčleniti"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
KEY_USE_ATTR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Atribut uporabe za <key> mora biti vozlišče, skupina vozlišč, niz ali številka."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
OUTPUT_VERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Različica izhodnega dokumenta XML mora biti 1.0"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_RELAT_OP_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Neznan operator za relacijski izraz"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ATTRIBSET_UNDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Poskus uporabe neobstoječe skupine atributov ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ATTR_VAL_TEMPLATE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Predloge vrednosti atributa ''{0}'' ni mogoče razčleniti."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNKNOWN_SIG_TYPE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"V podpisu za razred ''{0}'' je neznan podatkovni tip."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
DATA_CONVERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Ni mogoče pretvoriti podatkovnega tipa ''{0}'' v ''{1}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NO_TRANSLET_CLASS_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Te Templates ne vsebujejo veljavne definicije razreda translet."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NO_MAIN_TRANSLET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Te predloge ne vsebujejo razreda z imenom ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSLET_CLASS_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Ni mogoče naložiti razreda transleta ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSLET_OBJECT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Razred transleta je naložen, vendar priprava primerka transleta ni mogoča."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ERROR_LISTENER_NULL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Poskus nastavitve ErrorListener za ''{0}'' na null"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_UNKNOWN_SOURCE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"XSLTC podpira samo StreamSource, SAXSource in DOMSource"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_NO_SOURCE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Predmet Source, ki je bil podan z ''{0}'', nima vsebine."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_COMPILE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Ni mogoče prevesti slogovne datoteke"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_INVALID_ATTR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"TransformerFactory ne prepozna atributa ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_SET_RESULT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Klic za setResult() mora biti izveden pred klicem startDocument()."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_NO_TRANSLET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Transformer ne vsebuje enkapsuliranih translet objektov."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_NO_HANDLER_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Za rezultat transformacije ni izhodne obravnave."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_NO_RESULT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Rezultat, ki je bil posredovan ''{0}'', je neveljaven."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_UNKNOWN_PROP_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Poskus dostopa do neveljavne lastnosti (property) Transformer ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
SAX2DOM_ADAPTER_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Ni mogoče ustvariti adapterja SAX2DOM: ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
XSLTC_SOURCE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Klic XSLTCSource.build() brez predhodne nastavitve systemId."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ER_RESULT_NULL	TokenNameIdentifier
,	TokenNameCOMMA
"Rezultat naj ne bi bil NULL"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_INVALID_SET_PARAM_VALUE	TokenNameIdentifier
,	TokenNameCOMMA
"Vrednost parametra {0} mora biti veljaven javanski objekt"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COMPILE_STDIN_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Možnost -i mora biti uporabljena skupaj z možnostjo -o."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COMPILE_USAGE_STR	TokenNameIdentifier
,	TokenNameCOMMA
"SYNOPSIS    java org.apache.xalan.xsltc.cmdline.Compile [-o <izhodna datoteka>]       [-d <directory>] [-j  <datoteka jar>] [-p <paket>]       [-n] [-x] [-u] [-v] [-h] { <stylesheet> | -i }  OPTIONS    -o <izhodna datoteka>    dodeli ime <izhodna datoteka> generiranemu                   transletu.  Ime transleta se po privzetih nastavitvah                  izpelje iz imena <stylesheet>.  Pri prevajanju                   več slogovnih datotek je ta možnost prezrta.    -d <directory> določi ciljno mapo za translet    -j <datoteka jar>   združi razrede translet v datoteko jar        pod imenom, določenim z <datoteka jar>    -p <paket>   določi predpono imena paketa vsem generiranim                razredom translet.    -n             omogoča vrivanje predlog (v povprečju boljše privzeto                       obnašanje).    -x             vklopi dodatna izhodna sporočila za iskanje napak    -u             prevede argumente <stylesheet> kot URL-je    -i             prisili prevajalnik k branju slogovne datoteke iz stdin    -v             natisne različico prevajalnika    -h             natisne ta stavek za uporabo "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSFORM_USAGE_STR	TokenNameIdentifier
,	TokenNameCOMMA
"SYNOPSIS     java org.apache.xalan.xsltc.cmdline.Transform [-j <datoteka jar>]       [-x] [-n <ponovitve>] {-u <document_url> | <dokument>}       <razred> [<param1>=<value1> ...]     uporablja translet <razred> za pretvorbo dokumenta XML     navedenega kot <dokument>. Translet <razred> je ali v    uporabnikovem CLASSPATH ali v izbirno navedeni datoteki <datoteka jar>. OPTIONS    -j <datoteka jar>    določi datoteko jar, iz katere bo naložen translet    -x               vklopi dodatna sporočila za iskanje napak    n  <ponovitve> <ponovitve>-krat požene preoblikovanje in                    prikaže informacije profiliranja    -u <document_url> določi vhodni dokument XML za URL "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
STRAY_SORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:sort> je mogoče uporabljati samo znotraj <xsl:for-each> ali <xsl:apply-templates>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_ENCODING	TokenNameIdentifier
,	TokenNameCOMMA
"Ta JVM ne podpira izhodnega kodiranja ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
SYNTAX_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Napaka v sintaksi v ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CONSTRUCTOR_NOT_FOUND	TokenNameIdentifier
,	TokenNameCOMMA
"Ni mogoče najti zunanjega konstruktorja ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NO_JAVA_FUNCT_THIS_REF	TokenNameIdentifier
,	TokenNameCOMMA
"Prvi argument nestatične (non-static) javanske funkcije ''{0}'' ni veljaven sklic na objekt."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TYPE_CHECK_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Napaka pri preverjanju tipa izraza ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TYPE_CHECK_UNK_LOC_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Napaka pri preverjanju tipa izraza na neznani lokaciji."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_CMDLINE_OPTION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Možnost ukazne vrstice ''{0}'' ni veljavna."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CMDLINE_OPT_MISSING_ARG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Možnosti ukazne vrstice ''{0}'' manjka zahtevani argument."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
WARNING_PLUS_WRAPPED_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"OPOZORILO:  ''{0}''        :{1}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
WARNING_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"OPOZORILO:  ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FATAL_ERR_PLUS_WRAPPED_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"USODNA NAPAKA:  ''{0}''            :{1}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FATAL_ERR_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"USODNA NAPAKA:  ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ERROR_PLUS_WRAPPED_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"USODNA NAPAKA:  ''{0}''      :{1}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ERROR_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"NAPAKA:  ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSFORM_WITH_TRANSLET_STR	TokenNameIdentifier
,	TokenNameCOMMA
"Pretvorba z uporabo transleta ''{0}'' "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSFORM_WITH_JAR_STR	TokenNameIdentifier
,	TokenNameCOMMA
"Pretvorba z uporabo transleta ''{0}'' iz datoteke jar ''{1}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COULD_NOT_CREATE_TRANS_FACT	TokenNameIdentifier
,	TokenNameCOMMA
"Ni mogoče ustvariti primerka razreda TransformerFactory ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSLET_NAME_JAVA_CONFLICT	TokenNameIdentifier
,	TokenNameCOMMA
"Imena ''{0}'' ni bilo mogoče uporabiti kot ime razreda translet, saj vsebuje znake, ki v imenu javanskega razreda niso dovoljeni.  Uporabljeno je bilo ime ''{1}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COMPILER_ERROR_KEY	TokenNameIdentifier
,	TokenNameCOMMA
"Napake prevajalnika:"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COMPILER_WARNING_KEY	TokenNameIdentifier
,	TokenNameCOMMA
"Opozorila prevajalnika:"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
RUNTIME_ERROR_KEY	TokenNameIdentifier
,	TokenNameCOMMA
"Napake transleta:"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INVALID_QNAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Atribut, katerega vrednost mora biti vrednost QName ali s presledki ločen seznam vrednosti Qname, je imel vrednost ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INVALID_NCNAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Atribut, katerega vrednost mora biti NCName, je imel vrednost ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INVALID_METHOD_IN_OUTPUT	TokenNameIdentifier
,	TokenNameCOMMA
"Atribut metode elementa <xsl:output> je imel vrednost ''{0}''.  Vrednost mora biti ena izmed ''xml'', ''html'', ''text'', ali qname-but-not-ncname (qname, vendar pa ne ncname)"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_GET_FEATURE_NULL_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"Ime funkcije ne sme biti null v TransformerFactory.getFeature(Ime niza)."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_SET_FEATURE_NULL_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"Ime funkcije ne sme biti null v TransformerFactory.getFeature(Ime niza, boolova vrednost)."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_UNSUPPORTED_FEATURE	TokenNameIdentifier
,	TokenNameCOMMA
"Ni mogoče nastaviti funkcije ''{0}'' v tem TransformerFactory."	TokenNameStringLiteral
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
