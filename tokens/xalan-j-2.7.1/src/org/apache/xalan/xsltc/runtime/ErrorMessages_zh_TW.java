package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
xsltc	TokenNameIdentifier
.	TokenNameDOT
runtime	TokenNameIdentifier
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
ErrorMessages_zh_TW	TokenNameIdentifier
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
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
RUN_TIME_INTERNAL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' 發生執行時期內部錯誤"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
RUN_TIME_COPY_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"執行 <xsl:copy> 時，發生執行時期錯誤。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
DATA_CONVERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"從 ''{0}'' 成為 ''{1}'' 的轉換無效。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
EXTERNAL_FUNC_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"XSLTC 不支援外部函數 ''{0}''。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
EQUALITY_EXPR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"相等表示式中包含不明的引數類型。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
INVALID_ARGUMENT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"呼叫 ''{1}'' 所使用的引數類型 ''{0}'' 無效。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
FORMAT_NUMBER_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"嘗試使用型樣 ''{1}'' 格式化數字 ''{0}''。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
ITERATOR_CLONE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"無法複製重複項目 ''{0}''。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
AXIS_SUPPORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"不支援軸 ''{0}'' 的重複項目。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
TYPED_AXIS_SUPPORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"不支援所鍵入軸 ''{0}'' 的重複項目。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
STRAY_ATTRIBUTE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"屬性 ''{0}'' 超出元素外。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
STRAY_NAMESPACE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"名稱空間宣告 ''{0}''=''{1}'' 超出元素外。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
NAMESPACE_PREFIX_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"字首 ''{0}'' 的名稱空間尚未宣告。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
DOM_ADAPTER_INIT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"建立 DOMAdapter 時使用的原始檔 DOM 類型錯誤。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
PARSER_DTD_SUPPORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"您使用的 SAX 剖析器無法處理 DTD 宣告事件。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
NAMESPACES_SUPPORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"您使用的 SAX 剖析器不支援 XML 名稱空間。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
CANT_RESOLVE_RELATIVE_URI_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"無法解析 URI 參照 ''{0}''。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_XSL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"XSL 元素 ''{0}'' 不受支援"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_EXT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"XSLTC 延伸項目 ''{0}'' 無法辨識"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
UNKNOWN_TRANSLET_VERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"指定的 translet ''{0}'' 是以比使用中 XSLTC 執行時期版本更新的 XSLTC 版本所建立。您必須重新編譯樣式表或使用更新的 XSLTC 版本來執行此 translet。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
INVALID_QNAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"一個值必須是 QName 的屬性，具有值 ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
INVALID_NCNAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"一個值必須是 NCName 的屬性，具有值 ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
UNALLOWED_EXTENSION_FUNCTION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"當安全處理特性設為 true 時，不接受使用延伸函數 ''{0}''。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
UNALLOWED_EXTENSION_ELEMENT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"當安全處理特性設為 true 時，不接受使用延伸元素 ''{0}''。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
}	TokenNameRBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
