package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ListResourceBundle	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Locale	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
MissingResourceException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ResourceBundle	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SerializerMessages_pt_BR	TokenNameIdentifier
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
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
contents	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
BAD_MSGKEY	TokenNameIdentifier
,	TokenNameCOMMA
"A chave de mensagem ''{0}'' não está na classe de mensagem ''{1}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
BAD_MSGFORMAT	TokenNameIdentifier
,	TokenNameCOMMA
"O formato da mensagem ''{0}'' na classe de mensagem ''{1}'' falhou."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_SERIALIZER_NOT_CONTENTHANDLER	TokenNameIdentifier
,	TokenNameCOMMA
"A classe de serializador ''{0}'' não implementa org.xml.sax.ContentHandler."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_RESOURCE_COULD_NOT_FIND	TokenNameIdentifier
,	TokenNameCOMMA
"O recurso [ {0} ] não pôde ser encontrado. {1}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_RESOURCE_COULD_NOT_LOAD	TokenNameIdentifier
,	TokenNameCOMMA
"O recurso [ {0} ] não pôde carregar: {1}   {2}   {3}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_BUFFER_SIZE_LESSTHAN_ZERO	TokenNameIdentifier
,	TokenNameCOMMA
"Tamanho do buffer <=0"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier
,	TokenNameCOMMA
"Detectado substituto UTF-16 inválido: {0} ?"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_OIERROR	TokenNameIdentifier
,	TokenNameCOMMA
"Erro de E/S"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ILLEGAL_ATTRIBUTE_POSITION	TokenNameIdentifier
,	TokenNameCOMMA
"Impossível incluir atributo {0} depois de nós filhos ou antes da geração de um elemento. O atributo será ignorado."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NAMESPACE_PREFIX	TokenNameIdentifier
,	TokenNameCOMMA
"O espaço de nomes do prefixo ''{0}'' não foi declarado. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_STRAY_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
"Atributo ''{0}'' fora do elemento. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_STRAY_NAMESPACE	TokenNameIdentifier
,	TokenNameCOMMA
"Declaração de espaço de nomes ''{0}''=''{1}'' fora do elemento. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_COULD_NOT_LOAD_RESOURCE	TokenNameIdentifier
,	TokenNameCOMMA
"Não foi possível carregar ''{0}'' (verifique CLASSPATH) agora , utilizando somente os padrões"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ILLEGAL_CHARACTER	TokenNameIdentifier
,	TokenNameCOMMA
"Tentativa de processar o caractere de um valor integral {0} que não é representado na codificação de saída especificada de {1}."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_COULD_NOT_LOAD_METHOD_PROPERTY	TokenNameIdentifier
,	TokenNameCOMMA
"Não foi possível carregar o arquivo de propriedade ''{0}'' para o método de saída ''{1}'' (verifique CLASSPATH)"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_INVALID_PORT	TokenNameIdentifier
,	TokenNameCOMMA
"Número de porta inválido"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_PORT_WHEN_HOST_NULL	TokenNameIdentifier
,	TokenNameCOMMA
"A porta não pode ser definida quando o host é nulo"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_HOST_ADDRESS_NOT_WELLFORMED	TokenNameIdentifier
,	TokenNameCOMMA
"O host não é um endereço formado corretamente"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_SCHEME_NOT_CONFORMANT	TokenNameIdentifier
,	TokenNameCOMMA
"O esquema não está em conformidade."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_SCHEME_FROM_NULL_STRING	TokenNameIdentifier
,	TokenNameCOMMA
"Impossível definir esquema a partir da cadeia nula"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE	TokenNameIdentifier
,	TokenNameCOMMA
"O caminho contém seqüência de escape inválida"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_PATH_INVALID_CHAR	TokenNameIdentifier
,	TokenNameCOMMA
"O caminho contém caractere inválido: {0}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FRAG_INVALID_CHAR	TokenNameIdentifier
,	TokenNameCOMMA
"O fragmento contém caractere inválido"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FRAG_WHEN_PATH_NULL	TokenNameIdentifier
,	TokenNameCOMMA
"O fragmento não pode ser definido quando o caminho é nulo"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FRAG_FOR_GENERIC_URI	TokenNameIdentifier
,	TokenNameCOMMA
"O fragmento só pode ser definido para um URI genérico"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_SCHEME_IN_URI	TokenNameIdentifier
,	TokenNameCOMMA
"Nenhum esquema encontrado no URI"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_CANNOT_INIT_URI_EMPTY_PARMS	TokenNameIdentifier
,	TokenNameCOMMA
"Impossível inicializar URI com parâmetros vazios"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_FRAGMENT_STRING_IN_PATH	TokenNameIdentifier
,	TokenNameCOMMA
"O fragmento não pode ser especificado no caminho e fragmento"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_QUERY_STRING_IN_PATH	TokenNameIdentifier
,	TokenNameCOMMA
"A cadeia de consulta não pode ser especificada na cadeia de consulta e caminho"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_PORT_IF_NO_HOST	TokenNameIdentifier
,	TokenNameCOMMA
"Port não pode ser especificado se host não for especificado"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_USERINFO_IF_NO_HOST	TokenNameIdentifier
,	TokenNameCOMMA
"Userinfo não pode ser especificado se host não for especificado"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_XML_VERSION_NOT_SUPPORTED	TokenNameIdentifier
,	TokenNameCOMMA
"Aviso:  A versão do documento de saída precisa ser ''{0}''.  Essa versão do XML não é suportada. A versão do documento de saída será ''1.0''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_SCHEME_REQUIRED	TokenNameIdentifier
,	TokenNameCOMMA
"O esquema é obrigatório!"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FACTORY_PROPERTY_MISSING	TokenNameIdentifier
,	TokenNameCOMMA
"O objeto Properties transmitido para SerializerFactory não tem uma propriedade ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ENCODING_NOT_SUPPORTED	TokenNameIdentifier
,	TokenNameCOMMA
"Aviso:  A codificação ''{0}'' não é suportada pelo Java Runtime."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FEATURE_NOT_FOUND	TokenNameIdentifier
,	TokenNameCOMMA
"O parâmetro ''{0}'' não é reconhecido."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FEATURE_NOT_SUPPORTED	TokenNameIdentifier
,	TokenNameCOMMA
"O parâmetro ''{0}'' é reconhecido, mas o valor pedido não pode ser definido. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_STRING_TOO_LONG	TokenNameIdentifier
,	TokenNameCOMMA
"A cadeia resultante é muito longa para caber em uma DOMString: ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_TYPE_MISMATCH_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"O tipo de valor para este nome de parâmetro é incompatível com o tipo de valor esperado. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_OUTPUT_SPECIFIED	TokenNameIdentifier
,	TokenNameCOMMA
"O destino de saída para os dados a serem gravados era nulo. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_UNSUPPORTED_ENCODING	TokenNameIdentifier
,	TokenNameCOMMA
"Uma codificação não suportada foi encontrada. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_UNABLE_TO_SERIALIZE_NODE	TokenNameIdentifier
,	TokenNameCOMMA
"O nó não pôde ser serializado."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_CDATA_SECTIONS_SPLIT	TokenNameIdentifier
,	TokenNameCOMMA
"A Seção CDATA contém um ou mais marcadores de término ']]>'."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WARNING_WF_NOT_CHECKED	TokenNameIdentifier
,	TokenNameCOMMA
"Uma instância do verificador Well-Formedness não pôde ser criada. O parâmetro well-formed foi definido como true, mas a verificação well-formedness não pode ser executada."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER	TokenNameIdentifier
,	TokenNameCOMMA
"O nó ''{0}'' contém caracteres XML inválidos. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_COMMENT	TokenNameIdentifier
,	TokenNameCOMMA
"Um caractere XML inválido (Unicode: 0x{0}) foi encontrado no comentário. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_PI	TokenNameIdentifier
,	TokenNameCOMMA
"Um caractere XML inválido (Unicode: 0x{0}) foi encontrado no processo instructiondata."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_CDATA	TokenNameIdentifier
,	TokenNameCOMMA
"Um caractere XML inválido (Unicode: 0x{0}) foi encontrado nos conteúdos do CDATASection. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_TEXT	TokenNameIdentifier
,	TokenNameCOMMA
"Um caractere XML inválido (Unicode: 0x{0}) foi encontrado no conteúdo dos dados de caractere dos nós. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_NODE_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"Um caractere inválido foi encontrado no {0} do nó denominado ''{1}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_DASH_IN_COMMENT	TokenNameIdentifier
,	TokenNameCOMMA
"A cadeia "--" não é permitida dentro dos comentários. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_LT_IN_ATTVAL	TokenNameIdentifier
,	TokenNameCOMMA
"O valor do atributo "{1}" associado a um tipo de elemento "{0}" não deve conter o caractere ''<''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_REF_TO_UNPARSED_ENT	TokenNameIdentifier
,	TokenNameCOMMA
"A referência de entidade não analisada "&{0};" não é permitida. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_REF_TO_EXTERNAL_ENT	TokenNameIdentifier
,	TokenNameCOMMA
"A referência de entidade externa "&{0};" não é permitida em um valor de atributo. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NS_PREFIX_CANNOT_BE_BOUND	TokenNameIdentifier
,	TokenNameCOMMA
"O prefixo "{0}" não pode ser vinculado ao espaço de nomes "{1}"."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NULL_LOCAL_ELEMENT_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"O nome local do elemento "{0}" é nulo."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NULL_LOCAL_ATTR_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"O nome local do atributo "{0}" é nulo."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ELEM_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier
,	TokenNameCOMMA
"O texto de substituição do nó de entidade "{0}" contém um nó de elemento "{1}" com um prefixo não vinculado "{2}"."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ATTR_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier
,	TokenNameCOMMA
"O texto de substituição do nó de entidade "{0}" contém um nó de atributo "{1}" com um prefixo não vinculado "{2}"."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
}	TokenNameRBRACE
;	TokenNameSEMICOLON
return	TokenNamereturn
contents	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
