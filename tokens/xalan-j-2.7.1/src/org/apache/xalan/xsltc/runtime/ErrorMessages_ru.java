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
ErrorMessages_ru	TokenNameIdentifier
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
"Внутренняя ошибка выполнения в ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
RUN_TIME_COPY_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Ошибка времени выполнения при обработке <xsl:copy>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
DATA_CONVERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Недопустимое преобразование из ''{0}'' в ''{1}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
EXTERNAL_FUNC_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Внешняя функция ''{0}'' не поддерживается XSLTC. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
EQUALITY_EXPR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Неизвестный тип аргумента в выражении равенства."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
INVALID_ARGUMENT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Недопустимый тип аргумента ''{0}'' при вызове ''{1}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
FORMAT_NUMBER_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Попытка отформатировать число ''{0}'' с помощью шаблона ''{1}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
ITERATOR_CLONE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Невозможно создать дубликат счетчика ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
AXIS_SUPPORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Счетчик для оси ''{0}'' не поддерживается. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
TYPED_AXIS_SUPPORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Счетчик для указанной оси ''{0}'' не поддерживается. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
STRAY_ATTRIBUTE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Атрибут ''{0}'' вне элемента. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
STRAY_NAMESPACE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Объявление пространства имен ''{0}''=''{1}'' вне элемента. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
NAMESPACE_PREFIX_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Пространство имен для префикса ''{0}'' не объявлено. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
DOM_ADAPTER_INIT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"DOMAdapter создан с неправильным типом исходного DOM."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
PARSER_DTD_SUPPORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Применяемый анализатор SAX не обрабатывает события объявления DTD."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
NAMESPACES_SUPPORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Применяемый анализатор SAX не поддерживает пространства имен XML."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
CANT_RESOLVE_RELATIVE_URI_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Невозможно обработать ссылку на URI ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_XSL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Неподдерживаемый элемент XSL ''{0}'' "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_EXT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Неизвестное расширение XSLTC ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
UNKNOWN_TRANSLET_VERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Указанная процедура преобразования ''{0}'' была создана с помощью более новой версии XSLTC, чем используемая для выполнения версия XSLTC. Для выполнения этого преобразования следует перекомпилировать таблицу стилей или установить более позднюю версию XSLTC. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
INVALID_QNAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"В атрибуте, для которого допустимо значение QName, указано значение ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
INVALID_NCNAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"В атрибуте, для которого допустимо значение NCName, указано значение ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
UNALLOWED_EXTENSION_FUNCTION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Применение функции расширения ''{0}'' недопустимо, если для функции защищенной обработки задано значение true. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
UNALLOWED_EXTENSION_ELEMENT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Применение элемента расширения ''{0}'' недопустимо, если для функции защищенной обработки задано значение true. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
}	TokenNameRBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
