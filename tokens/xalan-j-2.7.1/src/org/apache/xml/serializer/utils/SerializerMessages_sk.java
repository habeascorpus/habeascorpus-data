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
SerializerMessages_sk	TokenNameIdentifier
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
"Kľúč správy ''{0}'' sa nenachádza v triede správ ''{1}''"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
BAD_MSGFORMAT	TokenNameIdentifier
,	TokenNameCOMMA
"Zlyhal formát správy ''{0}'' v triede správ ''{1}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_SERIALIZER_NOT_CONTENTHANDLER	TokenNameIdentifier
,	TokenNameCOMMA
"Trieda serializátora ''{0}'' neimplementuje org.xml.sax.ContentHandler."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_RESOURCE_COULD_NOT_FIND	TokenNameIdentifier
,	TokenNameCOMMA
"Prostriedok [ {0} ] nemohol byť nájdený.  {1}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_RESOURCE_COULD_NOT_LOAD	TokenNameIdentifier
,	TokenNameCOMMA
"Prostriedok [ {0} ] sa nedal načítať: {1}   {2}   {3}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_BUFFER_SIZE_LESSTHAN_ZERO	TokenNameIdentifier
,	TokenNameCOMMA
"Veľkosť vyrovnávacej pamäte <=0"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier
,	TokenNameCOMMA
"Bolo zistené neplatné nahradenie UTF-16: {0} ?"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_OIERROR	TokenNameIdentifier
,	TokenNameCOMMA
"chyba IO"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ILLEGAL_ATTRIBUTE_POSITION	TokenNameIdentifier
,	TokenNameCOMMA
"Nie je možné pridať atribút {0} po uzloch potomka alebo pred vytvorením elementu.  Atribút bude ignorovaný."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NAMESPACE_PREFIX	TokenNameIdentifier
,	TokenNameCOMMA
"Názvový priestor pre predponu ''{0}'' nebol deklarovaný."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_STRAY_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
"Atribút ''{0}'' je mimo prvku."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_STRAY_NAMESPACE	TokenNameIdentifier
,	TokenNameCOMMA
"Deklarácia názvového priestoru ''{0}''=''{1}'' je mimo prvku."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_COULD_NOT_LOAD_RESOURCE	TokenNameIdentifier
,	TokenNameCOMMA
"Nebolo možné zaviesť ''{0}'' (skontrolujte CLASSPATH), teraz sa používajú iba štandardné nastavenia"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ILLEGAL_CHARACTER	TokenNameIdentifier
,	TokenNameCOMMA
"Pokus o výstup znaku integrálnej hodnoty {0}, ktorá nie je reprezentovaná v zadanom výstupnom kódovaní {1}."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_COULD_NOT_LOAD_METHOD_PROPERTY	TokenNameIdentifier
,	TokenNameCOMMA
"Nebolo možné zaviesť súbor vlastností ''{0}'' pre výstupnú metódu ''{1}'' (skontrolujte CLASSPATH)"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_INVALID_PORT	TokenNameIdentifier
,	TokenNameCOMMA
"Neplatné číslo portu"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_PORT_WHEN_HOST_NULL	TokenNameIdentifier
,	TokenNameCOMMA
"Nemôže byť stanovený port, ak je hostiteľ nulový"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_HOST_ADDRESS_NOT_WELLFORMED	TokenNameIdentifier
,	TokenNameCOMMA
"Hostiteľ nie je správne formátovaná adresa"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_SCHEME_NOT_CONFORMANT	TokenNameIdentifier
,	TokenNameCOMMA
"Nezhodná schéma."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_SCHEME_FROM_NULL_STRING	TokenNameIdentifier
,	TokenNameCOMMA
"Nie je možné stanoviť schému z nulového reťazca"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE	TokenNameIdentifier
,	TokenNameCOMMA
"Cesta obsahuje neplatnú únikovú sekvenciu"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_PATH_INVALID_CHAR	TokenNameIdentifier
,	TokenNameCOMMA
"Cesta obsahuje neplatný znak: {0}"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FRAG_INVALID_CHAR	TokenNameIdentifier
,	TokenNameCOMMA
"Fragment obsahuje neplatný znak"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FRAG_WHEN_PATH_NULL	TokenNameIdentifier
,	TokenNameCOMMA
"Ak je cesta nulová, nemôže byť stanovený fragment"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FRAG_FOR_GENERIC_URI	TokenNameIdentifier
,	TokenNameCOMMA
"Fragment môže byť stanovený len pre všeobecné URI"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_SCHEME_IN_URI	TokenNameIdentifier
,	TokenNameCOMMA
"V URI nebola nájdená žiadna schéma"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_CANNOT_INIT_URI_EMPTY_PARMS	TokenNameIdentifier
,	TokenNameCOMMA
"Nie je možné inicializovať URI s prázdnymi parametrami"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_FRAGMENT_STRING_IN_PATH	TokenNameIdentifier
,	TokenNameCOMMA
"Fragment nemôže byť zadaný v ceste, ani vo fragmente"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_QUERY_STRING_IN_PATH	TokenNameIdentifier
,	TokenNameCOMMA
"Reťazec dotazu nemôže byť zadaný v ceste a reťazci dotazu"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_PORT_IF_NO_HOST	TokenNameIdentifier
,	TokenNameCOMMA
"Ak nebol zadaný hostiteľ, možno nebol zadaný port"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_USERINFO_IF_NO_HOST	TokenNameIdentifier
,	TokenNameCOMMA
"Ak nebol zadaný hostiteľ, možno nebolo zadané userinfo"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_XML_VERSION_NOT_SUPPORTED	TokenNameIdentifier
,	TokenNameCOMMA
"Varovanie:  Verzia výstupného dokumentu musí byť povinne ''{0}''.  Táto verzia XML nie je podporovaná.  Verzia výstupného dokumentu bude ''1.0''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_SCHEME_REQUIRED	TokenNameIdentifier
,	TokenNameCOMMA
"Je požadovaná schéma!"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FACTORY_PROPERTY_MISSING	TokenNameIdentifier
,	TokenNameCOMMA
"Objekt Properties, ktorý prešiel do SerializerFactory, nemá vlastnosť ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ENCODING_NOT_SUPPORTED	TokenNameIdentifier
,	TokenNameCOMMA
"Varovanie:  Java runtime nepodporuje kódovanie ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FEATURE_NOT_FOUND	TokenNameIdentifier
,	TokenNameCOMMA
"Parameter ''{0}'' nebol rozpoznaný."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_FEATURE_NOT_SUPPORTED	TokenNameIdentifier
,	TokenNameCOMMA
"Parameter ''{0}'' bol rozpoznaný, ale vyžadovaná hodnota sa nedá nastaviť."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_STRING_TOO_LONG	TokenNameIdentifier
,	TokenNameCOMMA
"Výsledný reťazec je príliš dlhý a nezmestí sa do DOMString: ''{0}''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_TYPE_MISMATCH_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"Typ hodnoty pre tento názov parametra je nekompatibilný s očakávaným typom hodnoty."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NO_OUTPUT_SPECIFIED	TokenNameIdentifier
,	TokenNameCOMMA
"Cieľ výstupu pre zapísanie údajov bol null."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_UNSUPPORTED_ENCODING	TokenNameIdentifier
,	TokenNameCOMMA
"Bolo zaznamenané nepodporované kódovanie."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_UNABLE_TO_SERIALIZE_NODE	TokenNameIdentifier
,	TokenNameCOMMA
"Uzol nebolo možné serializovať."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_CDATA_SECTIONS_SPLIT	TokenNameIdentifier
,	TokenNameCOMMA
"Časť CDATA obsahuje jeden alebo viaceré označovače konca ']]>'."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WARNING_WF_NOT_CHECKED	TokenNameIdentifier
,	TokenNameCOMMA
"Nebolo možné vytvoriť inštanciu kontrolóra Well-Formedness.  Parameter well-formed bol nastavený na hodnotu true, ale kontrola well-formedness sa nedá vykonať."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER	TokenNameIdentifier
,	TokenNameCOMMA
"Uzol ''{0}'' obsahuje neplatné znaky XML."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_COMMENT	TokenNameIdentifier
,	TokenNameCOMMA
"V komentári bol nájdený neplatný znak XML (Unicode: 0x{0})."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_PI	TokenNameIdentifier
,	TokenNameCOMMA
"Pri spracovaní dát inštrukcií sa našiel neplatný znak XML (Unicode: 0x{0})."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_CDATA	TokenNameIdentifier
,	TokenNameCOMMA
"V obsahu CDATASection sa našiel neplatný znak XML (Unicode: 0x{0})."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_TEXT	TokenNameIdentifier
,	TokenNameCOMMA
"V obsahu znakových dát uzla sa našiel neplatný znak XML (Unicode: 0x{0})."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_INVALID_CHARACTER_IN_NODE_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"V uzle {0} s názvom ''{1}'' sa našiel neplatný znak XML."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_DASH_IN_COMMENT	TokenNameIdentifier
,	TokenNameCOMMA
"Reťazec "--" nie je povolený v rámci komentárov."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_LT_IN_ATTVAL	TokenNameIdentifier
,	TokenNameCOMMA
"Hodnota atribútu "{1}", ktorá je priradená k prvku typu "{0}", nesmie obsahovať znak ''<''."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_REF_TO_UNPARSED_ENT	TokenNameIdentifier
,	TokenNameCOMMA
"Neanalyzovaný odkaz na entitu "&{0};" nie je povolený."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_WF_REF_TO_EXTERNAL_ENT	TokenNameIdentifier
,	TokenNameCOMMA
"Odkaz na externú entitu "&{0};" nie je povolený v hodnote atribútu."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NS_PREFIX_CANNOT_BE_BOUND	TokenNameIdentifier
,	TokenNameCOMMA
"Predpona "{0}" nemôže byť naviazaná na názvový priestor "{1}"."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NULL_LOCAL_ELEMENT_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"Lokálny názov prvku "{0}" je null."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_NULL_LOCAL_ATTR_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"Lokálny názov atribútu "{0}" je null."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ELEM_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier
,	TokenNameCOMMA
"Náhradný text pre uzol entity "{0}" obsahuje uzol prvku "{1}" s nenaviazanou predponou "{2}"."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_ATTR_UNBOUND_PREFIX_IN_ENTREF	TokenNameIdentifier
,	TokenNameCOMMA
"Náhradný text uzla entity "{0}" obsahuje uzol atribútu "{1}" s nenaviazanou predponou "{2}"."	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
}	TokenNameRBRACE
;	TokenNameSEMICOLON
return	TokenNamereturn
contents	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
