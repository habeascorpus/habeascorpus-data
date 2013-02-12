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
ErrorMessages_tr	TokenNameIdentifier
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
"Aynı dosyada birden çok biçem yaprağı tanımlandı."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TEMPLATE_REDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Biçem yaprağında ''{0}'' şablonu zaten tanımlı."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TEMPLATE_UNDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Bu biçem yaprağında ''{0}'' şablonu tanımlı değil."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
VARIABLE_REDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' değişkeni aynı kapsamda bir kereden çok tanımlandı."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
VARIABLE_UNDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' değişkeni ya da değiştirgesi tanımlı değil."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CLASS_NOT_FOUND_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' sınıfı bulunamıyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
METHOD_NOT_FOUND_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' dış yöntemi bulunamıyor (public olmalı)."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ARGUMENT_CONVERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' yöntemi çağrısında bağımsız değişken/dönüş tipi dönüştürülemiyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FILE_NOT_FOUND_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Dosya ya da URI ''{0}'' bulunamadı."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INVALID_URI_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Geçersiz URI ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FILE_ACCESS_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Dosya ya da URI ''{0}'' açılamıyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MISSING_ROOT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:stylesheet> ya da <xsl:transform> öğesi bekleniyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NAMESPACE_UNDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Ad alanı öneki ''{0}'' bildirilmemiş."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FUNCTION_RESOLVE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' işlevi çağrısı çözülemiyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NEED_LITERAL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' işlevine ilişkin bağımsız değişken bir hazır bilgi dizgisi olmalıdır."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
XPATH_PARSER_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"XPath ifadesi ''{0}'' ayrıştırılırken hata oluştu."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
REQUIRED_ATTR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Gerekli ''{0}'' özniteliği eksik."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_CHAR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"XPath ifadesinde geçersiz ''{0}'' karakteri var."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_PI_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"İşleme yönergesi için ''{0}'' adı geçersiz."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
STRAY_ATTRIBUTE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' özniteliği öğenin dışında."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_ATTRIBUTE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' özniteliği geçersiz."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CIRCULAR_INCLUDE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Çevrimsel import/include. ''{0}'' biçem yaprağı zaten yüklendi."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
RESULT_TREE_SORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Sonuç ağacı parçaları sıralanamıyor (<xsl:sort> öğeleri yok sayıldı). Düğümleri sonuç ağacını yaratırken sıralamalısınız."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
SYMBOLS_REDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Onlu biçimleme biçemi ''{0}'' zaten tanımlı."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
XSL_VERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"XSL sürümü ''{0}'' XSLTC tarafından desteklenmiyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CIRCULAR_VARIABLE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' içinde çevrimsel değişken/değiştirge başvurusu."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_BINARY_OP_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"İkili ifadede bilinmeyen işleç."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_ARG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"İşlev çağrısı için geçersiz sayıda bağımsız değişken."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
DOCUMENT_ARG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"document() işlevinin ikinci bağımsız değişkeni düğüm kümesi olmalıdır."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MISSING_WHEN_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:choose> içinde en az bir <xsl:when> öğesi gereklidir."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MULTIPLE_OTHERWISE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:choose> içinde tek bir <xsl:otherwise> öğesine izin verilir."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
STRAY_OTHERWISE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:otherwise> yalnızca <xsl:choose> içinde kullanılabilir."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
STRAY_WHEN_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:when> yalnızca <xsl:choose> içinde kullanılabilir."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
WHEN_ELEMENT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:choose> içinde yalnızca <xsl:when> ve <xsl:otherwise> öğeleri kullanılabilir."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNNAMED_ATTRIBSET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:attribute-set> öğesinde 'name' özniteliği eksik."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_CHILD_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Geçersiz alt öğe."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_ELEM_NAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Bir öğeye ''{0}'' adı verilemez."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_ATTR_NAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Bir özniteliğe ''{0}'' adı verilemez."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_TEXT_NODE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Üst düzey <xsl:stylesheet> öğesi dışında metin verisi."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
SAX_PARSER_CONFIG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"JAXP ayrıştırıcısı doğru yapılandırılmamış"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INTERNAL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Kurtarılamaz XSLTC iç hatası: ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_XSL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"XSL öğesi ''{0}'' desteklenmiyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_EXT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"XSLTC eklentisi ''{0}'' tanınmıyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MISSING_XSLT_URI_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Giriş belgesi bir biçem yaprağı değil (XSL ad alanı kök öğede bildirilmedi)."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
MISSING_XSLT_TARGET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Biçem yaprağı hedefi ''{0}'' bulunamadı."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NOT_IMPLEMENTED_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Gerçekleştirilmedi: ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NOT_STYLESHEET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Giriş belgesi bir XSL biçem yaprağı içermiyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ELEMENT_PARSE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' öğesi ayrıştırılamadı."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
KEY_USE_ATTR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<key> ile ilgili use özniteliği node, node-set, string ya da number olmalıdır."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
OUTPUT_VERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Çıkış XML belgesi sürümü 1.0 olmalıdır."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_RELAT_OP_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"İlişkisel ifade için bilinmeyen işleç"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ATTRIBSET_UNDEF_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Varolmayan ''{0}'' öznitelik kümesini kullanma girişimi."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ATTR_VAL_TEMPLATE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Öznitelik değeri şablonu ''{0}'' ayrıştırılamıyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNKNOWN_SIG_TYPE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' sınıfına ilişkin imzada bilinmeyen veri tipi."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
DATA_CONVERSION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' veri tipi ''{1}'' tipine dönüştürülemez."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NO_TRANSLET_CLASS_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Bu Templates geçerli bir derleme sonucu sınıf tanımı içermiyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NO_MAIN_TRANSLET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Bu Templates ''{0}'' adında bir sınıf içermiyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSLET_CLASS_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Derleme sonucu sınıfı ''{0}'' yüklenemedi."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSLET_OBJECT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Derleme sonucu sınıfı yüklendi, ancak derleme sonucu sınıfının somut kopyası yaratılamıyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ERROR_LISTENER_NULL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' ile ilgili ErrorListener nesnesini boş değer (null) olarak ayarlama girişimi."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_UNKNOWN_SOURCE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"XSLTC yalnızca StreamSource, SAXSource ve DOMSource arabirimlerini destekler."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_NO_SOURCE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' yöntemine aktarılan Source nesnesinin içeriği yok."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_COMPILE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Biçem yaprağı derlenemedi."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_INVALID_ATTR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"TransformerFactory ''{0}'' özniteliğini tanımıyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_SET_RESULT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"startDocument() yönteminden önce setResult() çağrılmalıdır."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_NO_TRANSLET_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Transformer, derleme sonucu sınıf dosyası nesnesine başvuru içermiyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_NO_HANDLER_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Dönüştürme sonucu için tanımlı çıkış işleyicisi yok."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_NO_RESULT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' yöntemine aktarılan Result nesnesi geçersiz."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_UNKNOWN_PROP_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Geçersiz ''{0}'' Transformer özelliğine (property) erişme girişimi."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
SAX2DOM_ADAPTER_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"SAX2DOM bağdaştırıcısı yaratılamadı: ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
XSLTC_SOURCE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"XSLTCSource.build() yöntemi systemId tanımlanmadan çağrıldı."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ER_RESULT_NULL	TokenNameIdentifier
,	TokenNameCOMMA
"Sonuç boş değerli olmamalı"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_INVALID_SET_PARAM_VALUE	TokenNameIdentifier
,	TokenNameCOMMA
"{0} değiştirgesinin değeri geçerli bir Java nesnesi olmalıdır"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COMPILE_STDIN_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"-i seçeneği -o seçeneğiyle birlikte kullanılmalıdır."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COMPILE_USAGE_STR	TokenNameIdentifier
,	TokenNameCOMMA
"ÖZET    java org.apache.xalan.xsltc.cmdline.Compile [-o <çıkış>]       [-d <dizin>] [-j <jardosyası>] [-p <paket>]       [-n] [-x] [-u] [-v] [-h] { <biçemyaprağı> | -i }  SEÇENEKLER    -o <çıkış>    derleme sonucu sınıf dosyasına <çıkış>                   adını atar. Varsayılan olarak, derleme sonucu sınıf dosyası                   adı <biçemyaprağı> adından alınır.  Birden çok biçem yaprağı derleniyorsa                   bu seçenek dikkate alınmaz.    -d <dizin> derleme sonucu sınıf dosyası için hedef dizini belirtir.    -j <jardosyası>   derleme sonucu sınıf dosyalarını                   <jardosyası> dosyasında paketler.    -p <paket>   derleme sonucu üretilen tüm sınıf dosyaları için                   bir paket adı öneki belirtir.    -n             şablona doğrudan yerleştirmeyi etkinleştirir (ortalama olarak                   daha yüksek başarım sağlar).    -x             ek hata ayıklama iletisi çıkışını etkinleştirir    -u             <biçemyaprağı> bağımsız değişkenlerini URL olarak yorumlars    -i             derleyiciyi stdin'den biçem yaprağını okumaya zorlar    -v             derleyici sürümünü yazdırır.    -h             bu kullanım bilgilerini yazdırır "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSFORM_USAGE_STR	TokenNameIdentifier
,	TokenNameCOMMA
"ÖZET     java org.apache.xalan.xsltc.cmdline.Transform [-j <jardosyası>]       [-x] [-n <yinelemesayısı>] {-u <belge_url> | <belge>}       <sınıf> [<değiştirge1>=<değer1> ...]     <belge> ile belirtilen XML belgesini dönüştürmek için <sınıf>    sınıf dosyasını kullanır. <sınıf> sınıf dosyası    kullanıcının CLASSPATH değişkeninde ya da isteğe bağlı olarak belirtilen <jardosyası> dosyasındadır. SEÇENEKLER    -j <jardosyası>    derleme sonucu sınıf dosyasının hangi jar dosyasından yükleneceğini belirtir    -x              ek hata ayıklama iletisi çıkışını etkinleştirir    -n <yinelemesayısı> dönüştürmeyi <yineleme sayısı> ile belirtilen sayı kadar çalıştırır                    ve yakalama bilgilerini görüntüler    -u <belge_url> XML giriş belgesini URL olarak belirtir "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
STRAY_SORT_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"<xsl:sort> yalnızca <xsl:for-each> ya da <xsl:apply-templates> içinde kullanılabilir."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_ENCODING	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' çıkış kodlaması bu JVM üzerinde desteklenmiyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
SYNTAX_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' ifadesinde sözdizimi hatası."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CONSTRUCTOR_NOT_FOUND	TokenNameIdentifier
,	TokenNameCOMMA
"Dış oluşturucu ''{0}'' bulunamıyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
NO_JAVA_FUNCT_THIS_REF	TokenNameIdentifier
,	TokenNameCOMMA
"Durağan (static) olmayan ''{0}'' Java işlevine ilişkin ilk bağımsız değişken geçerli bir nesne başvurusu değil."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TYPE_CHECK_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' ifadesinin tipi denetlenirken hata saptandı."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TYPE_CHECK_UNK_LOC_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Bilinmeyen bir yerdeki bir ifadenin tipi denetlenirken hata saptandı."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ILLEGAL_CMDLINE_OPTION_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Komut satırı seçeneği ''{0}'' geçerli değil."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
CMDLINE_OPT_MISSING_ARG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' komut satırı seçeneğinde gerekli bir bağımsız değişken eksik."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
WARNING_PLUS_WRAPPED_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"UYARI:  ''{0}''        :{1}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
WARNING_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"UYARI:  ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FATAL_ERR_PLUS_WRAPPED_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"ONULMAZ HATA:  ''{0}''            :{1}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
FATAL_ERR_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"ONULMAZ HATA:  ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ERROR_PLUS_WRAPPED_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"HATA:  ''{0}''      :{1}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
ERROR_MSG	TokenNameIdentifier
,	TokenNameCOMMA
"HATA:  ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSFORM_WITH_TRANSLET_STR	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' sınıfını kullanarak dönüştür "	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSFORM_WITH_JAR_STR	TokenNameIdentifier
,	TokenNameCOMMA
"''{1}'' jar dosyasından ''{0}'' derleme sonucu sınıf dosyasını kullanarak dönüştür"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COULD_NOT_CREATE_TRANS_FACT	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' TransformerFactory sınıfının somut örneği yaratılamadı."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TRANSLET_NAME_JAVA_CONFLICT	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' adı, derleme sonucu sınıf dosyası adı olarak kullanılamadı; bir Java sınıfında kullanılmasına izin verilmeyen karakterler içeriyor.  Onun yerine ''{1}'' adı kullanıldı."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COMPILER_ERROR_KEY	TokenNameIdentifier
,	TokenNameCOMMA
"Derleyici hataları:"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
COMPILER_WARNING_KEY	TokenNameIdentifier
,	TokenNameCOMMA
"Derleyici uyarıları:"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
RUNTIME_ERROR_KEY	TokenNameIdentifier
,	TokenNameCOMMA
"Derleme sonusu sınıf dosyası hataları:"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INVALID_QNAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Değerinin bir QName ya da beyaz alanla ayrılmış QName listesi olması gereken bir özniteliğin değeri ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INVALID_NCNAME_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Değerinin bir NCName olması gereken özniteliğin değeri ''{0}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INVALID_METHOD_IN_OUTPUT	TokenNameIdentifier
,	TokenNameCOMMA
"Bir <xsl:output> öğesinin yöntem özniteliğinin değeri ''{0}''.  Değer ''xml'', ''html'', ''text'' ya da ncname olmayan bir qname olmalıdır"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_GET_FEATURE_NULL_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"TransformerFactory.getFeature(dizgi adı) içinde özellik (feature) adı boş değerli olamaz."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_SET_FEATURE_NULL_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"TransformerFactory.setFeature(dizgi adı, boole değer) içinde özellik (feature) adı boş değerli olamaz."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
JAXP_UNSUPPORTED_FEATURE	TokenNameIdentifier
,	TokenNameCOMMA
"Bu TransformerFactory üzerinde ''{0}'' özelliği tanımlanamaz."	TokenNameStringLiteral
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
