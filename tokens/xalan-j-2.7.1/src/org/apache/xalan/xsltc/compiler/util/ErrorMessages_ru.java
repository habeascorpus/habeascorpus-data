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
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MULTIPLE_STYLESHEET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"В файле определено несколько таблиц стилей."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TEMPLATE_REDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Шаблон ''{0}'' уже определен в этой таблице стилей. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TEMPLATE_UNDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Шаблон ''{0}'' не определен в этой таблице стилей. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
VARIABLE_REDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Переменная ''{0}'' определена несколько раз в одной области имен. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
VARIABLE_UNDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Переменная или параметр ''{0}'' не определены. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CLASS_NOT_FOUND_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Не найден класс ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
METHOD_NOT_FOUND_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Не найден внешний метод ''{0}'' (метод должен относиться к классу public). "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ARGUMENT_CONVERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Не удалось преобразовать тип argument/return при вызове метода ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FILE_NOT_FOUND_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Не найден файл или  URI ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INVALID_URI_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Недопустимый URI ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FILE_ACCESS_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Невозможно открыть файл или URI ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MISSING_ROOT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Ожидался элемент <xsl:stylesheet> или <xsl:transform>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NAMESPACE_UNDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Не объявлен префикс ''{0}'' пространства имен. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FUNCTION_RESOLVE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Невозможно преобразовать вызов функции ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NEED_LITERAL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Аргумент ''{0}'' должен быть литеральной строкой. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
XPATH_PARSER_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Ошибка при анализе выражения XPath ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
REQUIRED_ATTR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Отсутствует обязательный атрибут ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_CHAR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Недопустимый символ ''{0}'' в выражении XPath. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_PI_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Имя ''{0}'' недопустимо для инструкции обработки. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
STRAY_ATTRIBUTE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Атрибут ''{0}'' вне элемента. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_ATTRIBUTE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Недопустимый атрибут ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CIRCULAR_INCLUDE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Циклический импорт/включение. Таблица стилей ''{0}'' уже загружена. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
RESULT_TREE_SORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Невозможно отсортировать фрагменты дерева результатов (элементы <xsl:sort> игнорируются). При создании дерева результатов необходимо отсортировать узлы."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
SYMBOLS_REDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Стиль десятичного форматирования ''{0}'' уже определен. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
XSL_VERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Версия XSL ''{0}'' не поддерживается XSLTC. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CIRCULAR_VARIABLE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Циклическая ссылка на переменную или параметр в ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_BINARY_OP_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Неизвестный оператор в двоичном выражении."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_ARG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Недопустимые аргументы в вызове функции."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
DOCUMENT_ARG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Второй аргумент в функции document() должен быть набором узлов."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MISSING_WHEN_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"В <xsl:choose> необходим по крайней мере один элемент <xsl:when>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MULTIPLE_OTHERWISE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:choose> разрешен только один элемент <xsl:otherwise>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
STRAY_OTHERWISE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:otherwise> может применяться только в <xsl:choose>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
STRAY_WHEN_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:when> может применяться только в <xsl:choose>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
WHEN_ELEMENT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"В <xsl:choose> разрешены только элементы <xsl:when> и <xsl:otherwise>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNNAMED_ATTRIBSET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"В <xsl:attribute-set> отсутствует атрибут 'name'."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_CHILD_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Недопустимый дочерний элемент."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_ELEM_NAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Нельзя вызывать элемент ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_ATTR_NAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Нельзя вызывать атрибут ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_TEXT_NODE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Текстовые данные вне элемента верхнего уровня <xsl:stylesheet>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
SAX_PARSER_CONFIG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Неправильно настроен анализатор JAXP"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INTERNAL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Неустранимая внутренняя ошибка XSLTC: ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_XSL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Неподдерживаемый элемент XSL ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_EXT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Неизвестное расширение XSLTC ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MISSING_XSLT_URI_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Исходный документ не является таблицей стилей (пространство имен XSL не объявлено в корневом элементе)."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MISSING_XSLT_TARGET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Не найден целевой документ таблицы стилей ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NOT_IMPLEMENTED_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Поддержка не реализована: ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NOT_STYLESHEET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Исходный документ не содержит таблицу стилей XSL."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ELEMENT_PARSE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Невозможно проанализировать элемент ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
KEY_USE_ATTR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Атрибут use <key> должен быть node, node-set, string или number."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
OUTPUT_VERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Документ XML должен использовать версию 1.0"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_RELAT_OP_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Неизвестный оператор в выражении сравнения."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ATTRIBSET_UNDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Попытка воспользоваться несуществующим набором атрибутов ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ATTR_VAL_TEMPLATE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Не удалось разобрать шаблон значений атрибутов ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNKNOWN_SIG_TYPE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Неизвестный тип данных в сигнатуре класса ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
DATA_CONVERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Невозможно преобразовать тип данных ''{0}'' в ''{1}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NO_TRANSLET_CLASS_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"В классе Templates нет допустимого определения класса процедур преобразования."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NO_MAIN_TRANSLET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"В классе Templates нет класса с именем ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSLET_CLASS_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Невозможно загрузить класс процедур преобразования ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSLET_OBJECT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Класс процедур преобразования загружен, однако создать экземпляр процедуры невозможно."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ERROR_LISTENER_NULL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Попытка присвоить значение null интерфейсу ErrorListener для ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_UNKNOWN_SOURCE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"XSLTC поддерживает только StreamSource, SAXSource и DOMSource"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_NO_SOURCE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Исходный объект, переданный в ''{0}'', не содержит данных. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_COMPILE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Невозможно откомпилировать таблицу стилей"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_INVALID_ATTR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Объект TransformerFactory не распознал атрибут ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_SET_RESULT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Перед startDocument() необходимо вызвать setResult()."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_NO_TRANSLET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"В интерфейсе Transformer нет инкапсулированного объекта процедуры преобразования."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_NO_HANDLER_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Для результатов преобразования не определен обработчик вывода."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_NO_RESULT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Объект Result, переданный ''{0}'', недопустим. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_UNKNOWN_PROP_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Попытка обратиться к недопустимому свойству Transformer ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
SAX2DOM_ADAPTER_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Невозможно создать адаптер SAX2DOM: ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
XSLTC_SOURCE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"XSLTCSource.build() вызван без предварительной установки systemId."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ER_RESULT_NULL	TokenNameIdentifier
,	TokenNameCOMMA
"Результат не должен быть пустым"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_INVALID_SET_PARAM_VALUE	TokenNameIdentifier
,	TokenNameCOMMA
"Значение параметра {0} должно быть допустимым объектом Java"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COMPILE_STDIN_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Опция -i должна применяться вместе с опцией -o."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COMPILE_USAGE_STR	TokenNameIdentifier
,	TokenNameCOMMA
"SYNOPSIS  java org.apache.xalan.xsltc.cmdline.Compile [-o <выходной-файл>]  [-d <каталог>] [-j <файл-jar>] [-p <пакет>]  [-n] [-x] [-u] [-v] [-h] { <таблица-стилей> | -i }  ОПЦИИ  -o <выходной-файл> присваивает имя <выходной-файл> созданному объекту   translet. По умолчанию имя процедуры преобразования             берется из имени <таблицы-стилей>. При компиляции нескольких таблиц стилей                   эта опция игнорируется.    -d <каталог> задает целевой каталог для процедуры преобразования    -j <файл-jar> упаковывает классы процедуры преобразования                    в <файл-jar> с указанным именем    -p <пакет>   задает префикс имени пакета для всех созданных                   классов процедуры преобразования    -n             разрешает копирование строк шаблона (обычно способ, применяемый по умолчанию,  работает лучше).    -x выдавать подробные отладочные сообщения   -u интерпретировать аргументы <таблицы-стилей> как URL  -i читать таблицу стилей из stdin  -v показать версию компилятора  -h выдать это сообщение "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSFORM_USAGE_STR	TokenNameIdentifier
,	TokenNameCOMMA
"SYNOPSIS     java org.apache.xalan.xsltc.cmdline.Transform [-j <файл-jar>]       [-x] [-n <итерации>] {-u <URL-документа> | <документ>}       <класс> [<параметр1>=<значение1> ...]     применять указанный <класс> для преобразования документа XML,    указанного в параметре <документ>. <Класс> процедуры преобразования должен быть доступен либо     с помощью CLASSPATH пользователя, либо с помощью указанного <файла-jar>. ОПЦИИ    -j <файл-jar> файл jar, из которого нужно загрузить translet    -x              выдавать подробные отладочные сообщения    -n <итерации> выполнить преобразование указанное число раз и                    показать сведения о профайлах    -u <URL-документа> URL входного документа XML "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
STRAY_SORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:sort> может применяться только в <xsl:for-each> или <xsl:apply-templates>."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_ENCODING	TokenNameIdentifier
,	TokenNameCOMMA
"Выходная кодировка ''{0}'' не поддерживается на данной JVM. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
SYNTAX_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Синтаксическая ошибка в ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CONSTRUCTOR_NOT_FOUND	TokenNameIdentifier
,	TokenNameCOMMA
"Не найден внешний конструктор ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NO_JAVA_FUNCT_THIS_REF	TokenNameIdentifier
,	TokenNameCOMMA
"Первый аргумент нестатической функции Java ''{0}'' должен быть ссылкой на объект. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TYPE_CHECK_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Ошибка при проверке типа выражения ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TYPE_CHECK_UNK_LOC_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Ошибка при проверке типа выражения в неизвестном расположении."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_CMDLINE_OPTION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Недопустимая опция командной строки ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CMDLINE_OPT_MISSING_ARG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Опция ''{0}'' в командной строке указана без аргумента. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
WARNING_PLUS_WRAPPED_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"Предупреждение:  ''{0}''        :{1}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
WARNING_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"Предупреждение:  ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FATAL_ERR_PLUS_WRAPPED_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"Неустранимая ошибка:  ''{0}''            :{1}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FATAL_ERR_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"Неустранимая ошибка:  ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ERROR_PLUS_WRAPPED_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"Ошибка:  ''{0}''      :{1}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ERROR_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"Ошибка:  ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSFORM_WITH_TRANSLET_STR	TokenNameIdentifier
,	TokenNameCOMMA
"Преобразование с помощью процедуры ''{0}'' "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSFORM_WITH_JAR_STR	TokenNameIdentifier
,	TokenNameCOMMA
"Преобразование с помощью процедуры ''{0}'' из файла jar ''{1}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COULD_NOT_CREATE_TRANS_FACT	TokenNameIdentifier
,	TokenNameCOMMA
"Не удалось создать экземпляр класса TransformerFactory ''{0}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSLET_NAME_JAVA_CONFLICT	TokenNameIdentifier
,	TokenNameCOMMA
"Имя ''{0}'' недопустимо в качестве имени класса преобразования, так как в нем содержатся символы, запрещенные в имени класса Java. Вместо него было использовано имя ''{1}''. "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COMPILER_ERROR_KEY	TokenNameIdentifier
,	TokenNameCOMMA
"Ошибки компилятора:"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COMPILER_WARNING_KEY	TokenNameIdentifier
,	TokenNameCOMMA
"Предупреждения компилятора:"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
RUNTIME_ERROR_KEY	TokenNameIdentifier
,	TokenNameCOMMA
"Ошибки процедуры преобразования:"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INVALID_QNAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"В атрибуте, для которого допустимо значение QName или список QName, разделенный пробелами, указано значение ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INVALID_NCNAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"В атрибуте, для которого допустимо значение NCName, указано значение ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INVALID_METHOD_IN_OUTPUT	TokenNameIdentifier
,	TokenNameCOMMA
"В атрибуте метода элемента <xsl:output> указано значение ''{0}''. Допустимы следующие значения ''xml'', ''html'', ''text'' и qname, но не ncname"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_GET_FEATURE_NULL_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"Имя функции не может быть пустым в TransformerFactory.getFeature(Имя строки). "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_SET_FEATURE_NULL_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"Имя функции не может быть пустым в TransformerFactory.setFeature(Имя строки, булевское значение). "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_UNSUPPORTED_FEATURE	TokenNameIdentifier
,	TokenNameCOMMA
"Невозможно задать функцию ''{0}'' в этом классе TransformerFactory. "	TokenNameStringLiteral
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
