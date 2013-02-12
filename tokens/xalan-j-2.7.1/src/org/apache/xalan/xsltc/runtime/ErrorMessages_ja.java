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
ErrorMessages_ja	TokenNameIdentifier
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
"''{0}'' でランタイム内部エラーがありました。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
RUN_TIME_COPY_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:copy> 実行時のランタイム・エラー"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
DATA_CONVERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' から ''{1}'' への変換は無効です。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
EXTERNAL_FUNC_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"外部関数 ''{0}'' は XSLTC によってサポートされていません。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
EQUALITY_EXPR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"等式内の引数が不明です。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
INVALID_ARGUMENT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{1}'' への呼び出しの引数の型 ''{0}'' が無効です。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
FORMAT_NUMBER_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"パターン ''{1}'' を使用して数値 ''{0}'' のフォーマット設定を試みています。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
ITERATOR_CLONE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"イテレーター ''{0}'' を複製できません。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
AXIS_SUPPORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"軸 ''{0}'' のイテレーターはサポートされていません。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
TYPED_AXIS_SUPPORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"型付きの軸 ''{0}'' のイテレーターはサポートされていません。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
STRAY_ATTRIBUTE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"属性 ''{0}'' が要素の外側です。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
STRAY_NAMESPACE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"名前空間宣言 ''{0}''=''{1}'' が要素の外側です。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
NAMESPACE_PREFIX_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"接頭部 ''{0}'' の名前空間が宣言されていません。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
DOM_ADAPTER_INIT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"DOMAdapter が間違った型のソース DOM を使用して作成されました。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
PARSER_DTD_SUPPORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"使用中の SAX パーサーは DTD 宣言イベントを処理しません。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
NAMESPACES_SUPPORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"使用中の SAX パーサーには XML 名前空間のサポートがありません。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
CANT_RESOLVE_RELATIVE_URI_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"URI 参照 ''{0}'' を解決できませんでした。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_XSL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"XSL 要素 ''{0}'' はサポートされていません。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_EXT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"XSLTC 拡張 ''{0}'' は認識されていません。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
UNKNOWN_TRANSLET_VERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"指定された translet ''{0}'' は、使用中の XSLTC ランタイムより新しいバージョンの XSLTC を使用して作成されました。この translet を実行するには、スタイルシートを再コンパイルするか、または新しいバージョンの XSLTC を使用しなければなりません。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
INVALID_QNAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"値が QName でなければならない属性に、値 ''{0}'' がありました。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
INVALID_NCNAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"値が NCName でなければならない属性に、値 ''{0}'' がありました。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
UNALLOWED_EXTENSION_FUNCTION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"セキュリティー保護された処理機能が true に設定されているときに、拡張関数 ''{0}'' を使用することはできません。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
UNALLOWED_EXTENSION_ELEMENT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"セキュリティー保護された処理機能が true に設定されているときに、拡張要素 ''{0}'' を使用することはできません。"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
}	TokenNameRBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
