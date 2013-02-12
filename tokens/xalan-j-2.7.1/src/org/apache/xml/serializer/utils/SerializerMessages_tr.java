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
SerializerMessages_tr	TokenNameIdentifier
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
"''{0}'' ileti anahtarı ''{1}'' ileti sınıfında yok"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
BAD_MSGFORMAT	TokenNameIdentifier
,	TokenNameCOMMA
"''{1}'' ileti sınıfındaki ''{0}'' iletisinin biçimi başarısız."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_SERIALIZER_NOT_CONTENTHANDLER	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' diziselleştirme sınıfı org.xml.sax.ContentHandler sınıfını gerçekleştirmiyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_RESOURCE_COULD_NOT_FIND	TokenNameIdentifier
,	TokenNameCOMMA
"Kaynak [ {0} ] bulunamadı.  {1}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_RESOURCE_COULD_NOT_LOAD	TokenNameIdentifier
,	TokenNameCOMMA
"Kaynak [ {0} ] yükleyemedi: {1}   {2}   {3}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_BUFFER_SIZE_LESSTHAN_ZERO	TokenNameIdentifier
,	TokenNameCOMMA
"Arabellek büyüklüğü <=0"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier
,	TokenNameCOMMA
"UTF-16 yerine kullanılan değer geçersiz: {0} ?"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_OIERROR	TokenNameIdentifier
,	TokenNameCOMMA
"GÇ hatası"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ILLEGAL_ATTRIBUTE_POSITION	TokenNameIdentifier
,	TokenNameCOMMA
"Alt düğümlerden sonra ya da bir öğe üretilmeden önce {0} özniteliği eklenemez.  Öznitelik yoksayılacak."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NAMESPACE_PREFIX	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' önekine ilişkin ad alanı bildirilmedi."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_STRAY_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' özniteliği öğenin dışında."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_STRAY_NAMESPACE	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}''=''{1}'' ad alanı bildirimi öğenin dışında."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_COULD_NOT_LOAD_RESOURCE	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' yüklenemedi (CLASSPATH değişkeninizi inceleyin), yalnızca varsayılanlar kullanılıyor"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ILLEGAL_CHARACTER	TokenNameIdentifier
,	TokenNameCOMMA
"Belirtilen {1} çıkış kodlamasında gösterilmeyen {0} tümlev değeri karakteri çıkış girişimi."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_COULD_NOT_LOAD_METHOD_PROPERTY	TokenNameIdentifier
,	TokenNameCOMMA
"''{1}'' çıkış yöntemi için ''{0}'' özellik dosyası yüklenemedi (CLASSPATH değişkenini inceleyin)"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_INVALID_PORT	TokenNameIdentifier
,	TokenNameCOMMA
"Kapı numarası geçersiz"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_PORT_WHEN_HOST_NULL	TokenNameIdentifier
,	TokenNameCOMMA
"Anasistem boş değerliyken kapı tanımlanamaz"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_HOST_ADDRESS_NOT_WELLFORMED	TokenNameIdentifier
,	TokenNameCOMMA
"Anasistem doğru biçimli bir adres değil"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_SCHEME_NOT_CONFORMANT	TokenNameIdentifier
,	TokenNameCOMMA
"Şema uyumlu değil."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_SCHEME_FROM_NULL_STRING	TokenNameIdentifier
,	TokenNameCOMMA
"Boş değerli dizgiden şema tanımlanamaz"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE	TokenNameIdentifier
,	TokenNameCOMMA
"Yol geçersiz kaçış dizisi içeriyor"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_PATH_INVALID_CHAR	TokenNameIdentifier
,	TokenNameCOMMA
"Yol geçersiz karakter içeriyor: {0}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FRAG_INVALID_CHAR	TokenNameIdentifier
,	TokenNameCOMMA
"Parça geçersiz karakter içeriyor"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FRAG_WHEN_PATH_NULL	TokenNameIdentifier
,	TokenNameCOMMA
"Yol boş değerliyken parça tanımlanamaz"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FRAG_FOR_GENERIC_URI	TokenNameIdentifier
,	TokenNameCOMMA
"Parça yalnızca soysal URI için tanımlanabilir"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_SCHEME_IN_URI	TokenNameIdentifier
,	TokenNameCOMMA
"URI içinde şema bulunamadı"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_CANNOT_INIT_URI_EMPTY_PARMS	TokenNameIdentifier
,	TokenNameCOMMA
"Boş değiştirgelerle URI kullanıma hazırlanamaz"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_FRAGMENT_STRING_IN_PATH	TokenNameIdentifier
,	TokenNameCOMMA
"Parça hem yolda, hem de parçada belirtilemez"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_QUERY_STRING_IN_PATH	TokenNameIdentifier
,	TokenNameCOMMA
"Yol ve sorgu dizgisinde sorgu dizgisi belirtilemez"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_PORT_IF_NO_HOST	TokenNameIdentifier
,	TokenNameCOMMA
"Anasistem belirtilmediyse kapı belirtilemez"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_USERINFO_IF_NO_HOST	TokenNameIdentifier
,	TokenNameCOMMA
"Anasistem belirtilmediyse kullanıcı bilgisi belirtilemez"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_XML_VERSION_NOT_SUPPORTED	TokenNameIdentifier
,	TokenNameCOMMA
"Uyarı:  Çıkış belgesinin sürümünün ''{0}'' olması isteniyor.  Bu XML sürümü desteklenmez.  Çıkış dosyasının sürümü ''1.0'' olacak."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_SCHEME_REQUIRED	TokenNameIdentifier
,	TokenNameCOMMA
"Şema gerekli!"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FACTORY_PROPERTY_MISSING	TokenNameIdentifier
,	TokenNameCOMMA
"SerializerFactory''ye geçirilen Properties nesnesinin bir ''{0}'' özelliği yok."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ENCODING_NOT_SUPPORTED	TokenNameIdentifier
,	TokenNameCOMMA
"Uyarı: ''{0}'' kodlaması Java Runtime tarafından desteklenmiyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FEATURE_NOT_FOUND	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' değiştirgesi tanınmıyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FEATURE_NOT_SUPPORTED	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' değiştirgesi tanınıyor, ancak istenen değer tanımlanamıyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_STRING_TOO_LONG	TokenNameIdentifier
,	TokenNameCOMMA
"Sonuç dizgisi DOMString için çok uzun: ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_TYPE_MISMATCH_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Bu değiştirge adına ilişkin değer tipi, beklenen değer tipiyle uyumlu değil."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_OUTPUT_SPECIFIED	TokenNameIdentifier
,	TokenNameCOMMA
"Yazılacak verilerin çıkış hedefi boş değerli."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_UNSUPPORTED_ENCODING	TokenNameIdentifier
,	TokenNameCOMMA
"Desteklenmeyen bir kodlama saptandı."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_UNABLE_TO_SERIALIZE_NODE	TokenNameIdentifier
,	TokenNameCOMMA
"Düğüm diziselleştirilemedi."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_CDATA_SECTIONS_SPLIT	TokenNameIdentifier
,	TokenNameCOMMA
"CDATA kısmında bir ya da daha çok ']]>' sonlandırma imleyicisi var."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WARNING_WF_NOT_CHECKED	TokenNameIdentifier
,	TokenNameCOMMA
"Well-Formedness denetşeyicisinin somut örneği yaratılamadı.  well-formed değiştirgesi true değerine ayarlandı, ancak doğru biçim denetimi gerçekleştirilemiyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER	TokenNameIdentifier
,	TokenNameCOMMA
"''{0}'' düğümü geçersiz XML karakterleri içeriyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_COMMENT	TokenNameIdentifier
,	TokenNameCOMMA
"Açıklamada geçersiz bir XML karakteri (Unicode: 0x{0}) saptandı."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_PI	TokenNameIdentifier
,	TokenNameCOMMA
"İşleme yönergesi verilerinde geçersiz bir XML karakteri (Unicode: 0x{0}) saptandı."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_CDATA	TokenNameIdentifier
,	TokenNameCOMMA
"CDATASection içeriğinde geçersiz bir XML karakteri (Unicode: 0x{0}) saptandı."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_TEXT	TokenNameIdentifier
,	TokenNameCOMMA
"Düğümün karakter verileri içeriğinde geçersiz bir XML karakteri (Unicode: 0x{0}) saptandı."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_NODE_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"''{1}'' adlı {0} düğümünde geçersiz XML karakteri saptandı."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_DASH_IN_COMMENT	TokenNameIdentifier
,	TokenNameCOMMA
"Açıklamalar içinde "--" dizgisine izin verilmez."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_LT_IN_ATTVAL	TokenNameIdentifier
,	TokenNameCOMMA
""{0}" öğe tipiyle ilişkilendirilen "{1}" özniteliğinin değeri ''<'' karakteri içermemelidir."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_REF_TO_UNPARSED_ENT	TokenNameIdentifier
,	TokenNameCOMMA
""&{0};" ayrıştırılmamış varlık başvurusuna izin verilmez."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_REF_TO_EXTERNAL_ENT	TokenNameIdentifier
,	TokenNameCOMMA
"Öznitelik değerinde "&{0};" dış varlık başvurusuna izin verilmez."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NS_PREFIX_CANNOT_BE_BOUND	TokenNameIdentifier
,	TokenNameCOMMA
""{0}" öneki "{1}" ad alanına bağlanamıyor."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NULL_LOCAL_ELEMENT_NAME	TokenNameIdentifier
,	TokenNameCOMMA
""{0}" öğesinin yerel adı boş değerli."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NULL_LOCAL_ATTR_NAME	TokenNameIdentifier
,	TokenNameCOMMA
""{0}" özniteliğinin yerel adı boş değerli."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ELEM_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier
,	TokenNameCOMMA
""{0}" varlık düğümünün yerine koyma metninde, bağlanmamış "{2}" öneki bulunan bir öğe düğümü ("{1}") var."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ATTR_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier
,	TokenNameCOMMA
""{0}" varlık düğümünün yerine koyma metninde, bağlanmamış "{2}" öneki bulunan bir öznitelik düğümü ("{1}") var."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
}	TokenNameRBRACE
;	TokenNameSEMICOLON
return	TokenNamereturn
contents	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
