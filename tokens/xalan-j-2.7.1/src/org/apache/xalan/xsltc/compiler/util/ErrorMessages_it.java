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
ErrorMessages_it	TokenNameIdentifier
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
"Più fogli di stile definiti nello stesso file."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TEMPLATE_REDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"La maschera ''{0}'' già definita in questo foglio di lavoro."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TEMPLATE_UNDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"La maschera ''{0}'' non definita in questo foglio di lavoro."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
VARIABLE_REDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"La variabile ''{0}'' è definita più volte nello stesso ambito."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
VARIABLE_UNDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Variabile o parametro ''{0}'' non definito. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CLASS_NOT_FOUND_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Impossibile trovare la classe ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
METHOD_NOT_FOUND_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Impossibile trovare il metodo esterno ''{0}'' (deve essere pubblico)."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ARGUMENT_CONVERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Impossibile convertire il tipo di argomento/ritorno nella chiamata nel metodo ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FILE_NOT_FOUND_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"File o URI ''{0}'' non trovato."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INVALID_URI_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"URI non valido ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FILE_ACCESS_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Impossibile aprire il file o l''''URI ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MISSING_ROOT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Era previsto l'elemento <xsl:stylesheet> o <xsl:transform>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NAMESPACE_UNDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Il prefisso dello spazio nome ''{0}'' non è dichiarato. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FUNCTION_RESOLVE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Impossibile risolvere la chiamata alla funzione ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NEED_LITERAL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L''''argomento di ''{0}'' deve essere una stringa letterale. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
XPATH_PARSER_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Errore durante l''''analisi dell''''espressione XPath ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
REQUIRED_ATTR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Attributo ''{0}'' richiesto mancante. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_CHAR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Carattere non valido ''{0}'' nell''''espressione XPath. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_PI_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Nome ''{0}'' non valido per l''''istruzione di elaborazione. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
STRAY_ATTRIBUTE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L''''attributo ''{0}'' al di fuori dell''''elemento."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_ATTRIBUTE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Attributo non valido ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CIRCULAR_INCLUDE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Import/include circolare. Foglio di lavoro ''{0}'' già caricato. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
RESULT_TREE_SORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Impossibile ordinare i frammenti della struttura ad albero dei risultati (elementi <xsl:sort> ignorati). È necessario ordinare i nodi quando si crea la struttura ad albero dei risultati."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
SYMBOLS_REDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"La formattazione decimale ''{0}'' è già definita."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
XSL_VERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"La versione XSL ''{0}'' non è supportata da XSLTC."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CIRCULAR_VARIABLE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Riferimento variabile/parametro circolare in ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_BINARY_OP_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Operatore sconosciuto per l'espressione binaria."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_ARG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Argomento(i) non valido(i) per la chiamata alla funzione."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
DOCUMENT_ARG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Il secondo argomento di una funzione document() deve essere una serie di nodi."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MISSING_WHEN_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"È necessario almeno un elemento <xsl:when> in <xsl:choose>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MULTIPLE_OTHERWISE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Solo un elemento <xsl:otherwise> consentito in <xsl:choose>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
STRAY_OTHERWISE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:otherwise> può essere utilizzato solo all'interno di <xsl:choose>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
STRAY_WHEN_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:when> può essere utilizzato solo all'interno di <xsl:choose>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
WHEN_ELEMENT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Solo gli elementi <xsl:when> e <xsl:otherwise> sono consentiti in <xsl:choose>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNNAMED_ATTRIBSET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:attribute-set> non contiene l'attributo 'name'."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_CHILD_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Elemento child non valido."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_ELEM_NAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Impossibile chiamare un elemento ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_ATTR_NAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Impossibile chiamare un attributo ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_TEXT_NODE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Dati di testo al di fuori dell'elemento <xsl:stylesheet> di livello superiore."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
SAX_PARSER_CONFIG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Parser JAXP non configurato correttamente"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INTERNAL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Errore XSLTC interno non recuperabile: ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_XSL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Elemento XSL non supportato ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_EXT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Estensione XSLTC non riconosciuta ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MISSING_XSLT_URI_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Il documento di immissione non è un foglio di lavoro (lo namespace XSL non è dichiarato nell'elemento root)."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MISSING_XSLT_TARGET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Impossibile trovare la destinazione stylesheet ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NOT_IMPLEMENTED_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Non implementato: ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NOT_STYLESHEET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Il documento di immissione non contiene un foglio di lavoro XSL."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ELEMENT_PARSE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Impossibile analizzare l''''elemento ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
KEY_USE_ATTR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L'attributo use di <key> deve essere node, node-set, string o number."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
OUTPUT_VERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"La versione del documento XML di emissione deve essere 1.0"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_RELAT_OP_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Operatore sconosciuto per l'espressione relazionale"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ATTRIBSET_UNDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Tentativo di utilizzare una serie di attributi ''{0}'' non esistente."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ATTR_VAL_TEMPLATE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Impossibile analizzare la maschera del valore di attributo ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNKNOWN_SIG_TYPE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Tipo di dati sconosciuto nella firma per la classe ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
DATA_CONVERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Impossibile convertire il tipo di dati da ''{0}'' a ''{1}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NO_TRANSLET_CLASS_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Questa Templates non contiene una definizione di classe translet valida."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NO_MAIN_TRANSLET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Questa Templates non contengono una classe con il nome ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSLET_CLASS_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Impossibile caricare la classe translet ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSLET_OBJECT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Classe translet caricata, ma non è possibile creare l'istanza translet."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ERROR_LISTENER_NULL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Tentativo di impostare ErrorListener per ''{0}'' su null"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_UNKNOWN_SOURCE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Solo StreamSource, SAXSource e DOMSource sono supportati da XSLTC"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_NO_SOURCE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L''oggetto Source passato a ''{0}'' non ha contenuto."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_COMPILE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Impossibile compilare il foglio di lavoro"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_INVALID_ATTR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"TransformerFactory non riconosce l''''attributo ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_SET_RESULT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"setResult() deve essere richiamato prima di startDocument()."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_NO_TRANSLET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Transformer non dispone di un oggetto translet incapsulato."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_NO_HANDLER_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Nessun programma di gestione dell'emissione definito per il risultato della trasformazione."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_NO_RESULT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Oggetto Result passato ''{0}'' non valido."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_UNKNOWN_PROP_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Tentativo di accedere alla proprietà Transformer ''{0}'' non valida."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
SAX2DOM_ADAPTER_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Impossibile creare l''''adattatore SAX2DOM: ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
XSLTC_SOURCE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"XSLTCSource.build() richiamato senza che sia impostato un systemId (identificativo di sistema)."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ER_RESULT_NULL	TokenNameIdentifier
,	TokenNameCOMMA
"Il risultato non può essere nullo"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_INVALID_SET_PARAM_VALUE	TokenNameIdentifier
,	TokenNameCOMMA
"Il valore del parametro {0} deve essere un oggetto Java valido"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COMPILE_STDIN_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L'opzione -i deve essere utilizzata con l'opzione -o."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COMPILE_USAGE_STR	TokenNameIdentifier
,	TokenNameCOMMA
"SYNOPSIS    java org.apache.xalan.xsltc.cmdline.Compile [-o <output>]       [-d <directory>] [-j <jarfile>] [-p <package>]       [-n] [-x] [-u] [-v] [-h] { <stylesheet> | -i }  OPTIONS    -o <output>    assegna il nome <output> al translet generato .  Per impostazione predefinita, il nome translet è                   derivato dal nome <stylesheet>.  Questa opzione                   viene ignorata se vengono compilati più fogli di stile.    -d <directory> specifica una directory di destinazione per il translet    -j <jarfile>   raggruppa le classi translet in un file jar del                   nome specificato come <jarfile>    -p <package>   specifica un prefisso del nome pacchetto per tutte le classi                   translet generate.    -n             abilita l'allineamento della maschera (funzionamento predefinito migliore                   in media).    -x             attiva ulteriori emissioni dei messaggi di debug    -u             interpreta gli argomenti <stylesheet> come URL    -i             impone al programma di compilazione di leggere il foglio di lavoro da stdin    -v             stampa la versione del programma di compilazione     -h             stampa queste istruzioni sull'utilizzo "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSFORM_USAGE_STR	TokenNameIdentifier
,	TokenNameCOMMA
"SYNOPSIS     java org.apache.xalan.xsltc.cmdline.Transform [-j <jarfile>]       [-x] [-n <iterations>] {-u <document_url> | <document>}       <class> [<param1>=<value1> ...]     utilizza il translet <class> per convertire un documento XML     specificato come <document>. Il translet <classe> si trova     nella istruzione CLASSPATH dell'utente o nel <jarfile> eventualmente specificato. OPTIONS    -j <jarfile>    specifica un jarfile dal quale caricare il translet    -x    attiva ulteriori output dei messaggi di debug    -n <iterations> esegue la trasformazione <iterazioni> e                    visualizza le informazioni relative al profilo    -u <document_url> specifica il documento di immissione XML come URL "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
STRAY_SORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:sort> può essere utilizzato solo all'interno di <xsl:for-each> o <xsl:apply-templates>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_ENCODING	TokenNameIdentifier
,	TokenNameCOMMA
"Codifica di emissione ''{0}'' non supportata in questa JVM."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
SYNTAX_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Errore di sintassi in ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CONSTRUCTOR_NOT_FOUND	TokenNameIdentifier
,	TokenNameCOMMA
"Impossibile trovare un costruttore esterno ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NO_JAVA_FUNCT_THIS_REF	TokenNameIdentifier
,	TokenNameCOMMA
"Il primo argomento della funzione Java non statica ''{0}'' non è un riferimento ad un oggetto valido. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TYPE_CHECK_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Errore durante la verifica del tipo di espressione ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TYPE_CHECK_UNK_LOC_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Errore durante la verifica del tipo di espressione in una posizione sconosciuta."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_CMDLINE_OPTION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"L''''opzione della riga comandi ''{0}'' non è valida."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CMDLINE_OPT_MISSING_ARG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Manca un argomento obbligatorio per l''''opzione della riga comandi ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
WARNING_PLUS_WRAPPED_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"ATTENZIONE:  ''{0}''        :{1}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
WARNING_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"ATTENZIONE:  ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FATAL_ERR_PLUS_WRAPPED_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"ERRORE IRREVERSIBILE:  ''{0}''            :{1}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FATAL_ERR_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"ERRORE IRREVERSIBILE:  ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ERROR_PLUS_WRAPPED_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"ERRORE:  ''{0}''      :{1}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ERROR_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"ERRORE:  ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSFORM_WITH_TRANSLET_STR	TokenNameIdentifier
,	TokenNameCOMMA
"Trasformazione utilizzando il translet ''{0}'' "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSFORM_WITH_JAR_STR	TokenNameIdentifier
,	TokenNameCOMMA
"Trasformazione utilizzando il translet ''{0}'' dal file jar ''{1}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COULD_NOT_CREATE_TRANS_FACT	TokenNameIdentifier
,	TokenNameCOMMA
"Impossibile creare un''istanza della classe TransformerFactory ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSLET_NAME_JAVA_CONFLICT	TokenNameIdentifier
,	TokenNameCOMMA
"Non è stato possibile utilizzare il nome ''{0}'' come nome della classe translet perché contiene dei caratteri che non sono consentiti nel nome della classe Java. È stato invece utilizzato il nome ''{1}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COMPILER_ERROR_KEY	TokenNameIdentifier
,	TokenNameCOMMA
"Errori del programma di compilazione:"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COMPILER_WARNING_KEY	TokenNameIdentifier
,	TokenNameCOMMA
"Messaggi di avvertenza del programma di compilazione:"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
RUNTIME_ERROR_KEY	TokenNameIdentifier
,	TokenNameCOMMA
"Errori del translet:"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INVALID_QNAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Un attributo il cui valore deve essere un QName o un elenco separato da spazi vuoti di QName ha avuto il valore di ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INVALID_NCNAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Un attributo il cui valore deve essere un NCName aveva il valore ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INVALID_METHOD_IN_OUTPUT	TokenNameIdentifier
,	TokenNameCOMMA
"L''''attributo del metodo di un elemento <xsl:output> aveva il valore ''{0}''.  Il valore deve essere uno di ''xml'', ''html'', ''text'' o qname-but-not-ncname"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_GET_FEATURE_NULL_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"Il nome della funzione non può essere nullo in TransformerFactory.getFeature(Nome stringa)."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_SET_FEATURE_NULL_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"Il nome della funzione non può essere nullo in TransformerFactory.setFeature(Nome stringa, valore booleano)."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_UNSUPPORTED_FEATURE	TokenNameIdentifier
,	TokenNameCOMMA
"Impossibile impostare la funzione ''{0}'' su questo TransformerFactory."	TokenNameStringLiteral
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
