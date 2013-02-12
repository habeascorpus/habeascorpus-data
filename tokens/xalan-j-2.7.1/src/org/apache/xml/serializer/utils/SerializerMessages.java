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
SerializerMessages	TokenNameIdentifier
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
"The message key ''{0}'' is not in the message class ''{1}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
BAD_MSGFORMAT	TokenNameIdentifier
,	TokenNameCOMMA
"The format of message ''{0}'' in message class ''{1}'' failed."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_SERIALIZER_NOT_CONTENTHANDLER	TokenNameIdentifier
,	TokenNameCOMMA
"The serializer class ''{0}'' does not implement org.xml.sax.ContentHandler."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_RESOURCE_COULD_NOT_FIND	TokenNameIdentifier
,	TokenNameCOMMA
"The resource [ {0} ] could not be found.  {1}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_RESOURCE_COULD_NOT_LOAD	TokenNameIdentifier
,	TokenNameCOMMA
"The resource [ {0} ] could not load: {1}   {2}   {3}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_BUFFER_SIZE_LESSTHAN_ZERO	TokenNameIdentifier
,	TokenNameCOMMA
"Buffer size <=0"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier
,	TokenNameCOMMA
"Invalid UTF-16 surrogate detected: {0} ?"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_OIERROR	TokenNameIdentifier
,	TokenNameCOMMA
"IO error"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ILLEGAL_ATTRIBUTE_POSITION	TokenNameIdentifier
,	TokenNameCOMMA
"Cannot add attribute {0} after child nodes or before an element is produced.  Attribute will be ignored."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NAMESPACE_PREFIX	TokenNameIdentifier
,	TokenNameCOMMA
"Namespace for prefix ''{0}'' has not been declared."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_STRAY_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
"Attribute ''{0}'' outside of element."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_STRAY_NAMESPACE	TokenNameIdentifier
,	TokenNameCOMMA
"Namespace declaration ''{0}''=''{1}'' outside of element."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_COULD_NOT_LOAD_RESOURCE	TokenNameIdentifier
,	TokenNameCOMMA
"Could not load ''{0}'' (check CLASSPATH), now using just the defaults"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ILLEGAL_CHARACTER	TokenNameIdentifier
,	TokenNameCOMMA
"Attempt to output character of integral value {0} that is not represented in specified output encoding of {1}."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_COULD_NOT_LOAD_METHOD_PROPERTY	TokenNameIdentifier
,	TokenNameCOMMA
"Could not load the propery file ''{0}'' for output method ''{1}'' (check CLASSPATH)"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_INVALID_PORT	TokenNameIdentifier
,	TokenNameCOMMA
"Invalid port number"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_PORT_WHEN_HOST_NULL	TokenNameIdentifier
,	TokenNameCOMMA
"Port cannot be set when host is null"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_HOST_ADDRESS_NOT_WELLFORMED	TokenNameIdentifier
,	TokenNameCOMMA
"Host is not a well formed address"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_SCHEME_NOT_CONFORMANT	TokenNameIdentifier
,	TokenNameCOMMA
"The scheme is not conformant."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_SCHEME_FROM_NULL_STRING	TokenNameIdentifier
,	TokenNameCOMMA
"Cannot set scheme from null string"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE	TokenNameIdentifier
,	TokenNameCOMMA
"Path contains invalid escape sequence"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_PATH_INVALID_CHAR	TokenNameIdentifier
,	TokenNameCOMMA
"Path contains invalid character: {0}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FRAG_INVALID_CHAR	TokenNameIdentifier
,	TokenNameCOMMA
"Fragment contains invalid character"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FRAG_WHEN_PATH_NULL	TokenNameIdentifier
,	TokenNameCOMMA
"Fragment cannot be set when path is null"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FRAG_FOR_GENERIC_URI	TokenNameIdentifier
,	TokenNameCOMMA
"Fragment can only be set for a generic URI"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_SCHEME_IN_URI	TokenNameIdentifier
,	TokenNameCOMMA
"No scheme found in URI"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_CANNOT_INIT_URI_EMPTY_PARMS	TokenNameIdentifier
,	TokenNameCOMMA
"Cannot initialize URI with empty parameters"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_FRAGMENT_STRING_IN_PATH	TokenNameIdentifier
,	TokenNameCOMMA
"Fragment cannot be specified in both the path and fragment"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_QUERY_STRING_IN_PATH	TokenNameIdentifier
,	TokenNameCOMMA
"Query string cannot be specified in path and query string"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_PORT_IF_NO_HOST	TokenNameIdentifier
,	TokenNameCOMMA
"Port may not be specified if host is not specified"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_USERINFO_IF_NO_HOST	TokenNameIdentifier
,	TokenNameCOMMA
"Userinfo may not be specified if host is not specified"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_XML_VERSION_NOT_SUPPORTED	TokenNameIdentifier
,	TokenNameCOMMA
"Warning:  The version of the output document is requested to be ''{0}''.  This version of XML is not supported.  The version of the output document will be ''1.0''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_SCHEME_REQUIRED	TokenNameIdentifier
,	TokenNameCOMMA
"Scheme is required!"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FACTORY_PROPERTY_MISSING	TokenNameIdentifier
,	TokenNameCOMMA
"The Properties object passed to the SerializerFactory does not have a ''{0}'' property."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ENCODING_NOT_SUPPORTED	TokenNameIdentifier
,	TokenNameCOMMA
"Warning:  The encoding ''{0}'' is not supported by the Java runtime."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FEATURE_NOT_FOUND	TokenNameIdentifier
,	TokenNameCOMMA
"The parameter ''{0}'' is not recognized."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FEATURE_NOT_SUPPORTED	TokenNameIdentifier
,	TokenNameCOMMA
"The parameter ''{0}'' is recognized but the requested value cannot be set."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_STRING_TOO_LONG	TokenNameIdentifier
,	TokenNameCOMMA
"The resulting string is too long to fit in a DOMString: ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_TYPE_MISMATCH_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"The value type for this parameter name is incompatible with the expected value type."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_OUTPUT_SPECIFIED	TokenNameIdentifier
,	TokenNameCOMMA
"The output destination for data to be written to was null."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_UNSUPPORTED_ENCODING	TokenNameIdentifier
,	TokenNameCOMMA
"An unsupported encoding is encountered."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_UNABLE_TO_SERIALIZE_NODE	TokenNameIdentifier
,	TokenNameCOMMA
"The node could not be serialized."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_CDATA_SECTIONS_SPLIT	TokenNameIdentifier
,	TokenNameCOMMA
"The CDATA Section contains one or more termination markers ']]>'."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WARNING_WF_NOT_CHECKED	TokenNameIdentifier
,	TokenNameCOMMA
"An instance of the Well-Formedness checker could not be created.  The well-formed parameter was set to true but well-formedness checking can not be performed."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER	TokenNameIdentifier
,	TokenNameCOMMA
"The node ''{0}'' contains invalid XML characters."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_COMMENT	TokenNameIdentifier
,	TokenNameCOMMA
"An invalid XML character (Unicode: 0x{0}) was found in the comment."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_PI	TokenNameIdentifier
,	TokenNameCOMMA
"An invalid XML character (Unicode: 0x{0}) was found in the processing instructiondata."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_CDATA	TokenNameIdentifier
,	TokenNameCOMMA
"An invalid XML character (Unicode: 0x{0}) was found in the contents of the CDATASection."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_TEXT	TokenNameIdentifier
,	TokenNameCOMMA
"An invalid XML character (Unicode: 0x{0}) was found in the node''s character data content."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_NODE_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"An invalid XML character(s) was found in the {0} node named ''{1}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_DASH_IN_COMMENT	TokenNameIdentifier
,	TokenNameCOMMA
"The string "--" is not permitted within comments."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_LT_IN_ATTVAL	TokenNameIdentifier
,	TokenNameCOMMA
"The value of attribute "{1}" associated with an element type "{0}" must not contain the ''<'' character."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_REF_TO_UNPARSED_ENT	TokenNameIdentifier
,	TokenNameCOMMA
"The unparsed entity reference "&{0};" is not permitted."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_REF_TO_EXTERNAL_ENT	TokenNameIdentifier
,	TokenNameCOMMA
"The external entity reference "&{0};" is not permitted in an attribute value."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NS_PREFIX_CANNOT_BE_BOUND	TokenNameIdentifier
,	TokenNameCOMMA
"The prefix "{0}" can not be bound to namespace "{1}"."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NULL_LOCAL_ELEMENT_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"The local name of element "{0}" is null."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NULL_LOCAL_ATTR_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"The local name of attr "{0}" is null."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ELEM_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier
,	TokenNameCOMMA
"The replacement text of the entity node "{0}" contains an element node "{1}" with an unbound prefix "{2}"."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ATTR_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier
,	TokenNameCOMMA
"The replacement text of the entity node "{0}" contains an attribute node "{1}" with an unbound prefix "{2}"."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WRITING_INTERNAL_SUBSET	TokenNameIdentifier
,	TokenNameCOMMA
"An error occured while writing the internal subset."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
}	TokenNameRBRACE
;	TokenNameSEMICOLON
return	TokenNamereturn
contents	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
