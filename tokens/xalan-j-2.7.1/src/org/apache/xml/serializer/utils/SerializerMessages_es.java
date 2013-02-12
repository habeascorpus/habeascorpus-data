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
SerializerMessages_es	TokenNameIdentifier
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
"La clave de mensaje ''{0}'' no está en la clase de mensaje ''{1}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
BAD_MSGFORMAT	TokenNameIdentifier
,	TokenNameCOMMA
"Se ha producido un error en el formato de mensaje ''{0}'' de la clase de mensaje ''{1}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_SERIALIZER_NOT_CONTENTHANDLER	TokenNameIdentifier
,	TokenNameCOMMA
"La clase serializer ''{0}'' no implementa org.xml.sax.ContentHandler."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_RESOURCE_COULD_NOT_FIND	TokenNameIdentifier
,	TokenNameCOMMA
"No se ha podido encontrar el recurso [ {0} ].  {1}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_RESOURCE_COULD_NOT_LOAD	TokenNameIdentifier
,	TokenNameCOMMA
"No se ha podido cargar el recurso [ {0} ]: {1}   {2}   {3}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_BUFFER_SIZE_LESSTHAN_ZERO	TokenNameIdentifier
,	TokenNameCOMMA
"Tamaño de almacenamiento intermedio <=0"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier
,	TokenNameCOMMA
"¿Se ha detectado un sustituto UTF-16 no válido: {0}?"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_OIERROR	TokenNameIdentifier
,	TokenNameCOMMA
"Error de ES"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ILLEGAL_ATTRIBUTE_POSITION	TokenNameIdentifier
,	TokenNameCOMMA
"No se puede añadir el atributo {0} después de nodos hijo o antes de que se produzca un elemento.  Se ignorará el atributo."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NAMESPACE_PREFIX	TokenNameIdentifier
,	TokenNameCOMMA
"No se ha declarado el espacio de nombres para el prefijo ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_STRAY_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
"Atributo ''{0}'' fuera del elemento."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_STRAY_NAMESPACE	TokenNameIdentifier
,	TokenNameCOMMA
"Declaración del espacio de nombres ''{0}''=''{1}'' fuera del elemento."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_COULD_NOT_LOAD_RESOURCE	TokenNameIdentifier
,	TokenNameCOMMA
"No se ha podido cargar ''{0}'' (compruebe la CLASSPATH), ahora sólo se están utilizando los valores predeterminados"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ILLEGAL_CHARACTER	TokenNameIdentifier
,	TokenNameCOMMA
"Se ha intentado dar salida a un carácter del valor integral {0} que no está representado en la codificación de salida especificada de {1}."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_COULD_NOT_LOAD_METHOD_PROPERTY	TokenNameIdentifier
,	TokenNameCOMMA
"No se ha podido cargar el archivo de propiedades ''{0}'' para el método de salida ''{1}'' (compruebe la CLASSPATH)"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_INVALID_PORT	TokenNameIdentifier
,	TokenNameCOMMA
"Número de puerto no válido"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_PORT_WHEN_HOST_NULL	TokenNameIdentifier
,	TokenNameCOMMA
"No se puede establecer el puerto si el sistema principal es nulo"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_HOST_ADDRESS_NOT_WELLFORMED	TokenNameIdentifier
,	TokenNameCOMMA
"El sistema principal no es una dirección bien formada"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_SCHEME_NOT_CONFORMANT	TokenNameIdentifier
,	TokenNameCOMMA
"El esquema no es compatible."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_SCHEME_FROM_NULL_STRING	TokenNameIdentifier
,	TokenNameCOMMA
"No se puede establecer un esquema de una serie nula"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE	TokenNameIdentifier
,	TokenNameCOMMA
"La vía de acceso contiene una secuencia de escape no válida"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_PATH_INVALID_CHAR	TokenNameIdentifier
,	TokenNameCOMMA
"La vía de acceso contiene un carácter no válido: {0}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FRAG_INVALID_CHAR	TokenNameIdentifier
,	TokenNameCOMMA
"El fragmento contiene un carácter no válido"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FRAG_WHEN_PATH_NULL	TokenNameIdentifier
,	TokenNameCOMMA
"No se puede establecer el fragmento si la vía de acceso es nula"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FRAG_FOR_GENERIC_URI	TokenNameIdentifier
,	TokenNameCOMMA
"Sólo se puede establecer el fragmento para un URI genérico"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_SCHEME_IN_URI	TokenNameIdentifier
,	TokenNameCOMMA
"No se ha encontrado un esquema en el URI"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_CANNOT_INIT_URI_EMPTY_PARMS	TokenNameIdentifier
,	TokenNameCOMMA
"No se puede inicializar el URI con parámetros vacíos"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_FRAGMENT_STRING_IN_PATH	TokenNameIdentifier
,	TokenNameCOMMA
"No se puede especificar el fragmento en la vía de acceso y en el fragmento"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_QUERY_STRING_IN_PATH	TokenNameIdentifier
,	TokenNameCOMMA
"No se puede especificar la serie de consulta en la vía de acceso y en la serie de consulta"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_PORT_IF_NO_HOST	TokenNameIdentifier
,	TokenNameCOMMA
"No se puede especificar el puerto si no se ha especificado el sistema principal"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_USERINFO_IF_NO_HOST	TokenNameIdentifier
,	TokenNameCOMMA
"No se puede especificar la información de usuario si no se ha especificado el sistema principal"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_XML_VERSION_NOT_SUPPORTED	TokenNameIdentifier
,	TokenNameCOMMA
"Aviso: la versión del documento de salida tiene que ser ''{0}''.  No se admite esta versión de XML.  La versión del documento de salida será ''1.0''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_SCHEME_REQUIRED	TokenNameIdentifier
,	TokenNameCOMMA
"¡Se necesita un esquema!"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FACTORY_PROPERTY_MISSING	TokenNameIdentifier
,	TokenNameCOMMA
"El objeto Properties pasado a SerializerFactory no tiene una propiedad ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ENCODING_NOT_SUPPORTED	TokenNameIdentifier
,	TokenNameCOMMA
"Aviso: La codificación ''{0}'' no está soportada por Java Runtime."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FEATURE_NOT_FOUND	TokenNameIdentifier
,	TokenNameCOMMA
"El parámetro ''{0}'' no se reconoce."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FEATURE_NOT_SUPPORTED	TokenNameIdentifier
,	TokenNameCOMMA
"Se reconoce el parámetro ''{0}'' pero no puede establecerse el valor solicitado."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_STRING_TOO_LONG	TokenNameIdentifier
,	TokenNameCOMMA
"La serie producida es demasiado larga para ajustarse a DOMString: ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_TYPE_MISMATCH_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"El tipo de valor para este nombre de parámetro es incompatible con el tipo de valor esperado."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_OUTPUT_SPECIFIED	TokenNameIdentifier
,	TokenNameCOMMA
"El destino de salida de escritura de los datos es nulo."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_UNSUPPORTED_ENCODING	TokenNameIdentifier
,	TokenNameCOMMA
"Se ha encontrado una codificación no soportada."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_UNABLE_TO_SERIALIZE_NODE	TokenNameIdentifier
,	TokenNameCOMMA
"No se ha podido serializar el nodo."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_CDATA_SECTIONS_SPLIT	TokenNameIdentifier
,	TokenNameCOMMA
"La sección CDATA contiene uno o más marcadores ']]>' de terminación."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WARNING_WF_NOT_CHECKED	TokenNameIdentifier
,	TokenNameCOMMA
"No se ha podido crear una instancia del comprobador de gramática correcta.  El parámetro well-formed se ha establecido en true pero no se puede realizar la comprobación de gramática correcta."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER	TokenNameIdentifier
,	TokenNameCOMMA
"El nodo ''{0}'' contiene caracteres XML no válidos."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_COMMENT	TokenNameIdentifier
,	TokenNameCOMMA
"Se ha encontrado un carácter XML no válido (Unicode: 0x{0}) en el comentario."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_PI	TokenNameIdentifier
,	TokenNameCOMMA
"Se ha encontrado un carácter XML no válido (Unicode: 0x{0}) en los datos de la instrucción de proceso."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_CDATA	TokenNameIdentifier
,	TokenNameCOMMA
"Se ha encontrado un carácter XML no válido (Unicode: 0x{0}) en el contenido de CDATASection."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_TEXT	TokenNameIdentifier
,	TokenNameCOMMA
"Se ha encontrado un carácter XML no válido (Unicode: 0x{0}) en el contenido de datos de caracteres del nodo."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_NODE_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"Se ha encontrado un carácter o caracteres XML no válidos en el nodo {0} denominado ''{1}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_DASH_IN_COMMENT	TokenNameIdentifier
,	TokenNameCOMMA
"No se permite la serie "--" dentro de los comentarios."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_LT_IN_ATTVAL	TokenNameIdentifier
,	TokenNameCOMMA
"El valor del atributo "{1}" asociado a un tipo de elemento "{0}" no debe contener el carácter ''''<''''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_REF_TO_UNPARSED_ENT	TokenNameIdentifier
,	TokenNameCOMMA
"No se permite la referencia de entidad no analizada "&{0};"."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_REF_TO_EXTERNAL_ENT	TokenNameIdentifier
,	TokenNameCOMMA
"La referencia de entidad externa "&{0};" no está permitida en un valor de atributo."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NS_PREFIX_CANNOT_BE_BOUND	TokenNameIdentifier
,	TokenNameCOMMA
"No se puede encontrar el prefijo "{0}" en el espacio de nombres "{1}"."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NULL_LOCAL_ELEMENT_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"El nombre local del elemento "{0}" es null."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NULL_LOCAL_ATTR_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"El nombre local del atributo "{0}" es null."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ELEM_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier
,	TokenNameCOMMA
"El texto de sustitución del nodo de entidad "{0}" contiene un nodo de elemento "{1}" con un prefijo no enlazado "{2}"."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ATTR_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier
,	TokenNameCOMMA
"El texto de sustitución del nodo de entidad "{0}" contiene un nodo de atributo "{1}" con un prefijo no enlazado "{2}"."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
}	TokenNameRBRACE
;	TokenNameSEMICOLON
return	TokenNamereturn
contents	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
